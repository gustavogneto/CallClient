
/**
 *
 * @author ggomes
 */
public class Teste implements Runnable {

    private int id;

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }

    }

    public static void main(String args[]) throws InterruptedException {

        Teste p1 = new Teste();
        p1.setId(1);
        Teste p2 = new Teste();
        p1.setId(2);
        Thread t2 = new Thread(p2);
        Thread t1 = new Thread(p1);
        t1.start();
        t2.start();

    }

    private void setId(int i) {
        this.id = i;
    }

}
