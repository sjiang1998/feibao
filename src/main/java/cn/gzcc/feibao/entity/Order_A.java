package cn.gzcc.feibao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order_A {

    @Id
    @GeneratedValue
    private int id;
    private String aname;
    private String ano;
    private String agtype;
    private String aprice;
    private String adress;
    private String areason;
    private String acourier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAgtype() {
        return agtype;
    }

    public void setAgtype(String agtype) {
        this.agtype = agtype;
    }

    public String getAprice() {
        return aprice;
    }

    public void setAprice(String aprice) {
        this.aprice = aprice;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String address) {
        this.adress = address;
    }

    public String getAreason() {
        return areason;
    }

    public void setAreason(String areason) {
        this.areason = areason;
    }

    public String getAcourier() {
        return acourier;
    }

    public void setAcourier(String acourier) {
        this.acourier = acourier;
    }

}
