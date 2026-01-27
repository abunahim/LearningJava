package LearningJava.Threading;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Thread was Interrupted");
            }
            if(i == 5){
                System.out.println("Times's up!");
                System.exit(0);
            }
        }
    }
}
