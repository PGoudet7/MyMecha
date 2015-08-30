import mysupermecha.behaviour.com.*;

public class MyMechaTest {

	public static void main(String args[]){
		
		Baby b = new Baby();
		Mecha m = new Mecha();
		TankMecha t = new TankMecha();
		
		System.out.println("The baby...:");
		b.movement.move();
		b.attack.fight();
		System.out.println("-----");

		System.out.println("The Mecha...:");
		m.movement.move();
		m.attack.fight();
		System.out.println("-----");
		
		System.out.println("The TankMecha...:");
		t.movement.move();
		t.attack.fight();
		t.learnSpell(new Missile(), 0);
		t.castSpell(0);
		t.learnSpell(new Laser(), 1);
		t.castSpell(1);
		System.out.println("-----");
	}
	
}
