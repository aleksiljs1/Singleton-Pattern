
package singletonpattern;


public class SingletonPattern {

    public static void main(String[] args) {
     Singleton singleton1 = Singleton.getInstance("First data i whant to test");
        System.out.println("Singleton 1 Data: " + singleton1.getData());

       
        Singleton singleton2 = Singleton.getInstance("This data should not pass");
        System.out.println("Singleton 2 Data: " + singleton2.getData());
    }
    
}
