# Desa API

## Request

+ Endpoint : ``/desa//``
+ HTTP Method : `POST`
+ Request Body :

    ```json
      {
          "nama": "nama",
          "namaKepalaDesa" : "nama kepala desa",
          "jumlahPenduduk" : 1000,
          "kecamatan" : "kecamatan",
          "gambar" : "jpg"
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
        "nama": "nama",
          "namaKepalaDesa" : "nama kepala desa",
          "jumlahPenduduk" : 1000,
          "kecamatan" : "kecamatan",
          "gambar" : "jpg"
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
  
  ## FindByNama
  
  + Endpoint : ``/auth/test/{username}``
  + HTTP Method : `GET`
  + Path Variable :
    + nama
    + kecamatanDefaults
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
  
  
