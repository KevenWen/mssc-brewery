package keven.springframework.msscbrewery.services.V2;

import keven.springframework.msscbrewery.web.model.V2.BeerDtoV2;
import keven.springframework.msscbrewery.web.model.V2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerService2Impl implements BeerService2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerID) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerID, BeerDtoV2 beerDto) {
        //todo impl - would add a real impl to update beer.
        log.debug("updating a beer...");
    }

    @Override
    public void deleteBeerById(UUID bearId) {

        log.debug("Deleting a beer...");
    }
}
