// Not allowed directly 
class A { 
void show() { 
System.out.println("A"); 
} 
} 
class B { 
void show() { 
} 
} 
System.out.println("B"); 
// class C extends A, B { } // ❌ Compile Error
