package ModelsCRUD;

import DataBaseConnector.DataBaseConnection;
import Interfaces.StudentDao;
import Models.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplementation
        implements StudentDao {

    static Connection connection = DataBaseConnection.getConnection();

    @Override
    public int add(student c) throws SQLException {
        String query = "insert into student(student_id, last_name, first_name, gender, date_of_birth, address, phone, username, password1) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, c.getStudent_id());
        preparedStatement.setString(2, c.getLast_name());
        preparedStatement.setString(3, c.getGender());
        preparedStatement.setDate(4, c.getDate_of_birth());
        preparedStatement.setString(5, c.getAddress());
        preparedStatement.setString(6, c.getPhone());
        preparedStatement.setString(7, c.getUsername());
        preparedStatement.setString(8, c.getPassword1());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from student where student_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public student getStudent(int id) throws SQLException {
        String query
                = "select * from student where student_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        student student = new student();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            student.setStudent_id(resultSet.getInt("student_id"));
            student.setFirst_name(resultSet.getString("first_name"));
            student.setLast_name("last_name");
            student.setGender("gender");
            student.setAddress("address");
            student.setPhone("phone");
            student.setUsername("username");
            student.setPassword1("password1");
        }
        if(check == true)
            return student;
        else
            return null;
    }

    @Override
    public List<student> getStudents() throws SQLException {
        String query
                = "select * from student";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        List<student> students = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            student student = new student();
            student.setStudent_id(resultSet.getInt("student_id"));
            student.setFirst_name(resultSet.getString("first_name"));
            student.setLast_name("last_name");
            student.setGender("gender");
            student.setAddress("address");
            student.setPhone("phone");
            student.setUsername("username");
            student.setPassword1("password1");
            students.add(student);
        }
       return students;
    }

    @Override
    public void update(student c) throws SQLException {
        String query
                = "update student set first_name = ?, " +
                "last_name = ?, " +
                "gender = ?, " +
                "address = ?, " +
                "phone = ?, " +
                "username = ?, " +
                "password1 = ?" +
                "where student_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setString(1, c.getFirst_name());
        preparedStatement.setString(2, c.getLast_name());
        preparedStatement.setString(3, c.getGender());
        preparedStatement.setString(4, c.getAddress());
        preparedStatement.setString(5, c.getPhone());
        preparedStatement.setString(6, c.getUsername());
        preparedStatement.setString(7, c.getPassword1());
        preparedStatement.setInt(8, c.getStudent_id());
        preparedStatement.executeUpdate();
    }

    @Override
    public student login(String username, String password) throws SQLException {
        String query
                = "select * from student where username = ? and password1 = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2,password);
        student student = new student();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            student.setStudent_id(resultSet.getInt("student_id"));
            student.setFirst_name(resultSet.getString("first_name"));
            student.setLast_name("last_name");
            student.setGender("gender");
            student.setAddress("address");
            student.setPhone("phone");
            student.setUsername("username");
            student.setPassword1("password1");
        }
        if(check == true)
            return student;
        else
            return null;
    }
}
