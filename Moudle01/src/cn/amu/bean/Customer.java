package cn.amu.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * 这是多行注释
 */
public class Customer extends Person{

    private static final String CORE = "dfdsaf";
    private static String str = "ddd";
    private static int a;

    public void eat(){
        System.out.println("客户吃饭！");
    }

    //这是单行
    public static void main(String[] args) {
        test();
        a = 10;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //region Description
        System.out.println();

        System.out.println();

        System.out.println();
        //endregion


    }

    private static void test() {
        test0();
    }

    private static void test0() {
        System.out.println("hello world!!!");
        ArrayList ll = new ArrayList();
        ArrayList list1;
        Date date = new Date();
        ll.add(223);

        ArrayList llss = new ArrayList();
    }

    public void method() {
        StringBuffer b = new StringBuffer();
    }
}
