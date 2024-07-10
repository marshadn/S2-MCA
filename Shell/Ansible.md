# Ansible

Ansible is an open-source IT automation engine that automates software provisioning, configuration management, application deployment, orchestration etc.
Ansible works by assigning one system as a control station, known as the Ansible **control node**.
This control node is responsible for managing and orchestrating the configuration and deployment of other systems, known as **managed nodes**.
Ansible uses a declarative language called YAML to define the desired state of the managed nodes, making it easy to automate complex configuration management tasks.

### [Documentation](https://docs.ansible.com/ansible/latest/getting_started/introduction.html)

<img src="./Others/ansible-arch.png" alt="alt" style="height:300px;">

Ansible is owned by RedHat and it's python-based.
Ansible is **Agent-less**, meaning, it does not require installing a client on the systems.
The control node communicates with the managed nodes over SSH or WinRM protocols, allowing it to execute tasks and playbooks remotely. 
It uses straightforward **YAML** syntax.

```sh
pip install ansible
```

Build an inventory directory, `cd` into it and make an `inventory.ini` (*yaml* can also be used) file to add a group of hosts to control:

```ini
[myhosts]
192.0.2.50
192.0.2.51
192.0.2.52
```
Ping the group:
```sh
ansible myhosts -m ping -i inventory.ini 
```
which should output something like:
<pre>
192.0.2.50 | SUCCESS => {
    "ansible_facts": {
        "discovered_interpreter_python": "/usr/bin/python3"
    },
    "changed": false,
    "ping": "pong"
}
192.0.2.51 | SUCCESS => {
    ---
}
192.0.2.52 | SUCCESS => {
    ---
}
</pre>

Metagroups, groups, variables:
```yaml
webservers:
  hosts:
    webserver01:
      ansible_host: 192.0.2.140
      http_port: 80
    webserver02:
      ansible_host: 192.0.2.150
      http_port: 443
```

## Playbooks

* **Playbook**: A list of plays that define the order in which Ansible performs operations.
* **Play**: An ordered list of tasks that maps to managed nodes in an inventory.
* **Task**: A reference to a single module (e.g. `ping`), that defines the operation that Ansible performs.
* *Module*: A unit of code or library that Ansible runs on managed nodes.

Below is a playbook *requirenano.yml* written to ensure nano is installed in the nodes:

```yml
---
  - name: requirenano
    hosts: group_name
    tasks:
      - name: ensure nano is there
        yum:
          name: nano
          state: latest
```
To run a playbook, do:
```sh
ansible-playbook requirenano.yml
```
This will cause our tasks to be run on each node. 
We'll get the state of each node and whether it has changed (installed nano) or not.

**Idempotency** means that, Ansible does not make a change unless it has to. 
If nano is already installed in the above example, it won't re-install it.

If we create another playbook *deletenano.yml*, which removes nano, just change the `state` to `absent`.

### Q. Write an Ansible playbook to deploy a new Linux VM on a remote server.

```yaml
---
- name: Deploy Linux VM
  hosts: remote_server
  become: yes
  vars:
    vm_name: myvm
    vm_disk_size: 20G
    vm_memory: 1024
    vm_vcpus: 2
    vm_os_variant: centos7
    vm_install_iso: /path/to/linux.iso
    vm_network_bridge: br0
    vm_network_mac: 00:11:22:33:44:55
    vm_network_ip: 192.168.1.100
    vm_network_netmask: 255.255.255.0
    vm_network_gateway: 192.168.1.1
    vm_network_dns: 8.8.8.8

  tasks:
    - name: Create VM Disk Image
      command: qemu-img create -f qcow2 /var/lib/libvirt/images/{{ vm_name }}.qcow2 {{ vm_disk_size }}
      register: disk_created

    - name: Install Linux VM
      command: >
        virt-install
        --name={{ vm_name }}
        --memory={{ vm_memory }}
        --vcpus={{ vm_vcpus }}
        --os-variant={{ vm_os_variant }}
        --disk path=/var/lib/libvirt/images/{{ vm_name }}.qcow2,format=qcow2
        --cdrom {{ vm_install_iso }}
        --network bridge={{ vm_network_bridge }},mac={{ vm_network_mac }},ip={{ vm_network_ip }},netmask={{ vm_network_netmask }},gateway={{ vm_network_gateway }},nameserver={{ vm_network_dns }}
        --noautoconsole
      register: vm_installed

    - name: Wait for VM Installation to Complete
      wait_for:
        path: /var/lib/libvirt/images/{{ vm_name }}.qcow2
        state: present
        timeout: 600
```
```sh
# To run the playbook
ansible-playbook -i inventory_file deploy_vm.yml
```
