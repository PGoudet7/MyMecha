import mymecha.behaviour.com.*;

public abstract class MyMecha {

	protected Movements movement = new Creep();
	protected Attacks attack = 	new Cry();
	
	public MyMecha(){
	}

	public MyMecha(Movements m, Attacks a){
		this.movement = m;
		this.attack = a;
	}
	
}

