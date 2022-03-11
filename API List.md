GET /backend/cintaBumi/findUserDetailById

Request Param: String userId
{
  "serialVersionUID": 0,
  "success": false,
  "errorMessage": "",
  "content": {
    "id": "",
    "name": "",
    "treesPlanted": 0.0,
    "carbonOffset": 0.0,
    "unclaimedPoints": 0.0,
    "serialVersionUID": 0
  }
}



GET /backend/cintaBumi/getProjectsList

{
  "serialVersionUID": 0,
  "success": false,
  "errorMessage": "",
  "content": [
    {
      "name": "",
      "address": "",
      "numberOfTreesNeeded": 0.0,
      "currentTreesPlanted": 0.0,
      "deadlineTimestamp": 0,
      "serialVersionUID": 0,
      "id": ""
    }
  ]
}


GET /backend/cintaBumi/findHistoryListByUserId

Request Param: String userId
{
  "serialVersionUID": 0,
  "success": false,
  "errorMessage": "",
  "content": [
    {
      "userId": "",
      "description": "",
      "amount": "",
      "timestamp": 0,
      "price": 0,
      "trees": 0.0,
      "serialVersionUID": 0,
      "id": ""
    }
  ]
}

POST /backend/cintaBumi/claimUnclaimedRewards

Request Param: String userId
{
  "serialVersionUID": 0,
  "success": true,
  "errorMessage": "",
  "content": null
}

GET /backend/cintaBumi/calculateOrderCarbonFootprint

Request Param: double distanceInM
{
  "serialVersionUID": 0,
  "success": false,
  "errorMessage": "",
  "content": {
    "serialVersionUID": 0,
    "carbonOffset": 0.0,
    "trees": 0.0,
    "price": 0.0
  }
}

GET /backend/cintaBumi/calculateOrderRecyclePrice

Request Param: int cardboardAmount
{
  "serialVersionUID": 0,
  "success": false,
  "errorMessage": "",
  "content": {
    "serialVersionUID": 0,
    "weight": 0.0,
    "price": 0.0
  }
} 
