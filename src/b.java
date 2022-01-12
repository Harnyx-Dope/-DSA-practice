class SampleDemo implements Runnable {
    private Thread t;
    private String threadname;

    SampleDemo(String threadname) {
        this.threadname = threadname;
    }

    public void run() {
        while (true)
            System.out.print(threadname);

    }

    public void start() {
        if (t == null) {
            t = new Thread(this,threadname);
            t.start();
        }
    }
}
public class b
{
    public static void main(String[] args)
    {
        SampleDemo A=new SampleDemo("A");
        SampleDemo B=new SampleDemo("B");

    }

}
