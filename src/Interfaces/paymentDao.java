package Interfaces;


import Models.payment;

import java.sql.SQLException;
import java.util.List;


public interface paymentDao {
    public int add(payment pay)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public payment getPayment(int id)
            throws SQLException;
    public List<payment> getPayment()
            throws SQLException;
    public void update(payment pay)
            throws SQLException;
}
