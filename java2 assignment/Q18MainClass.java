interface Interface1 {
    void method1();
    void method2();
}
interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}

interface Interface4 extends Interface1, Interface2, Interface3 {
    void method7();
}

class ConcreteClass implements Interface4 {
       public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface1");
    }
    public void method3() {
        System.out.println("Method 3 from Interface2");
    }

    public void method4() {
        System.out.println("Method 4 from Interface2");
    }

    public void method5() {
        System.out.println("Method 5 from Interface3");
    }

    public void method6() {
        System.out.println("Method 6 from Interface3");
    }
    public void method7() {
        System.out.println("Method 7 from Interface4");
    }
}
public class Q18MainClass {

    public static void useInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    public static void useInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    public static void useInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }
    public static void useInterface4(Interface4 obj) {
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
    }

    public static void main(String[] args) {
        
        ConcreteClass concreteObj = new ConcreteClass();

        System.out.println("Using Interface1:");
        useInterface1(concreteObj);

        System.out.println("\nUsing Interface2:");
        useInterface2(concreteObj);

        System.out.println("\nUsing Interface3:");
        useInterface3(concreteObj);

        System.out.println("\nUsing Interface4:");
        useInterface4(concreteObj);
    }
}