package sistema.lp3.service;

import java.util.List;
import sistema.lp3.domain.Transferencia;
import sistema.lp3.exceptions.SistemaException;


public interface Transferencia_service {
	
	List<Transferencia> findAll();

	void delete_transfer(long transferencia_ID) throws SistemaException;

	Transferencia update_transfer(Transferencia transfer, long transferencia_ID);
}
