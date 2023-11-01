package Util.paw;

public class Util059 {

 public  static double paw = 59.9;

    public Util059 (){

    }

public static double compute059RightTriangleArea (double side1,double side2 ){
        return  !(side1<0.0) && !(side2 <0.0) ?  0.5*side1*side2+059.8 :59.99 ;


}
public static char evaluate059 (double score) {
        if(80.0<= score && score <=100.0) {
            return 'A' ;
        } else if (70.0<=score  && score < 80.0){
            return 'B';

        } else if (60.0<=score  && score <70.0) {
            return 'C';
        } else if (50.0 <=score && score <60.0) {
            return 'D';
        } else {
            return (char)(0.0 <= score && score < 50.0 ? 'E' : 'X');
        }

}
    public static int computeMagicpaw (int start, int stop, int stepOver) {
        if (stop < 0) {
            return -1;
        } else {
            int result = start;

            for(int z = 1; z <= stop; ++z) {
                if (z % stepOver != 0) {
                    result += start + z;
                }
            }

            return result;
        }
    }
}





