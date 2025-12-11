public class TestMidterm {
    public static void main(String[] args) {
        
        Adapter one = new twelve(51060);
        Adapter two = new twentyfour(51060);

        one.convert();
        ((twelve)one).fortwelve();
        ((twentyfour)two).fortwentyfour();

    }
}

class Adapter {
    int sec = 51060;
    int[] time = new int[3];

    Adapter(int sec) {
        this.sec = sec;
    }

    int convert() {
        time[0] = (sec/60) / 60;
        time[1] = (sec / 60) % 60;
        time[2] = sec % 60;
        return time[0] * 3600 + time[1] * 60 + time[2];
    }
}

class twelve extends Adapter {
    twelve(int sec) {
        super(sec);
        convert();
    }

    int convert() {
        time[0] = (sec/60) / 60;
        time[1] = (sec / 60) % 60;
        time[2] = sec % 60;
        return time[0] * 3600 + time[1] * 60 + time[2];
    }

    int fortwelve() {
        if (time[0] > 12) {
            time[0] = time[0] - 12;
            System.out.println(time[0] + ":" + time[1] + ":" + time[2] + " PM");
        } else {
            System.out.println(time[0] + ":" + time[1] + ":" + time[2] + " AM");
        }
        return time[0] * 3600 + time[1] * 60 + time[2];
    }
}

class twentyfour extends Adapter {
    twentyfour(int sec) {
        super(sec);
        convert();
    }

    int convert() {
        time[0] = (sec/60) / 60;
        time[1] = (sec / 60) % 60;
        time[2] = sec % 60;
        return time[0] * 3600 + time[1] * 60 + time[2];
    }

    int fortwentyfour() {
        System.out.println(time[0] + ":" + time[1] + ":" + time[2]);
        return time[0] * 3600 + time[1] * 60 + time[2];
    }
}