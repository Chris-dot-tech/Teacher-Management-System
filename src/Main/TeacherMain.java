package Main;

import java.util.Scanner;

import DAO.Dao;

import DTO.Teacher;

import DAOImpl.Daoimpl;

public class TeacherMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dao d = new Daoimpl();
		
		int choice;
		
		do {
			System.out.println("/n-----------------Teacher Management System ");
			
			System.out.println("1. Add Teacher ");
			
			System.out.println("2. Fetach All Teacher ");
			
			System.out.println("3. Get Teacher By Id");
			
			System.out.println("4. Update Teacher");
			
			System.out.println("5. Delete Teacher");
			
			System.out.println("6. Exit");
			
			System.out.println("Enter Your Choice: ");
			
			choice = sc.nextInt();
			
			switch(choice){
			
			case 1:
				System.out.print("Enter Teacher Id: ");
				
				int id = sc.nextInt();
				
				System.out.print("Enter Teacher Name: ");
				
				String name = sc.next();
				
				System.out.print("Enter your email: ");
				
				String email = sc.next();
				
				System.out.print("Enter Teacher Contact: ");
				
				int contact = sc.nextInt();
				
				System.out.print("Enter Teacher Gender: ");
				
				String gender = sc.next();
				
				System.out.print("Enter Teacher Subject: ");
				
				String subject = sc.next();
				
				System.out.print("Enter teacher Salary: ");
				
				int salary = sc.nextInt();
				
				Teacher t = new Teacher(id, name, email, contact, gender, subject, salary);
				
				d.addTeacher(t);
				
				break;
				
			case 2:
				d.fetchAll();
				
				break;
				
			case 3:
				
				System.out.print("Enter Teacher id: ");
				
				int uid = sc.nextInt();
				
				d.getTeacherById(uid);
				
				break;
				
			case 4:
				
                System.out.print("Enter Teacher Id: ");
				
				int tid = sc.nextInt();
				
				System.out.print("Enter Teacher Name: ");
				
				String tname = sc.next();
				
				System.out.print("Enter your email: ");
				
				String temail = sc.next();
				
				System.out.print("Enter Teacher Contact: ");
				
				int tcontact = sc.nextInt();
				
				System.out.print("Enter Teacher Gender: ");
				
				String tgender = sc.next();
				
				System.out.print("Enter Teacher Subject: ");
				
				String tsubject = sc.next();
				
				System.out.print("Enter teacher Salary: ");
				
				int tsalary = sc.nextInt();
				
				Teacher tt = new Teacher(tid, tname, temail, tcontact, tgender, tsubject, tsalary);
				
				d.updateTeacher(tt);
				
				break;
				
			case 5:
				System.out.print("Enter delete id: ");
				
				int did = sc.nextInt();
				
				d.deleteTeacher(did);
				
				break;
				
			case 6:
				System.out.println("Thank You For Using This App");
				
			default:
				System.out.println("Entered data is invalid try again ley");
			}
			
			
		}while(choice!=6);
		
		
		sc.close();
		
		
	}
}
