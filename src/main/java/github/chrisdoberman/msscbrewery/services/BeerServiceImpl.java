package github.chrisdoberman.msscbrewery.services;

import github.chrisdoberman.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Trite")
                .beerStyle("IPA")
                .build();
    }
}
