import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class getMethodJVM {

    private String name;
    private int roll;

    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;

    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoll(int roll)
    {
        this.roll = roll;
    }

}

class test{
    public static void main(String[] args) {
        getMethodJVM jvm = new getMethodJVM();

        Class c = jvm.getClass();
        System.out.println(c.getName()); //class java.lang.Class --> getMethodJVM

        Method[] m = c.getDeclaredMethods();
        for(Method methods : m)
        {
            System.out.println(methods.getName()); //setRoll getRoll getName setName
        }

        Field[] f = c.getDeclaredFields();
        for(Field field : f)
        {
            System.out.println(field.getName());
        }
    }
}