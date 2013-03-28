package testprogram;

public class Printnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for(count=1;count<=100;count++){
			
			if(count%15 ==0){
				//System.out.print(count);
				System.out.print("GitHub\n");
			}
			else if (count%3==0){
				//System.out.print(count);
				System.out.print("Hub\n");
				}
			else if (count%5==0){
				// System.out.print(count);
				System.out.print("Git\n");
				}
			else System.out.print(count+"\n");
			
		}
		

	}

}
