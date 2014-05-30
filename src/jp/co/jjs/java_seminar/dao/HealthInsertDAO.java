package jp.co.jjs.java_seminar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class HealthInsertDAO {

    private DataSource ds;

    public HealthInsertDAO() {
        try {
            Context initialContext = new InitialContext();
            Context envContext = (Context) initialContext
                    .lookup("java:/comp/env");
            ds = (DataSource) envContext.lookup("jdbc/crud");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    Calendar cal1 = Calendar.getInstance(); // (1)オブジェクトの生成

    int month = cal1.get(Calendar.MONTH) + 1; // (3)現在の月を取得
    int day = cal1.get(Calendar.DATE); // (4)現在の日を取得



    public void getHealthIns(double height, double weight,
            double sleeptime) {
        try (Connection con = ds.getConnection();
                PreparedStatement ps = con
                        .prepareStatement("INSERT INTO HEALTH (DATE,HEIGHT,WEIGHT,BMI,SLEEPTIME) VALUES(?,?,?,?,?)")) {

            double bmi = height/100;

            System.out.println(month);
            ps.setInt(1, (month * 100) + day);
            ps.setDouble(2, height);
            ps.setDouble(3, weight);
            ps.setDouble(4, weight/(bmi * bmi));
            ps.setDouble(5, sleeptime);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
