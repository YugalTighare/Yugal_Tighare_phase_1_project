package project.phase1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static final String DIR = "C:\\Users\\tigha\\documents";
	
	public static void main(String[] args) throws IOException {
		
		File file = new File(DIR);
		
		for(;;)      //infinite loop
		{
			System.out.println("Welcome to the Portal");
			System.out.println("Please select your choice from the below :");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. Retrive files from directory .. ");
			System.out.println("2. Add file to directory ");
			System.out.println("3. delete file");
			System.out.println("4. search file ");
			System.out.println("5. Exit");
			System.out.println("Enter choice : ");
			String choice = sc.nextLine();
			
			switch (choice) {
			case "1": {
				int count =1;
				String listOfFile[] = file.list();
				for(String name : listOfFile)
				{
					System.out.println(count +"."+ name);
					count ++;
				}
				break;
			}
			
			case "2": {
				System.out.println("Enter file name to create");
				String filename = sc.nextLine();
				
				File creteFileName = new File(DIR+filename);
				boolean createNewFile = creteFileName.createNewFile();
				if(createNewFile)
				{
					System.out.println("File created successfully ");
				}else {
					System.out.println("file already exist ");
				}
				break;
			}
			
			case "3": {
				System.out.println("Enter file name to delete ");
				String filename = sc.nextLine();
				
				File deleteFileName = new File(DIR+filename);
				boolean delete = deleteFileName.delete();
				if(delete)
				{
					System.out.println("file is deleted ");
				}else {
					System.out.println("file is not-present ");
				}
				break;

			}
			
			case "4": {
				System.out.println("Enter file name to search ");
				String filename = sc.nextLine();
				
				File deleteFileName = new File(DIR+filename);
				boolean exists = deleteFileName.exists();
				if(exists)
				{
					System.out.println("file is present in current directory ");
				}else {
					System.out.println("file is not-present in current directory ");
				}
				break;

			}
			case "5": {
				System.out.println("**** Exit ****");
				System.exit(0);
				break;

			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	
		
	}

}
