package episode5;

public class Youtube {

	public static void main(String[] args) {
		Youtube YT = new Youtube();
		YT.deletevedio("HFYI");
		YT.deletevedio("SQWUYD");
	}
	
	private void deletevedio(String vedioId) {
	System.out.println("deleted vedio-"+ vedioId);
	}
	
	
	public void createvedio() {
		System.out.println("vediocreated");
	
	}
 private boolean  uploadvedio(){
	System.out.println("uploading");
	  return true;

}
public String ShareVedio() {
	return "facebook";

}
}


