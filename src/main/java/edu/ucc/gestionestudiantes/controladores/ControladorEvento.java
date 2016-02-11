package edu.ucc.gestionestudiantes.controladores;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import edu.ucc.gestionestudiantes.domain.Programa;
//import edu.ucc.gestionestudiantes.servicios.ServicioPrograma;

//@Controller
public class ControladorEvento {
	/*
	@Autowired
	private ServicioPrograma servPrograma;

	@RequestMapping(value="programa/nuevo", method=RequestMethod.GET)
	public String formularioPrograma(Model modelo){
		
		System.out.println("Obteniendo el formulario");
		modelo.addAttribute("programa", new Programa());
		
		return "formularioPrograma"; 
	}
	

	@RequestMapping(value="programa/crear", method=RequestMethod.POST)
	public String crearPrograma(@ModelAttribute Programa programa, Model modelo){
		
		System.out.println("posteando desde el formulario");
		programa.setNombre(programa.getNombre());
		
		servPrograma.crearPrograma(programa);

		return "vistaPrograma";
	}
	
	@RequestMapping(value="programa", method=RequestMethod.GET)
	public String listarPrograma(Model modelo){
		
		List<Programa> listado = servPrograma.listarProgramas(1, 5);
		
		modelo.addAttribute("programa", listado);
		
		
		return "listadoProgramas";
	}
	
	@RequestMapping(value="programas/{idPrograma}/editar", method=RequestMethod.GET)
	public String editarPrograma(@PathVariable Integer idPrograma, Model modelo){
		
		System.out.println("idPrograma= "+ idPrograma);
		
		Programa p = servPrograma.buscarPrograma(idPrograma);
		
		modelo.addAttribute("programa", p);
		
		return "formularioProgramaActualizar";
	}
	
	@RequestMapping(value="programas/{idPrograma}/actualizar", method=RequestMethod.POST)
	public String actualizarPrograma(@PathVariable Integer idPrograma, @ModelAttribute Programa programa, Model modelo){
		
		Programa p = null;
		
		try {
			p = servPrograma.actualizarPrograma(idPrograma, programa);
		} catch (Exception er) {
			modelo.addAttribute("error", er.getMessage());
			p = programa;
		}
		
		modelo.addAttribute("programa", p);
		
		return "vistaPrograma";
	}
	
	/*
	@RequestMapping(value="programas/{idPrograma}/eliminar", method=RequestMethod.GET)
	public String eliminarPrograma(@PathVariable Integer idPrograma, Model modelo){
		
		Programa p = null;
		try {
			p = servPrograma.eliminarEstudiante(idEstudiante);
		} catch (Exception e1) {
			modelo.addAttribute("error", e1.getMessage());
			e = new Estudiante();
		}
		
		modelo.addAttribute("estudiante", e);
		
		return "vistaEstudiante";
	}*/
	
}