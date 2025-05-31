public class lcm {
  public static void main(String[] args) {
    int n1=12;
    int n2=18;
    int max=(n1>n2)?n1:n2;
    while (true) {
      if(max%n1==0 && max%n2==0){
        System.out.println(max);
        break;
      }
    max++;
    }
  }
}
