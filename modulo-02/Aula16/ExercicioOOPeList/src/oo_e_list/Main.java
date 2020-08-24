package oo_e_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
				
		System.out.println("How many employees will be registered?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter id from employee whose salary will increase: ");
		int idsalary = sc.nextInt();
	
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
//		Integer pos = position(list, idsalary);
		
		if (pos == null) {
			System.out.println("This Id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double prc = sc.nextDouble();
			list.get(pos).increaseSalary(prc);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Employee> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		
		return null;
	}
}