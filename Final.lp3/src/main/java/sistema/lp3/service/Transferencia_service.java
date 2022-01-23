package sistema.lp3.service;

import java.util.List;
import org.springframework.stereotype.Service;

import sistema.lp3.domain.Transferencia;


public interface Transferencia_service {
	
	List<Transferencia> findAll();

	void delete_transfer(long transferencia_ID);

	Transferencia update_transfer(Transferencia transfer, long transferencia_ID);
}
