
import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class ex6 {

    public volatile static boolean flag = true;

    static class ThreadFlagReader extends Thread {

        @Override
        public void run() {
            while (flag) {

            }
            System.err.println("ThreadFlagReader completed " + flag);
        }
//������ �����, ������� ����� ������ flag
        static class ThreadFlagSetter extends Thread {

            @Override
            public void run() {

                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(ex6.class.getName()).log(Level.SEVERE, null, ex);
                }
                flag = false;
                System.err.println("Flag set to " + flag);

            }
        }

        public static void main(String[] args) {
            new ThreadFlagReader().start();
            new ThreadFlagSetter().start();
        }
    }
}
