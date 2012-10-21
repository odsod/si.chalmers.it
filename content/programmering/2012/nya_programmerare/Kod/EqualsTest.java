public class EqualsTest {
	
	public static class Player {
		public Equippable thing;
		
		public void setThing(Equippable thing) {
			this.thing = thing;
		}
	}
	
	public static void main(String[] args) {
		Equippable sword = new Sword();
		Equippable rocket = new RocketLauncher(4, 20, 200, 10);
		Equippable rocket2 = new RocketLauncher(4, 20, 200, 11);
		
		// Test different weapons
		System.out.println("Comparing a sword with a rocket. Should be false");
		System.out.println(sword.equals(rocket));
		
		// Test the same weapon
		System.out.println("Comparing two rockets. Should be false");
		System.out.println(rocket.equals(rocket2));
		
		Player p = new Player();
		p.setThing(rocket);
		p.thing.use();
		
		p.setThing(sword);
		p.thing.use();
	}
}

interface Equippable {
	public void use();
}

abstract class ProjectileWeapon implements Equippable {
	
	private int ammo;
	private int range;
	private int caliber;
	
	public ProjectileWeapon(int ammo, int range, int caliber) {
		this.ammo = ammo;
		this.range = range;
		this.caliber = caliber;
	}
	
	public int getAmmo() {
		return this.ammo;
	}
	
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}
	
	public void use() {
		if(this.ammo > 0){
			this.fire();
			System.out.println("*** " + this.toString() + " fired");
			this.ammo--;
		}
	}
	
	
	public boolean equals(Object obj){
		if(this == obj) {
			return true;
		}
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		ProjectileWeapon other = (ProjectileWeapon) obj;
		return 	this.ammo == other.ammo && 
				this.range == other.range && 
				this.caliber == other.caliber;
	}
	
	public abstract void fire();
}

class Sword implements Equippable {
	private boolean isTwoHanded = false;
	
	public void use() {
		// Slash sword
	}
	
	public boolean isTwoHanded() {
		return this.isTwoHanded;
	}
	
}

class ShotGun extends ProjectileWeapon {
	
	private int bulletSpread;
	
	public ShotGun(int ammo, int range, int caliber, int spread) {
		super(ammo, range, caliber);
		this.bulletSpread = spread;
	}
	
	public void fire() {
		// Fire the weapon here
	}
	
}

class RocketLauncher extends ProjectileWeapon {
	
	private int splashArea;
	
	public RocketLauncher(int ammo, int range, int caliber, int splash) {
		super(ammo, range, caliber);
		this.splashArea = splash;
	}
	
	public void fire() {
		// Fire the weapon here
	}

	public boolean equals(Object obj) {
		return super.equals(obj) && this.splashArea == ((RocketLauncher) obj).splashArea;
	}

}