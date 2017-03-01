class moveZerosWithExtraArray{
 
	public static void main(String[] args){
 
		//int[] A = {1, 0, 3, 0, 5};
		//int[] A = {1, 0, 3, 5, 0};
		//int[] A = {0, 0, 3, 5, 1};
		//int[] A = {0, 0, 1, 0};
		int[] A = {0, 0, 3, 0, 5};
  
		printArray(A);
  
		moveZeros(A);
  
		printArray(A);
   
	} 

	public static void moveZeros(int[] arr)
	{
  
      int[] tmp=new int[arr.length]; //tmp is filled with zeros
		int index_tmp=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{  
			  tmp[index_tmp]=arr[i];	
			  index_tmp++;
			}
		}
		// why are we done?
		// because tmp is filled initially with zeros
	
		// copy tmp to arr
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=tmp[i];
		}
	}
 
	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++){
			System.out.print("\t"+array[i]); 
		}
		System.out.println(); 
	}
 
}