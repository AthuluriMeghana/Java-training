public class pattern8 {
  public static void main(String[] args) {
    int n=7;
    for(int row=1;row<=n;row++)
    {
      for(int col=1;col<=row;col++)
      {
        System.out.print(row*col+"  ");
      }
      System.out.println();
    }
  }
}


