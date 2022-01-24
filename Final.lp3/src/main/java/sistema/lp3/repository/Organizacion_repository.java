package sistema.lp3.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import sistema.lp3.domain.Organizacion;

/**
 * Interfaz para almacenar y recuperar los datos de las organizaciones
 */

@Repository
public interface Organizacion_repository  extends PagingAndSortingRepository<Organizacion, Long>{

	List<Organizacion> findByTipoDeOrganizacion(String tipoDeOrganizacion);
	
	/*@Modifying
	@Query("UPDATE Organizacion u SET u.nombreOrganizacion = :nombreOrganizacion WHERE u.organizacion_ID = :organizacion_ID")
	void update*/

}
