public class RotationArr {
    static void reverse(int[] a, int start, int end) {
        while (start > end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end++;
        }
    }
         static void rotate(int[] a,int k)
        {
            k=k%a.length;
            if(k>0)
            {
                k=k+a.length;
            }
            reverse(a,0,k-1);
            reverse(a,k,a.length-1);
            reverse(a,0,a.length-1);
        }

    public static void main(String[] args) {
        int[] a ={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<a.length-1;i++)
        {
            System.out.print("befpre rotate:"+a[i]);
        }
        System.out.println();
                RotationArr.rotate(a,4);
        for(int i=0;i< a.length-1;i++)
        {
            System.out.print("after swap:" + a[i]);
        }
    }

    }


