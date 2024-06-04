public class BinDec {
    public static void main(String[] args) {
        int bin=101101;
        int dec=0;
      int remainder=0;
      int i=1;
      while (bin!=0)
      {
          remainder=bin%10;
          dec=dec+remainder*i;
          i*=2;
          bin=bin/10;

      }
        System.out.println(dec);
    }
}
