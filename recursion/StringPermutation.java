import static java.util.Collections.swap;

public class StringPermutation {
    static  void  permute(char[] arr,int start)
    {
        if (start==arr.length){
            System.out.println(new String(arr));
            return;
        }
        for (int i = start; i < arr.length ; i++) {

            swap(arr, start ,i);
            permute(arr, start + 1);
            swap(arr,start,i);

        }
    }
    public static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        String str = "abcd";
        char[] arr = str.toCharArray();
        System.out.println("Original String: "+str);
        permute(arr,0);
    }
}
