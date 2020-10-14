package cn.gzcc.feibao.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_C {

//

    @Id
    private int id;
    private String name;
    private String no;
    private String address;
    private String tele;
    private String status;
    private String remarks;


    public Order_C(){}
//    public Order_C(String name){
//        this.name=name;
//        this.no="12331";
//        this.address="广州商学院";
//        this.tele="10320839022";
//        this.status="已送达";
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
