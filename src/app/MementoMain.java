package app;

public class MementoMain {

	public static void main(String[] args) {
		Arvuuttaja a = new Arvuuttaja();
		Object o = a.liityPeliin();
		for(int i = 0; i < 11; i++) {
			a.arvaaLuku(o, i);
		}
	}

}
