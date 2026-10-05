import java.util.*; 
public class ArrayOperations { 
public static void main(String[] args) { 
int[] arr = {5, 3, 9, 1, 6}; 
// Insert 10 
arr = insertElement(arr, 10); 
// Delete value 3 
arr = deleteByValue(arr, 3); 
// Delete element at position 2 
Bhuwaneswari B 
Software Trainer 
Bhuwaneswari B 
Software Trainer 
 
        arr = deleteByPosition(arr, 2); 
 
        // Sort Ascending 
        Arrays.sort(arr); 
        System.out.println("Ascending: " + Arrays.toString(arr)); 
 
        // Sort Descending 
        Integer[] arrObj = 
Arrays.stream(arr).boxed().toArray(Integer[]::new); 
        Arrays.sort(arrObj, Collections.reverseOrder()); 
        System.out.println("Descending: " + Arrays.toString(arrObj)); 
    } 
 
    public static int[] insertElement(int[] arr, int value) { 
        int[] newArr = new int[arr.length + 1]; 
        for (int i = 0; i < arr.length; i++) newArr[i] = arr[i]; 
        newArr[arr.length] = value; 
        return newArr; 
    } 
 
    public static int[] deleteByValue(int[] arr, int value) { 
        int count = 0; 
        for (int i : arr) if (i == value) count++; 
        if (count == 0) return arr; 
 
        int[] newArr = new int[arr.length - count]; 
        int idx = 0; 
        for (int i : arr) if (i != value) newArr[idx++] = i; 
        return newArr; 
    } 
 
    public static int[] deleteByPosition(int[] arr, int pos) { 
        if (pos < 0 || pos >= arr.length) return arr; 
        int[] newArr = new int[arr.length - 1]; 
        for (int i = 0, j = 0; i < arr.length; i++) { 
            if (i != pos) newArr[j++] = arr[i]; 
        } 
        return newArr; 
    } 
}
