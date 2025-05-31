public class gcd {
  public static void main(String[] args) {
    int n1=12;
    int n2=18;
    int min=(n1<n2)?n1:n2;
    int div=2;
    int last=0;
    while (div<=min/2){
      if(n1%div==0 && n2%div==0){
        last=div;
      }
      div++;
    }
    System.out.println(last);
    int mul=n1*n2;
    while (n2!=0) {
      int t=n2;
            n2=n1%n2;
            n1=t;
        }
        System.out.println(n1);

        System.out.println("lCM:"+ mul/n1);

    }
  }
      