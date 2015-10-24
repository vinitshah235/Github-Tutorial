import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * - TASK: Extend the class Superhero as a subclass of Human.
 * - TASK: Add a String field that stores the hero's alter ego!
 * - TASK: Modify the given constructor by adding the alter ego as an additional parameter
 *   and setting it.
 * - TASK: Override the introduce() method to ALSO include the alter ego! (In other words,
 *   you should call the superclass introduce method when you override the method.)
*/

public class Superhero extends Human{
    
	private String alterEgo;
	
    public Superhero(String givenName, int age , String alterEgo) {
        super(givenName, age);
        this.alterEgo = alterEgo;
    }
    
    public String getAlterEgo() {
        return alterEgo;
    }
    
    public String introduce(){
    	return super.introduce() + " I'm also known as " + getAlterEgo();
    }
    
    public static void main(String args[]){
    	Superhero ironman = new Superhero("Tony" , 38 , "Ironman");
    	Superhero shaktimaan = new Superhero("Shakti" , 46 , "Shaktimaan");
    	Superhero batman = new Superhero("bruce" , 34 , "Batman");
    	
    	System.out.println(batman.introduce());
    	
    	List<Superhero> people = new ArrayList<Superhero>();
    	people.add(ironman);
    	people.add(shaktimaan);
    	people.add(batman);
    	
    	
    	for (Superhero names : people){
    		System.out.println(names.getName());
    	}
    	
    	Collections.sort(people);
    	
    	for (Superhero names : people){
    		System.out.println(names.getAge() + " " + names.getName() + " '" + 
    	names.getAlterEgo() + "'");
    	}
    	
    	
    }
}

