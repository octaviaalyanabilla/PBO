PEMINJAMAN

Class DBHelper

<img src="./db1.png"/>
<img src="./db2.png"/>
<img src="./db3.png"/>
<img src="./db4.png"/>

Digunakan untuk menyambungkan Netbeans dengan database yang ada di phpMyAdmin.

Class Jenis Barang

<img src="./jb1.png"/>
<img src="./jb2.png"/>
<img src="./jb3.png"/>
<img src="./jb4.png"/>
<img src="./jb5.png"/>
<img src="./jb6.png"/>

Pada class jenis barang berisikan variabel namabarang, IDbarang, dan keterangan dari barang yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database.

Class Kamera

<img src="./kam1.png"/>
<img src="./kam2.png"/>
<img src="./kam3.png"/>
<img src="./kam4.png"/>
<img src="./kam5.png"/>
<img src="./kam6.png"/>
<img src="./kam7.png"/>

Pada class kamera berisikan variable idkamera, harga, merek yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. Terdapat variable JenisBarang jb merupakan 
relasi class kamera pada class jenis barang dimana tiap kamera akan memiliki IDbarang yang nantinya akan muncul pada class kamera.

Class Pelanggan

<img src="./pel1.png"/>
<img src="./pel2.png"/>
<img src="./pel3.png"/>
<img src="./pel4.png"/>
<img src="./pel5.png"/>
<img src="./pel6.png"/>

Pada class pelanggan berisikan variable IDpelanggan, namapelanggan, alamat, dan nomor hp yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. 

Class Peminjaman

<img src="./pem1.png"/>
<img src="./pem2.png"/>
<img src="./pem3.png"/>
<img src="./pem4.png"/>
<img src="./pem5.png"/>
<img src="./pem6.png"/>
<img src="./pem7.png"/>
<img src="./pem8.png"/>
<img src="./pem9.png"/>

Pada class peminjaman berisikan variable IDpeminjaman, harga, tanggalpinjam, tanggalkembali yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. Terdapat variable Pelanggan pelanggan, dan JenisBarang jenisbarang
karena mereka merupakan relasi class pada class pelanggan dan class jenis barang dimana dalam form akan dimunculkan data dari pelanggan yang sudah tersimpan pada tabel pelanggan 
dan data dari kamera akan muncul dari data yang sudah tersimpan pada tabel kamera.
