package keven.springframework.msscbrewery.services;

import keven.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerID) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerID, BeerDto beerDto) {

        //todo impl - would add a real impl to update beer.
        log.debug("updating a beer...");
    }

    @Override
    public void deleteBeerById(UUID bearId) {

        log.debug("Deleting a beer...");
    }


}
