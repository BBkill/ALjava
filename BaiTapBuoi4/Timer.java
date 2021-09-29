public class Timer extends Thread {

    private int second, minute, hour;
    Timer(int second,int minute,int hour)
    {
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }
    synchronized void secondCounter(int seconds)
    {
        if(seconds<59) second++;
        else
        {
            second=0;
            minute++;

        } 
    }
    synchronized void minuteCounter(int minutes) 
    {
        if(minutes==60)
        {
            minute=0;
            hour++;
        }
    }
    @Override
    public void run(){
        while(true){
            try {
                secondCounter(second);
                minuteCounter(minute);
                Thread.sleep(50);
                System.out.println("hh:mm:ss: "+hour+":"+minute+":"+second);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public synchronized void start() {
        
        super.start();
    }
    
}