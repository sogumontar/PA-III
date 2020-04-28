# Penginapan Desa

#Add Penginapan

+ Endpoint : ``/penginapan/add``
+ HTTP Method : `POST`
+ Request Body :
  
  ```json
  {
      "nama": "name",
      "harga" : 100000,
      "deskripsi" : "deskripsi",
      "jumlahKamar" : 100,
      "lokasi" : "lokasi",
      "gambar" : "gambar",
      "desa" : "desa",
      "kecamatan" : "kecamatan"
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
        "harga" : 100000,
        "deskripsi" : "deskripsi",
        "jumlahKamar" : 100,
        "lokasi" : "lokasi",
        "gambar" : "gambar",
        "desa" : "desa",
        "kecamatan" : "kecamatan"
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

+ Endpoint : ``/penginapan/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000  
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

## Update by sku
+ Endpoint : ``/penginapan/update/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000,
        "keterangan" : "lama"  
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

#Penginapan update gambar

+ Endpoint : ``/penginapan/updateWithGambar/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000,
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

# Suspend penginapan

+ Endpoint : ``/penginapan/suspend/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000,
        "tanggal" : 14  
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

#Delete penginapan

+ Endpoint : ``/penginapan/delete/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000,
        "tanggal" : "14-10-2000"  
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

# Penginapan Active

+ Endpoint : ``/penginapan/activate/{sku}``
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
        "nama" : "hendra",
        "jlhKamar" : 1000,
        "alamat" : "alamat",
        "fasilitas" : "fasilitas",
        "harga" : 100000,
        "tanggalMasuk" : "12-04-2020",
        "tanggalKeluar": "10-05-2020"  
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