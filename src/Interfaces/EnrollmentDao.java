package Interfaces;

import Models.Enrollment;
import Models.student;

import java.sql.SQLException;
import java.util.List;

public interface EnrollmentDao {
    public int add(Enrollment enrollment)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Enrollment getEnrollment(int id)
            throws SQLException;
    public List<Enrollment> getEnrollments()
            throws SQLException;
    public void update(Enrollment enrollment)
            throws SQLException;
}
