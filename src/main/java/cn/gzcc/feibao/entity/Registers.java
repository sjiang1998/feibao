package cn.gzcc.feibao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registers {

    @Id
    @GeneratedValue
    private int id;
    private String gname;
    private String gtele;
    private String gaddress;
    private String gident;
    private String gstatus;

    public Registers(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGtele() {
        return gtele;
    }

    public void setGtele(String gtele) {
        this.gtele = gtele;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gadddress) {
        this.gaddress = gadddress;
    }

    public String getGident() {
        return gident;
    }

    public void setGident(String gident) {
        this.gident = gident;
    }

    public String getGstatus() {
        return gstatus;
    }

    public void setGstatus(String gstatus) {
        this.gstatus = gstatus;
    }
}
