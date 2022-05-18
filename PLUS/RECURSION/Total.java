import java.util.ArrayList;

class Total {

  public static int getTotal(ArrayList<Integer> arr) {
    // Add code below
    if (arr.size() == 0){
        return 0;
    }
    else {
        int total = arr.get(0);
        arr.remove(0);
        return total += getTotal(arr);
    }
    
    
  }

  public static void main(String[] args) {
    ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
    myArrayLs.add(3);
    myArrayLs.add(5);
    myArrayLs.add(6);
    myArrayLs.add(9);
  
    int total = getTotal(myArrayLs);
    System.out.println(total);
  }
}
