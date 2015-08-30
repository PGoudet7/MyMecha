import mymecha.behaviour.com.*;


public class Mecha extends MyMecha{

	public Mecha(){
		this.movement = new Walk();
		this.attack = new Melee();
	}
	
}
