package Interfaces;
import Models.student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    public int add(student c)
        throws SQLException;
    public void delete(int id)
        throws SQLException;
    public student getStudent(int id)
        throws SQLException;
    public List<student> getStudents()
        throws SQLException;
    public void update(student c)
        throws SQLException;

    public student login(String username , String password)
        throws SQLException;



}
