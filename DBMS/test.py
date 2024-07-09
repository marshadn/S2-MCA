import pymongo,json
conn=pymongo.MongoClient("mongodb://localhost:27017")
db=conn['yourcet']
collection=db['studlist']

mydict=[
    {"_id":1,"name":"Arker","age":34,"Mark":92},
    {"_id":2,"name":"Newer","age":44,"Mark":97},
    {"_id":3,"name":"Hhfgh","age":21,"Mark":98},
    {"_id":4,"name":"KJb","age":22,"Mark":67},
    {"_id":5,"name":"GHdsfsd","age":12,"Mark":78},
    {"_id":6,"name":"Bgker","age":45,"Mark":88},
    {"_id":7,"name":"KJiker","age":35,"Mark":60},
    {"_id":8,"name":"Anjnr","age":37,"Mark":70},
    {"_id":9,"name":"Mokbh","age":24,"Mark":79},
    {"_id":10,"name":"Bgyg","age":34,"Mark":96},
    
]
# x=collection.insert_many(mydict)
# print(x)
#y= {"_id":11,"name":{"fname":"Abcs","lname":"xtq"},"age":22,"mark":99}

# z=collection.insert_one(y)
# print(z)
# with open("data.json") as file:
#     data=json.load(file)
# db.studlist.insert_many(data)

# x=db.studlist.find({"gender":"female","name.lname":"Vijayan"},{"_id":0,"name":1,"mark":1,"address.city":1}).limit(1)
# for i in x:
#     print(i['name']['lname']+" "+i['name']['fname'])



# for i in x:
#     print(i['name']['fname']+" is living in "+i['address']['city'])

x=db.studlist.update_one({"name.fname":"Renuka"},{"$set":{"name.fname":"Remya"}})
x=db.studlist.find({},{"name":1,"address.city":1})
for i in x:
    print(i['name']['fname']+" is living in "+i['address']['city'])
    