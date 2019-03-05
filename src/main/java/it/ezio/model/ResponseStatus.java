package it.ezio.model;

import java.io.Serializable;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class ResponseStatus implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codice;
	private String descrizione;
	private String esito;

	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getEsito() {
		return esito;
	}
	public void setEsito(String esito) {
		this.esito = esito;
	}



}
