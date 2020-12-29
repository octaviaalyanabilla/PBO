/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Pelanggan {
    public String namapelanggan;
    public String alamat;
    public String nomorhp;
    private int IDpelanggan;

    public Pelanggan() {

    }

    public void Pelanggan(String namapelanggan, String alamat, String nomorhp, int IDpelanggan) {
        this.namapelanggan = namapelanggan;
        this.alamat = alamat;
        this.nomorhp = nomorhp;
        this.IDpelanggan = IDpelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }

    public void setNomorHp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getNomorHp() {
        return nomorhp;
    }

    public void setIDpelanggan(int IDpelanggan) {
        this.IDpelanggan = IDpelanggan;
    }

    public int getIDpelanggan() {
        return IDpelanggan;
    }

    public int getByID(int IDpelanggan) {
        return getByID(IDpelanggan);
    }

    public void setByID(int IDpelanggan) {
        this.IDpelanggan = IDpelanggan;
    }

    public String toString() {
        return namapelanggan;
    }

    public Pelanggan getById(int id) {
        Pelanggan pel = new Pelanggan();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pelanggan WHERE IDpelanggan = '" + id + "'");

        try {
            while (rs.next()) {
                pel = new Pelanggan();
                pel.setIDpelanggan(rs.getInt("IDpelanggan"));
                pel.setNamapelanggan(rs.getString("namapelanggan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pel;
    }

    public ArrayList<Pelanggan> getAll() {
        ArrayList<Pelanggan> ListPelanggan = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pelanggan");

        try {
            while (rs.next()) {
                Pelanggan pel = new Pelanggan();
                pel.setIDpelanggan(rs.getInt("IDpelanggan"));
                pel.setNamapelanggan(rs.getString("Namapelanggan"));
                pel.setalamat(rs.getString("alamat"));
                pel.setNomorHp(rs.getString("nomortelepon"));

                ListPelanggan.add(pel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPelanggan;
    }

    public ArrayList<Pelanggan> search(String keyword) {
        ArrayList<Pelanggan> ListPelanggan = new ArrayList();
        String sql = "SELECT * FROM pelanggan WHERE "
                + "namapelanggan LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Pelanggan pel = new Pelanggan();
                pel.setIDpelanggan(rs.getInt("IDpelanggan"));
                pel.setNamapelanggan(rs.getString("namapelanggan"));
                pel.setalamat(rs.getString("alamat"));
                pel.setNomorHp(rs.getString("nomortelepon"));

                ListPelanggan.add(pel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPelanggan;
    }
     public void save(){
        if(getById(IDpelanggan).getIDpelanggan() == 0){
            String SQL = "INSERT INTO pelanggan (namapelanggan, nomortelepon,alamat) VALUES("
                    + "'" + this.namapelanggan + "',"
                    + "'" + this.nomorhp + "',"
                    + "'" + this.alamat + "'"
                    + ")";
            this.IDpelanggan = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE pelanggan set "
                    + " namapelanggan = '" + this.namapelanggan + "', "
                    + " nomortelepon = '" + this.nomorhp+"', "
                    + " alamat = '"+this.alamat + "',"
                    + " WHERE IDpelanggan = '" + this.IDpelanggan + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM pelanggan WHERE IDpelanggan = '" + this.IDpelanggan + "'";
        DBHelper.executeQuery(SQL);
    }
}
