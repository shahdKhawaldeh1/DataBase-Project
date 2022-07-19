package Models;


import java.sql.Date;

public class Enrollment{


    int e_id;
    String e_time;
    Date e_date;
    String e_day;
    int  inst_id;
    int car_id ;
    int stu_id;

    public Enrollment(int e_id ,  String e_time, Date e_date,String e_day, int  inst_id, int car_id ,
    int stu_id)
{
        this.e_id = e_id;
        this.e_date=e_date;
        this.car_id=car_id;
        this.e_day=e_day;
        this.e_time=e_time;
        this.stu_id=stu_id;
        this.inst_id=inst_id;
    }
public Enrollment(){}
    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getInst_id() {
        return inst_id;
    }

    public void setInst_id(int inst_id) {
        this.inst_id = inst_id;
    }

    public String getE_day() {
        return e_day;
    }

    public void setE_day(String e_day) {
        this.e_day = e_day;
    }

    public Date getE_date() {
        return e_date;
    }

    public void setE_date(Date e_date) {
        this.e_date = e_date;
    }

    public String getE_time() {
        return e_time;
    }

    public void setE_time(String e_time) {
        this.e_time = e_time;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }
}