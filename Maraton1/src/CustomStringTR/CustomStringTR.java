package CustomStringTR;

public class CustomStringTR {

	String kelime = "";

	public static void main(String[] args) {

		CustomStringTR customStringTR = new CustomStringTR();
		customStringTR.kelime = "Merhaba Dünya";

		// Test için:
		// System.out.println(customStringTR.uzunluk());
	}

	public int uzunluk() {
		return kelime.length();
	}

	public char ordakiKarakter(int index) {
		return kelime.charAt(index);
	}

	public boolean iceriyorMu(String s) {
		return kelime.contains(s);
	}

	public boolean ileBasliyorMu(String s) {
		return kelime.startsWith(s);
	}

	public boolean ileBitiyorMu(String s) {
		return kelime.endsWith(s);
	}

	public boolean esitMi(String s) {
		return kelime.equals(s);
	}

	public boolean buyukKucukHarfBakmadanEsitMi(String s) {
		return kelime.equalsIgnoreCase(s);
	}

	public int ilkDizin(String s) {
		return kelime.indexOf(s);
	}

	public String degistir(String eski, String yeni) {
		return kelime.replace(eski, yeni);
	}

	// Overload örneği
	public String degistir(char eski, char yeni) {
		return kelime.replace(eski, yeni);
	}

	public String[] ayir(String s) {
		return kelime.split(s);
	}

	public String altDize(int baslangic, int bitis) {
		return kelime.substring(baslangic, bitis);
	}

	// Overload örneği
	public String altDize(int baslangic) {
		return kelime.substring(baslangic);
	}

	public String harfleriKucult() {
		return kelime.toLowerCase();
	}

	public String harfleriBuyut() {
		return kelime.toUpperCase();
	}

	public String kenarBosluklariniAl() {
		return kelime.trim();
	}

}
