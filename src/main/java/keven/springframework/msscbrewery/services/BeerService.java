package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerID);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerID, BeerDto beerDto);
}
