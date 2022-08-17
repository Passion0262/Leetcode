package javaguide.thread;

public class concunrrent {
    public static void main(String[] args) throws Exception{
        Thread a = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(1);
            }
        });


        a.start();
    }
}
