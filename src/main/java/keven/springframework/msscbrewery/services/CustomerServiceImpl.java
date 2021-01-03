package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerbyID(UUID customerID) {
        return CustomerDto.builder().uuid(UUID.randomUUID())
                .name("Bill Gates")
                .build();
    }
}
