package fp.tipos.common;

public record Partido(String rival, Integer golesMadrid, Integer golesRival) {
	
	public String getResumenPartido() {
		return "Real Madrid "+golesMadrid+"-"+golesRival+" "+rival;
	}
	

	

}
