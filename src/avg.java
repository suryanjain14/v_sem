public class avg {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        int avg=0;
        for(int i=0;i<5;i++)
        {
            avg=avg+a[i];
        }
        avg=avg/5;
        System.out.println(avg);
    }
}
