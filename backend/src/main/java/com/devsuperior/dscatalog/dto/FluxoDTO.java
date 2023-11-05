package com.devsuperior.dscatalog.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Fluxo;
import com.devsuperior.dscatalog.entities.Product;

public class FluxoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message = "Campo requerido")
	private String horarioChegada;

	@NotBlank(message = "Campo requerido")
	private String produto;
	
	@NotBlank(message = "Campo requerido")
	private String placaCavalo;
	
	@NotBlank(message = "Campo requerido")
	private String placaCarreta;
	
	@NotBlank(message = "Campo requerido")
	private String motorista;
	
	@NotBlank(message = "Campo requerido")
	private String dataNasc;
	
	@NotBlank(message = "Campo requerido")
	private String cpf;
	
	@NotBlank(message = "Campo requerido")
	private String rg;
	
	@NotBlank(message = "Campo requerido")
	private String cnh;
	
	@NotBlank(message = "Campo requerido")
	private String transportadora;
	
	@NotBlank(message = "Campo requerido")
	private String cnpj;
	
	@NotBlank(message = "Campo requerido")
	private String contrato;
	
	@NotBlank(message = "Campo requerido")
	private String destino;
	
	@NotBlank(message = "Campo requerido")
	private String statusLibFluxo;
	
	@NotBlank(message = "Campo requerido")
	private String horarioLibFluxo;
	
	public FluxoDTO() {
	}
	
	public FluxoDTO(Long id, String horarioChegada, String produto, String placaCavalo, String placaCarreta,
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
		this.horarioLibFluxo = horarioLibFluxo;
	}

	public FluxoDTO(Fluxo entity) {
		this.id = entity.getId();
		this.horarioChegada = entity.getHorarioChegada();
		this.produto = entity.getProduto();
		this.placaCavalo = entity.getPlacaCavalo();
		this.placaCarreta = entity.getPlacaCarreta();
		this.motorista = entity.getMotorista();
		this.dataNasc = entity.getDataNasc();
		this.cpf = entity.getCpf();
		this.rg = entity.getRg();
		this.cnh = entity.getCnh();
		this.transportadora = entity.getTransportadora();
		this.cnpj = entity.getCnpj();
		this.contrato = entity.getContrato();
		this.destino = entity.getDestino();
		this.statusLibFluxo = entity.getStatusLibFluxo();
		this.horarioLibFluxo = entity.getHorarioLibFluxo();
	
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
	
	
	
	
}
