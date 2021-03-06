package br.com.stickerz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "rede")
public class Rede implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdRede", unique=true ,nullable = false)
	private int idRede;

	@Column(nullable = false, length = 200 , unique=true)
	private String nomeRede;
	
	@Column(nullable = false)
	private Double valorTicketMedio;
	
	@Column(nullable = false)
	private boolean bolAtivo;

	@Column(nullable = false, length = 100)
	private String pathImagemRede;
	
	
	public Rede() {

	}



	
}
