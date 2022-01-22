package sistema.lp3.repository;

/*import java.util.List;*/

import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

import sistema.lp3.domain.Organizacion;

/**
 * Interfaz para almacenar y recuperar los datos de las organizaciones
 */

@Repository
public interface Organizacion_repository  extends PagingAndSortingRepository<Organizacion, Long>{
	/*List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);*/
}
