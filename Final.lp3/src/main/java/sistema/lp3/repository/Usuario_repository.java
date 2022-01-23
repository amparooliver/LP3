package sistema.lp3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sistema.lp3.domain.Usuario;

@Repository
public interface Usuario_repository extends PagingAndSortingRepository<Usuario, Long>{

	@Query("SELECT u from Usuario u WHERE u.rol LIKE %?1")
	List<Usuario> findByRol(String rol);
	
}
