package github.chrisdoberman.msscbrewery.services;

import github.chrisdoberman.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
