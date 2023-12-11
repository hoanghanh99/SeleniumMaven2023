package mang;

public class BaiTap6 {
    public static void main(String[] args) {
        int[] mang6 = {1,3,4,5,6,7,8,9,10,13,12};
        if (KTMangTangDan(mang6)){
            System.out.println("Mảng được sắp xếp tăng dần");
        } else {
            System.out.println("Mảng không được sắp xếp tăng dần");
        }
    }
    public static boolean KTMangTangDan(int[] mang6){
        for (int i = 0; i < mang6.length; i++) {
            if (mang6[i] < mang6[i+1]) {
                return true;
            }
        }
        return false;
    }
}
