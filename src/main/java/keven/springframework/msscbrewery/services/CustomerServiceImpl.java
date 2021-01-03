package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerbyID(UUID customerID) {
        return CustomerDto.builder().uuid(UUID.randomUUID())
                .name("Bill Gates")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID uuid, CustomerDto customerDto) {
        log.debug("updating a customer...");
    }

    @Override
    public void deleteCustomerById(UUID uuid) {
        log.debug("deleting a customer...");
    }
}
