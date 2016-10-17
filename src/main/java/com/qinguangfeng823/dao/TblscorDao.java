package com.qinguangfeng823.dao;


import com.qinguangfeng823.entity.Tblscore;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/24.
 */
public interface TblscorDao {


        /**
         * 查询所有 分数信息的方法
         */
        List<Tblscore> selectScoAll();


        /**
         * 查询指定 UUID的   分数信息的方法
         */
        Tblscore selectScoId(Serializable pkscore );


        /**
         * 删除 分数的方法
         */

        int deleteSco(Serializable pkscore);


        /**
         * 修改 更新， 分数信息的方法
         */
        int updateSco(Tblscore tblscore);



        /**
         * 增加 分数信息的方法
         */
        int insertSco(Tblscore tblscore);




    }





