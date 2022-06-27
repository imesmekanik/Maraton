package EsnekDizi;

public class EsnekDizi {
	// boyutu ve içeriği belirli olmayan dizi
	static int[] arr;

	public static void main(String[] args) {

		// Test İçin:
		// arr = new int[3];
		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = i; }
		 */

		// ekle(arr.length, arr, 12);
		// sil(arr, 1);
		// arayaEkle(arr, 99, 1);
		// listele();
	}

	// arrayin istenilen bir indexine eleman ekler
	public static void arayaEkle(int[] a, int sayi, int index) {
		int[] temp;

		if (index == a.length) {
			ekle(a.length, a, sayi);
		} else {

			temp = new int[a.length + 1];

			for (int i = 0, j = 0; i < a.length; i++, j++) {
				if (i == index) {
					temp[j] = sayi;
					j++;
				}
				temp[j] = a[i];
			}

			arr = new int[temp.length];

			for (int i = 0; i < (temp.length); i++) {
				arr[i] = temp[i];
			}
		}

	}

	// son sıradan arraye ekleme yapar
	public static void ekle(int length, int a[], int sayi) {
		int i;

		int temp[] = new int[length + 1];

		for (i = 0; i < length; i++)
			temp[i] = a[i];

		temp[length] = sayi;
		arr = new int[length + 1];

		for (i = 0; i < (length + 1); i++) {
			arr[i] = temp[i];
		}

	}

	// array indexini girdiğimiz elemanı siler
	public static void sil(int[] a, int index) {

		if (a == null || index < 0 || index >= a.length) {
			System.out.println("Dizide eleman yok ya da olmayan bir index değeri girdiniz.");
			return;
		}

		int[] temp = new int[a.length - 1];

		for (int i = 0, j = 0; i < a.length; i++) {

			if (i == index) {
				continue;
			}

			temp[j++] = a[i];
		}

		arr = new int[temp.length];

		for (int i = 0; i < (arr.length); i++) {
			arr[i] = temp[i];
		}

	}

	public static void listele() {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

}
