package com.mapping.services;

import com.mapping.entities.Address;
import com.mapping.entities.Student;
import com.mapping.repositories.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService
{

    @Autowired
    private AddressRepo adsRepo;


    @Override
    public Address saveAddress(Address address, Integer stdId)
    {
        Address ads=new Address();
        ads=adsRepo.save(address);

        return ads;
    }

    @Override
    public Address getAddress(Integer addressId)
    {
        Address ads1=adsRepo.findById(addressId).get();
        return ads1;
    }

    @Override
    public List<Address> getAllAddresses()
    {
        List<Address> ads2=new ArrayList<Address>();
        ads2=adsRepo.findAll();
        return ads2;
    }

    @Override
    public Address updateAddress(Address address, Integer addressId)
    {
        Optional<Address> optional=adsRepo.findById(addressId);

        Address ads3=optional.get();

        //Student s2=studentRepo.findById(stdId).get();

        ads3.setAddress_id(addressId);
        ads3.setStreet_code(address.getStreet_code());
        ads3.setCity(address.getCity());
        ads3.setCountry(address.getCountry());

        return adsRepo.save(ads3);
    }

    @Override
    public void deleteAddress(Integer addressId)
    {
        Optional d1=adsRepo.findById(addressId);
        if (d1.isPresent())
            adsRepo.deleteById(addressId);
        else
            adsRepo.deleteById(addressId);


    }
}
