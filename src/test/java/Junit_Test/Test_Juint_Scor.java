package Junit_Test;


import com.qinguangfeng823.entity.Tblcourse;
import com.qinguangfeng823.entity.Tblscore;
import com.qinguangfeng823.impl.ImplCous;
import com.qinguangfeng823.impl.ImplSco;
import org.junit.After;
import org.junit.Test;

import java.util.List;

/**
 * 这里是  专门用来 测试 的类
 * Created by Administrator on 2016/8/23.
 */


public class Test_Juint_Scor {


    Tblscore tblscore = new Tblscore();
    ImplSco implSco = new ImplSco();

    /**
     * 测试 查询全部的 方法
     */
    @Test
    public void testSelectScoAll() {


       List<Tblscore> list = implSco.selectScoAll();
        for(Tblscore tblscore: list){

            System.out.println(tblscore.getStuId()+"\t"+tblscore.getCourseId()+"\t"+tblscore.getScore()+"\t"+tblscore.getPkScore());
        }


    }


    /**
     * 测试 ==查询 单个分数
     */
    @Test
    public void testSelectScoId() {



        Tblscore   str= implSco.selectScoId("001");

        System.out.println(str.getStuId()+"\t"+str.getCourseId()+"\t"+str.getScore()+"\t"+str.getPkScore());


    }


    /**
     * 测试 //==删除分数信息
     */
    @Test
    public void testDeleteSco() {



        int result = implSco.deleteSco("56");
        System.out.println("受影响"+result+"行！");

    }


    /**
     * 测试 ==修改分数信息
     */
    @Test
    public void testupdateCous() {




        tblscore.setStuId("1001");
        tblscore.setCourseId("002");
        tblscore.setScore(95.3f);
        tblscore.setPkScore(56);



        int result = implSco.updateSco(tblscore);

        System.out.println("受影响"+result+"行！");
    }


    /**
     * 测试增加分数信息
     */
    @Test
    public void testInsertSco() {


        tblscore.setStuId("1018");
        tblscore.setCourseId("005");
        tblscore.setScore(20.3f);
        tblscore.setPkScore(56);

       int result= implSco.insertSco(tblscore);
        System.out.println("受影响"+result+"行！");

    }


    @After
    public void end() {

        System.out.println("程序结束了");
    }


}
