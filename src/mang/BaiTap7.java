package mang;

import java.util.HashMap;
import java.util.Map;

public class BaiTap7 {
    public static void main(String[] args) {
        int[] mang7 = {1,3,4,5,6,7,8,9,10,13,12};
        int S = 10;
//        timCapSoTongBangS(mang7, S);
//    }
//    //hàm tìm tất cả các cặp số có tổng bằng S trong mảng
//    public static void timCapSoTongBangS(int[] mang7, int S){
//        Map<Integer, Integer> map = new HashMap<>(); // sử dụng map để lưu các số đã xem qua
//        for (int i = 0; i < mang7.length; i++) {
//            int soConLai = S - mang7[i];
//            //Kiểm tra xem số còn lại đã xuất hiện trong mảng chưa
//            if (map.containsKey(soConLai)){
//                System.out.println("Cặp số có tổng bằng " + S + ": (" + soConLai + " , " + mang7[i] +")");
//            }
//            //Lưu số hiện tại vào map
//            map.put(mang7[i], i);
//        }
        for (int i = 0; i < mang7.length; i++) {
            for (int j = i+1; j < mang7.length; j++) {
                if (mang7[i] + mang7[j] == S) {
                    System.out.println("Cặp số có tổng bằng " + S + ": (" + mang7[i] + " + " + mang7[j] + " = " + S + ")");
                }
            }
        }



    }
}
