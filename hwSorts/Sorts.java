// Nicole Cheng
// apcs pd7
// Big-O
// 2016-01-04

public class Sorts{
    public static void printArray(int[]data){
	//print the array like:  [ 1, 2, 3, 4]
	String ret = "[ ";
	for (int i = 0; i < data.length; i++){
	    ret += data[i];
	    if (i != data.length-1){
		ret += ", ";
	    }
	}
	System.out.println(ret + "]");
    }
    
    public static void insertionSort(int[]data){
	//your code here to make data re-order its elements
	//from least to greatest just like we did in class
	//same algorithm as the way you created your OrderedSuperArray

	if (data.length > 1){
	
	    int index = 1; // where are we up to?
	    int insert = 0;
	    int hold = data[index];
	
	    while (index < data.length){
		if (data[index] >= data[index-1]){
		    index++;
		}else{
		    hold = data[index];
		    insert = index-1;
		    while (hold < data[insert] && insert > 0 && hold < data[insert-1]){
			insert--;
		    }
	    
		    for (int i = index; i > insert; i--){
			data[i] = data[i-1];
		    }
		    data[insert] = hold;
		    index++;	
		    printArray(data);	
		}
	    }
	}
    }


    public static void selectionSort(int[]data){
	if (data.length > 1){
            int index = 0;
	    while (index < data.length){
		int min = data[index];
		int minInd = index;
		for (int i = index; i < data.length; i++){
		    if (data[i] < min){
			min = data[i];
			minInd = i;
		    }
		}
		data[minInd] = data[index];
		data[index] = min;
		index++;
		printArray(data);	
	    }
	}
    }

    public static void bubbleSort(int[]data){
	int sorted = data.length; // from which index is it sorted?
	int hold = 0;
	while (sorted > 0){
	    for (int i = 0; i < sorted-1; i++){
		if (data[i] > data[i+1]){
		    hold = data[i+1];
		    data[i+1] = data[i];
		    data[i] = hold;
		}
	    }
	    sorted --;
	    printArray(data);
	}
    }

    public static void main(String[]args){
	System.out.println("Selection Sort:");
	int[] arrayName = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray( arrayName);
	Sorts.selectionSort( arrayName);
	Sorts.printArray( arrayName);
	System.out.println();
	System.out.println("Insertion Sort:");
	int[] arrayN = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray( arrayN);
	Sorts.insertionSort( arrayN);
	Sorts.printArray( arrayN);
	System.out.println();
	System.out.println("Bubble Sort:");
	int[] arryN = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray( arryN);
	Sorts.bubbleSort( arryN);
	Sorts.printArray( arryN);
	/*	
		int[] e = {};
		Sorts.printArray( e);
		Sorts.selection( e);
		Sorts.printArray( e);
	
		int[] ae = { 8, 8, 8, 8, 8};
		Sorts.printArray( ae);
		Sorts.selection( ae);
		Sorts.printArray( ae);

		int[] a = { 9, -9, 6, 3, 17};
		Sorts.printArray( a);
		Sorts.selection( a);
		Sorts.printArray( a);

		int[] ar = { 0};
		Sorts.printArray( ar);
		Sorts.selection( ar);
		Sorts.printArray( ar);

		int[] array = { 15, 14, 13, 12, 11, 10};
		Sorts.printArray( array);
		Sorts.selection( array);
		Sorts.printArray( array);
	*/
    }

}
