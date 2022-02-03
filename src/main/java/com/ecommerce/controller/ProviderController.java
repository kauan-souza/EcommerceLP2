package com.ecommerce.controller;

import com.ecommerce.model.ProviderModel;
import com.ecommerce.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class ProviderController {

    private ProviderService service;

    public ProviderController(ProviderService service) {
        this.service = service;
    }

    @PostMapping
    public void saveProvider(@RequestBody @Valid ProviderModel providerModel){
        service.save(providerModel);
    }

    @GetMapping
    public List<ProviderModel> findAllProvider(){
        return service.findAll();
    }
}
