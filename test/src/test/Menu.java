package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	static boolean list(ArrayList<Empregado> employedList) {
		if (employedList.isEmpty()) {
			System.out.println("Nenhum empregrado cadastrado!");
			return false;
		} else {
			for(int i = 0; i < employedList.size(); i++)
			{
				System.out.println("ID: " + employedList.get(i).getID() + " - " + employedList.get(i).getName());
			}
		}
		return true;
	}
	
	static void add(ArrayList<Empregado> employedList, int id) {
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
			System.out.println("Choose your employee type:\n [0] Hourly \n [1] Salaried \n [2] Commissioned");
			input = x.nextInt();
			if (input > 2 || input < 0) {
				System.out.println("Tente de novo!");
			} else {
				emp.setType(input);
			}
		}while(input > 2 || input < 0);
		System.out.println("Employee Salary: ");
		double salary = x.nextDouble();
		emp.setSalary(salary);
		do{
			System.out.println("Choose your Payment Method:\n [0] Check payment by the post office \n [1] Check payment in hands \n [2] Bank deposit");
			input = x.nextInt();
			if (input > 2 || input < 0) {
				System.out.println("Tente de novo!");
			} else {
				emp.setPaymentMethod(input);
			}
		}while(input > 2 || input < 0);
		
		
		emp.setID(id);
		emp.getStatus();
		employedList.add(emp);
	}
	
	static void remove(ArrayList<Empregado> employedList) {
		if (list(employedList)) {
			Scanner x = new Scanner(System.in);
			System.out.println("id do funcionario que deseja remover: ");
			int input = x.nextInt();
			if (input > employedList.size()) {
				System.out.println("Empregado inexistente!");				
			} else {
				employedList.remove(input);
			}		
		} else {
			System.out.println("Não há empregrado para ser removido!");
		}
	}
	
	static void edit(ArrayList<Empregado> employedList) {
		if (list(employedList)) {
			Scanner in = new Scanner(System.in);
			System.out.println("ID do funcionario que deseja motificar: ");
			int input = in.nextInt();
			if (input > employedList.size()) {
				System.out.println("Empregado inexistente!");				
			} else {
				int editInput;
				do {
					System.out.println("O que você deseja editar: ");
					System.out.println("[1] Nome");
					System.out.println("[2] Endereço");
					System.out.println("[3] Tipo de Empregado");
					System.out.println("[4] Metodo de pagamento");
					System.out.println("[5] Sindicato");
					System.out.println("[6] Taxa sindical");
					System.out.println("[7] Salvar");
					
					editInput = in.nextInt();
					
					switch (editInput) {
					case 1:
						System.out.println("New name: ");
						//String newName = in.nextLine();
						employedList.get(input).setName(in.nextLine());
						break;
					case 2:
						System.out.println("New Address: ");
						String newAddress = in.nextLine();
						employedList.get(input).setName(newAddress);
						break;
					case 3:
						System.out.println("Choose your employee type:\n [0] Hourly \n [1] Salaried \n [2] Commissioned");
						int theType = in.nextInt();
						if (theType > 2 || theType < 0) {
							System.out.println("Tipo Invalido");
						} else {
							employedList.get(input).setType(theType);
						}
						break;
					case 4:
						System.out.println("Choose your Payment Method:\n [0] Check payment by the post office \n [1] Check payment in hands \n [2] Bank deposit");
						int paymentMethod = in.nextInt();
						if (paymentMethod > 2 || paymentMethod < 0) {
							System.out.println("Método Invalido");				
						} else {
							employedList.get(input).setPaymentMethod(paymentMethod);
						}
						break;
					case 5:
						System.out.println("Mudar estado de sindicato:\n [1] Sim\n [2] Não");
						if (in.nextInt() == 1) {
							if (employedList.get(input).getSyndicate() == false) {
								employedList.get(input).setSyndicate(true);							
							}else if (employedList.get(input).getSyndicate() == true) {
								employedList.get(input).setSyndicate(false);
							}
						}break;
					case 6:
						if (employedList.get(input).getSyndicate() == true) {
							System.out.println("Digite a nova taxa sindical: ");
							employedList.get(input).setSyndicateTax(in.nextDouble());
						} else {
							System.out.println("Empregado não participa do sindicato");
						}
						break;			
					case 7:
						employedList.get(input).getStatus();
						break;
					default:
						System.out.println("Opção invalida!");
						break;
					}
					
				} while (editInput != 7);
			}			
		} else {
			System.out.println("Não há empregrado para ser editado!");
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Empregado> employedList = new ArrayList<Empregado>();
		int ID = 0;

	    Scanner in = new Scanner(System.in);
	    int input = 11;
	    
	    do{
	      System.out.println("----------------MENU----------------");
	      System.out.println("[1] Adição de um empregado");
	      System.out.println("[2] Remoção de um empregado");
	      //System.out.println("[3] Lançar um Cartão de Ponto");
	      //System.out.println("[4] Lançar um Resultado Venda");
	      //System.out.println("[5] Lançar uma taxa de serviço");
	      //System.out.println("[5] Lançar uma taxa de serviço");
	      System.out.println("[6] Alterar detalhes de um empregado");
	      //System.out.println("[7] Rodar a folha de pagamento para hoje");
	      //System.out.println("[8] Undo");
	      //System.out.println("[9] Redo");
	      //System.out.println("[10] Agenda de Pagamento");
	      //System.out.println("[11] Nova Agenda de Pagamento");
	      System.out.println("[0] Sair");

	      input = in.nextInt();

	      switch(input){
	      	case 0: list(employedList); break;
	        case 1: add(employedList, ID++);break;
	        case 2: remove(employedList);break;
	        case 3:System.out.println("3:");break;
	        case 4:System.out.println("4:");break;
	        case 5:System.out.println("5:");break;
	        case 6: edit(employedList);break;
	        case 7:System.out.println("7:");break;
	        case 8:System.out.println("8:");break;
	        case 9:System.out.println("9:");break;
	        case 10:System.out.println("10:");break;
	        case 11:System.out.println("11:");break;
	        default:System.out.println("Operação inválida!!");break;
	      }
	    }while(input != 0);

	}
}
