package cn.paixu;

public class InsertData {
    public void insertDa(int... data){
        for(int i=1;i<data.length;i++){
            int temp=data[i];//第一步取插入的数
            //判断插入的值与它插入位置的前一位进行比较，如果比前一位大，就不用变更位置，如果小于则下面
            if(temp<data[i-1]){
                int j=i-1;
                for(;j>=0&&data[j]>temp;j--){
                    data[j+1]=data[j];//比较后交换
                }
                data[j+1]=temp;
            }
            //插入数值小于前面的数值，依次比较


        }
        System.out.print("插入排序：");
        for(int x:data){
            System.out.print(x+" ");
        }
    }

}