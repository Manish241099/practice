public class TEST
{
    public static void main(String[] args)
    {
//        int arr []={1,2,3,4,5,6,7,8,9,10};
//        int even []=new int [20];
//        int odd []=new int [20];
//        int evnPos=0;
//        int oddPos=0;
//        for (int i=0;i<arr.length;i++)
//        {
//            if (arr[i]%2  ==0)
//            {
//                even[evnPos]=arr[i];
//                evnPos++;
//            }
//            else
//            {
//                odd[oddPos]=arr[i];
//                oddPos++;
//            }
//        }
////        for (int r : odd){
////            System.out.println(odd[oddPos]);
//        System.out.println("Odd numbers: ");
//        for(int i=0;i<oddPos;i++)
//        {
//            System.out.println(odd[i]);
//        }
////        for (int e : even){
////            System.out.println(odd[evnPos]);
//        System.out.println("even numbers: ");
//        for(int i=0;i<evnPos;i++)
//        {
//            System.out.println(even[i]);
//        }
        //public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int even[] = new int[20];
        int odd[] = new int[20];
        int evnPos = 0;
        int oddPos = 0;

        // Corrected loop condition and removed the stray semicolon
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[evnPos] = arr[i];
                evnPos++;
            } else {
                odd[oddPos] = arr[i];
                oddPos++;
            }
        }

        // Print odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddPos; i++) {
            System.out.println(odd[i]);
        }

        // Print even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evnPos; i++) {
            System.out.println(even[i]);
        }
    }

    }


