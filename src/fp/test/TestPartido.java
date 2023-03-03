package fp.test;

import java.time.LocalDateTime;

import fp.tipos.Partido;
import fp.tipos.Resultados;

public class TestPartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime fechaHora1=LocalDateTime.of(2022, 2, 27, 20, 30);
		Partido p1=new Partido("Barcelona",fechaHora1, Resultados.VICTORIA );
		System.out.println(p1);
		
		
		
		Partido p2=new Partido("Atlético de Madrid", fechaHora1, Resultados.VICTORIA, 3.8);
		System.out.println(p2);
		
		//En este salta el IllegalArgumentException
		/*LocalDateTime fechaHora2=LocalDateTime.of(2019, 3, 20, 22, 00);
		Partido p3=new Partido("Betis",fechaHora2, Resultados.EMPATE );
		System.out.println(p3);*/
		
		System.out.println(p2.getAudiencia()+5.0);
		
		

	}


}
