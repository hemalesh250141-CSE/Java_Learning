public static int[] insertElement(int[] arr, int value) { 
int[] newArr = new int[arr.length + 1]; 
for (int i = 0; i < arr.length; i++) { 
newArr[i] = arr[i]; 
} 
newArr[arr.length] = value; 
return newArr; 
} 
