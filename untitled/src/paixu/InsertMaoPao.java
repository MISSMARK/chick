package paixu;

/**
 * Created by miss on 15/4/21.21
 */

public class InsertMaoPao {
    public void insertMao(int []data){
        try{
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data.length-1;j++){
                    if(data[j]>data[j+1]){
                        int temp=data[j];
                        data[j]=data[j+1];
                        data[j+1]=temp;
                    }
                }
            }
        }catch(Exception e){
            System.out.println("索引出错");
            e.printStackTrace();
        }
        System.out.print("冒泡排序：");
        for(int x:data){
            System.out.print(x+" ");
        }
    }
}