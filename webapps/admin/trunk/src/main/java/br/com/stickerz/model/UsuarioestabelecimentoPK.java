package br.com.stickerz.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the usuarioestabelecimento database table.
 * 
 */
@Embeddable
public class UsuarioEstabelecimentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idEstabelecimento;

	@Column(insertable=false, updatable=false)
	private int idPessoa;

	public UsuarioEstabelecimentoPK() {
	}
	public int getIdEstabelecimento() {
		return this.idEstabelecimento;
	}
	public void setIdEstabelecimento(int idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	public int getIdPessoa() {
		return this.idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioEstabelecimentoPK)) {
			return false;
		}
		UsuarioEstabelecimentoPK castOther = (UsuarioEstabelecimentoPK)other;
		return 
			(this.idEstabelecimento == castOther.idEstabelecimento)
			&& (this.idPessoa == castOther.idPessoa);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEstabelecimento;
		hash = hash * prime + this.idPessoa;
		
		return hash;
	}
}