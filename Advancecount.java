public class Advancecount {
    public static void main(String[] args) {
        String str="aaaabbbbcccc";
        int count=0;


        if(str!=null || str.length()==0) {
            System.out.println("str should not be null");
        }
        StringBuilder SB = new StringBuilder();
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else {
                SB.append(str.charAt(i-1)).append(count);
            }
        }


    }



}
