package mang;

public class Baitap2 {
    public static void main(String[] args) {
        int mang2 [] = new int[] {1,3,6,64,74,89,100};
       // int max = mang2[0];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mang2.length; i++) {
        if (mang2[i] > max ){
            max = mang2[i];}
        }
        System.out.println("Gia tri lon nhat la: "+max);
    }
}
