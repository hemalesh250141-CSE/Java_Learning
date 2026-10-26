public static int[] deleteByValue(int[] arr, int value) { 
int count = 0; 
for (int i : arr) { 
if (i == value) count++; 
} 
if (count == 0) return arr; // value not found 
int[] newArr = new int[arr.length - count]; 
int index = 0; 
for (int i : arr) { 
if (i != value) { 
newArr[index++] = i; 
} 
} 
return newArr; 
} 
