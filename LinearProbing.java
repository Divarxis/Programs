import java.util.*;
@SuppressWarnings("unused")
class Hashing{
    // Declaring Table and size.
    int table[];
    int size;
    // Constructor
    Hashing(int size){
        // Initializing size.
        this.size=size;
        // Allocating memory to the table.
        table=new int[size];
        // Initializing all values of 
        // table with minimum possible
        // value integer can hold.
        for(int i=0;i<size;i++)
            table[i]=Integer.MIN_VALUE;
    }
    // Hash Function
    int hash(int x){
        // returning value of modulus 
        // of x taken with table size.
        return x%size;
    }    
    // Insert function
    void insert(int x){
        // Finding the hash value of x.
        int k=hash(x);
        // Iterating till we find a cell
        // that is not occupied currently.
        while(table[k]!=Integer.MIN_VALUE&&table[k]!=Integer.MAX_VALUE)
            k=(k+1)%size;
        // Assigning x to cell k. 
        table[k]=x;
    }
    // Search function 
    boolean search(int x){
        // Finding the hash value of x.
        int k=hash(x);
        // Iterating till we find a cell
        // containing x.
        while(table[k]!=x){
            // If the cell has never been 
            // occupied we return false.
            if(table[k]==Integer.MIN_VALUE)
                return false;
            k=(k+1)%size;
        }
        // Checking if table[k] is x or not. 
        return table[k]==x;
    }
    void delete(int x){
        // Finding the hash value of x.
        int k=hash(x);
        // Iterating till we find a cell
        // containing x.
        while(table[k]!=x)
        {
            // If the cell has never been 
            // occupied we return false.
            if(table[k]==Integer.MIN_VALUE)
                return;
            k=(k+1)%size;
        }
        // If x exists in table replacing 
        // its value with a very large value. 
        if(table[k]==x)
            table[k]=Integer.MAX_VALUE;
    }
    public static void main(String args[]){
        Hashing h=new Hashing(7);
        h.insert(16);
        h.insert(40);
        h.insert(27);
        h.insert(9);
        h.insert(75);
        
        if(h.search(75))
            System.out.println("75 found");
        if(h.search(40))
            System.out.println("40 found");
    
        h.delete(40);
        if(!h.search(40))
            System.out.println("After deleting 40, 40 is not found");
    }
}
