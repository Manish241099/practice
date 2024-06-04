public class Strduplicate {
    public void stringDupl() {
        String str = "meme";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            boolean isdupl=true;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j & ch[i]==ch[j]){
                    isdupl=false;
                    break;

                }
            }if(isdupl)
            {
                System.out.println("answer:"+ch[i]);
            }
        }

    }

    public static void main(String[] args) {
        Strduplicate st =new Strduplicate();
        st.stringDupl();
    }
}
