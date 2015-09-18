package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the campanhaadesivo database table.
 * 
 */
@Entity
@NamedQuery(name="Campanhaadesivo.findAll", query="SELECT c FROM Campanhaadesivo c")
public class Campanhaadesivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCampanhaAdesivo;

	private String nomeAdesivo;

	private int numAdesivo;

	private String pathImagemAdesivo;

	//bi-directional many-to-one association to Campanha
	@ManyToOne
	@JoinColumn(name="IdCampanha")
	private Campanha campanha;

	public Campanhaadesivo() {
	}

	public int getIdCampanhaAdesivo() {
		return this.idCampanhaAdesivo;
	}

	public void setIdCampanhaAdesivo(int idCampanhaAdesivo) {
		this.idCampanhaAdesivo = idCampanhaAdesivo;
	}

	public String getNomeAdesivo() {
		return this.nomeAdesivo;
	}

	public void setNomeAdesivo(String nomeAdesivo) {
		this.nomeAdesivo = nomeAdesivo;
	}

	public int getNumAdesivo() {
		return this.numAdesivo;
	}

	public void setNumAdesivo(int numAdesivo) {
		this.numAdesivo = numAdesivo;
	}

	public String getPathImagemAdesivo() {
		return this.pathImagemAdesivo;
	}

	public void setPathImagemAdesivo(String pathImagemAdesivo) {
		this.pathImagemAdesivo = pathImagemAdesivo;
	}

	public Campanha getCampanha() {
		return this.campanha;
	}

	public void setCampanha(Campanha campanha) {
		this.campanha = campanha;
	}

}