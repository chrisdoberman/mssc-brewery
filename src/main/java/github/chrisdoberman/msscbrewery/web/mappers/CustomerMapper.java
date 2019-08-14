package github.chrisdoberman.msscbrewery.web.mappers;

import github.chrisdoberman.msscbrewery.domain.Customer;
import github.chrisdoberman.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
