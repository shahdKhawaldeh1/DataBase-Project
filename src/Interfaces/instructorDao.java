package Interfaces;

import Models.instructor;

import java.sql.SQLException;
import java.util.List;


public interface instructorDao {
    public int add(instructor instructor)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public instructor getinstructor(int id)
            throws SQLException;
    public List<instructor> getinstructors()
            throws SQLException;
    public void update(instructor instructor)
            throws SQLException;

    public instructor login(String username , String password)
            throws SQLException;
}
