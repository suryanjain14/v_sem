public class intdel {
    public static void main(String[] args) {
        int a[]={5,3,1,4,6};
        int min=a[0],max=a[0];
        for(int i=0 ;i<4;i++){
            if (min>a[i]){
                min = a[i];
            }
            else if(max<a[i])
            {
                max = a[i];
            }
        }
        System.out.println("min:"+ min);
        System.out.println("max:"+ max);
    }
}
