package mang;

public class BaiTap8 {
    public static void main(String[] args) {
        int[] mangSoNguyen = {5, 1, 8, 3, 10, 9};

        sortArray(mangSoNguyen);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int so : mangSoNguyen) {
            System.out.print(so + " ");
        }
    }

    public static void sortArray(int[] mang) {
        int n = mang.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (mang[j] > mang[j + 1]) {
                    int temp = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = temp;
                }
            }
        }
    }
}
