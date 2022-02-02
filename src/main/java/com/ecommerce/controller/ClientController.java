package com.ecommerce.controller;

import com.ecommerce.model.ClientModel;
import com.ecommerce.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    public void saveClient(@RequestBody @Valid ClientModel clientModel){
        service.save(clientModel);
    }

    @GetMapping(params = {"name"})
    public String findClientByName(@RequestParam("name") String name){
       return service.findByName(name);
    }

    @GetMapping
    public List<ClientModel> getAllClient(){
        return service.findAll();
    }

}
