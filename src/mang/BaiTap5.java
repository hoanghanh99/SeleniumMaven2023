package mang;

public class BaiTap5 {
    public static void main(String[] args) {
        int[] mang5 = {1,3,7,5,9,11,13};
        int soChanDauTien = timSoChanDauTien(mang5);
        if (soChanDauTien != -1) {
            System.out.println("Số chẵn đầu tiên trong mảng là: " + soChanDauTien);
        } else {
            System.out.println("Không có số chẵn trong mảng");
        }
    }
    public static int timSoChanDauTien(int[] mang5) {
        for (int i = 0; i < mang5.length; i++) {
            if (mang5[i] % 2 == 0) {
                return mang5[i];
            }
        }
        return -1;
    }
}
