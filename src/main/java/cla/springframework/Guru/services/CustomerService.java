package cla.springframework.Guru.services;

import cla.springframework.Guru.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerByID(UUID uuid);
}
