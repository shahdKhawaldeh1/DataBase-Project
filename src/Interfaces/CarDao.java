package Interfaces;

import Models.Car;
import Models.student;

import java.sql.SQLException;
import java.util.List;

public interface CarDao {

    public int add(Car car)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Car getCar(int id)
            throws SQLException;
    public List<Car> getCars()
            throws SQLException;
    public void update(Car car)
            throws SQLException;
}
