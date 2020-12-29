/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author HP
 */
public class Peminjaman {
    private int IDpeminjaman, harga;
    private Pelanggan pelanggan = new Pelanggan();
    private JenisBarang jenisbarang = new JenisBarang();
    private String tanggalpinjam, tanggalkembali;


    public Peminjaman() {

    }

    public Peminjaman(Pelanggan pelanggan, JenisBarang jenisbarang, int IDpeminjaman, int harga, String tanggalpinjam, String tanggalkembali) {
        this.IDpeminjaman = IDpeminjaman;
        this.harga = harga;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
        this.pelanggan = pelanggan;
        this.jenisbarang = jenisbarang;
    }

    public int getIDpeminjaman() {
        return IDpeminjaman;
    }

    public void setIDpeminjaman(int IDpeminjaman) {
        this.IDpeminjaman = IDpeminjaman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public JenisBarang getJenisbarang() {
        return jenisbarang;
    }

    public void setJenisBarang(JenisBarang jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }
    public Peminjaman getById(int id) {
        Peminjaman pinjam = new Peminjaman();

        String query = "SELECT * FROM peminjaman n "
                + "LEFT JOIN pelanggan p ON n.idpelanggan = p.idpelanggan "
                + "LEFT JOIN jenisbarang j ON j.IDbarang = n.IDbarang "
                + "WHERE p.idpelanggan = '" + id + "'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                pinjam = new Peminjaman();
                Pelanggan p = new Pelanggan();
                JenisBarang j = new JenisBarang();
                pinjam.setPelanggan(p);
                pinjam.setJenisBarang(j);

                pinjam.setIDpeminjaman(rs.getInt("idpeminjaman"));
                pinjam.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembali(rs.getString("tanggalkembali"));
                pinjam.getPelanggan().setIDpelanggan(rs.getInt("idpelanggan"));
                pinjam.getPelanggan().setNamapelanggan(rs.getString("namapelanggan"));
                pinjam.getPelanggan().setNomorHp(rs.getString("nomortelepon"));
                pinjam.getPelanggan().setalamat(rs.getString("alamat"));
                pinjam.getJenisbarang().setIDbarang(rs.getInt("IDbarang"));
                pinjam.getJenisbarang().setNamabarang(rs.getString("namabarang"));
                pinjam.setHarga(rs.getInt("harga"));
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }
     public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> Peminjaman = new ArrayList();
        String query = "SELECT * FROM peminjaman n "
                + "LEFT JOIN pelanggan p ON n.idpelanggan = p.idpelanggan "
                + "LEFT JOIN jenisbarang j ON j.IDbarang = n.IDbarang ";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Peminjaman pin = new Peminjaman();
                Pelanggan p = new Pelanggan();
                JenisBarang j = new JenisBarang();
                pin.setPelanggan(p);
                pin.setJenisBarang(j);

                pin.setIDpeminjaman(rs.getInt("idpeminjaman"));
                pin.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pin.setTanggalkembali(rs.getString("tanggalkembali"));
                pin.getPelanggan().setIDpelanggan(rs.getInt("idpelanggan"));
                pin.getPelanggan().setNamapelanggan(rs.getString("namapelanggan"));
                pin.getPelanggan().setNomorHp(rs.getString("nomortelepon"));
                pin.getPelanggan().setalamat(rs.getString("alamat"));
                pin.getJenisbarang().setIDbarang(rs.getInt("IDbarang"));
                pin.getJenisbarang().setNamabarang(rs.getString("namabarang"));
                pin.setHarga(rs.getInt("harga"));
                Peminjaman.add(pin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Peminjaman;
    }
     public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> Peminjaman = new ArrayList();
        String query = "SELECT * FROM peminjaman p "
                + "LEFT JOIN pelanggan n ON p.idpelanggan = n.idpelanggan "
                + "LEFT JOIN jenisbarang j ON j.IDbarang = p.IDbarang "
                + "WHERE n.namapelanggan LIKE '%" + keyword + "%'"
                + "OR p.IDpeminjaman LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            while (rs.next()) {
                Peminjaman pin = new Peminjaman();
                Pelanggan p = new Pelanggan();
                JenisBarang j = new JenisBarang();
                pin.setPelanggan(p);
                pin.setJenisBarang(j);

                pin.setIDpeminjaman(rs.getInt("idpeminjaman"));
                pin.setTanggalpinjam(rs.getString("tanggalpinjam"));
                pin.setTanggalkembali(rs.getString("tanggalkembali"));
                pin.getPelanggan().setIDpelanggan(rs.getInt("idpelanggan"));
                pin.getPelanggan().setNamapelanggan(rs.getString("namapelanggan"));
                pin.getPelanggan().setNomorHp(rs.getString("nomortelepon"));
                pin.getPelanggan().setalamat(rs.getString("alamat"));
                pin.getJenisbarang().setIDbarang(rs.getInt("IDbarang"));
                pin.getJenisbarang().setNamabarang(rs.getString("namabarang"));
                pin.setHarga(rs.getInt("harga"));
                Peminjaman.add(pin);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Peminjaman;
    }
     public void save() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        if (getById(IDpeminjaman).getIDpeminjaman() == 0) {
            try {
                java.util.Date tanggalPinjam = format.parse(this.tanggalpinjam);
                java.sql.Date sqlTanggalPinjam = new java.sql.Date(tanggalPinjam.getTime());
                java.util.Date tanggalKembali = format.parse(this.tanggalkembali);
                java.sql.Date sqlTanggalKembali = new java.sql.Date(tanggalKembali.getTime());

                String SQL = "INSERT INTO peminjaman (idpelanggan, tanggalpinjam, tanggalkembali, harga, IDbarang) VALUES("
                        + "'" + this.getPelanggan().getIDpelanggan() + "',"
                        + "'" + sqlTanggalPinjam + "',"
                        + "'" + sqlTanggalKembali + "',"
                        +"'" + this.harga+"',"
                        + "'" + this.getJenisbarang().getIDbarang() + "'"
                        + ")";

                this.IDpeminjaman = DBHelper.insertQueryGetId(SQL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            String SQL = "UPDATE peminjaman SET"
                    + "idpelanggan = '" + this.getPelanggan().getIDpelanggan() + "',"
                    + "tanggalpinjam = '" + this.tanggalpinjam + "',"
                    + "tanggalkembali ='" + this.tanggalkembali + "',"
                    + "harga ='"+this.harga+"',"
                    + "IDbarang = '" + this.getJenisbarang().getIDbarang() + "'"
                    + ")";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.IDpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }  
}
