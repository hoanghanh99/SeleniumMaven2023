//package bien;
//
//public class learnvariable {
//    // hàm xây dựng trùng với hàm class
//    public learnvariable ()
//    {
//
//    }
//    //block
//    static {
//
//    }
//    public void sayHello() {
//        int n = 10; //đây là biến local
//        System.out.println("Gia tri cua n la:" +n);
//    }
//    //biến
//    public static void main(String[] args) {
//        // Đây là biến local: nằm trong hàm
//        // Không dùng phạm vi truy cập (public, private, protected)
//        // ví dụ: public String name = "hanh"
//        String name = "Hanh Test";
//        int age = 24;
//        String address = "Ha Noi";
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(address);
//        learnvariable bienLocal = new learnvariable();
//        bienLocal.sayHello();
//    }
//}
//// biến toàn cục: Nằm ngoài hàm, trong class