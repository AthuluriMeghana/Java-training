public class DemoQ {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                if (row == 0&&col!=5||row==4&&col!=5||col==0&&row!=5||col==4&&row!=5||col==2&&row==2||col==3&&row==3||col==5&&row==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}