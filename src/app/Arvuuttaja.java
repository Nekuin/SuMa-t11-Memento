package app;

import java.util.Random;

public class Arvuuttaja {
	
	private Random random;
	
	public Arvuuttaja() {
		random = new Random();
	}
	
	public void arvaaLuku(Object o, int arvaus) {
		int arvottu = ((Memento)o).getLuku();
		if(arvaus == arvottu) {
			System.out.println("arvasit oikein");
		} else {
			System.out.println("arvasit v‰‰rin, oikea luku: " + arvottu);
		}
		
	}
	
	public Object liityPeliin() {
		return new Memento(random.nextInt(10)+1);
	}
	
	private class Memento {
		
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}
		
		public int getLuku() {
			return luku;
		}
	}
}
