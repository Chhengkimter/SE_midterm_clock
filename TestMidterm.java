public class TestMidterm {
    public static void main(String[] args) {
        
        twelve one = new twelve(51060);
        twentyfour two = new twentyfour(51060);

        one.fortwelve();
        two.fortwentyfour();

    }
    
}

class Adapter {
    int sec;
    int[] time = new int[3];

    Adapter(int sec) {
        this.sec = sec;
        convert();
    }

    void convert() {
        time[0] = (sec / 3600);
        time[1] = (sec % 3600) / 60;
        time[2] = sec % 60;
    }
}

class twelve extends Adapter {
    twelve(int sec) {
        super(sec);
    }

    void fortwelve() {
        int hour = time[0];
        String period = "AM";
        
        if (hour > 12) {
            hour = hour - 12;
            period = "PM";
        }
        
        System.out.println(hour + ":" + time[1] + ":" + time[2] + " " + period);
    }
}

class twentyfour extends Adapter {
    twentyfour(int sec) {
        super(sec);
    }

    void fortwentyfour() {
        System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
    }
}