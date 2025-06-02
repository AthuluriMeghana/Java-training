public class secmin  {
  public static void main(String[] var0) {
      int[] var1 = new int[]{4, 33, 29, 1, 5};
      int var2 = Integer.MAX_VALUE;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         if (var1[var4] < var2) {
            var3 = var2;
            var2 = var1[var4];
         } else if (var1[var4] < var3 && var1[var4] != var2) {
            var3 = var1[var4];
         }
      }

      if (var3 == Integer.MAX_VALUE) {
         System.out.println("No second maximum found.");
      } else {
         System.out.println("Second maximum element in the array: " + var3);
      }
    }
}

  
