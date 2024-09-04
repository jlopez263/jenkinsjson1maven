package org.aib.json1;

public class MainClass {

	public static void main(String[]  args)
	{
		String json="{\"nombre\":\"pedro\"}";
		LeerJsonPersona leer=new LeerJsonPersona();
		Persona persona=leer.getPersona(json);
		System.out.println(persona.getNombre());
	}
	
}
