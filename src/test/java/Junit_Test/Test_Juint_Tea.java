package Junit_Test;


import com.qinguangfeng823.entity.Tblscore;
import com.qinguangfeng823.entity.Tblteacher;
import com.qinguangfeng823.impl.ImplSco;
import com.qinguangfeng823.impl.ImplTea;
import org.junit.After;
import org.junit.Test;

import java.util.List;

/**
 * 这里是  专门用来 测试 的类
 * Created by Administrator on 2016/8/23.
 */


public class Test_Juint_Tea {


    Tblteacher tblteacher = new Tblteacher();
    ImplTea implTea = new ImplTea();

    /**
     * 测试 查询全部的 方法
     */
    @Test
    public void testSelectTeaAll() {


       List<Tblteacher> list = implTea.selectTeaAll();
        for(Tblteacher tblteacher: list){

            System.out.println(tblteacher.getTeaId()+"\t"+tblteacher.getTeaName());
        }


    }


    /**
     * 测试 ==查询 单个老师
     */
    @Test
    public void testSelectTeaId() {



        Tblteacher   str= implTea.selectTeaId("001");

        System.out.println(str.getTeaId()+"\t"+str.getTeaName());


    }


    /**
     * 测试 //==删除老师信息
     */
    @Test
    public void testDeleteTea() {



        int result = implTea.deleteTea("021");
        System.out.println("受影响"+result+"行！");

    }


    /**
     * 测试 ==修改老师信息
     */
    @Test
    public void testUpdateTea() {




        tblteacher.setTeaId("021");
        tblteacher.setTeaName("Byo");


        int result = implTea.updateTea(tblteacher);

        System.out.println("受影响"+result+"行！");
    }


    /**
     * 测试增加分数信息
     */
    @Test
    public void testInsertTea() {


        tblteacher.setTeaId("021");
        tblteacher.setTeaName("Gid");


       int result= implTea.insertTea(tblteacher);
        System.out.println("受影响"+result+"行！");

    }


    @After
    public void end() {

        System.out.println("程序结束了");
    }


}
