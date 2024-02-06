package Services;

import java.util.Random;

public class Algorithms {
    Random random = new Random();

    public boolean algorithmOne(){
        int x =  random.nextInt(1,20) + random.nextInt(1,20) + random.nextInt(1,20) / 3;
        if(x >= 10) return true;
        return false;
    }
    public boolean algorithmTwo(int ticketNumber){
        int x = ticketNumber / random.nextInt(1 ,20);
        if(x%2 == 0 && ticketNumber%2==0) return true;
        else if (x%2 != 0 && ticketNumber%2!=0) return true;
        return false;
    }

    public boolean algorithmThree(int ticketNumber){
        double x = Math.pow(ticketNumber,2) + Math.pow(random.nextInt(1 ,20),2);
        double z = Math.pow(random.nextInt(1 ,20),2);
        int y = (int)x;
        int w = (int)z;
        if(y >= w) return true;
        return false;
    }
}
