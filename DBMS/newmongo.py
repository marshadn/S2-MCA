import pymongo
import json
conn=pymongo.MongoClient('mongodb://localhost:27017')
db=conn['dbs']
coll=db['cet']
# myList=conn.list_database_names()
# myList=conn.list_collection_names()
# if 'dbs' in myList:
#     print("The database exists.")
# else:
#     print("The database does not exist.")

dict={"name":"Mrd","Age":22,"Score":66,"Address":{"city":"Eranamkinlam"}}
# x=db.cet.insert_one(dict)
# print(dict)
mydict=[
    {
  "_id": 1,
  "name": {
    "fname": "Athira",
    "lname": "Krishnan"
  },
  "address": {
    "house_name": "Ambadi",
    "city": "Kollam"
  },
  "gender": "female",
  "course": "MCA",
  "mark": 80,
  "grade": "A",
  "phone": {
    "type": "mobile",
    "no": 9896321450
  }
},{
  "_id": 2,
  "name": {
    "fname": "Arya",
    "lname": "S"
  },
  "address": {
    "house_name": "M.B.S.Bhavan",
    "city": "Varkala"
  },
  "gender": "female",
  "course": "Computer Science",
  "mark": 90,
  "grade": "A+",
  "phone": {
    "type": "mobile",
    "no": 9446321420
  }
},{
  "_id": 3,
  "name": {
    "fname": "Varun",
    "lname": "Nair"
  },
  "address": {
    "house_name": "Koustubham",
    "city": "Thiruvananthapuram"
  },
  "gender": "male",
  "course": "MCA",
  "mark": 70,
  "grade": "B+",
  "phone": {
    "type": "land",
    "no": "04712662690"
  }
},{
  "_id": 4,
  "name": {
    "fname": "Vidhya",
    "lname": "S"
  },
  "address": {
    "house_name": "MRS House",
    "city": "Kadakkavoor"
  },
  "gender": "female",
  "course": "Civil",
  "mark": 85,
  "grade": "A",
  "phone": {
    "type": "mobile",
    "no": 8146321420
  }
},{
  "_id": 5,
  "name": {
    "fname": "Karthik",
    "lname": "MS"
  },
  "address": {
    "house_name": "Devi",
    "city": "Thiruvananthapuram"
  },
  "gender": "male",
  "course": "MCA",
  "mark": 60,
  "grade": "B",
  "phone": {
    "type": "land",
    "no": "04712663890"
  }
}
]
#x=db.cet.insert_many(mydict)
#print(mydict)
x=db.cet.find_one({"name":"Mrd"},{"_id":0})
print(x)