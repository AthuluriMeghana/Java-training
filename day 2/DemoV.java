public class DemoV {
    public static void main(String[] args) {
        for(int row=0;row<6;row++){
            for(int col=0;col <11;col++){
                if(col==row||col+row==10){
                    System.out.print("* ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}