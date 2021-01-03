package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerbyID(UUID customerID);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID uuid, CustomerDto customerDto);

    void deleteCustomerById(UUID uuid);
}
