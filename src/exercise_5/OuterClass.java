package exercise_5;

import java.awt.desktop.OpenURIEvent;

public class OuterClass {
    private int i;
    public int OuterClassField;

    static class StaticNestedClass {

    }

    private void m() {
        System.out.println(i);
    }

    class InnerClass {
        void accessOuterClass(){
            i = i;
            m();
        }

        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
    }
    void testMethod(int x) {
        int y = x * 2;

        class LocalClass {
            int a;
            int b;

            public LocalClass() {
                a = x;
                b = y;
            }

            }

            LocalClass lc = new LocalClass();
            System.out.println(lc.a);
            System.out.println(lc.b);

        OuterClass obj = new OuterClass();
        obj.testMethod(10);
    }
}
