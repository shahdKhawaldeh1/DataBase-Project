package ModelsCRUD;

import DataBaseConnector.DataBaseConnection;
import Interfaces.paymentDao;
import Models.payment;
import Models.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class paymentDaoImplementation implements paymentDao {
    static Connection connection = DataBaseConnection.getConnection();

    @Override
    public int add(payment pay) throws SQLException {
        String query = "insert into payment(pay_id, amount, p_date, s_id) " +
                "values (?, ?, ?, ?)";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, pay.getP_id());
        preparedStatement.setFloat(2, pay.getAmount());
        preparedStatement.setDate(3, pay.getP_date());
        preparedStatement.setInt(4, pay.getS_id());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from payment where pay_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public payment getPayment(int id) throws SQLException {
        String query
                = "select * from payment where pay_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        payment payment = new payment();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            payment.setP_id(resultSet.getInt("pay_id"));
            payment.setAmount(Float.parseFloat(("amount")));
            payment.setP_date(Date.valueOf("Date"));
            payment.setS_id(resultSet.getInt("student_id"));
        }
        if(check == true)
            return payment;
        else
            return null;
    }

    @Override
    public List<payment> getPayment() throws SQLException {
        String query
                = "select * from payment";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        List<payment> payments = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            payment payment = new payment();
            payment.setP_id(resultSet.getInt("pay_id"));
            payment.setAmount(Float.parseFloat(("amount")));
            payment.setP_date(Date.valueOf("Date"));
            payment.setS_id(resultSet.getInt("student_id"));
            payments.add(payment);
        }
        return payments;
    }

    @Override
    public void update(payment pay) throws SQLException {
        String query
                = "update student set Amount = ?, " +
                "date = ?, " +
                "student_id = ?, " +
                "where pay_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setFloat(1, pay.getAmount());
        preparedStatement.setDate(2, pay.getP_date());
        preparedStatement.setInt(3, pay.getS_id());
        preparedStatement.setInt(4, pay.getP_id());

        preparedStatement.executeUpdate();
    }
}
