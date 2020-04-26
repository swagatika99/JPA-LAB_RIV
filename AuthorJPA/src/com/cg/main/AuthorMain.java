package com.cg.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.entity.Author;
import com.cg.service.AuthorService;
import com.cg.service.AuthorServiceImpl;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorService service=new AuthorServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice =0;
		while(true)
		{
			choice=getChoice(sc);
			switch(choice){
			case 1:
				System.out.println("Create Author");
				System.out.println("Enter <id> <firstname> <middlename> <lastname> <phoneno>");
				Author aut=new Author(sc.nextInt(),sc.next(),
						        sc.next(),sc.next(),sc.nextLong());
				boolean success=service.create(aut);
				if(success)
				{
				System.out.println("Author data is saved to the database");	
				}
				else {
					System.out.println("Author data not saved");
				}
				break;
			case 2:
				System.out.println("Update Author");
				System.out.println("Find Auther : Enter <id>");
				aut = service.getAut(sc.nextInt());
				System.out.println("Author found: " + aut);
				if (aut!= null) {
					System.out.println("Enter new phone no");
					aut.setPhoneno(sc.nextLong());
					boolean saved = service.update(aut);
					if (saved)
						System.out.println("Author table updated");
					else
						System.out.println("Author table  could not be updated");
						}
				break;
			case 3:
				System.out.println("Find Author");
				System.out.println("Enter the <id>");
				aut = service.getAut(sc.nextInt());
				if(aut!=null)
				{
				System.out.println("Author found: " + aut);
				}
				else {
					System.out.println("Author  not found");
				}
				break;
			case 4:
				System.out.println("Delete Author");
				System.out.println("Enter the <id>");
				aut = service.getAut(sc.nextInt());
				System.out.println("Author found: " + aut);
				if(aut!=null)
				{
					boolean delete=service.delete(aut);
					if(delete) {
						System.out.println("Author data has been deleted");
					}
					else {
						System.out.println("Author data not deleted");
					}
				}

				break;
			case 5:
				System.out.println("Exit System");
				System.exit(0);
				break;
				default:
					System.out.println("Enter choice from 1 to 5 only");
					break;
			}
			
			}

	}

	private static int getChoice(Scanner sc) {
		int choice=0;
		System.out.println("Author Management System");
		System.out.println("1.Create Author");
		System.out.println("2. Update Author");
		System.out.println("3.Find Author");
		System.out.println("4.Delete Author");
		System.out.println("5.Exit System");
		System.out.println("Choose from the options");
		try {
		choice=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("please enter a number from the menu");
			sc.nextLine();
			
		}
		return choice;
	}

}
