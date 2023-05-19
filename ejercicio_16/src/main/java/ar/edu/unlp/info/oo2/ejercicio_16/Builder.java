package ar.edu.unlp.info.oo2.ejercicio_16;

public interface Builder {
	public void reset();
	public void nuevaCompraDolares(double valorCompra);
	public void nuevaCompraPesos(double valorCompra);
	public void nuevoPlazoFijo(int cantDias, double interes);
	public void nuevoPlazoFijoRenovable(int cantDias, double interes);
}
