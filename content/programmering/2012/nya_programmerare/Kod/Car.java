class Car {
	
	/* Instansvariabler */
	
	// Bilens aktuella hastighet
	int speed;
	
	// Bilens färg representerad med klassen Color
	Color color;
	
	// Bilens märke
	String brand;
	
	
	/* Getters/setters – kommandon och frågor för en Car */
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color newColor) {
		color = newColor;
	}
	
	public String getBrand() {
		return brand;
	}
	
	/* Beteenden */
	
	public void turnLeft() {
		// Bilen svänger vänster
	}
	
	public void turnRight() {
		// Bilen svänger höger
	}
	
	public void honk() {
		// Bilen tutar
	}
	
	public boolean isRunning() {
		return speed != 0;
	}
	
	// etc ..
}