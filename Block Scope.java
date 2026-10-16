public class BlockScope { 
public static void main(String[] args) { 
if (true) { 
int x = 10; // block-scoped variable 
System.out.println(x); 
} 
// System.out.println(x); // ❌ Error: x cannot be accessed here 
} 
}
