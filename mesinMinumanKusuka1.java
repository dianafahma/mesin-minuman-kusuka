import java.util.Arrays;
import java.util.Scanner;

class menu{
	static int juice, coffe, airPutih, minumanSoda;

	public int getJuice(){
		return this.juice;
	}

	public int getCoffe(){
		return this.coffe;
	}

	public int getAirPutih(){
		return this.airPutih;
	}

	public int getMinumanSoda(){
		return this.minumanSoda;
	}

	void setBeliJuice(int juice){
		this.juice = 10000;
	}

	void setBeliCoffe(int coffe){
		this.coffe = 7000;
	}

	void setBeliAirPutih(int airPutih){
		this.airPutih = 5000;
	}

	void setBeliMinumanSoda(int minumanSoda){
		this.minumanSoda = 13000;
	}
}

class diskon{
	diskon(){

    String[]x = {"juice","coffe","air putih","minuman soda"};
        
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }		
	}
}

class printNota{

}

class checkMenu{
	void checkMenu (){
	int scan;
	Scanner keyboard = new Scanner(System.in);

	System.out.println("--------------------");
	System.out.println(" Silahkan Pilih Minuman yang Tersedia");
	System.out.println(" 1. Juice ");
	System.out.println(" 2. Coffe ");
	System.out.println(" 3. Air Putih ");
	System.out.println(" 4. Minuman Soda ");
	System.out.println("--------------------");

	System.out.print("Masukkan No Pilihan Anda (1-4) :");
	scan = keyboard.nextInt();
	System.out.println();

	switch (scan){
		case 1:
			System.out.println( "Harganya adalah :" );
			
		break;
		case 2:
			System.out.println("harganya adalah 7000" );
			
		break;
		case 3:
		System.out.println("harganya adalah 5000" );
		break;

		case 4:
		System.out.println("harganya adalah 13000" );

		}
	}
}

public class mesinMinumanKusuka1{
public static void main (String[] args){
	menuMethod m = new menuMethod();
	m.menu();
}}
