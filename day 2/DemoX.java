public class DemoX {
    public static void main(String[] args) {
        for(int row=0;row<7;row++){
            for(int col=0;col <7;col++){
                if(col==0&&row==0||col==0&&row==6||col==6&&row==0||col==6&&row==6||col==1&&row==1||col==1&&row==5||col==5&&row==5||col==5&&row==1||col==2&&row==2||col==2&&row==4||col==3&&row==3||col==4&&row==2||col==0&&row==0||col==4&&row==4){
                    System.out.print("* ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}