package refactoring_guru.java;

import java.io.*;
import java.math.BigDecimal;



public class Test {

    public static void main(String[] args) throws Exception {
        contextLoads();
    }

    static void contextLoads() throws Exception {
        String str = "�";
        String strCode = new String(str.getBytes("UTF-8"), "GBK");
        System.out.println(strCode);
    }


}

