public class DemoW {
    public static void main(String[] args) {
        for(int row=0;row<4;row++){
            for(int col=0;col <7;col++){
                if(col==0 || col==6 || col+row==3||col==4&&row==1||col==5&&row==2){
                    System.out.print("* ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}