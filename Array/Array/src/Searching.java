public class Searching {
    public static String linear(int[] a, int x){
        long start=System.currentTimeMillis();

        for (int j : a) {
            if (x == j) {
                return "element found at position: " + j;
            } else continue;
        }
        System.out.println("Time taken: "+(System.currentTimeMillis()-start));
        return "Not found";
    }
    public static String binary(int[] a, int x){
        long start=System.currentTimeMillis();
        int f=0;
        int l=a.length-1;

       while(f<=l) {
           int mid=(l+f)/2;
           if(x==a[mid]){
               return "element found at position: "+a[mid];
           }
           else if(x<a[mid]){
               l=mid-1;


           }
           else {
               f=mid+1;
           }
       }        System.out.println("Time taken: "+(System.currentTimeMillis()-start));

        return "Not found";
    }
}
