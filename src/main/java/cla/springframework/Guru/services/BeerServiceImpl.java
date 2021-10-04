package cla.springframework.Guru.services;

import cla.springframework.Guru.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(String uuid) {
        return BeerDto.builder().uuid(UUID.randomUUID()).beerName("Chouffe").ucd("plof").description("Meilleure bière ever").build();
    }
}
