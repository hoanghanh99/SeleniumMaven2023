package mang;

public class LyThuyet {
    public static void main(String[] args) {
        //1. khai báo mảng
        String [] mangStr;
        Float [] mangFl;
        Double [] mangdb;
        //2. khoi tạo kèm theo kích thước
        String [] mangStr1 = new String[3];
        int [] mangint = new int[5];
        //3. khoi tao mang kem theo gia tri ban dau
        String [] mangStr2 = new String[]{"A", "B", "c"};
        int [] mangint2 = new int[]{1, 2, 3, 4, 5};
        //truy xuat phan tu theo index
        System.out.println(mangint2[1]);
    }
}
