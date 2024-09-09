package application;

abstract class CheckLetter {

	protected String text;

    public CheckLetter(String text) {
    	this.text = text;
    }
	
    public abstract void check();

}
	

