/*
    作者：ThirtyTwo-boom
    开源协议：MIT
    修改时间：2024/12/15
 */
import java.util.Scanner;

public class Main {
    public static double[] BubbleSort(double[] in,boolean sortDirection){
        for (int i = 0;i<in.length;i++){
            for (int j = 0;j<in.length-i-1;j++){
                if(sortDirection){
                    if (in[j] < in[j + 1]){
                        double temp = in[j];
                        in[j] = in[j + 1];
                        in[j + 1] = temp;
                    }
                } else{
                    if (in[j] > in[j + 1]){
                        double temp = in[j];
                        in[j] = in[j + 1];
                        in[j + 1] = temp;
                    }
                }
            }
        }
        return in;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组大小");
        int arraySize = in.nextInt();
        double[] input = new double[arraySize];
        boolean sortDirection;
        System.out.println("请输入数组");
        for (int i = 0;i<arraySize;i++){
            input[i] = in.nextDouble();
        }
        System.out.println("请输入排序方向（1是升序，2是降序）");
        sortDirection = in.nextInt() != 1;
        double[] output = BubbleSort(input,sortDirection);
        System.out.println("排序后的数组：");
        for (double i : output) {
            System.out.print(i + " ");
        }
    }
}