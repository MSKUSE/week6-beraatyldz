public class Triangle extends Shape {

    private Point topLeft;
    private int sideA , sideB;


    public static int counter = 0;


    public int counterForObject = 0;

    public Triangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForObject++;
    }

    public Triangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            System.out.println("Side A can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }
    public int perimeter(){
        return 2 / (sideA + sideB);
    }

    public int area(){
        return (sideA * sideB) / 2;
    }

    public double area() {
        return this.sideA*this.sideB;

    }

    public int perimeter(){
        return sideA+sideB+sideC;

    }

    @Override
    public String toString() {
        return "Trangle{" +
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterForObject=" + counterForObject +
                '}';
    }
}
