public class studentclass {
    public static class student{
        String name;
        int rollno;
        double percent;
    }
    public static class animals{
        String name;
        int age;
    }
    public static void main(String[] args) {
        student x = new student();
        x.name="rahul";
        x.rollno =12;
        x.percent = 78.9;
        System.out.println(x.name);
        System.out.println(x.rollno);
        System.out.println(x.percent);
        animals y = new animals();
        y.name = "dog";
        y.age = 6;
        System.out.println(y.name);
        System.out.println(y.age);
    }
}