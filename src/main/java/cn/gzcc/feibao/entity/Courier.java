package cn.gzcc.feibao.entity;




import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courier {

    @Id
    private  int id;
    private String cno;
    private String cname;
    private String ctele;
    private String year;
    private String cstatus;
    private int long_num;
    private int short_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtele() {
        return ctele;
    }

    public void setCtele(String ctele) {
        this.ctele = ctele;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCstatus() {
        return cstatus;
    }

    public void setCstatus(String cstatus) {
        this.cstatus = cstatus;
    }

    public int getLong_num() {
        return long_num;
    }

    public void setLong_num(int long_num) {
        this.long_num = long_num;
    }

    public int getShort_num() {
        return short_num;
    }

    public void setShort_num(int short_num) {
        this.short_num = short_num;
    }


}
