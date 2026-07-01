package FileTest;

import java.io.*;

public class FileTest1 {

	public static void main(String[] args) throws IOException {
	
		
		
	File f=new File("C:\\users\\91897\\Downloads\\Test.txt");
//		
//		BufferedReader a=new BufferedReader(new FileReader(f));
//		
//		String r;
//		
//		while((r=a.readLine())!=null) {
//			
//			System.out.println(r);
//			
//		}

	BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
	
	bw.append("java is experencied in Uipath");
	
	bw.newLine();
	
	bw.append("he ha good knowledge in sql as well");
	
	bw.close();
	
	
	File k=new File("C:\\users\\91897\\Downloads\\Test.txt");
	
	BufferedReader br=new BufferedReader(new FileReader(k));
	
	String l;
	
	while((l=br.readLine())!=null) {
		System.out.println(l);
	}
		//Added comments to test the file
		
		
	}

}
