/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleproceso;

import static java.lang.Thread.sleep;

/**
 *
 * @author PC-50
 */
public class ExampleProceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PingPong t1 = new PingPong("PING", 33);
        PingPong t2 = new PingPong("PONG", 33);
        
        t1.start();
        t2.start();
        
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
        t1.stop();
        t2.stop();
    }

}
