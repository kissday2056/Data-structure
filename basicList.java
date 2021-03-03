package Structure;

import java.util.Scanner;

public class basicList {
//5개의 수를 입력받아 빈배열에 넣어서 출력하기.
	public static void main(String[] args) {
		int n[] =new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력 ㄱㄱ");
		for(int i=0; i<n.length; i++) {				
			n[i] = input.nextInt();
		}
		for(int j:n) {
			System.out.println("입력받은 5개의수 : " +j);
		}
	}//byte short long int double float char bollean
}

