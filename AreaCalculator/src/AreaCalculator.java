public class AreaCalculator {
    public static double area (double radius){
        if(radius <0) {
            System.out.println("Invalid value");
            return -1;
        }
        double circleArea = radius * radius * Math.PI;
        System.out.println("Circle Area = " + circleArea );
        return circleArea;
    }

    public static double area (double x, double y){
        if( x < 0 || y < 0 ){
            System.out.println("Invalid value");
            return -1;
        }
        double rectArea = x * y;
        System.out.println("Rectangle area = " + rectArea );
        return rectArea;
    }
}
