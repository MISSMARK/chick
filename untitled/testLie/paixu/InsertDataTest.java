package paixu;

import static org.junit.Assert.*;

public class InsertDataTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("1.1");
    }

    @org.junit.Test
    public void testInsertDa() throws Exception {
        int data []=new int[3];

        data[0]=3;
        data[1]=1;
        data[2]=2;

        InsertData insetda=new InsertData();
        insetda.insertDa(data);

        InsertData ins = new InsertData();
        ins.insertDa(data);
        System.out.println("");
        System.out.println();
    }

    public String str;



}