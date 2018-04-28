package Package;

public class S {
	
	public static void main(String [] args)
	{
		
		int[] arr =  { 6, 7, 7, 4, 312, 78, 54, 4, 12, 100, 89, 74 };

		    for (int i = 0; i < arr.length; i++) {
		        for (int j = i + 1; j < arr.length; j++) {
		            int tmp = 0;
		            if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		            }
		        }
		    }
		    for(int l : arr)
		    {
		    	System.out.println(l);
		    
		    }
			System.out.println("ascendinh");
			System.out.println();
	
			
//********gbchgbvnbvnbvnbvnbvnbvmnvnmbmnbmnb****************************************************************************************************************\\			
			
		    
		    int[]parr =  { 6, 7, 7, 4, 312, 78, 54, 4, 12, 100, 89, 74 };

		    for (int i = 0; i < parr.length; i++) {
		        for (int j = i + 1; j < parr.length; j++) {
		            int tmp = 0;
		            if (parr[i] < parr[j]) {
		                tmp = parr[i];
		                parr[i] = parr[j];
		                parr[j] = tmp;
		            }
		        }
		    }
		    for(int k : parr)
		    {
		    	System.out.println(k);
		    }
		    System.out.println("decending");
			System.out.println();
			System.out.println("Changes Made");
		}

	}
	
				
