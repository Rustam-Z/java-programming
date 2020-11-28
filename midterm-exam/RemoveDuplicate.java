import java.util.ArrayList;

public static void removeDuplicate(ArrayList<Integer> list) {
    // Create a new ArrayList 
    ArrayList<Integer> newList = new ArrayList<Integer>(); 
    // Traverse through the first list 
    for (Integer element : list) {  
        // If this element is not present in newList 
        // then add it 
        if (!newList.contains(element)) { 
            newList.add(element); 
        } 
    } 

    // return the new list 
    return newList; 
}