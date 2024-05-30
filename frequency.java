public class frequency {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,10,20,30,50,30,20,40};
        int count=1;
        int k=1;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }

            }
        }
            for(int s :arr)
            {
                System.out.println(s);
            }
            //for  (int i=0;i<arr.length;i++)
            //{
              //  if(arr[i]==arr[i+1])
                //{
                 //   count++;
                //}
                //System.out.println("element"+arr[i]+"frequency"+count);
           // }
        int p=0;
        while( p < arr.length){
            while(k< arr.length && arr[k]==arr[k-1]){
                count++;
                k++;
                System.out.println("element"+arr[k]+"frequency"+count);
            }
            count=1;
            k++;



        }




}
}
