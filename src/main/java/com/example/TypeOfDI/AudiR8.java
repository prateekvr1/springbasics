package com.example.TypeOfDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AudiR8 {
    Tyre t;
    AudiEngine e;

    public Tyre getT() {
        return t;
    }

    public void setT(Tyre t) {
        System.out.println("Instantiated via Setter");
        this.t = t;
    }

    public AudiEngine getE() {
        return e;
    }

    public void setE(AudiEngine e) {
        System.out.println("Instantiated via Setter");
        this.e = e;
    }
    AudiR8(AudiEngine a1,Tyre t1){
        System.out.println("Instantiated via Constructor");
        this.e=a1;
        this.t=t1;
    }
    public AudiR8(){}

    public String toString()
    {
        return e.toString() + " " + t.toString();
    }
public static void main(String args[]){
    ApplicationContext act=new ClassPathXmlApplicationContext("ApplicationContext.xml");
    // Instantiating the obj1 via Constructor DI
    AudiR8 obj1
            = (AudiR8) act
            .getBean("InjectwithConstructor");

    // Instantiating the obj1 via Setter DI
    AudiR8 obj2
            = (AudiR8)act
            .getBean("InjectwithSetter");
    System.out.println(obj1);
    System.out.println(obj2);
}

}
