package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	static void add(List<Empregado> employedList, int id) {
		Empregado emp = new Empregado();
		Scanner x = new Scanner(System.in);
		System.out.print("Name: ");
		String theName = x.nextLine();
		emp.setName(theName);
		System.out.print("Address: ");
		String theAddress = x.nextLine();
		emp.setAddress(theAddress);
		int input;
		do{
			System.out.println("Choose your employed type:\n [0] Hourly \n [1] Salaried \n [2] Commissioned");
			input = x.nextInt();
			switch (input) {
			case 0:
				emp.setType("Hourly");//FALTA COLOCAR O PAGAMENTO	
				break;
			case 1:
				emp.setType("Salaried");//FALTA COLOCAR O PAGAMENTO
				break;
			case 2:
				emp.setType("Commissioned");//FALTA COLOCAR O PAGAMENTO
				break;
			default:
				System.out.println("Try Again!!");
				break;
			}
		}while(input > 2);
		do{
			System.out.println("Choose your Payment Method:\n [0] Check payment by the post office \n [1] Check payment in hands \n [2] Bank deposit");
			input = x.nextInt();
			switch (input) {
			case 0:
				emp.setPaymentMethod("Check payment by the post office");	
				break;
			case 1:
				emp.setPaymentMethod("Check payment in hands");
				break;
			case 2:
				emp.setPaymentMethod("Bank deposit");
				break;
			default:
				System.out.println("Try Again!!");
				break;
			}
		}while(input > 2);
		emp.setID(id);

		employedList.add(emp);
	}
	
	static void remove(List<Empregado> employedList) {
		for(int i = 0; i < employedList.size(); i++)
		{
			System.out.println("ID: " + employedList.get(i).getID() + " - " + employedList.get(i).getName());
		}
		Scanner x = new Scanner(System.in);
		System.out.println("id do funcionario que deseja remover: ");
		int input = x.nextInt();
		employedList.remove(input);
	}
	
	
	public static void main(String[] args) {
		
		List<Empregado> employedList = new ArrayList<Empregado>();
		int ID = 0;

	    Scanner in = new Scanner(System.in);
	    int input = 11;
	    
	    do{
	      System.out.println("MENU:");
	      System.out.println("[1] Adição de um empregado");
	      System.out.println("[2] Remoção de um empregado");
	      System.out.println("[3] Lançar um Cartão de Ponto");
	      System.out.println("[4] Lançar um Resultado Venda");
	      System.out.println("[5] Lançar uma taxa de serviço");
	      System.out.println("[5] Lançar uma taxa de serviço");
	      System.out.println("[6] Alterar detalhes de um empregado");
	      System.out.println("[7] Rodar a folha de pagamento para hoje");
	      System.out.println("[8] Undo");
	      System.out.println("[9] Redo");
	      System.out.println("[10] Agenda de Pagamento");
	      System.out.println("[11] Nova Agenda de Pagamento");

	      input = in.nextInt();

	      switch(input){
	        case 1:add(employedList, ID++);break;
	        case 2:remove(employedList);break;
	        case 3:System.out.println("3:");break;
	        case 4:System.out.println("4:");break;
	        case 5:System.out.println("5:");break;
	        case 6:System.out.println("6:");break;
	        case 7:System.out.println("7:");break;
	        case 8:System.out.println("8:");break;
	        case 9:System.out.println("9:");break;
	        case 10:System.out.println("10:");break;
	        case 11:System.out.println("11:");break;
	        default:System.out.println("Operação inválida!!");break;
	      }

	    }while(input < 11);
	    
	    for(int i = 0; i < employedList.size(); i++)
		{
			System.out.println(employedList.get(i).getID() + " - " + employedList.get(i).getName());
		}

	}
}
