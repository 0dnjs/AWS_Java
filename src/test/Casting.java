package test;

public class Casting {

	public static void main(String[] args) {
		Program[] programs = new Program[2];
		programs[0] = new Java();
		programs[1] = new C();
		
		for(int i = 0; i < programs.length; i++) {
			String[] arrays = new String[2];
//			arrays[0]
 			for(int j =0; j < arrays.length; j++) {
				System.out.println(arrays[i]);
			}
			
		}
	}

}
