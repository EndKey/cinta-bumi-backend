Blibli Cinta Bumi

Setup Mongo:
1. Start Robo Mongo
2. Create connection to localhost:27017
3. Right Click your connection and create "blibliCintaBumi" database.
4. Create a user in Users named "saya", with read and readWrite roles.
5. Create 3 collections in the database, named "histories", "projects", and "users".
6. Run the below scripts to mock data.

db.getCollection('users').insert({
    "id": "95d6118c-b7ea-4c1e-b769-d4fe9c617859",
    "name": "Rizki",
    "treesPlanted": 10.32,
    "carbonOffset": 325.08,
    "unclaimedPoints": 230
    })

db.getCollection('projects').insert({
    "name": "Kota Rembang, Jawa Tengah, Indonesia",
    "address": "Jalan Rembang - Blora Km 5",
    "numberOfTreesNeeded": 200,
    "currentTreesPlanted": 150,
    "deadlineTimestamp": 1647561600000
    })
    
db.getCollection('histories').insertMany([
{
    "userId": "95d6118c-b7ea-4c1e-b769-d4fe9c617859",
    "description": "0.25KgCO2",
    "amount": 0,
    "timestamp": 1647036000000,
    "price": 3600,
    "trees": 0.7
}, {
    "userId": "95d6118c-b7ea-4c1e-b769-d4fe9c617859",
    "description": "0.25KgCO2",
    "amount": 0,
    "timestamp": 1647018070000,
    "price": 3600,
    "trees": 0.7
}, {
    "userId": "95d6118c-b7ea-4c1e-b769-d4fe9c617859",
    "description": "Box Returned",
    "amount": 1,
    "timestamp": 1647018070000,
    "price": 2500,
    "trees": 0.001
}, {
    "userId": "95d6118c-b7ea-4c1e-b769-d4fe9c617859",
    "description": "Box Returned",
    "amount": 2,
    "timestamp": 1647079200000,
    "price": 5000,
    "trees": 0.002
}
])
