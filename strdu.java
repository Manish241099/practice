public class strdu {
    public void duplicate() {
        String str = "meme";
        int count1=0;
        int [] count = new int [332];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;

        }
        for(int i=0;i<332 ;i++)
        {
            if(count[i]>1)
            {
                System.out.println(""+(char)i+"frequency"+count[i]);
            }
        }
    }

        public static void main(String[] args) {
        strdu st =new strdu();
        st.duplicate();


        }
    }
