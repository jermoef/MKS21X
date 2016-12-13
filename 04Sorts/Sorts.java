public class Sorts{

  public static String name(){
    return "01.Freudenberg.Jerome"; 
  }


  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){  
      for (int i = 0; i < data.length; i++) {
	  int placeholder = 0;
	  for( int j = i; j < data.length; j++) {
	      if (data[j] < data[i]) {
		  placeholder = data[i];
		  data [i] = data[j];
		  data[j] = placeholder;
	      }
	  }
      }
  }

    public static void main (String[] args) {
	int[] data = {1,63,12,5,1235,12,-7};
	selectionSort(data);
	for(int i : data) {
	    System.out.println(i);
	}
    }
}

