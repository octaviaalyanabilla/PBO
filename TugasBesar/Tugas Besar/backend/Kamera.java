/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author HP
 */
public class Kamera {
    private int idkamera, harga;
    private JenisBarang jb = new JenisBarang();
    private String Merek;

    public Kamera() {

    }

    public Kamera(JenisBarang jb, int harga, String Merek) {
        this.jb = jb;
        this.harga = harga;
        this.Merek = Merek;
    }

    public int getIdkamera() {
        return idkamera;
    }

    public void setIdkamera(int idkamera) {
        this.idkamera = idkamera;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public JenisBarang getJb() {
        return jb;
    }

    public void setJb(JenisBarang jb) {
        this.jb = jb;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String Merek) {
        this.Merek = Merek;
    }
    public Kamera getById(int id) {
        Kamera kar = new Kamera();
        String query = "SELECT "
                + "k.idkamera AS idkamera, "
                + "k.merek AS merek, "
                + "k.harga AS harga, "
                + "j.IDbarang AS IDbarang, "
                + "j.namabarang AS namabarang, "
                + "j.keterangan AS keterangan "
                + "FROM kamera k "
                + "LEFT JOIN jenisbarang j ON k.IDbarang = j.IDbarang "
                + "WHERE k.idkamera = '" + id + "'";
        ResultSet rs = DBHelper.selectQuery(query);
        try {
            while (rs.next()) {
                kar = new Kamera();
                kar.setIdkamera(rs.getInt("idkamera"));
                kar.getJb().setIDbarang(rs.getInt("IDbarang"));
                kar.getJb().setNamabarang(rs.getString("namabarang"));
                kar.getJb().setKeterangan(rs.getString("keterangan"));
                kar.setMerek(rs.getString("merek"));
                kar.setHarga(rs.getInt("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kar;
    }
    public ArrayList<Kamera> getAll() {
        ArrayList<Kamera> ListKamera = new ArrayList();
        Kamera kar = new Kamera();
        String query = "SELECT "
                + "k.idkamera AS idkamera, "
                + "k.merek AS merek, "
                + "k.harga AS harga, "
                + "j.IDbarang AS IDbarang, "
                + "j.namabarang AS namabarang, "
                + "j.keterangan AS keterangan "
                + "FROM kamera k "
                + "LEFT JOIN jenisbarang j ON k.IDbarang = j.IDbarang ";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                kar = new Kamera();
                kar.setIdkamera(rs.getInt("idkamera"));
                kar.getJb().setIDbarang(rs.getInt("IDbarang"));
                kar.getJb().setNamabarang(rs.getString("namabarang"));
                kar.getJb().setKeterangan(rs.getString("keterangan"));
                kar.setMerek(rs.getString("merek"));
                kar.setHarga(rs.getInt("harga"));

                ListKamera.add(kar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKamera;
    }
    public ArrayList<Kamera> search(String keyword) {
        ArrayList<Kamera> ListKamera = new ArrayList();

        String query = "SELECT "
                + "k.idkamera AS idkamera, "
                + "k.merek AS merek, "
                + "k.harga AS harga, "
                + "j.IDbarang AS IDbarang, "
                + "j.namabarang AS namabarang, "
                + "j.keterangan AS keterangan "
                + "FROM kamera k "
                + "LEFT JOIN jenisbarang j ON k.IDbarang = j.IDbarang "
                + "WHERE k.merek LIKE '%" + keyword + "%'"
                +"OR k.idkamera LIKE '%"+keyword+"%'";
        ResultSet rs = DBHelper.selectQuery(query);

        try {
            while (rs.next()) {
                Kamera kar = new Kamera();
                kar.setIdkamera(rs.getInt("idkamera"));
                kar.getJb().setIDbarang(rs.getInt("IDbarang"));
                kar.getJb().setNamabarang(rs.getString("namabarang"));
                kar.getJb().setKeterangan(rs.getString("keterangan"));
                kar.setMerek(rs.getString("merek"));
                kar.setHarga(rs.getInt("harga"));

                ListKamera.add(kar);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKamera;
    }
    public void save() {
        if (getById(idkamera).getIdkamera() == 0) {
            String SQL = "INSERT INTO kamera (IDbarang, merek, harga) VALUES("
                    + "'" + this.getJb().getIDbarang() + "',"
                    + "'" + this.Merek + "',"
                    + "'" + this.harga + "'"
                    + ")";

            this.idkamera = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kamera SET "
                    + "IDbarang = '" + this.getJb().getIDbarang() + "',"
                    + "Merek = '" + this.Merek + "',"
                    + "harga = '" + this.harga+ "'"
                    + "WHERE idkamera = '" + this.idkamera + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kamera WHERE idkamera = '" + this.idkamera + "'";
        DBHelper.executeQuery(SQL);
    }
}
