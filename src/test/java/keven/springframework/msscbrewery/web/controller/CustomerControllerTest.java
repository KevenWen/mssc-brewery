package keven.springframework.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import keven.springframework.msscbrewery.services.BeerService;
import keven.springframework.msscbrewery.web.model.BeerDto;
import keven.springframework.msscbrewery.web.model.CustomerDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author MikeWen
 * @date 2/14/2021 6:33 PM
 **/
class CustomerControllerTest {

    @MockBean
    BeerService beerService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    CustomerDto validCustomer;

    @Before
    public void setUp(){
        validCustomer = CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .name("customer1")
                .build();
    }

    @Test
    void getCustomer() {
    }

    @Test
    void handlePost() {
        // CustomerDto customerDto = validCustomer.;

    }

    @Test
    void handleUpdate() {
    }

    @Test
    void handleDelete() {
    }
}