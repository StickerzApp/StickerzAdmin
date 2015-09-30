package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the adesaocampanha database table.
 * 
 */
@Embeddable
public class AdesaoCampanhaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idEstabelecimento;

	@Column(insertable=false, updatable=false)
	private int idCampanha;

	public AdesaoCampanhaPK() {
	}
	public int getIdEstabelecimento() {
		return this.idEstabelecimento;
	}
	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	public int getIdCampanha() {
		return this.idCampanha;
	}
	public void setIdCampanha(int idCampanha) {
		this.idCampanha = idCampanha;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdesaoCampanhaPK)) {
			return false;
		}
		AdesaoCampanhaPK castOther = (AdesaoCampanhaPK)other;
		return 
			(this.idEstabelecimento == castOther.idEstabelecimento)
			&& (this.idCampanha == castOther.idCampanha);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEstabelecimento;
		hash = hash * prime + this.idCampanha;
		
		return hash;
	}
}