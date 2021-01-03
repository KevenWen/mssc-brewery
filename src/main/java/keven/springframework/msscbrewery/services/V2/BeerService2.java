package keven.springframework.msscbrewery.services.V2;

import keven.springframework.msscbrewery.web.model.V2.BeerDtoV2;

import java.util.UUID;

public interface BeerService2 {
    BeerDtoV2 getBeerById(UUID beerID);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerID, BeerDtoV2 beerDto);

    void deleteBeerById(UUID bearId);
}
