import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkList l = new LinkList();
		
		while(true) {
			System.out.println(" Enter your choice ");
			System.out.println("1) Push employee data ");
			System.out.println("2) Print Stack ");
			System.out.println("3) pop employee data ");
			System.out.println("4) Print all male employee ");
			System.out.println("5) print all female employee ");
			System.out.println("6) Empty stack ");
			System.out.println("7) Exit ");
			int ch = sc.nextInt();
			if(ch == 7) {
				break;
			}
			else {
			switch(ch) {
			
			case 1 : System.out.println("Enter Employee_id  ");
						int id = sc.nextInt();
						System.out.println("Enter Name");
						String name = sc.next();
						System.out.println("Enter Gender");
						String g = sc.next();
						char gender = g.charAt(0);
						Employee e = new Employee(id , name, gender);
						l.push(e);
						break;
			case 2: System.out.println(l);
						break;
			case 3: l.pop();
					break;
			case 4: l.maleEmployee();
					break;
			case 5: l.femaleEmployee();
					break;
			case 6: l.emptyStack();
					break;
			default :
					System.out.println("Invalid input ");
			
			}
			}
		}
		sc.close();

	}

}
