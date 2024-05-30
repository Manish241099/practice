public class EceptSelf {
    public int[] arr(int num[]){
        int []right=new int[num.length];
        int []left=new int[num.length];
        left[0]=1;
        for (int i=1;i<num.length;i++)
        {
            left[i]=left[i-1]*num[i-1];
        }
        right[num.length-1]=1;
        for(int i =num.length-2;i >-1;i--)
        {
            right[i]=right[i+1]*num[i+1];
        }
        int []result=new int[num.length];
        for(int i=0;i< num.length;i++)
        {
            result[i]=left[i]*right[i];
      }
        return result;


    }

    public static void main(String[] args) {
        int []num={2,3,4,5,6};
        EceptSelf es=new EceptSelf();
        es.arr(num);
        for(int r :num)
        {
            System.out.println(r);
        }
    }
}
