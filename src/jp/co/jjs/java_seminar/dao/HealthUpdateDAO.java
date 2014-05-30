package jp.co.jjs.java_seminar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import jp.co.jjs.java_seminar.beans.MyHealth;

public class HealthUpdateDAO {

    private DataSource ds;

    public HealthUpdateDAO() {
        try {
            Context initialContext = new InitialContext();
            Context envContext = (Context) initialContext
                    .lookup("java:/comp/env");
            ds = (DataSource) envContext.lookup("jdbc/crud");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    // テーブルの中から指定したIDのレコードを返す
    public MyHealth setUpdate(int id, String height, String weight,
            String sleeptime) {

        MyHealth myhealth = new MyHealth();

        try (Connection con = ds.getConnection();
                PreparedStatement ps = con
                        .prepareStatement("INSERT INTO TEST VALUES(?, ?, ?, ?, ?, ?)")) {

            try (ResultSet rs = ps.executeQuery()) {
                ps.setInt(1, rs.getInt(id));
                ps.setString(2, rs.getString("date"));
                ps.setDouble(3, rs.getDouble(height));
                ps.setDouble(4, rs.getDouble(weight));
                ps.setDouble(5, rs.getDouble("bmi"));
                ps.setDouble(6, rs.getDouble(sleeptime));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return myhealth;
    }

    public void tableUpdate(MyHealth healthUp, int upHealth) {

        try (Connection con = ds.getConnection();
                PreparedStatement ps = con
                        .prepareStatement(
                                "UPDATE HEALTH SET ID="+ healthUp.getId()
                                + ",HEIGHT="+ healthUp.getHeight()
                                + ",WEIGHT="+healthUp.getWeight()
                                + ",SLEEPTIME="+healthUp.getSleepTime()
                                + "WHERE ID=" + upHealth)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
