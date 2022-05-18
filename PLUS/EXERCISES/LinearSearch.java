public class LinearSearch
{
  public static int linearSearch(int[] arr, int target)
  {
      // write code here
    for (int i = 0; i < arr.length; i++){
        if(target == arr[i]){
            return i;
        }
    }
    return -1;  
  }
  public static void main(String args[])
  {
      int arr[] = { 2, 3, 4, 10, 40 };
      int target = 10;
      linearSearch(arr, target);
  }
}
