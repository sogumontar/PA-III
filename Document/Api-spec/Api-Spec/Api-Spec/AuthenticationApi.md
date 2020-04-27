# Authentication API

## Sign up

+ Endpoint : ``/auth/signup``
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
    "message": "User Register Success"
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


## Login

+ Endpoint : ``/auth/signin``
+ HTTP Method : `POST`
+ Request Body :
  
  ```json
  {
      "username": "test",
      "password" : "test"
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
    "token" : "asdfzji7afkhjmnlckxjohodlikmasnfxlfiju8oasd"
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

```json
{
    "timestamp": "2019-08-23T04:22:26.690+0000",
    "code": 401,
    "status": "Unauthorized",
    "message": "Username/Password Is Wrong"
}
```


## FindwithUsername

+ Endpoint : ``/auth/test/{username}``
+ HTTP Method : `GET`
+ Path Variable :
  + username
+ Request Header :
  + Accept : `application/json`
  + Authorization : `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NjY1NTE5ODksImlhdCI6MTU2NjUzMzk4OX0.Kvx2VZkmckMexnTwK8A3vHSDar3J-K-dCrkJ2jmQtKdAWbw1dAjJ34WXCQXs-WO23OQPTqVF36E1STEhGZFZfg`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "data" : {
        "nama" : "hendra",
        "username" : "hendra",
        "role" : "ROLE_ADMIN",
        "status" : 1,
        "alamat" : "silaen"  
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

```json
{
    "timestamp": "2019-08-23T04:22:26.690+0000",
    "code": 401,
    "status": "Unauthorized",
    "message": "You are not login yet"
}
```


