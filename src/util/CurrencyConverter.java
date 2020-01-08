package util;

public class CurrencyConverter {
	
	public static double IOF = 6; // Al�quota IOF (%)
	
	public static double dolarReal (double cambio, double usd) {
		// C�mbio US$ - R$
		return usd * cambio * (1 + IOF / 100);
	}
	
	public static double realDolar (double cambio, double rs) {
		// C�mbio R$ - US$
		return rs / cambio * (1 + IOF / 100);
	}
}
