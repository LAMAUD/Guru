package cla.springframework.Guru.services;

import cla.springframework.Guru.web.model.BeerDto;

public interface BeerService {

    BeerDto getBeerById(String uuid);
}
