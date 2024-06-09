public class q29 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,1,0,1,0,1,1,0};
        // int[] arr = {0,1,1,0,1,1,1,1,0,1,0};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) { 
            if(arr[i]==0 && arr[i+1]==1 && !flag){
                flag=true;
            }
            if(flag && arr[i]==0){
                count++;
                flag=false;
            }
        }
        System.out.println("\ntotal number of count: " + count);
    }
}
