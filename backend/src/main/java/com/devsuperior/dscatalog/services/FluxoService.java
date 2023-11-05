package com.devsuperior.dscatalog.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.dto.FluxoDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Fluxo;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.repositories.FluxoRepository;
import com.devsuperior.dscatalog.services.exceptions.DatabaseException;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;

@Service
public class FluxoService {

	@Autowired
	private FluxoRepository repository;
	
	@Transactional(readOnly = true)
	public Page<FluxoDTO> findAllPaged(Pageable pageable) {
		Page<Fluxo> list = repository.findAll(pageable);
		return list.map(x -> new FluxoDTO(x));
	}

	@Transactional(readOnly = true)
	public FluxoDTO findById(Long id) {
		Optional<Fluxo> obj = repository.findById(id);
		Fluxo entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new FluxoDTO(entity);
	}

	@Transactional
	public FluxoDTO insert(FluxoDTO dto) {
		Fluxo entity = new Fluxo();
		entity.setHorarioChegada(dto.getHorarioChegada());
		entity.setProduto(dto.getProduto());
		entity.setPlacaCavalo(dto.getPlacaCavalo());
		entity.setPlacaCarreta(dto.getPlacaCarreta());
		entity.setMotorista(dto.getMotorista());
		entity.setDataNasc(dto.getDataNasc());
		entity.setCpf(dto.getCpf());
		entity.setRg(dto.getRg());
		entity.setCnh(dto.getCnh());
		entity.setTransportadora(dto.getTransportadora());
		entity.setCnpj(dto.getCnpj());
		entity.setContrato(dto.getContrato());
		entity.setDestino(dto.getDestino());
		entity.setStatusLibFluxo(dto.getStatusLibFluxo());
		entity.setHorarioLibFluxo(dto.getHorarioLibFluxo());
		entity = repository.save(entity);
		return new FluxoDTO(entity);
	}

	@Transactional
	public FluxoDTO update(Long id, FluxoDTO dto) {
		try {
			Fluxo entity = repository.getOne(id);
			entity.setHorarioChegada(dto.getHorarioChegada());
			entity.setProduto(dto.getProduto());
			entity.setPlacaCavalo(dto.getPlacaCavalo());
			entity.setPlacaCarreta(dto.getPlacaCarreta());
			entity.setMotorista(dto.getMotorista());
			entity.setDataNasc(dto.getDataNasc());
			entity.setCpf(dto.getCpf());
			entity.setRg(dto.getRg());
			entity.setCnh(dto.getCnh());
			entity.setTransportadora(dto.getTransportadora());
			entity.setCnpj(dto.getCnpj());
			entity.setContrato(dto.getContrato());
			entity.setDestino(dto.getDestino());
			entity.setStatusLibFluxo(dto.getStatusLibFluxo());
			entity.setHorarioLibFluxo(dto.getHorarioLibFluxo());
			entity = repository.save(entity);
			return new FluxoDTO(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}		
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}
}
