package hospital;

public interface Phlebotomist {

	public default void drawBlood(Bleedable bleeder) {
		drawBlood(bleeder,1);
	}
	
	public default void drawBlood(Bleedable bleeder, int amount) {
		bleeder.removeBlood(amount);
	}
}
