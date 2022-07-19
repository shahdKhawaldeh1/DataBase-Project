package Models;

import java.sql.Date;

public class instructor {
    int instructor_id;
    String last_name;
    String first_name;
    String  gender;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    Date date_of_birth;
    String address;
    String phone;
    String username ;
    String password1 ;
    public instructor(int instructor_id ,  String last_name, String first_name,
                      String  gender,Date date_of_birth,String address, String phone,String username,String password1) {
        this.instructor_id = instructor_id;
        this.last_name= last_name;
        this.date_of_birth= date_of_birth;
        this.address= address;
        this.password1= password1;
        this.username= username;
        this.first_name=first_name;
        this.gender=gender;
        this.phone=phone;
    }
    public instructor() {

    }

}
