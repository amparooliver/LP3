package tpf.lp3.repository;


import tpf.lp3.domain.Usuario;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

}
