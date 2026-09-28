    public static void main(String[] args) { 
        for (int i = 1; i <= 5; i++) { 
            if (i == 4) { 
                return; // exit the method when i is 4 
            } 
            System.out.println(i); 
        } 
        System.out.println("This will not print"); 
    } 
} 
