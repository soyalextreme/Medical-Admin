package model;

import java.util.Date;

public interface ISchedulable {

    void schedule(Date date, String time);


    default void defaultMethod(){
        System.out.println("Hello from the Iterface ISchedulabe");
    }


    private void privateMethod(final String string){
        System.out.println(string);
    }


}
