import pymongo
myclient=pymongo.MongoClient("mongodb://localhost:27017")
mydbs=myclient["mydb"]
mycol=mydbs["mycollection"]
# print(myclient.list_database_names())
# dblist=myclient.list_database_names()
# if "mydb" in dblist:
#     print("Database exist")
# else:
#     print("Not exists")

# collist=mydbs.list_collection_names()
# # print(collist)
# print(mydbs.list_collection_names())
# if "mycollection" in collist:
#     print("collection exist")
# else:
#     print("Not exists")

# mydict={"name":"Marshad","age":22,"mark":85}
# # x=mycol.insert_one(mydict)
# # print(x.inserted_id)
# y=mycol.delete_one(mydict)
# print(y)

# mydict=[
#     {"_id":1,"name":"Arker","age":34,"Mark":92},
#     {"_id":2,"name":"Newer","age":44,"Mark":97},
#     {"_id":3,"name":"Hhfgh","age":21,"Mark":98},
#     {"_id":4,"name":"KJb","age":22,"Mark":67},
#     {"_id":5,"name":"GHdsfsd","age":12,"Mark":78},
#     {"_id":6,"name":"Bgker","age":45,"Mark":88},
#     {"_id":7,"name":"KJiker","age":35,"Mark":60},
#     {"_id":8,"name":"Anjnr","age":37,"Mark":70},
#     {"_id":9,"name":"Mokbh","age":24,"Mark":79},
#     {"_id":10,"name":"Bgyg","age":34,"Mark":96},
    
# ]
# x=mycol.insert_many(mydict)
# print(x)
# x=mycol.find_one()
# print(x)
# for x in mycol.find({},{"_id":0,"name":1,"Mark":1}):
#     print(x)
# mydocs={"age":34}
# mydoc=mycol.find(mydocs)
# for x in mydoc:
#     print(x)

# marks={"Mark":{"$gt":90}}
# mydoc=mycol.find(marks)
# for x in mydoc:
#     print(x)
    
# marks={"name":{"$regex":"^A"}}
# mydoc=mycol.find(marks)
# for x in mydoc:
#     print(x)

# mydoc=mycol.find().sort("Mark",-1).limit(1)
# for x in mydoc:
#     print(x)

#myInsert={"name":"Manga","age":22,"Mark":90,"Address":{"street":"houseXYZ","pin":676789}}
# x=mycol.insert_one(myInsert)
# print(x)

# newValue={"$set":{"_id":11}}
# upd=mycol.update_many(myInsert,newValue)
# print(upd)

# #