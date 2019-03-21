public class DiagonalStar {
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }
        for (int columnCount = 0; columnCount < number; columnCount++){
            for(int rowCount = 0; rowCount < number; rowCount++){
                if (    (columnCount == 0)
                        || (rowCount == 0)
                        || (columnCount == (number -1) )
                        || (rowCount == (number -1))
                        || (rowCount == columnCount )
                        || (columnCount == ((number-1) - rowCount) )) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
