package fa.training.controller;

import fa.training.dto.PersonForCreate;
import fa.training.models.PERSONAL;
import fa.training.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/person" )
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/list")
    public String list(Model theModel) {
        List<PERSONAL> personals = personService.getAll();
        theModel.addAttribute("personals", personals);
        return "list-visitor";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        PersonForCreate personDTO = new PersonForCreate();
        model.addAttribute("person",personDTO);
        return "visitor-add";
    }

    @PostMapping("/add")
    public String addDatabase(@ModelAttribute("person") PersonForCreate customerDTO) {
        personService.save(customerDTO);
        return "redirect:/person/list";
    }


}
