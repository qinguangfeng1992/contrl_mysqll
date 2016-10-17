package com.qinguangfeng823.impl;


import com.qinguangfeng823.dao.TblscorDao;
import com.qinguangfeng823.dao.Utils;

import com.qinguangfeng823.entity.Tblscore;
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
public class ImplSco extends Utils implements TblscorDao {





    @Override//==查询全部分数
    public List<Tblscore> selectScoAll() {
        try {

            String str = "select * from Tblscore";

            getConnection();//打开连接

            queryRunner = new QueryRunner();



            return  queryRunner.query(connection, str, new BeanListHandler<Tblscore>(Tblscore.class));


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }

        return null;

    }

    @Override//==查询 单个分数
    public Tblscore selectScoId(Serializable pkscore) {

        try {
            getConnection();
            String str = "SELECT * FROM `Tblscore` where pkscore=?";
            queryRunner = new QueryRunner();
            return queryRunner.query(connection, str, new BeanHandler<Tblscore>(Tblscore.class), pkscore);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(connection, null, null);
        }


        return null;
    }

    @Override//==删除分数信息
    public int deleteSco(Serializable pkscore) {

        try {
            getConnection();
            String str = "delete from Tblscore where pkscore=?";

            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, pkscore);


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }


        return -1;
    }

    @Override//==修改分数信息
    public int updateSco(Tblscore tblscore) {

        try {
            getConnection();
            String str = "update  Tblscore set stuid=?, courseid=?,score=?  where pkscore=?";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblscore.getStuId(), tblscore.getCourseId(), tblscore.getScore(), tblscore.getPkScore());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {

            close(connection, null, null);
        }
        return -1;
    }

    @Override//==增加分数信息
    public int insertSco(Tblscore tblscore) {
        try {
            getConnection();
            String str = "INSERT INTO Tblscore (stuid, courseid, score,pkscore  ) VALUES(?,?,?,?)";
            queryRunner = new QueryRunner();

            return queryRunner.update(connection, str, tblscore.getStuId(), tblscore.getCourseId(), tblscore.getScore(), tblscore.getPkScore());


        } catch (Exception e) {

            e.printStackTrace();


        } finally {
            close(connection, null, null);

        }

        return -1;
    }
}