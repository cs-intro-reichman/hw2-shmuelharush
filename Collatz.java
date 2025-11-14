// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Collatz {
   public Collatz() {
   }

   public static void main(String[] var0) {
      int var1 = Integer.parseInt(var0[0]);
      char var2 = var0[1].charAt(0);
      char var3 = Character.toUpperCase(var2);
      Boolean var4 = var3 == 'V';

      for(int var5 = 1; var5 <= var1; ++var5) {
         long var6 = (long)var5;
         int var8 = 1;
         if (var4) {
            System.out.print(var6);
         }

         if (var6 == 1L) {
            var6 = 4L;
            if (var4) {
               System.out.print(" " + var6);
            }

            ++var8;
         }

         for(; var6 > 1L; ++var8) {
            if (var6 % 2L == 0L) {
               var6 /= 2L;
            } else {
               var6 = var6 * 3L + 1L;
            }

            if (var4) {
               System.out.print(" " + var6);
            }
         }

         if (var4) {
            System.out.println(" (" + var8 + ")");
         }
      }

      System.out.println("Every one of the first " + var1 + " hailstone sequences reached 1.");
   }
}
