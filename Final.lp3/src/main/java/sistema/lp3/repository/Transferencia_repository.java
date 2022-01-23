package sistema.lp3.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import sistema.lp3.domain.Transferencia;
import sistema.lp3.domain.Usuario;

/**
 * Interfaz para almacenar y recuperar los datos de las organizaciones
 */

@Repository
public interface Transferencia_repository extends PagingAndSortingRepository<Transferencia, Long> {

}
