

import static java.lang.Thread.sleep;

public class EvenandOdd
{
   static Object object = new Object();


    static int count1 = 0;
    static int count2 = 1;
    public static void main(String[] args)
    {
        Thread t = new Thread(){
            public void run()
            {
                while(count1 <= 20)
                {
                    synchronized (object)
                    {
                        System.out.println(count1);
                        count1 = count1 + 2;
                        //goes to sleep

                    }
                    try {
                        sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }

        };
        Thread t1 = new Thread()
        {
            public void run()
            {
                while(count2 <= 19)
                {
                    synchronized (object)
                    {
                        System.out.println(count2);
                        count2 = count2 + 2;
                        //goes to sleep

                    }
                    try {
                        sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };

        t.start();
        try{
            sleep(10);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        t1.start();
    }


}
