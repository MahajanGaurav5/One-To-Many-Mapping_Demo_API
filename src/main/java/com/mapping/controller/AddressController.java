package com.mapping.controller;

import com.mapping.entities.Address;
import com.mapping.entities.Student;
import com.mapping.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController
{
    @Autowired
    private AddressService adsService;

    //this is post mapping for save address in address controller
    @PostMapping("/saveads/{stdId}")
    public  Address saveAddress(@RequestBody Address address ,@PathVariable Integer stdId )
    {
        Address ads= adsService.saveAddress(address,    stdId);
        return ads;

    }

    //this is getting one address by id
    @GetMapping("/getads/{address_id}")
    public Address getAddressData(@PathVariable Integer address_id)
    {
        Address ads=adsService.getAddress(address_id);

        return ads;

    }
// this is for getmapping for get all address
    @GetMapping("/getallads")
    public List<Address> getAddressesData()
    {
        List<Address> ads1= adsService.getAllAddresses();

        return ads1;
    }

    //this is updating address by id
    @PutMapping("/updateads/{address_id}")
    public Address updateAddress(@RequestBody Address address, @PathVariable Integer address_id)
    {

        return adsService.updateAddress(address, address_id);
    }

    //this is for deleting one address by id
    @DeleteMapping("/deleteads/{address_id}")
    public String deleteAddressData(@PathVariable Integer address_id)
    {
        adsService.deleteAddress(address_id);
       return "One Address Data Deleted Successfully..";

    }



}
