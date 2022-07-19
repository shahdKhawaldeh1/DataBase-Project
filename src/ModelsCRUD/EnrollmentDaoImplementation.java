package ModelsCRUD;

import DataBaseConnector.DataBaseConnection;
import Interfaces.EnrollmentDao;
import Models.Enrollment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentDaoImplementation implements EnrollmentDao {
    static Connection connection = DataBaseConnection.getConnection();

    @Override
    public int add(Enrollment enrollment) throws SQLException {
        String query = "insert into enrolment(E_id, time, date, day, inst_id, stu_id, car_id) " +
                "values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, enrollment.getE_id());
        preparedStatement.setString(2, enrollment.getE_time());
        preparedStatement.setDate(3, enrollment.getE_date());
        preparedStatement.setString(4, enrollment.getE_day());
        preparedStatement.setInt(5, enrollment.getInst_id());
        preparedStatement.setInt(6, enrollment.getStu_id());
        preparedStatement.setInt(7, enrollment.getCar_id());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from enrollment where enroll_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public Enrollment getEnrollment(int id) throws SQLException {
        String query
                = "select * from enrollment where enroll_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        Enrollment enrollment = new Enrollment();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            enrollment.setE_id(resultSet.getInt("enroll_id"));
            enrollment.setE_time(resultSet.getString("time"));
            enrollment.setE_date(Date.valueOf("date"));
            enrollment.setE_day("day");
            enrollment.setInst_id(resultSet.getInt("inst_id"));
            enrollment.setStu_id(resultSet.getInt("stu_id"));
            enrollment.setCar_id(resultSet.getInt("car_id"));
        }
        if(check == true)
            return enrollment;
        else
            return null;
    }

    @Override
    public List<Enrollment> getEnrollments() throws SQLException {
        String query
                = "select * from enrollment";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        List<Enrollment> enrollments = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Enrollment enrollment = new Enrollment();
            enrollment.setE_id(resultSet.getInt("enroll_id"));
            enrollment.setE_time(resultSet.getString("time"));
            enrollment.setE_date(Date.valueOf("date"));
            enrollment.setE_day("day");
            enrollment.setInst_id(resultSet.getInt("inst_id"));
            enrollment.setCar_id(resultSet.getInt("car_id"));
            enrollment.setStu_id(resultSet.getInt("stu_id"));

            enrollments.add(enrollment);
        }
        return enrollments;
    }

    @Override
    public void update(Enrollment enrollment) throws SQLException {

        String query
                = "update student set time = ?, " +
                "date = ?, " +
                "day = ?, " +
                "inst_id = ?, " +
                "stu_id = ?, " +
                "car_id = ?, " +
                "where enroll_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setTime(1, Time.valueOf(enrollment.getE_time()));
        preparedStatement.setDate(2, enrollment.getE_date());
        preparedStatement.setString(3, enrollment.getE_day());
        preparedStatement.setInt(4, enrollment.getInst_id());
        preparedStatement.setInt(5, enrollment.getStu_id());
        preparedStatement.setInt(6, enrollment.getCar_id());
        preparedStatement.setInt(7, enrollment.getE_id());
        preparedStatement.executeUpdate();
    }
}
