package DriverManager;

import Drivers.DriverClass;
import org.openqa.selenium.WebDriver;

public class ObjectClass extends  DriverClass{
    private static ObjectClass obj;

    private ObjectClass(){}

    public static ObjectClass createObject(){
        if(obj==null){
            obj=new ObjectClass();
        }
        return obj;
    }

}
