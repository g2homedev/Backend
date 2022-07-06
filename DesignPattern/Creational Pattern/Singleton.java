/*
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance and provide a global access point to this instance.
 * Singleton đảm bảo chỉ duy nhất một thể hiện (instance) được tạo ra và nó sẽ cung cấp cho bạn một method để có thể truy xuất được thể hiện duy nhất đó mọi lúc mọi nơi trong chương trình.
 *
 * private constructor để hạn chế truy cập từ class bên ngoài.
 * Đặt private static final variable đảm bảo biến chỉ được khởi tạo trong class.
 * Có một method public static để return instance được khởi tạo ở trên.
 * 
 */
public class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getIntance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}