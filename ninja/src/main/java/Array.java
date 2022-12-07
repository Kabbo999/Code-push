
public class Array {
public static void main(String[]args) {
	//int[] number;
	int[] number = new int[5];
  int[] number2 = new int[8] ;  //"[]" this indicates the size of an array // array index start from 0 and it can never be positive
	number[0]=10;
	number[1]=10;
	number[2]=10;
	number[3]=10;
	number[4]=10;
	int sum = number[0]+number[1] + number[2]+number[3] + number[4];
	System.out.println("sum= "+sum);
	int len = number.length;
	System.out.println("Array size= "+len);
	System.out.println(number[0]);
			
	
}
}