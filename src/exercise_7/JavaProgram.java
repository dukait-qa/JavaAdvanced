package exercise_7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class JavaProgram {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {

        Class c = Class.forName("exercise_7.MyClass");
        MyClass mc = new MyClass();

        String stringArgument = "John";
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Invoking of method: " + method.getName());

            if (method.getParameterCount() > 0) {
                Parameter[] param =  method.getParameters();
                if (param.length == 1) {
                    if (param[0].getType() == String.class) {
                        method.invoke(mc, stringArgument);
                    }
                }
            } else {
                method.invoke(mc);
            }
        }
    }
}
