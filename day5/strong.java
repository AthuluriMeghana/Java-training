
public class strong {
  public static void main(String[] args) {
    int n=145;
    int dup=n,sum=0;
    while (dup!=0) {
      int rem=dup%10;
      sum=sum+fact(rem);
      dup=dup/10;
    }
    System.out.print((n==sum)?"yes":"no"); 
  }
  public static int fact(int n){
    if(n==0){
      return 1;
    }else{
      return n*fact(n-1);
    }
  }
  
}
