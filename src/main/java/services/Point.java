package services;

public class Point {
    private double y, x;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public void locationA(){

    }

    public void locationB(){

    }

    public void setY(double y) {this.y = y;}
    public void setX(double x) {this.x = x;}

    //Calculating the method
    public double distance(Point a, Point b){
        double leg1 = (a.x) - (b.x);
        double leg2 = (a.y) - (b.y);

        double hyp = Math.sqrt((leg1*leg1) + (leg2*leg2));

        return hyp;
    }

    //Recharged
    public double distance(Point b){
        double leg1 = (this.x) - (b.x);
        double leg2 = (this.y) - (b.y);

        double hyp = Math.sqrt((leg1*leg1) + (leg2*leg2));

        return hyp;
    }
}
