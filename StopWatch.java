public class StopWatch {
    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i <5 ; i++) {
            Thread.sleep(2000);
            System.out.println("Execute "+i);
        }
    long endTime=System.currentTimeMillis();
        long elapsedTime=endTime-startTime;
        System.out.println("Execution of program of time is "+elapsedTime);
    }
}