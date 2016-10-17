package com.qinguangfeng823.impl;



import com.qinguangfeng823.dao.TblteaDao;
import com.qinguangfeng823.dao.Utils;

import com.qinguangfeng823.entity.Tblteacher;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.Serializable;
import java.util.List;



/**
 * 这是 实现 接类口 的实现
 * 具体 写怎么 增删查改
 * Created by Administrator on 2016/8/23.
 */
public class ImplTea extends Utils implements TblteaDao {





    @Override//==查询全部老师
    public List<Tblteacher> selectTeaAll() {
        try {

            String str = "select * from Tblteacher";

            getConnection();//打开连接

            queryRunner = new QueryRunner();



            return  queryRunner.query(connection, str, new BeanListHandler<Tblteacher>(Tblteacher.class));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }

        return null;

    }

    @Override//==查询 单个老师
    public Tblteacher selectTeaId(Serializable teaid) {

        try {
            getConnection();
            String str = "SELECT * FROM `Tblteacher` where teaid=?";
            queryRunner = new QueryRunner();
            return queryRunner.query(connection, str, new BeanHandler<Tblteacher>(Tblteacher.class), teaid);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }


        return null;
    }

    @Override//==删除老师信息
    public int deleteTea(Serializable teaid) {

        try {
            getConnection();
            String str = "delete from Tblteacher where teaid=?";

            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, teaid);


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }


        return -1;
    }

    @Override//==修改老师信息
    public int updateTea(Tblteacher tblteacher) {

        try {
            getConnection();
            String str = "update  Tblteacher set teaname=? where teaid=?";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblteacher.getTeaName(), tblteacher.getTeaId());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {

            close(connection, null, null);
        }
        return -1;
    }

    @Override//==增加老师信息
    public int insertTea(Tblteacher tblteacher) {
        try {
            getConnection();
            String str = "INSERT INTO Tblteacher (teaid,teaname  ) VALUES(?,?)";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblteacher.getTeaId(),tblteacher.getTeaName());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }

        return -1;
    }
}