package Searching;

/**
 * CeilInArray
 */
public class CeilInArray {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
    int n = arr.length;
    int x = 3;
    int index = ceilSearch(arr, 0, n-1, x);if(index==-1)System.out.println("Ceiling of "+x+" doesn't exist in array");else System.out.println("ceiling of "+x+" is "+arr[index]); 
  }

  public static int ceilSearch(int[] arr, int low, int high, int x) {
    int mid;
    if(x <= arr[low]) {
      return low;
    }
    
    if(x > arr[high]) {
      return -1;
    }

    mid = (low + high) / 2;

    if(x == arr[mid]) {
      return mid;
    }
    else if(arr[mid] < x) {
      if(mid + 1 <= high && x <= arr[mid + 1]) {
        return mid + 1;
      }
      else {
        return ceilSearch(arr, mid + 1, high, x);
      }
    }
    else {
      if(mid - 1 >= low && x > arr[mid-1]) {
        return mid - 1;
      }
      else {
        return ceilSearch(arr, low, mid - 1, x);
      }
    }
  }

}
