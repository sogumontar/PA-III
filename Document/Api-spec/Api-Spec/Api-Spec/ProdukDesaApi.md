#Produk Desa 

#Add

+ Endpoint : ``/produk/add``
+ HTTP Method : `POST`
+ Request Body :
  
  ```json
  {
      "nama": "name",
      "harga" : 500,
      "deskripsi" : "deskripsi",
      "desa" : "desa",
      "gambar" : "gambar"
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
       "nama": "name",
        "harga" : 500,
        "deskripsi" : "deskripsi",
        "desa" : "desa",
        "gambar" : "gambar"
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

## FindBySku

+ Endpoint : ``/produk/sku/{sku}``
+ HTTP Method : `GET`
+ Path Variable :
  + sku
+ Request Header :
  + Accept : `application/json`
  + Authorization : `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NjY1NTE5ODksImlhdCI6MTU2NjUzMzk4OX0.Kvx2VZkmckMexnTwK8A3vHSDar3J-K-dCrkJ2jmQtKdAWbw1dAjJ34WXCQXs-WO23OQPTqVF36E1STEhGZFZfg`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "data" : {
        "nama" : "ulos",
        "harga" : 100,
        "jumlah" : 1000,
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

```json
{
    "timestamp": "2019-08-23T04:22:26.690+0000",
    "code": 401,
    "status": "Unauthorized",
    "message": "You are not login yet"
}
```

#Update Produk Desa

+ Endpoint : ``/produk/update/{sku}``
+ HTTP Method : `PUT`
+ Request Body :
  
  ```json
  {
      "nama": "nama",
      "harga" : "harga",
      "deskripsi" : "deskripsi",
      "desa" : "desa",
      "gambar" : "gambar"
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
        "harga" : "harga",
        "deskripsi" : "deskripsi",
        "desa" : "desa",
        "gambar" : "gambar"
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
#Update Produk Desa With Gambar

+ Endpoint : ``/produk/updateWithGambar/{sku}``
+ HTTP Method : `PUT`
+ Request Body :
  
  ```json
  {
      "nama": "nama",
      "harga" : "harga",
      "deskripsi" : "deskripsi",
      "desa" : "desa",
      "gambar" : "gambar"
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
        "harga" : "harga",
        "deskripsi" : "deskripsi",
        "desa" : "desa",
        "gambar" : "gambar"
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

#Suspend Produk

+ Endpoint : ``/produk/suspend/{sku}``
+ HTTP Method : `PUT`
+ Path Variable :
  + sku
+ Request Header :
  + Accept : `application/json`
  + Authorization : `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NjY1NTE5ODksImlhdCI6MTU2NjUzMzk4OX0.Kvx2VZkmckMexnTwK8A3vHSDar3J-K-dCrkJ2jmQtKdAWbw1dAjJ34WXCQXs-WO23OQPTqVF36E1STEhGZFZfg`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "data" : {
        "nama" : "laptop",
        "alamat" : "silaen",
        "harga" : 1000
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

#Delete Produk Desa

+ Endpoint : ``/produk/delete/{sku}``
+ HTTP Method : `PUT`
+ Path Variable :
  + sku
+ Request Header :
  + Accept : `application/json`
  + Authorization : `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NjY1NTE5ODksImlhdCI6MTU2NjUzMzk4OX0.Kvx2VZkmckMexnTwK8A3vHSDar3J-K-dCrkJ2jmQtKdAWbw1dAjJ34WXCQXs-WO23OQPTqVF36E1STEhGZFZfg`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "data" : {
        "nama" : "laptop",
        "alamat" : "silaen",
        "harga" : 1000
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
# Produk Aktif

+ Endpoint : ``/produk/activate/{sku}``
+ HTTP Method : `PUT`
+ Path Variable :
  + sku
+ Request Header :
  + Accept : `application/json`
  + Authorization : `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqYXZhaW51c2UiLCJleHAiOjE1NjY1NTE5ODksImlhdCI6MTU2NjUzMzk4OX0.Kvx2VZkmckMexnTwK8A3vHSDar3J-K-dCrkJ2jmQtKdAWbw1dAjJ34WXCQXs-WO23OQPTqVF36E1STEhGZFZfg`
+ Response Body (Success) :

```json
{
    "code": 200,
    "status": "OK",
    "data" : {
        "nama" : "laptop",
        "alamat" : "silaen",
        "harga" : 1000,
        "kecamatan" : "laguboti"
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
