package mang;

public class BaiTap4 {
    public static boolean KTsotrongmang (int[] mang4, int soCanKT) {
        for (int i = 0; i < mang4.length; i++) {
            if (mang4[i] == soCanKT) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] mang4 = {23, 45, 36, 75, 46, 99,100};
        int soCanKT = 99;
        if (KTsotrongmang(mang4, soCanKT)) {
            System.out.println(soCanKT + " " + "Tồn tại trong mảng");
        } else {
            System.out.println(soCanKT + " " + "Không tồn tại trong màng");
        }
    }

}
