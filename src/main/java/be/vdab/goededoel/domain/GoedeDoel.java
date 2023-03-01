package be.vdab.goededoel.domain;

import java.math.BigDecimal;

public class GoedeDoel {
	private final String naam;
	private BigDecimal opbrengst = BigDecimal.ZERO;

	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

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
}
