class moveZerosInPlace{

	public static void main(String[] args){

		int[] A = {1, 0, 3, 0, 5};
		//int[] A = {1, 0, 3, 5, 0};
		//int[] A = {0, 0, 3, 5, 1};
		//int[] A = {0, 0, 1, 0};
		//int[] A = {0, 0, 3, 0, 5};

		printArray(A);

		moveZeros(A);

		printArray(A);

	} 

	public static void moveZeros(int[] arr)
	{

		int front=0;
		int back=arr.length-1;
	
		while(front<back){
			if(arr[front]==0 && arr[back]!=0)
			{
				arr[front]=arr[back];
				arr[back]=0;
				front++; 
				back--; 
			}
			else if(arr[front]==0 && arr[back]==0){
				back--;
			}
			else{
				front++;
			}
		
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