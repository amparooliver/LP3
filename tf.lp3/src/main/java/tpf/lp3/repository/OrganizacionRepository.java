package tpf.lp3.repository;

import java.util.ArrayList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tpf.lp3.domain.Organizacion;

@RepositoryRestResource(collectionResourceRel = "organizacionRepo", path = "organizacionRepo")
public interface OrganizacionRepository extends PagingAndSortingRepository<Organizacion, Long>{

	ArrayList<Organizacion> findByNombreOrganizacion(String nombreOrganizacion);

	static Organizacion findById(long Usuario_ID) {
		// TODO Auto-generated method stub
		return null;
	}

	ArrayList<Organizacion> findAll();

}
