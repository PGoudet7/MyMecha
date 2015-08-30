import java.util.HashMap;

import mymecha.behaviour.com.*;
import mysupermecha.behaviour.com.*;

public abstract class MySuperMecha extends MyMecha{
	
	protected HashMap<Integer, Spells> spell = new HashMap<Integer, Spells>();

	public MySuperMecha(){
	}
	
	public MySuperMecha(Movements m, Attacks a){
		this.movement = m;
		this.attack = a;
	}

	public void learnSpell(Spells s,int i){
	this.spell.put(i,s);
	}
	
	public void castSpell(int i){
		this.spell.get(i).cast();
	}
}
