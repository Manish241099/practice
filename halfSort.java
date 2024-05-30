public class halfSort {
    public static void main(String[] args) {


        int arr[] = {10, 20, 12, 34, 212, 45, 67, 78,};
        int n=arr.length;
        int temp=0;
        for (int i =0; i<n;i++)
        {
            for (int j=0; j <n/2 ;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
                for (int k=0; k <n/2 ;k++)
                {
                    if (arr[k]>arr[k+1])
                    {
                        temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;

                    }

            }
        }
        for(int r : arr)
        {
            System.out.println(r);
        }

    }
}