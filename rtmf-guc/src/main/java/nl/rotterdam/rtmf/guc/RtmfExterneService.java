/*
 * Copyright (c) 2009-2011 Gemeente Rotterdam
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the European Union Public Licence (EUPL),
 * version 1.1 (or any later version).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * European Union Public Licence for more details.
 *
 * You should have received a copy of the European Union Public Licence
 * along with this program. If not, see
 * http://www.osor.eu/eupl/european-union-public-licence-eupl-v.1.1
*/
package nl.rotterdam.rtmf.guc;

/**
 * Een enum om de magic values "GM" "TMF" en "Both" te vervangen in de code. 
 * 
 * De nieuwe aanduidingen zijn respectivelijk Landelijk, Rotterdam, Beide.
 * 
 * @author Peter Paul Bakker
 */
public enum RtmfExterneService {
	
	Landelijk("TMF"), Rotterdam("GM"), Beide("Both");

	private String naam;
	
	RtmfExterneService(String naam) {
		this.naam = naam;
	}
	
	public String toString() {
		return naam;
	}
	
}
