package week_5;

import week_1.AccessDemo1;

public class AccessDemo3 extends AccessDemo1 {

    public static void main(String[] args) {
        AccessDemo1 obj = new AccessDemo1();
        // default is  just like protected, but not available to child classes
        //System.out.println(obj.defaultVar);
        // public is available to anyone anywhere within this application
        System.out.println(obj.publicVar);
        // protected is only available within the same package, or to child classes
        //System.out.println(obj.protectedVar);
    }

}