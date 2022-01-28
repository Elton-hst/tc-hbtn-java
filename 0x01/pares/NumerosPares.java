public class NumerosPares {

	public static void main(String[] args) {
		int num;
		for(num = 0; num <= 98; num++) {
		if(num%2 == 0 && num<98) {
			System.out.printf(num + ", ");	
				}
		else if(num%2 == 0 && num == 98){
			System.out.println(num);
		}
		}

	}

}