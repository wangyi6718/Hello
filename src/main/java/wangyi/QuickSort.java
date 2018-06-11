package wangyi;

public class QuickSort {
    public static void qSort(int a[],int p,int r){
        if(p<r){
            int q=partition(a,p,r);
            qSort(a,p,q-1);
            qSort(a,q+1,r);
        }
    }

    public static int partition(int a[],int p,int r){
        int i=p,j=r+1;
        int x=a[p];
        while(true){
            while(a[++i]<x && i<r);
            while(a[--j]>x);
            if(i>=j) break;
            swap(a,i,j);
        }
        a[p]=a[j];
        a[j]=x;
        return j;
    }

    public static void swap(int a[],int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {5,3,4,10,9,6,2,7,1,8};
        qSort(a,0,9);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
