package examples;

public class Taco {
	
	String filling;
	String tortilla;

	public void setFilling(String filling) {

		this.filling = filling;
	}

	public void setTortilla(String tortilla) {

		this.tortilla = tortilla;
	}

	private String getFilling() {
		return this.filling;
	}
	private String getTortilla() { return this.tortilla; }

	public static void main(String[] args) {
		
		Taco taco = new Taco();
		taco.setFilling("carne asada");
		taco.setTortilla("corn");
		System.out.println("this taco " +"filling is: "+taco.getFilling()  +" and tortilla is: " +taco.getTortilla());
		
	}

}
