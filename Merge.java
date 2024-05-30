public class Merge {
    public static void main(String[] args) {
        int []arr1={10,20,30,40};
        int []arr2={80,70,60,50};
        int index=0;
        int []result=new int[arr1.length+arr2.length];
        for (int i=0;i< arr1.length;i++)
        {
            result[index]=arr1[i];
            index++;
        }
        for (int i=0;i< arr2.length;i++)
        {
            result[index]=arr2[i];
            index++;
        }
        for(int s : result)
        {
            System.out.println(s);
        }

    }
}
