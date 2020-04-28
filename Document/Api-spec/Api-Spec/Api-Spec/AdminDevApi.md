#Admin Developer

##Add

+ Endpoint : ``adminDev/add``
+ HTTP Method : `POST`
+ Request Body :
  
  ```json
  {
      "name": "name",
      "alamat" : "alamat",
      "username" : "username",
      "email" : "email",
      "password" : "password",
      "confirmPassword" : "confirmPassword",
      "role" : "role"
  }
  ```
+ Request Header :
  + Accept : `application/json`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "message": "User Register Success",
    "data" : {
      "name": "sogu",
      "alamat" : "silaen",
      "username" : "sogu",
      "email" : "sogu@gmail.com",
      "password" : "sogu",
      "confirmPassword" : "sogu",
      "role" : "admin"
    }
     
}
```
+ Response Body (Fail) :

```json
{
    "timestamp": "2019-08-23T04:22:26.690+0000",
    "code": 400,
    "status": "Bad Request",
    "message": "Invalid Request: Invalid user authentication or invalid request format"
}
```
