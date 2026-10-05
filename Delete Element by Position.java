public static int[] deleteByPosition(int[] arr, int pos) { 
if (pos < 0 || pos >= arr.length) return arr; // invalid index 
int[] newArr = new int[arr.length - 1]; 
for (int i = 0, j = 0; i < arr.length; i++) { 
if (i != pos) { 
newArr[j++] = arr[i]; 
} 
} 
return newArr; 
} 
