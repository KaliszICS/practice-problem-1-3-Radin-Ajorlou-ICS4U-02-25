import java.util.*;
import java.io.*;
import java.nio.file.NoSuchFileException;



public class PracticeProblem {

	public static void main(String args[]) {

	}






	public static String readFile(String fileName){

		BufferedReader inputStream = null;
		StringBuilder total = new StringBuilder ("");
		String output = "";

		
		try
		{
			inputStream = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = inputStream.readLine()) != null)
			{
				total = total.append(line).append("\n");
			}
			output = total.toString();
		}
		catch(NoSuchFileException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if (inputStream != null)
				{
					inputStream.close();
				}
			}
			catch (IOException e )
			{
				System.out.println(e);
			}
		}
			
		return output;



	
	}




	public static String backwardsReadFile(String fileName){
		FileReader inputStream = null;
		StringBuilder fwds = new StringBuilder();
		try {
			inputStream = new FileReader(fileName);
			int s;
			while ((s = inputStream.read()) != -1){
				char b = (char)s;
				Character c = b;
				String d = c.toString();
				fwds.append(d);
			}
			

			
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally {
			try {
		 		if (inputStream != null) {
		 			inputStream.close();
		 		}

		 	}
		 	catch (IOException e) {
		 		System.out.println(e);
		 	}
			
		}
		return fwds.reverse().toString();

	

	}
}
