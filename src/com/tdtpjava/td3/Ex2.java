

public class Ex2 {
    public static void main(String[] args) {
        Point a = new Point("A", 2.5, 3.7);
        System.out.println(a.Norme());
    }
}


class Point{
    private String nom;
    private double x,y;

    public Point() {
    }

    public Point(String nom, double x, double y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double Norme ( ){
        return  Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }
}