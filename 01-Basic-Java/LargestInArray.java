class LargestInArray{
	public static void main(String arg[])
	{
		int[] arr = {15,30,45,75,60};
		int largest=arr[0];
		for(int i=1; i<arr.length;i++){
			 if(arr[i]>largest) {
				 largest = arr[i];
			 }
		}
		System.out.println("Largest element = "+largest);
	}
}