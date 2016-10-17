package com.qinguangfeng823.dao;




import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * 这是 工具类
 * Created by Administrator on 2016/8/23.
 */
public class Utils {
    protected  Connection connection;

    protected QueryRunner queryRunner;

/**
 *  ==获取连接的方法
 */

    public  Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String str="jdbc:mysql://127.0.0.1:3306/mysqll?useUnicoding=true&characterEncoding=utf8";
            connection = DriverManager.getConnection(str, "root", "hzit");

} catch (Exception e) {
            e.printStackTrace();
        }
    return connection;
    }


/**
 *  ==获取连接的方法
 */
    public  void close(Connection connection,Statement statement,ResultSet resultSet){

        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        if(statement!=null){
            try {

                statement.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        if(connection!=null){
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }



    }

}
