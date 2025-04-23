public class classLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClass());
        System.out.println(String.class.getClassLoader());
        System.out.println(classLoader.class.getClassLoader());
    }
}
