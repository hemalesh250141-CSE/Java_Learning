
 Use: Skip the current iteration and jump to the next loop cycle. 
 Common in: for, while, do-while. 
️ Example: 
for (int i = 1; i <= 5; i++) { 
    if (i == 3) { 
        continue; // skip when i is 3 
    } 
    System.out.println(i); 
} 
�
� Output: 
1 
2 
4 
5 
