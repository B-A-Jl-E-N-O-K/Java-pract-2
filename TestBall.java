package pract2_2;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("Test task №2.2: Ball coordinate");
        Ball ball1 = new Ball(4.5, 7.8);
        Ball ball2 = new Ball();
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        ball2.setXY(-14.6,2.75);
        System.out.println(ball2.toString());
        ball1.move(-3.34,2.06);
        System.out.println(ball1.toString());


    }
}
