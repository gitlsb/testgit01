package test01;

/**
 * Created by dagai on 2017/9/10.
 */
public class ProduceConsumer {
    public static void main(String[] args){
        ShareResourse sr = new ShareResourse();
//        Thread t = new Thread();
//        t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("catch到了");
//            }
//        });
        new Thread(() -> {
            for(int i = 0; i < 20 ;i++){
                sr.increment();
            }
        },"aa").start();
        new Thread(() -> {
            for(int i = 0; i < 20 ;i++){
                sr.decrement();
            }
        },"bb").start();
    }

}

class  ShareResourse {
    private int number = 0;
    public synchronized void increment(){
        while (number != 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName()+":"+(++number));
        this.notifyAll();
    }
    public synchronized void decrement(){
        try {
            while (number == 0){
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":"+(--number));
        this.notifyAll();
    }
}
