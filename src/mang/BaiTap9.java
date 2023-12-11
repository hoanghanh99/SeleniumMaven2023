package mang;

public class BaiTap9 {
    public static void main(String[] args) {
        int mang9[] = new int[]{1, 3, 6, 64, 74, 89, 100};
        int soLonThuHai = timSoLonThuHai(mang9);
        if (soLonThuHai != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ hai trong mảng là: " + soLonThuHai);
        } else {
            System.out.println("Mảng không có số lớn thứ hai");
        }
    }
    //hàm tìm số lớn thứ hai trong mảng
    public static int timSoLonThuHai(int[] mang9) {
        if (mang9.length < 2) {
            //nếu mảng có ít hơn 2 phần tử thì không có số lớn t2
            return Integer.MIN_VALUE;
        }
        int lonNhat = Integer.MIN_VALUE;
        int lonThuHai = Integer.MIN_VALUE;
        for (int i = 0; i < mang9.length; i++) {
            if (mang9[i] > lonNhat ){
                lonThuHai = lonNhat;
                lonNhat = mang9[i];
            }else if (mang9[i] > lonThuHai && mang9[i] < lonNhat){
                //Cập nhật số lớn t2 nếu tìm thấy số lớn hơn số lớn t2 hiện tại và nhỏ hơn số lớn nhất
                lonThuHai = mang9[i];
            }
        }
        return lonThuHai;
    }
}
