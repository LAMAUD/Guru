package cla.springframework.Guru.web.controller;

import cla.springframework.Guru.services.BeerService;
import cla.springframework.Guru.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/{uuid}")
    public ResponseEntity<BeerDto> gedBeerById(@PathVariable("uuid") String uuid){

        return new ResponseEntity<BeerDto>(beerService.getBeerById(uuid), HttpStatus.OK);
    }


}
