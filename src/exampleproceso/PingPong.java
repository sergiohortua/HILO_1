/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleproceso;

/**
 *
 * @author PC-50
 */
public class PingPong extends Thread {

    private String word;
    private int delay;

    public PingPong(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println(word);
            try {
                sleep(delay);                
            } catch (InterruptedException e) {
                return;
            }
        }

    }

}
