import java.util.Scanner; 

public class CW3 { 
public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	boolean k = true; 
	double a = 0; 
	double b = 0; 
		while (1 == 1) { 
			if (k == true){ 
			System.out.println("Введите первое число"); 
			a = sc.nextDouble(); 
	}	
	else if(k == false){ 
				a = b; 
			} 
				System.out.println("Введите аргумент"); 
				String arg = sc.next(); 
				System.out.println("Введите второе число"); 
					double c = sc.nextDouble(); 
						if (arg.equals("+")) { 
							b = a + c; 
						} 
						if (arg.equals("-")) { 
							b= a - c; 
						} 
						if (arg.equals("*")) { 
							b = a * c; 
						} 
						if (arg.equals("/")) { 
						b = a / c; 
						} 
						System.out.println(b); 
						System.out.println("Сбросить результат? yes/no?"); 
						String otw = sc.next(); 
							if (otw.equals("yes")){ 
							b = 0; 
							k = true; 
							}else { 
								k = false; 
								} 

							} 
					} 
	}


				 
				
				
								
			
	

		