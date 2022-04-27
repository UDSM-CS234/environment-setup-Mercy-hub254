public class Labday1 {
    public static void main (String[]args){
        double a; //acceleration
        double t; //time
        double v; //initial velocity
        double i; //initial position
        double f; //final position;
        a = -9.81;
        t = 10;
        v = 0;
        i = 0;
        f = 0.5 * a * Math.pow(t,2) + v*t + i;
        System.out.println("The position will be: " +f);

    }
}
