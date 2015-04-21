package paixu;

import java.util.Scanner;

/**
 * Created by miss on 15/4/21.21
 */
public class TestData {

    public void getData() {
        int count = 0;
        System.out.println("请依次输入您所需要排列的数值 以空格分隔例如：5 8 9 ...");
        System.out.print("输入数值为：");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String [] str=s.split(" ");
        count=str.length;
        int data[]=new int[count];
        for(int i=0;i<count;i++){
            data[i]=Integer.parseInt(str[i]);
        }

//  for (int i = 0; i < s.length(); i++) {
//   char c = s.charAt(i);
//   if (c >= '0' && c <= '9')
//    count++;
//  }
        //System.out.println(count);
    }

    public static void main(String[] args) {
//
        int count = 0;

        System.out.println("请依次输入您所需要排列的数值 以空格分隔例如：5 8 9 ...");
        System.out.print("输入数值为：");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String [] str=s.split(" ");
        count=str.length;
        int data[]=new int[count];
        for(int i=0;i<count;i++){
            data[i]=Integer.parseInt(str[i]);
        }

        // TODO Auto-generated method stub
        InsertData insetda=new InsertData();
        insetda.insertDa(data);
        InsertMaoPao im=new InsertMaoPao();
        im.insertMao(data);
    }

}
