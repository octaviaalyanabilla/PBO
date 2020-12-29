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
public class JenisBarang {
    private String namabarang;
    private int IDbarang;
    private String keterangan;

    public JenisBarang() {
    }

    public JenisBarang(String namabarang, String keterangan) {
        this.namabarang = namabarang;
        this.keterangan = keterangan;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public int getIDbarang() {
        return IDbarang;
    }

    public void setIDbarang(int IDbarang) {
        this.IDbarang = IDbarang;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public JenisBarang getById(int id){
        JenisBarang jb = new JenisBarang();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jenisbarang "
        + " WHERE IDbarang = '"+id+"'");
        
        try{
            while(rs.next()){
                jb = new JenisBarang();
                jb.setIDbarang(rs.getInt("IDbarang"));
                jb.setNamabarang(rs.getString("namabarang"));
                jb.setKeterangan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return jb;
    }
    public ArrayList<JenisBarang> getAll(){
        ArrayList<JenisBarang> ListJenis = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM jenisbarang");
        
        try{
            while(rs.next()){
                JenisBarang jb = new JenisBarang();
                jb.setIDbarang(rs.getInt("idbarang"));
                jb.setNamabarang(rs.getString("namabarang"));
                jb.setKeterangan(rs.getString("keterangan"));
                
                ListJenis.add(jb);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListJenis;
    }
    public ArrayList<JenisBarang> search(String keyword){
        ArrayList<JenisBarang> ListJenis = new ArrayList();
        
        String sql = "SELECT * FROM jenisbarang WHERE "+
                " IDbarang LIKE '%"+keyword+"%'"+
                "   OR namabarang LIKE '%"+keyword+"%' "+
                "   OR keterangan LIKE '%"+keyword+"%' ";
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try{
            while(rs.next()){
                JenisBarang jb = new JenisBarang();
                jb.setIDbarang(rs.getInt("IDbarang"));
                jb.setNamabarang(rs.getString("namabarang"));
                jb.setKeterangan(rs.getString("keterangan"));
                
                ListJenis.add(jb);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListJenis;
}
    public void save(){
        if(getById(IDbarang).getIDbarang() == 0){
            String SQL = "INSERT INTO jenisbarang (namabarang, keterangan) VALUES("
                    + "     '"+this.namabarang+"',"
                    +"      '"+this.keterangan+"' "
                    +"      )";
            this.IDbarang = DBHelper.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE kategori SET" +
                         "      namabarang= '"+this.namabarang+"', "+
                         "      keterangan= '"+this.keterangan+"' "+
                         "      WHERE IDbarang = '"+this.IDbarang+"'";
            DBHelper.executeQuery(SQL);
        }
    }
     public void delete(){
        String SQL = "DELETE FROM jenisbarang WHERE IDbarang = '"+this.IDbarang+"'";
        DBHelper.executeQuery(SQL);
    }
    public String toString(){
        return namabarang;
    }
    
    
}

