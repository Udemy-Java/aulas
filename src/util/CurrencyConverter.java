package util;

public class CurrencyConverter {
	
	public static double IOF = 6; // Alíquota IOF (%)
	
	public static double dolarReal (double cambio, double usd) {
		// Câmbio US$ - R$
		return usd * cambio * (1 + IOF / 100);
	}
	
	public static double realDolar (double cambio, double rs) {
		// Câmbio R$ - US$
		return rs / cambio * (1 + IOF / 100);
	}
}
