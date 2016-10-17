package com.qinguangfeng823;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Administrator on 2016/8/23.
 */
public class TestSql_Connec {

 public static void main(String[] args) {


        try {

            Class.forName("com.mysql.jdbc.Driver");
       Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysqll", "root", "hzit");
            System.out.println(connection.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
