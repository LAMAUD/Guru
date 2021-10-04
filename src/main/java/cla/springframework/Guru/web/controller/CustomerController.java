package cla.springframework.Guru.web.controller;


import cla.springframework.Guru.services.CustomerService;
import cla.springframework.Guru.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{uuid}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("uuid") UUID uuid) {

        return new ResponseEntity<CustomerDto>(customerService.getCustomerByID(uuid), HttpStatus.OK);
    }

}
