/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Melone
 */
public class MainT {
    public static void main (String[] args)
    {
        Thread t1=new MioT("Brontolo");
        Thread t2=new MioT("Cucciolo");
        Thread t3=new MioT("Dotto");
        Thread t4=new MioT("Eolo");
        Thread t5=new MioT("Gongolo");
        Thread t6=new MioT("Mammolo");
        Thread t7=new MioT("Pisolo");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
