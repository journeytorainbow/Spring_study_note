package ems.member;

import java.util.Scanner;

import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

import ems.member.config.*;
import ems.member.service.*;

public class MainClassUseConfigImport {
	public static void main(String[] args) {
		String[] sNums = {"H39r8djakndfae32", "H39asdfaelu42o23", "H39iiemamca8w9h4", 
				  "H39lkmn754fghia7", "H39plo865cuy8k92", "H39mnbviiaed89q1", 
				  "H399omjjyv56t3d5", "H39lczaqwg644gj8", "H39ymbcsh74thgh2", 
				  "H39lesvj7544vf89"};

		String[] sIds = {"rabbit", "hippo", "raccoon", "elephant", "lion", 
					    "tiger", "pig", "horse", "bird", "deer"};
		
		String[] sPws = {"96539", "94875", "15284", "48765", "28661", 
						"60915", "30028", "29801", "28645", "28465"};
		
		String[] sNames = {"agatha", "barbara", "chris", "doris", "elva", 
						  "fiona", "holly", "jasmin", "lena", "melissa"};
		
		int[] sAges = {19, 22, 20, 27, 19, 21, 19, 25, 22, 24};
		String[] sGenders = {"M", "W", "W", "M", "M", "M", "W", "M", "W", "W"};
		String[] sMajors = {"English Literature", "Korean Language and Literature", 
				"French Language and Literature", "Philosophy", "History", 
				"Law", "Statistics", "Computer", "Economics", "Public Administration"};
		
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfig1.class, MemberConfig2.class, MemberConfig3.class);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MemberConfigUseImport.class);
 		
		StudentRegisterService registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
		for (int i=0; i<sNums.length; i++) {
			Student student = new Student(sNums[i], sIds[i], sPws[i], sNames[i], sAges[i], sGenders[i], sMajors[i]);
			registerService.register(student);
		}
		
		StudentSelectService selectService = ctx.getBean("studentSelectService", StudentSelectService.class);
		System.out.println("\nsNums\t\t\tsId\tsPw\tsName\tsAge\tsGender\tsMajor");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i=0; i<sNums.length; i++) {
			Student student = selectService.select(sNums[i]);
			System.out.print(student.getsNum() + "\t");
			System.out.print(student.getsId() + "\t");
			System.out.print(student.getsPw() + "\t");
			System.out.print(student.getsName() + "\t");
			System.out.print(student.getsAge() + "\t");
			System.out.print(student.getsGender() + "\t");
			System.out.print(student.getsMajor() + "\n");
		}
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String str = "";
			
			System.out.println("\n==================================================================="
					+ "==============================================================================");
			System.out.println("Select number.");
			System.out.println("1. Check student information");
			System.out.println("2. Exit");
			
			str = scanner.next();
			if(str.equals("2")) {
				System.out.println("Bye~~");
				break;
			} else {
				System.out.println("Pls input ur class num.");
				
				str = scanner.next();
				Student student = selectService.select(str);
				System.out.print("sNum:" + student.getsNum() + "\t");
				System.out.print("|sId:" + student.getsId() + "\t");
				System.out.print("|sPw:" + student.getsPw() + "\t");
				System.out.print("|sName:" + student.getsName() + "\t");
				System.out.print("|sAge:" + student.getsAge() + "\t");
				System.out.print("|sGender:" + student.getsGender() + "\t");
				System.out.println("|sMajor:" + student.getsMajor() + "\t");
			}
		}
	}
}