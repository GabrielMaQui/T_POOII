package com.cibertec.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



import com.cibertec.modelo.Medicamentos;
import com.cibertec.repositorio.IMedicamentoRepositorio;


@Controller

public class MedicamentoController {
	@Autowired
    private IMedicamentoRepositorio medicamentoRepository;

    @GetMapping("/")
    public String listarMedicamentos(Model model) {
        List<Medicamentos> medicamentos = medicamentoRepository.findAll();
        model.addAttribute("medicamentos", medicamentos);
        return "listarmedicamentos";
    }
    @GetMapping("/nuevo")
    public String mostrarFormularioRegistro(Model model) {
    	model.addAttribute("libro", new Medicamentos());
		return "nuevo"; 
    }
    @PostMapping("/registrar")
    public String registrarMedicamento(@ModelAttribute Medicamentos medicamento) {
        medicamentoRepository.save(medicamento);
        return "redirect:/";
    }
}
