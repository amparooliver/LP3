package sistema.lp3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sistema.lp3.domain.Usuario;

@Repository
public interface Usuario_repository extends PagingAndSortingRepository<Usuario, Long> {
	
	//@Query ("SELECT u FROM Usuario u WHERE u.rol in :rol")
	//public List<Usuario> findbyRol(String Rol);
}
