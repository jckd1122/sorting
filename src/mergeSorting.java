public class mergeSorting{
	private int[] a;
	private int[] helper;
	
	public void mergeSort(int low, int high){
		if(low == high)
			return;
		
		int mid = (low+high)/2;
		
		mergeSort(low, mid);
		mergeSort(mid+1,high);
		merge(low,mid,high);
	}
	
	public void merge(int low, int mid,int high){
		for (int i = low; i <= high; i++) {
			helper[i] = a[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		
		while(i <= mid && j<= high ){
			if(helper[i] <= helper[j]){
				a[k] = helper[i];
				i++;
			}
			else{
				a[k]= helper[j];
				j++;
			}
			
		}
		
		while(i <= mid){
			a[k] = helper[i];
			i++;
			k++;
		}
		
		while(j <= high){
			a[k] = helper[j];
			j++;
			k++;
		}
		
	}
	
	public static void main(String args){
		mergeSorting wenqiang = new mergeSorting();
		int[] a = {6,5,7,2,1,10,17,14};
		wenqiang.a = a;
		wenqiang.mergeSort(0, 7);
		//System.out.println(wenqiang.a.toString());
		
	}
	
	
}