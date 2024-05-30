public class Kadanes {
    public static void main(String[] args) {
        int arr []={4,2,-3,4,-9,8,-6,-4-9};
        int maxSum=arr[0];
        int sum=arr[0];
        for (int i=1;i< arr.length;i++)
        {
            if(sum>=0){
                sum=sum+arr[i];
            }
            else{
                sum=arr[i];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }

        }
        System.out.println( "maxSum "+maxSum );
    }
}
