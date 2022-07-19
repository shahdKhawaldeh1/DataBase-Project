package ModelsCRUD;
import DataBaseConnector.DataBaseConnection;
import Interfaces.instructorDao;
import Models.instructor;
import Models.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class instructorDaoImplementation implements instructorDao {
    static Connection connection = DataBaseConnection.getConnection();

    @Override
    public int add(instructor instructor) throws SQLException {
        String query = "insert into instructor(instructor_id, last_name, first_name, gender, date_of_birth, address, phone, username, password1) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, instructor.getInstructor_id());
        preparedStatement.setString(2, instructor.getLast_name());
        preparedStatement.setString(3, instructor.getGender());
        preparedStatement.setDate(4, instructor.getDate_of_birth());
        preparedStatement.setString(5, instructor.getAddress());
        preparedStatement.setString(6, instructor.getPhone());
        preparedStatement.setString(7, instructor.getUsername());
        preparedStatement.setString(8, instructor.getPassword1());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from instructor where instructor_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public instructor getinstructor(int id) throws SQLException {
        String query
                = "select * from instructor where instructor_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        instructor instructor = new instructor();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            instructor.setInstructor_id(resultSet.getInt("student_id"));
            instructor.setFirst_name(resultSet.getString("first_name"));
            instructor.setLast_name("last_name");
            instructor.setGender("gender");
            instructor.setAddress("address");
            instructor.setPhone("phone");
            instructor.setUsername("username");
            instructor.setPassword1("password1");
        }
        if(check == true)
            return instructor;
        else
            return null;
    }

    @Override
    public List<instructor> getinstructors() throws SQLException {
        String query
                = "select * from instructor";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        List<instructor> instructors = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            instructor instructor = new instructor();
            instructor.setInstructor_id(resultSet.getInt("student_id"));
            instructor.setFirst_name(resultSet.getString("first_name"));
            instructor.setLast_name("last_name");
            instructor.setGender("gender");
            instructor.setAddress("address");
            instructor.setPhone("phone");
            instructor.setUsername("username");
            instructor.setPassword1("password1");
            instructors.add(instructor);
        }
        return instructors;
    }

    @Override
    public void update(instructor instructor) throws SQLException {
        String query
                = "update instructor set first_name = ?, " +
                "last_name = ?, " +
                "gender = ?, " +
                "address = ?, " +
                "phone = ?, " +
                "username = ?, " +
                "password1 = ?" +
                "where instructor_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setString(1, instructor.getFirst_name());
        preparedStatement.setString(2, instructor.getLast_name());
        preparedStatement.setString(3, instructor.getGender());
        preparedStatement.setString(4, instructor.getAddress());
        preparedStatement.setString(5, instructor.getPhone());
        preparedStatement.setString(6, instructor.getUsername());
        preparedStatement.setString(7, instructor.getPassword1());
        preparedStatement.setInt(8, instructor.getInstructor_id());
        preparedStatement.executeUpdate();
    }
    public instructor login(String username, String password) throws SQLException {
        String query
                = "select * from instructor where username = ? and password1 = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2,password);
        instructor instructor = new instructor();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            instructor.setInstructor_id(resultSet.getInt("instructor_id"));
            instructor.setFirst_name(resultSet.getString("first_name"));
            instructor.setLast_name("last_name");
            instructor.setGender("gender");
            instructor.setAddress("address");
            instructor.setPhone("phone");
            instructor.setUsername("username");
            instructor.setPassword1("password1");
        }
        if(check == true)
            return instructor;
        else
            return null;
    }
}
