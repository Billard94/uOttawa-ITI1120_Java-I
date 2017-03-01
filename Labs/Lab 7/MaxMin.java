public class  MaxMin{
	public static void main(String[] args) {
		int n=1000;
		int[] array=new int[n];  

		for(int i=0; i<array.length; i++){ 
			array[i]=(int)(Math.random()*10);
		}
	
		int[] maxmin = MaxMin(array);
	 
		System.out.println(" Maximum is "+ maxmin[0]);
		System.out.println(" Minimum is "+ maxmin[1]);
	
	}
  
  
	public static int[] MaxMin(int[] A){
		int current_max=A[0];
		int current_min=A[0];
	    
		for(int i=1; i<A.length; i++){ // no need to start from 0
			if(A[i]>current_max){
				current_max=A[i];
			}
			if(A[i]<current_min){
				current_min=A[i];
			}
		}
		int[] B = {current_max, current_min};
		return B;
		
	}
  	
}
  
 
