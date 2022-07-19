package ModelsCRUD;

import DataBaseConnector.DataBaseConnection;
import Interfaces.ReportDao;
import Models.Report;
import Models.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReportDaoImplementation implements ReportDao {
    static Connection connection = DataBaseConnection.getConnection();
    @Override
    public int add(Report report) throws SQLException {
        String query = "insert into Report(report_id, remark, score, tranning_name, inst_id, stu_id) " +
                "values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, report.getR_id());
        preparedStatement.setString(2, report.getRemark());
        preparedStatement.setString(3, report.getScore());
        preparedStatement.setString(4, report.getTranning_name());
        preparedStatement.setInt(5, report.getInst_id());
        preparedStatement.setInt(6, report.getStu_id());
        int n = preparedStatement.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query
                = "delete from report where report_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    }

    @Override
    public Report getReport(int id) throws SQLException {
        String query
                = "select * from report where report_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        Report report = new Report();
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean check = true;
        while(resultSet.next())
        {
            check = true;
            report.SetR_id(resultSet.getInt("report_id"));
            report.SetRemark(resultSet.getString("remark"));
            report.SetScore("score");
            report.SetTranning_name("tranning_name");
            report.SetInst_id(resultSet.getInt("inst_id"));
            report.SetStu_id(resultSet.getInt("stu_id"));
        }
        if(check == true)
            return report;
        else
            return null;
    }

    @Override
    public List<Report> getReports() throws SQLException {
        String query
                = "select * from report";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        List<Report> reports = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Report report = new Report();
            report.SetR_id(resultSet.getInt("report_id"));
            report.SetRemark(resultSet.getString("remark"));
            report.SetScore("score");
            report.SetTranning_name("tranning_name");
            report.SetInst_id(resultSet.getInt("inst_id"));
            report.SetStu_id(resultSet.getInt("stu_id"));
            reports.add(report);
        }
        return reports;
    }

    @Override
    public void update(Report report) throws SQLException {
        String query
                = "update report set remark = ?, " +
                "score = ?, " +
                "tranning_name = ?, " +
                "instrutor_id = ?, " +
                "student_id = ?, " +
                "where report_id = ?";
        PreparedStatement preparedStatement
                = connection.prepareStatement(query);
        preparedStatement.setString(1, report.getRemark());
        preparedStatement.setString(2, report.getScore());
        preparedStatement.setString(3, report.getTranning_name());
        preparedStatement.setInt(4, report.getInst_id());
        preparedStatement.setInt(5, report.getStu_id());
        preparedStatement.setInt(6, report.getR_id());
        preparedStatement.executeUpdate();
    }
}
