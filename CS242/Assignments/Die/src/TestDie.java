
public class TestDie {

	public static void main(String[] args) {
		
		Die D1 = new Die();
		
		int topFace;
		
		System.out.println("Die Roll lands on: " + D1.getTop());
		
	    int count1, count2, count3, count4, count5, count6;
		count1 = count2 = count3 = count4 = count5 = count6 = 0;
	    
		
		//testing probability die sides appear
		for (int i=0; i<1000; i++) {
			//roll die
			topFace = D1.getTop();
			
//			for (int num=1; num <= topFace; num++) {
//				System.out.println(num);
				if( topFace == 1 ){
					  count1 = count1 + 1;
					  System.out.println(count1);
				  }
				  
				if( topFace == 2 ){
					  count2 = count2 + 1;
				  }
				  
				if( topFace == 3 ){
					  count3 = count3 + 1;
				  }
				  
				if( topFace == 4 ){
					  count4 = count4 + 1;
				  }
				  
				if( topFace == 5 ){
					  count5 = count5 + 1;
				  }
				  
				if( topFace == 6 ){
					  count6 = count6 + 1;
				}
//			}
		}
		
		System.out.println();

	}

}
