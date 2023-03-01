package be.vdab.goededoel.domain;

import java.math.BigDecimal;
/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author Joe Dalton
 */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	/**
	 * Maakt een GoedeDoel object
	 * @param naam De naam van het goede doel
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}
	/**
	 * Geeft de naam terug
	 * @return de naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * Geeft de opbrengst terug
	 * @return de opbrengst
	 */
	public BigDecimal getOpbrengst() {
		return opbrengst;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof GoedeDoel) {
			var ander = (GoedeDoel) object;
			return naam.equalsIgnoreCase(ander.naam);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.naam.toUpperCase().hashCode();
	}
}
