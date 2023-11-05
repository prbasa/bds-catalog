package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fluxo")
public class Fluxo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String horarioChegada;
	private String produto;
	private String placaCavalo;
	private String placaCarreta;
	private String motorista;
	private String dataNasc;
	private String cpf;
	private String rg;
	private String cnh;
	private String transportadora;
	private String cnpj;
	private String contrato;
	private String destino;
	private String statusLibFluxo;
	private String horarioLibFluxo;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;

	public Fluxo() {
	}

	public Fluxo(Long id, String horarioChegada, String produto, String placaCavalo, String placaCarreta,
			String motorista, String dataNasc, String cpf, String rg, String cnh, String transportadora, String cnpj,
			String contrato, String destino, String statusLibFluxo, String horarioLibFluxo) {
		this.id = id;
		this.horarioChegada = horarioChegada;
		this.produto = produto;
		this.placaCavalo = placaCavalo;
		this.placaCarreta = placaCarreta;
		this.motorista = motorista;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.rg = rg;
		this.cnh = cnh;
		this.transportadora = transportadora;
		this.cnpj = cnpj;
		this.contrato = contrato;
		this.destino = destino;
		this.statusLibFluxo = statusLibFluxo;
		this.horarioLibFluxo = statusLibFluxo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHorarioChegada() {
		return horarioChegada;
	}

	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getPlacaCavalo() {
		return placaCavalo;
	}

	public void setPlacaCavalo(String placaCavalo) {
		this.placaCavalo = placaCavalo;
	}

	public String getPlacaCarreta() {
		return placaCarreta;
	}

	public void setPlacaCarreta(String placaCarreta) {
		this.placaCarreta = placaCarreta;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getStatusLibFluxo() {
		return statusLibFluxo;
	}

	public void setStatusLibFluxo(String statusLibFluxo) {
		this.statusLibFluxo = statusLibFluxo;
	}

	public String getHorarioLibFluxo() {
		return horarioLibFluxo;
	}

	public void setHorarioLibFluxo(String horarioLibFluxo) {
		this.horarioLibFluxo = horarioLibFluxo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	@PrePersist
	public void prePersist() {
		createdAt = Instant.now();
	}

	@PreUpdate
	public void preUpdate() {
		updatedAt = Instant.now();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fluxo other = (Fluxo) obj;
		return Objects.equals(id, other.id);
	}

}
