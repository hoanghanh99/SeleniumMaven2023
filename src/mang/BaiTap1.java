package mang;

public class BaiTap1 {
    public static void main(String[] args) {
        int mang1 [] = new int[] {1,2,3,4,5};
        int tong = 0;
        for (int i = 0; i < mang1.length; i++) {
            tong = tong + mang1[i];}
        System.out.println("Tong cac pt la: " + tong);
    }
}
