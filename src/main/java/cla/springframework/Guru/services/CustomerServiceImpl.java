package cla.springframework.Guru.services;

import cla.springframework.Guru.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerByID(UUID uuid) {

        return CustomerDto.builder().uuidCustomer(uuid)
                .nameCustomer("LAMAUD").firstNameCustomer("Cédric").build();
    }
}
