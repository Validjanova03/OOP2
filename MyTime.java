//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyTime {
   private int Hour;
    private int Minute;
    private int Second;
    public void MyTime(int Hour, int Minute,int Second){
        SetTime(Hour,Minute,Second);
    }

    public void SetTime(int Hour, int Minute, int Second){
        if(Hour >= 0  && Hour < 24 && Minute >= 0 && Minute < 60 && Second >=0 && Second < 60){
        this.Hour = Hour;
        this.Minute = Minute;
        this.Second=Second;
        }else {
            System.out.println("Vaqtni XATO tarzda kiritdingiz!");
        }



    }
    public int getHour() {
        return Hour;
    }
    public int getMinute() {
        return Minute;
    }
    public int getSecond(){
        return Second;
    }

    public void nextSecond() {
        Second++;
        if (Second > 60) {
            Second = 0;
            nextSecond();
        }

    }


    public  void nextMinute() {
        Minute++;
        if (Minute > 60) {
            Minute = 0;
            nextMinute();
        }

    }
    public void nextHour() {
        Hour++;
        if (Hour >= 24) {
            Hour = 0;
nextHour();
        }

    }
    public String toString(){
        return String.format("%02d:%02d:%02d",Hour,Minute,Second);
    }
    public static void main(String[] args) {
        MyTime time = new MyTime();
        time.SetTime(10, 20, 30);
        System.out.println("\n");
        System.out.println("Current Time: " +time.toString());

        time.nextMinute();
        time.nextSecond();
        time.nextHour();

        System.out.println("Next Time: "+ time.toString());
    }
}