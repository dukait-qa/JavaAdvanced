public interface Storable {
    void read();
    void write();
    void update();
    void delete();
    default boolean exists(){
        method1();
        method2();
        return true;
    }
    private void method1(){
        System.out.println("Hello from private method1");
    }
    private void method2(){
        System.out.println("Hello from private method2");
    }
}
