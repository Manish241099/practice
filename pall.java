
    class pall {
        public static void main(String[] args) {
            String str="wow";
            String result ="";
            char ch []= str.toCharArray();
            for (int i=ch.length-1;i>=0;i--)
            {
                result = result + ch[i];

            }
            System.out.println(result);
            if (str.equals(result))
            {
                System.out.println("str is pallendrome");
            }
            else {
                System.out.println("str  is not pallendrome");
            }
        }
    }

