public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
