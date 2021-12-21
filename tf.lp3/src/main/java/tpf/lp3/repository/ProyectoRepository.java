package tpf.lp3.repository;

import java.util.ArrayList;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import tpf.lp3.domain.Proyecto;

@RepositoryRestResource(collectionResourceRel = "proyectoRepo", path = "proyectoRepo")
public interface ProyectoRepository extends PagingAndSortingRepository<Proyecto, Long>  {
	
	ArrayList<Proyecto> findByNombreProyecto(String nombreProyecto);

	ArrayList<Proyecto> findAll();
}
