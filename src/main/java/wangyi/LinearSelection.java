package wangyi;
import java.util.Random;
import static wangyi.QuickSort.partition;//引用快速排序分割函数
import static wangyi.QuickSort.swap;//引用快速排序交换函数

public class LinearSelection {

    public static int randomizedPartition(int a[],int p,int r){
        int i = random(p,r);
        swap(a,i,p);
        return partition(a,p,r);
    }

    public static int random(int a, int b){
        Random random = new Random();
        return a+random.nextInt(b-a+1);
    }

    public static int randomizedSelect(int a[], int p, int r, int k){
        if(p==r){
            return a[p];
        }
        int i = randomizedPartition(a,p,r),j=i-p+1;
        if(k<=j){
            return randomizedSelect(a,p,i,k);
        }
        else{
            return randomizedSelect(a,i+1,r,k-j);
        }
    }

    public static void main(String[] args) {
        int a[] = {5,3,4,10,9,6,2,7,1,8};
        System.out.println(randomizedSelect(a,0,a.length-1,10));
    }
}
