package tpf.lp3.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tpf.lp3.domain.Proyecto;
import tpf.lp3.repository.ProyectoRepository;
import tpf.lp3.service.ProyectoService;
import tpf.lp3.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/proyecto")
public class ProyectoController {
	@Autowired
	private ProyectoService ProyectoService;
	@Autowired
	private ProyectoRepository proyectoRepository;
	@Autowired
	private UsuarioRepository UsuarioRepository;

	@RequestMapping(value = "/")
	public ArrayList<Proyecto> mostrar() {
		return proyectoRepository.findAll();
	}
}
