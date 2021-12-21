package tpf.lp3.repository;


import tpf.lp3.domain.Usuario;

import java.util.ArrayList;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(collectionResourceRel = "usuarioRepo", path = "usuarioRepo")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {
	Usuario findByCi(Long Usuario_ID);
	ArrayList<Usuario> findAll();
}
