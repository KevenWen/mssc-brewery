package keven.springframework.msscbrewery.web.controller.v2;

import keven.springframework.msscbrewery.services.V2.BeerService2;
import keven.springframework.msscbrewery.web.model.V2.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerService2 beerServicev2;
//
//    public BeerControllerV2(BeerService2 beerServicev2) {
//        this.beerServicev2 = beerServicev2;
//    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable("beerId") UUID beerID) {

        return new ResponseEntity<>(beerServicev2.getBeerById(beerID), HttpStatus.OK);
    }

    @PostMapping // POST - create new beer
    public ResponseEntity handlePost(@Valid @NotNull @RequestBody BeerDtoV2 beerDtov2){

        log.debug("in handle post......");
        val savedDto = beerServicev2.saveNewBeer(beerDtov2);
        var headers = new HttpHeaders();
        //todo  add hostname to url: http://localhost:8080
        headers.add("Location","/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerID, @Valid @RequestBody BeerDtoV2 beerDtov2){

        beerServicev2.updateBeer(beerID, beerDtov2);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID bearId){

        beerServicev2.deleteBeerById(bearId);
    }

}
