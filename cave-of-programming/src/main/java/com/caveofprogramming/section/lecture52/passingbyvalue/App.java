
package com.caveofprogramming.section.lecture52.passingbyvalue;


public class App {
    public static void main(String[] args) {
        App app = new App();
        //---------------------------------
        int value=7;
        System.out.println("1 Value is: "+value);
        app.show(value);
        System.out.println("4 Value is: "+value);
        //---------------------------
        Person person = new Person("Eren");
        System.out.println("1. Person is: "+person);
        app.show(person);
        System.out.println("4. Person is: "+person);
    }
    public void show(int value){
        System.out.println("2 Value is: "+value);
        value=8;
        System.out.println("3 Value is: "+value);
    }
    public void show(Person person){
        System.out.println("2. Person is: "+person);
        person=new Person("Fatih");
        System.out.println("3. Person is: "+person);
    }

}
