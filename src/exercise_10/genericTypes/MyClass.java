package exercise_10.genericTypes;

import java.util.SortedMap;

//public class MyClass {
//    public Object object;
//}
public class MyClass<T, S, U> {

        public T t;
        public S s;
        public U u;

    public MyClass(T t, S s, U u) {
            this.t = t;
            this.s = s;
            this.u = u;


        }
    }

