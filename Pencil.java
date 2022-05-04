public class Pencil  {
    string color = "grey";
    double length = 35.5;
    double price = 650.00;
    void display(){
        system.out.println("the color is " +color);
        system.out.println("the length is " +length);
        system.out.println("the price is " +price);
    }
    public static void main(string[] args) {
        Pencil p1 = new Pencil() ;
        p1.display();
    }
}
