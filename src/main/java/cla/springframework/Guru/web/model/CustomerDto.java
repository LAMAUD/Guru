package cla.springframework.Guru.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Builder
@Data
@AllArgsConstructor
public class CustomerDto {

    private UUID uuidCustomer;
    private String nameCustomer;
    private String firstNameCustomer;
}
