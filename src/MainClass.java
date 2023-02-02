import java.util.Scanner;


public class MainClass
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Benvenuto, effettuare una scelta");
		System.out.println("--------------------------------");
		System.out.println("1. somma indici pari");
		System.out.println("2. differenza indici dispari ");
		System.out.println("3. inverso ");
		System.out.println("4. inverso stringa ");
		System.out.println("--------------------------------");
		int Scelta = in.nextInt();
		
	
		
		switch(Scelta)
		{
			case 1 : 
				Pari();
				break;
			
			case 2:
				Dispari();
				break;
			
			case 3:
				Inverso();
				break;
			case 4:
				InversoStrng();
				break;
			default:
				Def();
				break;
		}		
	}
	public static void Def()
	{
		System.out.println("Non esiste alcuna scelta");
	}
	
	public static void Pari()
	{
		int Somma = 0;
		int Numeri[] = new int [6];
		for( int i = 0; i<Numeri.length; i++)
		{
			System.out.println("Inserire un numero");
			Numeri[i]=in.nextInt();
		}
		for(int i=0; i < Numeri.length; i+=2)
		{
			Somma+=Numeri[i];
		}
		System.out.println("La somma è pari a " + Somma);
	}
	
	public static void Dispari()
	{
		int Differenza = 0;
		int Numeri[] = new int [6];
		for( int i = 0; i<Numeri.length; i++)
		{
			System.out.println("Inserire un numero");
			Numeri[i]=in.nextInt();
		}
		for(int i=1; i<Numeri.length; i+=2)
		{
			Differenza-=Numeri[i];
		}
		System.out.println("La differenza è " + Differenza);
		
	}
	
	public static void Inverso()
	{
		int Numeri[] = new int [6];
		for( int i = 0; i<Numeri.length; i++)
		{
			System.out.println("Inserire un numero");
			Numeri[i]=in.nextInt();
		}
		
		int NumeriInversi[] = new int [Numeri.length];
		for (int i = Numeri.length; i<=0;i--)
		{
			int Contatore = 0;
			Contatore ++;
			NumeriInversi[Contatore] = Numeri[i];
		}
		
		
		for(int i=0; i<Numeri.length; i++)
		{
			System.out.println( NumeriInversi[i]);
		}
		
	}
	
	public static void InversoStrng()
	{
		String Stringa[] = new String [6];
		for( int i = 0; i<Stringa.length; i++)
		{
			System.out.println("Inserire un numero");
			Stringa[i]=in.nextLine();
		}
		
		int Stringaa[] = new int [Stringa.length];
		for (int i = Stringa.length; i<=0;i--)
		{
			int Contatore = 0;
			Contatore ++;
			Stringaa[Contatore] = Stringa[i];
		}
		
		
		for(int i=0; i<Stringa.length; i++)
		{
			System.out.println( Stringaa[i]);
		}
	}
	
	public static void Length()
	{
		int Numeri[] = new int [6];
		for( int i = 0; i<Numeri.length; i++)
		{
			System.out.println("Inserire un numero");
			Numeri[i]=in.nextInt();
		}
		int Contatore = 0;
		for(int i=0; i<Numeri.length; i++)
		{
			Contatore++;
		}
		System.out.println("La lunghezza equivale a " + Contatore);
	}
}
	
	
