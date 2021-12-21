package tpf.lp3.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tpf.lp3.domain.Organizacion;
import tpf.lp3.domain.Proyecto;
import tpf.lp3.domain.Usuario;
import tpf.lp3.repository.OrganizacionRepository;
import tpf.lp3.repository.ProyectoRepository;
import tpf.lp3.repository.UsuarioRepository;
import tpf.lp3.service.OrganizacionService;


@RestController
@RequestMapping(value = "/organizacion")
public class OrganizacionController {
	@Autowired
	private OrganizacionService organizacionService;

	@Autowired
	private OrganizacionRepository organizacionRepository;

	@Autowired
	private ProyectoRepository proyectoRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	/*
	 * Metodo mostrar() Retorna una lista de todos las organizaciones existentes en el
	 * repositorio
	 */
	@RequestMapping(value = "/")
	public ArrayList<Organizacion> mostrar() {
		return organizacionRepository.findAll();
	}
	/*
	 * Metodo mostrarIntegrantes Recibe como parametro el id de un Organizacion a traves
	 * de PathVariable de la api del servicio REST y retorna una lista de todos las
	 * personas asignadas como expositores a las charlas de dicho Proyecto
	 */
	@RequestMapping(value = "/listar/Integrantes/id={id}")
	public List<Usuario> mostrarIntegrantes(@PathVariable long Usuario_ID){
		return organizacionService.listarIntegrantes(OrganizacionRepository.findById(Usuario_ID));
	}
	/*
	 * Metodo crearOrganziacion Recibe como parametro un evento, que es cargado por el
	 * metodo "RequestBody" de la api del servicio REST y devuelve una instancia
	 * salvada en la base de datos
	 */
	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public Organizacion crearOrganizacion(@RequestBody Organizacion organizacion) {
		return organizacionRepository.save(organizacion);
	}

	

}
