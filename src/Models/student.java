package Models;

import java.sql.Date;

public class student {

     int student_id ;
     String last_name;
     String  first_name ;
     String gender ;
     Date date_of_birth;
     String address ;
     String phone ;
     String username ;
     String password1 ;


     public student(int student_id, String last_name, String first_name, String gender, Date date_of_birth, String address, String phone, String username, String password1) {
          this.student_id = student_id;
          this.last_name = last_name;
          this.first_name = first_name;
          this.gender = gender;
          this.date_of_birth = date_of_birth;
          this.address = address;
          this.phone = phone;
          this.username = username;
          this.password1 = password1;
     }

     public student() {

     }

     public int getStudent_id() {
          return student_id;
     }

     public void setStudent_id(int student_id) {
          this.student_id = student_id;
     }

     public String getLast_name() {
          return last_name;
     }

     public void setLast_name(String last_name) {
          this.last_name = last_name;
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
}
