package cn.amu.bean;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2020-05-07 22:21
 */
public class Human {
    private static final Customer cust = new Customer();
    public static void main(String[] args) {
        String str = "dfsda";
        System.out.println(str);
        System.out.println("args = [" + args + "]");
        System.out.println("Human.main");
        System.out.println("str = " + str);
        System.out.println(str);
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(i);
        }
        for (Object o : objects) {
            System.out.println(o);
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        for (String string : strings) {
            
        }
        for (int i = 0; i < strings.size(); i++) {
        }
        for (int i = strings.size() - 1; i >= 0; i--) {
            
        }
        if (strings != null) {

        }
        if (strings == null) {

        }
        if (strings != null) {

        }


    }
}
