package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e = new Email("Vikas","Jadhav");
		e.setAlternateEmail("vikasjadhav927@gmail.com");
		System.out.println("Alternate Email:"+e.getAlternateEmail());
		e.setMailBoxCapacity(567);
		System.out.println("Capacity:"+e.getMailBoxCapacity()+" MB");
		System.out.println("\n\n Details:\n"+e.displayInfo());

		
/*---------------
  			e.department;
-------------------
 
Error: Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
The field Email.department is not visible
		
		
		//==>it is constant string ..
		//..literal: Right Hand Side it should be;
		
*/

/*--------------------
		String a = e.department;
	--------------------------
		
		Error==>The field Email.department is not visible
*/
		
		
	}

}
