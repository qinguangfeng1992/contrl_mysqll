package com.qinguangfeng823.impl;

import com.qinguangfeng823.dao.TblcouseDao;
import com.qinguangfeng823.dao.TblstuDao;
import com.qinguangfeng823.dao.Utils;
import com.qinguangfeng823.entity.Tblcourse;
import com.qinguangfeng823.entity.Tblstudent;
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
public class ImplCous extends Utils implements TblcouseDao {





    @Override//==查询全部课程
    public List<Tblcourse> selectCousAll() {
        try {

            String str = "select * from Tblcourse";

            getConnection();//打开连接

            queryRunner = new QueryRunner();



            return  queryRunner.query(connection, str, new BeanListHandler<Tblcourse>(Tblcourse.class));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }

        return null;

    }

    @Override//==查询 单个课程
    public Tblcourse selectCousId(Serializable CourseId) {

        try {
            getConnection();
            String str = "SELECT * FROM `Tblcourse` where CourseId=?";
            queryRunner = new QueryRunner();
            return queryRunner.query(connection, str, new BeanHandler<Tblcourse>(Tblcourse.class), CourseId);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }


        return null;
    }

    @Override//==删除课程信息
    public int deleteCous(Serializable CourseId) {

        try {
            getConnection();
            String str = "delete from Tblcourse where CourseId=?";

            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, CourseId);


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }


        return -1;
    }

    @Override//==修改课程信息
    public int updateCous(Tblcourse tblcourse) {

        try {
            getConnection();
            String str = "update  Tblcourse set coursename=?, teaid=?  where courseid=?";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblcourse.getCourseName(), tblcourse.getTeaId(), tblcourse.getCourseId());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {

            close(connection, null, null);
        }
        return -1;
    }

    @Override//==增加课程信息
    public int insertCous(Tblcourse tblcourse) {
        try {
            getConnection();
            String str = "INSERT INTO Tblcourse (courseid, coursename, teaid  ) VALUES(?,?,?)";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblcourse.getCourseId(), tblcourse.getCourseName(),tblcourse.getTeaId());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }

        return -1;
    }
}