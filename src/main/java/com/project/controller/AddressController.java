package com.project.controller;

import com.project.model.Address;
import com.project.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService aService;

    @PostMapping("/")
    public ResponseEntity<Address> saveAddressHandler(@Valid @RequestBody Address add) {
        Address savedAddress = aService.addAddress(add);
        return new ResponseEntity<Address>(savedAddress, HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Address> updateAddressHandler(@Valid @RequestBody Address add) {
        Address updatedAddress = aService.updateAddress(add);
        return new ResponseEntity<Address>(updatedAddress, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Address> deleteAddressHandler(@PathVariable("id") Integer addressId) {
        Address deletedAddress = aService.removeAddress(addressId);
        return new ResponseEntity<Address>(deletedAddress, HttpStatus.OK);
    }

    @GetMapping("/getaddress/{id}")
    public ResponseEntity<Address> getAddressHandler(@PathVariable("id") Integer addressId) {
        Address address = aService.viewAddress(addressId);
        return new ResponseEntity<Address>(address, HttpStatus.OK);
    }

    @GetMapping("/getall")
    public List<Address> getAllAddressHandler() {
        return aService.viewAllAddress();
    }

}

