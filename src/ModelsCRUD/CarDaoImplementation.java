package ModelsCRUD;

import Interfaces.CarDao;
import Models.Car;
import Models.student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static ModelsCRUD.StudentDaoImplementation.connection;

public class CarDaoImplementation implements CarDao {
    @Override
    public int add(Car car) throws SQLException {
        String query = "insert into student(car_id, model, color, year_of_manufacture) " +
                "values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, car.getCar_id());
        preparedStatement.setString(2, car.getModel());
        preparedStatement.setString(3, car.getColor());
        preparedStatement.setInt(4, car.getYear_of_manifactor());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "delete from Car where Car_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public Car getCar(int id) throws SQLException {
        String query
                = "select * from Car where Car_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        Car car = new Car();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            car.setCar_id(resultSet.getInt("Car_id"));
            car.setModel(resultSet.getString("Model"));
            car.setColor("Color");
            car.setYear_of_manifactor(resultSet.getInt("year_of_manufacture"));
        }
        if(check == true)
            return car;
        else
            return null;
    }

    @Override
    public List<Car> getCars() throws SQLException {
        String query
                = "select * from car";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        List<Car> cars = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Car car = new Car();
            car.setCar_id(resultSet.getInt("Car_id"));
            car.setModel(resultSet.getString("Model"));
            car.setColor("Color");
            car.setYear_of_manifactor(resultSet.getInt("year_of_manufacture"));

            cars.add(car);
        }
        return cars;
    }

    @Override
    public void update(Car car) throws SQLException {
        String query
                = "update car set Model = ?, " +
                "Color = ?, " +
                "year_of_manufacture = ?, " +
                "where car_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, car.getModel());
        preparedStatement.setString(2, car.getColor());
        preparedStatement.setInt(3, car.getYear_of_manifactor());

        preparedStatement.setInt(8, car.getCar_id());
        preparedStatement.executeUpdate();
    }
}
