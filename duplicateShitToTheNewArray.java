public class duplicateShitToTheNewArray {
    public static void main(String[] args) {
        int arr2 []={10,20,30,40,50,60,70};
        int arr1 []={50,60,70,80};

        int newArray[]=new int [3];
        int count=0;
        for(int i =0;i<arr1.length;i++)
        {
           boolean isDigit=false;
            for (int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    isDigit=true;
                    break;
                }
            }
            if(isDigit)
                newArray[count]=arr1[i];
            count++;
            }
        for(int r:newArray)
        {
            System.out.println(r);
        }
        }
    }

