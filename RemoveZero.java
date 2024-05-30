public class RemoveZero {
    public static void main(String[] args) {

        int arr[]={ 0,1,2,0,3,0};
        int nz=0;
        int z=0;
        int size = arr.length;
        if(size==0 || size==1 )
        {
            return;
        }
        while(size>nz)
        {
            if (arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        for(int a : arr)
        {
            System.out.println(a);
        }
    }
}
