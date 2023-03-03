package fp.tipos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Partido implements Comparable<Partido> {
	//Definición de propiedades:
	
	
	private String rival; //Nombre del equipo al que se enfrenta
	private LocalDateTime fechaHora; //Fecha y hora del partido
	private Boolean fueLocal; //Dice si fue local o no
	private Double audiencia; //Audiencia por televisión  en millones
	private Integer golesMadrid; //Goles que el Real Madrid marcó en ese partido
	private Integer golesRival; //Goles que le marcaron al Real Madrid en ese partido
	private Resultados resultado; //Enumerado de si fue victoria, derrota o empate
	private List<String> jugadores; //Lista variable de 2 a 6 jugadores de ese partido
	private Partido resumenPartido; //Cadena con un formato Real madrid x-x Rival, para hacer un resumen de cómo acabó el partido.

	//Contructor 1
	public Partido(String rival,LocalDateTime fechaHora, Resultados resultado){
		//Restricción 1
		if (fechaHora.getYear()!=2021 || fechaHora.getYear()!=2022) {
			throw new IllegalArgumentException("El partido no es de esta temporada");
		}
	
		this.rival=rival;
		this.fechaHora=fechaHora;
		this.resultado=resultado;
	}
	//Constructor 2
	public Partido(String rival , Boolean fueLocal, Integer golesMadrid, Integer golesRival,Double audiencia ) {
		//Restricción 2
		if (audiencia<0) {
			throw new IllegalArgumentException ("La audiencia de un partido no puede ser negativa");
	
		}
		this.rival=rival;
		this.audiencia=audiencia;
		this.fueLocal=fueLocal;
		this.golesMadrid=0;
		this.golesRival=0;
	}
	//Propiedad derivada, que calcula la diferencia de goles en cada partido.
	public Integer getDiferenciaGoles() {
		return  Math.abs(golesMadrid-golesRival);
	}
	public String getRival() {
		return rival;
	}
	public void setRival(String rival) {
		this.rival = rival;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		if (fechaHora.getYear()!=2021 || fechaHora.getYear()!=2022) {
			throw new IllegalArgumentException("El partido no es de esta temporada");
		}
		this.fechaHora = fechaHora;
	}
	public Double getAudiencia() {
		return audiencia;
	}
	public void setAudiencia(Double audiencia) {
		if (audiencia<0) {
			throw new IllegalArgumentException ("La audiencia de un partido no puede ser negativa");
	
		}
		this.audiencia = audiencia;
	}
	public Integer getGolesMadrid() {
		return golesMadrid;
	}
	public void setGolesMadrid(Integer golesMadrid) {
		this.golesMadrid = golesMadrid;
	}
	public Integer getGolesRival() {
		return golesRival;
	}
	public void setGolesRival(Integer golesRival) {
		this.golesRival = golesRival;
	}
	public Resultados getResultado() {
		return resultado;
	}
	public void setResultado(Resultados resultado) {
		this.resultado = resultado;
	}
	public Boolean getFueLocal() {
		return fueLocal;
	}

	public List<String> getJugadores() {
		return jugadores;
	}
	public void setJugadores(List<String> jugadores) {
		this.jugadores = jugadores;
	}
	//Representación como cadena
	@Override
	public String toString() {
		return "Partido [rival=" + rival + ", fechaHora=" + fechaHora + ", resultado=" + resultado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaHora, resultado, rival);
	}
	//Criterio de igualdad
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(fechaHora, other.fechaHora) && resultado == other.resultado
				&& Objects.equals(rival, other.rival);
	}
	//Criterio de ordenación
	public int compareTo(Partido p) {
		int res=this.getRival().compareTo(p.getRival());
		if (res==0) {
			res=this.getFechaHora().compareTo(p.getFechaHora());
		}
		if (res==0) {
			res=this.getResultado().compareTo(p.getResultado());
		}
		return res;
	}
	public Partido getResumenPartido() {
		return resumenPartido;
	}
	public void setResumenPartido(Partido resumenPartido) {
		this.resumenPartido = resumenPartido;
	}


}
