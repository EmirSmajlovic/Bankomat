import java.util.Scanner;

public class BankomatTest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		Korisnik noviKorisnik = new Korisnik();
		double stanjeRacuna = 0;
		System.out.println("Unesite vase ime i prezime");
		noviKorisnik.setImeKorisnika("Emir Smajlovic");
		noviKorisnik.getImeKorisnika();
		System.out.println("Unesite broj vaseg racuna: ");
		int brojKorisnika = 0;
		do {
			brojKorisnika = unos.nextInt();
		} while (Korisnik.provjeriBrojRacuna(brojKorisnika) == true
				^ Korisnik.jelNegativanRacun(brojKorisnika) == true);
		noviKorisnik.setBrojRacuna(brojKorisnika);
		noviKorisnik.getBrojRacuna();
		System.out.println("Unesite iznos na racunu: ");
		do {
			stanjeRacuna = unos.nextDouble();
		} while (Korisnik.jelNegativanRacun(stanjeRacuna) == true);
		noviKorisnik.setStanje(stanjeRacuna);
		noviKorisnik.getStanje();
		Korisnik novijiKorisnik = new Korisnik();
		System.out.println("Unesite vase ime i prezime");
		novijiKorisnik.setImeKorisnika("Emir Smajlovic");
		novijiKorisnik.getImeKorisnika();
		System.out.println("Unesite broj vaseg racuna: ");
		do {
			brojKorisnika = unos.nextInt();
		} while (Korisnik.provjeriBrojRacuna(brojKorisnika) == true
				^ Korisnik.jelNegativanRacun(brojKorisnika) == true);
		novijiKorisnik.setBrojRacuna(brojKorisnika);
		novijiKorisnik.getBrojRacuna();
		System.out.println("Unesite iznos na racunu: ");
		do {
			stanjeRacuna = unos.nextDouble();
		} while (Korisnik.jelNegativanRacun(stanjeRacuna) == true);
		novijiKorisnik.setStanje(stanjeRacuna);
		novijiKorisnik.getStanje();
		System.out.println("Unesite source racun: ");
		int sourceRacun = 0;
		do {
			sourceRacun = unos.nextInt();
		} while (Korisnik.jeliPostoji(sourceRacun) == false);
		double stanjePosiljalac = Korisnik.kojiRacun(sourceRacun);
		System.out.println("Unesite target racun: ");
		int targetRacun = 0;
		do {
			targetRacun = unos.nextInt();
		} while (Korisnik.jeliPostoji(sourceRacun) == false);
		double stanjePrimalac = Korisnik.kojiRacun(targetRacun);
		System.out.println("Unesite iznos novca koji zelite prebaciti: ");
		double iznosNovca = unos.nextDouble();
		if (Korisnik.imalDovoljnoPara (stanjePosiljalac, iznosNovca ) == true) {
		if (stanjePosiljalac == noviKorisnik.stanjeRacuna) {noviKorisnik.stanjeRacuna = stanjePosiljalac - iznosNovca; novijiKorisnik.stanjeRacuna = stanjePrimalac + iznosNovca; noviKorisnik.getStanje(); novijiKorisnik.getStanje();}
		else if (stanjePosiljalac == novijiKorisnik.stanjeRacuna) {novijiKorisnik.stanjeRacuna = stanjePosiljalac - iznosNovca; noviKorisnik.stanjeRacuna = stanjePrimalac + iznosNovca;}
		}
		else {System.out.println("Nemate dovoljno novca na stanju");}
		System.out.println(noviKorisnik.vlasnikRacuna + " " + noviKorisnik.stanjeRacuna + " " + noviKorisnik.tRacun);
		System.out.println(novijiKorisnik.vlasnikRacuna + " " + novijiKorisnik.stanjeRacuna + " " + novijiKorisnik.tRacun);
		unos.close();
	}

}
