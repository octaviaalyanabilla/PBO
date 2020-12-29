PEMINJAMAN

Class DBHelper

<img src="./db1.jpg"/>
<img src="./db2.jpg"/>
<img src="./db3.jpg"/>
<img src="./db4.jpg"/>

Digunakan untuk menyambungkan Netbeans dengan database yang ada di phpMyAdmin.

Class Jenis Barang

<img src="./jb1.jpg"/>
<img src="./jb2.jpg"/>
<img src="./jb3.jpg"/>
<img src="./jb4.jpg"/>
<img src="./jb5.jpg"/>
<img src="./jb6.jpg"/>

Pada class jenis barang berisikan variabel namabarang, IDbarang, dan keterangan dari barang yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database.

Class Kamera

<img src="./kam1.jpg"/>
<img src="./kam2.jpg"/>
<img src="./kam3.jpg"/>
<img src="./kam4.jpg"/>
<img src="./kam5.jpg"/>
<img src="./kam6.jpg"/>
<img src="./kam7.jpg"/>

Pada class kamera berisikan variable idkamera, harga, merek yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. Terdapat variable JenisBarang jb merupakan 
relasi class kamera pada class jenis barang dimana tiap kamera akan memiliki IDbarang yang nantinya akan muncul pada class kamera.

Class Pelanggan

<img src="./pel1.jpg"/>
<img src="./pel2.jpg"/>
<img src="./pel3.jpg"/>
<img src="./pel4.jpg"/>
<img src="./pel5.jpg"/>
<img src="./pel6.jpg"/>

Pada class pelanggan berisikan variable IDpelanggan, namapelanggan, alamat, dan nomor hp yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. 

Class Peminjaman

<img src="./pem1.jpg"/>
<img src="./pem2.jpg"/>
<img src="./pem3.jpg"/>
<img src="./pem4.jpg"/>
<img src="./pem5.jpg"/>
<img src="./pem6.jpg"/>
<img src="./pem7.jpg"/>
<img src="./pem8.jpg"/>
<img src="./pem9.jpg"/>

Pada class peminjaman berisikan variable IDpeminjaman, harga, tanggalpinjam, tanggalkembali yang kemudian pada form akan dimasukkan datanya dan data tersebut apabila kita 
sudah mengisi dan mengeklik button simpan maka data tersebut akan muncul pada tabel dan juga akan tersimpan pada database. Terdapat variable Pelanggan pelanggan, dan JenisBarang jenisbarang
karena mereka merupakan relasi class pada class pelanggan dan class jenis barang dimana dalam form akan dimunculkan data dari pelanggan yang sudah tersimpan pada tabel pelanggan 
dan data dari kamera akan muncul dari data yang sudah tersimpan pada tabel kamera.
