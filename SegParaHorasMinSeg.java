import java.util.*;
 public class SegParaHorasMinSeg {
 public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduza o numero de segundos: ");
		int segundos = entrada.nextInt(); 
        int p1 = segundos % 60;
        int p2 = segundos / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
    }    
 }