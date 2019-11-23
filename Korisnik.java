public class Korisnik {

	static int brojZaArr;
	int racunskiBroj;
	static int[] brojRacuna = new int[10];
	String[] imeVlasnika = new String[10];
	static double[] stanjaRacuna = new double[10];
	String vlasnikRacuna;
	double stanjeRacuna;
	int tRacun;
	static double privremeniBroj;
	private static boolean jeLiRacun = false;
	private static boolean jeliNegativan = false;
	private static boolean jeliNegativnoStanje = false;
	private static boolean postojilRacun = false;
	private static boolean imalPara = false;

	Korisnik() {
		brojZaArr++;
	}

	public void setImeKorisnika(String nekoIme) {
		imeVlasnika[brojZaArr] = nekoIme;
		this.vlasnikRacuna = nekoIme;
	}
	

	public void getImeKorisnika() {
		System.out.println("Ime vlasnika je: " + imeVlasnika[brojZaArr]);
	}

	public static boolean provjeriBrojRacuna(int nekiBroj) {
		for (int i = 0; i < brojRacuna.length; i++) {
			if (brojRacuna[i] == nekiBroj) {
				System.out.println("Unijeli ste postojeci racun");
				jeLiRacun = true;
				break;
			} else if (brojRacuna[i] != nekiBroj) {
				jeLiRacun = false;
			}
		}
		return jeLiRacun;

	}

	public static boolean jelNegativanRacun(int nekiBroj) {
		if (nekiBroj < 0) {
			System.out.println("Unijeli ste nevazeci broj racuna");
			jeliNegativan = true;
		} else if (nekiBroj > 0) {
			jeliNegativan = false;
		}
		return jeliNegativan;
	}

	public void setBrojRacuna(int nekiBroj) {
		brojRacuna[brojZaArr] = nekiBroj;
		tRacun = nekiBroj;
	}

	public void getBrojRacuna() {
		System.out.print("Broj racuna je: " + brojRacuna[brojZaArr]);
	}

	public void setStanje(double nekoStanje) {
		this.stanjeRacuna = nekoStanje;
		stanjaRacuna[brojZaArr] = nekoStanje;
	}

	public void getStanje() {
		System.out.println(stanjeRacuna);
	}

	public static boolean jelNegativanRacun(double nekiBroj) {
		if (nekiBroj < 0) {
			System.out.println("Unijeli ste nevazece stanje racuna");
			jeliNegativnoStanje = true;
		} else if (nekiBroj > 0) {
			jeliNegativnoStanje = false;
		}
		return jeliNegativnoStanje;
	}
	public static boolean jeliPostoji (int nekiBroj) {
		for (int i = 0; i < brojRacuna.length; i++) {
			if (brojRacuna[i] == nekiBroj) {postojilRacun = true; break;}
			else if (brojRacuna[i] != nekiBroj) {postojilRacun = false;}
		}
		return postojilRacun;
	}
	
	public static double kojiRacun (int nekiBroj) {
		for (int i = 0; i < brojRacuna.length; i++) {
			if (nekiBroj == brojRacuna[i]) {privremeniBroj = stanjaRacuna[i]; break;}
		}
		return privremeniBroj;
	}
	
	public static boolean imalDovoljnoPara (double nekiBroj, double josJedanBroj) {
		if (nekiBroj - josJedanBroj < 0) {System.out.println("Nemate dovoljno novca na racunu"); imalPara = false;}
		else if (nekiBroj - josJedanBroj > 0) {System.out.println("Transakcija se moze obaviti"); imalPara = true;}
		
		return imalPara;
	}
	public String toString() {
		return vlasnikRacuna + " " + racunskiBroj + " " + " " + stanjeRacuna;
	}
}
	
	
