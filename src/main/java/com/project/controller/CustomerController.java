package com.project.controller;


import com.project.model.Address;
import com.project.model.Customer;
import com.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService cService;
//	private AddressService aService;

    @PostMapping("/")
    public Customer saveCustomerHandler(@Valid @RequestBody Customer customer) {

        return cService.addCustomer(customer);
    }


    @PutMapping("/")
    public Customer updateCustomer(@Valid @RequestBody Customer customer) {

        return cService.updateCustomer(customer);
    }

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable Integer customerId) {

        return cService.viewCustomer(customerId);

    }


    @DeleteMapping("/")
    public Customer deleteCustomerDetails(@Valid @RequestBody Customer customer) {

        return cService.removeCustomer(customer);

    }

    @PutMapping("/addAddress/{customerId}")
    public Customer addAddressCustomer(@Valid @RequestBody Address address, @PathVariable Integer customerId) {
        return cService.addAddress(address, customerId);
    }


}
