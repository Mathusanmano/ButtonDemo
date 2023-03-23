package demo;

public class Myyoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Youtube YT = new Youtube();
		String shared = YT.ShareVedio();
		System.out.println(shared);
		 YT.createvedio();
	}

}
