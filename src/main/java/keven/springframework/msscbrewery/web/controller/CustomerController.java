package keven.springframework.msscbrewery.web.controller;

import keven.springframework.msscbrewery.services.CustomerService;
import keven.springframework.msscbrewery.web.model.BeerDto;
import keven.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Validated
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerID) {
        return new ResponseEntity<>(customerService.getCustomerbyID(customerID), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity handlePost(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto savedDto  = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/vi/customer/" + savedDto.getUuid().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("customerId") UUID uuid, @Valid @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(uuid, customerDto);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity handleDelete(@PathVariable("customerId") UUID uuid){
        customerService.deleteCustomerById(uuid);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}


