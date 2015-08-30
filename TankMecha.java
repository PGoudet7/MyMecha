import mymecha.behaviour.com.*;

public class TankMecha extends MySuperMecha{

	public TankMecha(){
		this.attack = new Melee();
		this.movement = new Walk();
 	}

}
