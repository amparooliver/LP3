package sistema.lp3.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.lp3.domain.Transferencia;
import sistema.lp3.repository.Transferencia_repository;
import sistema.lp3.service.Transferencia_service;

@Service
public class Transferencia_service_impl implements Transferencia_service{
	
	@Autowired
	private Transferencia_repository transferencia_repository;
	
	@Override
	public List<Transferencia> findAll() {
		List<Transferencia> transferencias = new ArrayList<>();
		Iterator<Transferencia> iteratorTransferencias = transferencia_repository.findAll().iterator();
		while (iteratorTransferencias.hasNext()) {
			transferencias.add(iteratorTransferencias.next());
		}
		return transferencias;
	}
	
	public void save(Transferencia transferencias) {
		transferencia_repository.save(transferencias);
		
	}

	@Override
	public void delete_transfer(long transferencia_ID) {
		transferencia_repository.deleteById(transferencia_ID);
	}

	@Override
	public Transferencia update_transfer(Transferencia transfer, long transferencia_ID) {
		Transferencia transferencia= transferencia_repository.findById(transferencia_ID).get();
		
		transferencia.setMetodoPago(transfer.getMetodoPago());
		
		return transferencia_repository.save(transferencia);
		
	}
	
	
	
}
