package Aritmetik;

import java.util.Scanner;

public class Aritmetik {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Test İçin:
		// dortIslem();
		alanHesaplama();
	}

	public static void alanHesaplama() {
		double alan = 0;
		int secim = 1;

		while (secim != 0) {

			System.out.println("1...Üçgen alanı hesapla");
			System.out.println("2...Dikdörtgen alanı hesapla");
			System.out.println("0...Çıkış");
			System.out.println("Lütfen yapacağınız işlemi seçiniz: ");

			secim = scanner.nextInt();

			switch (secim) {

			case 0:
				System.out.println("Çıkış yapıldı!");
				break;
			case 1:
				System.out.print("Üçgenin taban uzunluğu: ");
				double taban = scanner.nextDouble();
				System.out.print("Üçgenin yüksekliği: ");
				double height = scanner.nextDouble();
				alan = taban * height / 2;
				System.out.println("Üçgenin alanı: " + alan);
				break;
			case 2:
				System.out.print("Dikdörtgenin bir kenar uzunluğu: ");
				double kisaKenar = scanner.nextDouble();
				System.out.print("Dikdörtgenin diğer kenar uzunluğu: ");
				double uzunKenar = scanner.nextDouble();
				alan = kisaKenar * uzunKenar;
				System.out.println("Dikdörtgenin alanı: " + alan);
				break;
			default:
				System.out.println("***Hatalı seçim yaptınız, tekrar deneyiniz.***");

			}
		}

	}

	public static void dortIslem() {

		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		System.out.println("1...Toplama");
		System.out.println("2...Çıkarma");
		System.out.println("3...Çarpma");
		System.out.println("4...Bölme");
		int secim = scanner.nextInt();

		switch (secim) {
		case 1:
			toplama();

			break;
		case 2:
			cikarma();

			break;
		case 3:
			carpma();

			break;
		case 4:
			bolme();

			break;

		default:
			break;
		}

	}

	public static void bolme() {
		double div = 0;
		double sayi;
		System.out.println("Bir sayı giriniz:");
		div = scanner.nextDouble();

		do {
			System.out.println("Bölmek için bir sayı giriniz, çıkmak için etkisiz eleman olan 1 giriniz: ");
			sayi = scanner.nextDouble();

			div = div / sayi;
		} while (sayi != 1);
		System.out.println("Girdiğiniz sayıların farkı= " + div);

	}

	public static void carpma() {
		double mul = 1;
		double sayi;

		do {
			System.out.println("Çarpmak için bir sayı giriniz, çıkmak için etkisiz eleman olan 1 giriniz: ");
			sayi = scanner.nextDouble();

			mul = mul * sayi;
		} while (sayi != 1);
		System.out.println("Girdiğiniz sayıların çarpımı= " + mul);

	}

	public static void cikarma() {
		double sub = 0;
		double sayi;
		System.out.println("Bir sayı giriniz:");
		sub = scanner.nextDouble();

		do {
			System.out.println("Çıkartmak için bir sayı giriniz, çıkmak için etkisiz eleman olan 0 giriniz: ");
			sayi = scanner.nextDouble();

			sub = sub - sayi;
		} while (sayi != 0);
		System.out.println("Girdiğiniz sayıların farkı= " + sub);

	}

	public static void toplama() {

		double sum = 0;
		double sayi;
		do {
			System.out.println("Toplanması için bir sayı giriniz, çıkmak için etkisiz eleman olan 0 giriniz: ");
			sayi = scanner.nextDouble();

			sum = sum + sayi;
		} while (sayi != 0);
		System.out.println("Girdiğiniz sayıların toplamı= " + sum);

	}

}
