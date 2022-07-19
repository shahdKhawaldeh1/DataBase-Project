package Interfaces;

import Models.Report;
import Models.student;

import java.sql.SQLException;
import java.util.List;

public interface ReportDao
{
    public int add(Report report)
            throws SQLException;
    public void delete(int id)
            throws SQLException;
    public Report getReport(int id)
            throws SQLException;
    public List<Report> getReports()
            throws SQLException;
    public void update(Report report)
            throws SQLException;
}
