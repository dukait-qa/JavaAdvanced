package exercise_10.genericTypes;

import static exercise_10.genericTypes.MyClass2.showInfo;

public class JavaProgram {
    public static void main(String[] args) {

        MyClass2<Integer> myClass1 = new MyClass2<>();
        myClass1.t                                                                                                   = 15;
        myClass1.showResult();

        MyClass2<Double> myClass2 = new MyClass2<>();
        myClass2.t = 15.0;
        myClass2.showResult();

        showInfo(13);
        showInfo("HelloWorld");
        showInfo(new Object());

    }
}
