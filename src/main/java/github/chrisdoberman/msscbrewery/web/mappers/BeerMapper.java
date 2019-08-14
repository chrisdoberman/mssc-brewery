package github.chrisdoberman.msscbrewery.web.mappers;

import github.chrisdoberman.msscbrewery.domain.Beer;
import github.chrisdoberman.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
