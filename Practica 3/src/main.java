
import java.util.HashSet;
import java.util.Set;


public class main {

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.setColor("azul");
        System.out.println(animal.getColor());
       
        Animal animal2 = new Animal();
        animal2.setColor("Naranja");
        System.out.println(animal2.getColor());
        
        System.out.println(animal);
        System.out.println(animal2);
        
        Perro guau = new Perro();
        guau.setPatas(4);
        System.out.println(guau.getColor());
        System.out.println(guau.getPatas());
        
    }
    
}

