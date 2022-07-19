package Models;

import java.sql.Date;

public class payment{

    int p_id;
    float amount;
    Date p_date ;
    int s_id ;
    public payment(){}

    public payment(int p_id) {
        this.p_id = p_id;
    }

    public payment(float amount) {
        this.amount = amount;
    }

    public payment(Date p_date) {
        this.p_date = p_date;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public Date getP_date() {
        return p_date;
    }

    public void setP_date(Date p_date) {
        this.p_date = p_date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}