package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerbyID(UUID customerID);
}
