package com.mapping.services;

import com.mapping.entities.Address;

import java.util.List;

public interface AddressService
{


   public Address saveAddress(Address address, Integer stdId);

    public Address getAddress(Integer addressId);

    public List<Address> getAllAddresses();

   public  Address updateAddress(Address address, Integer addressId);

    public void deleteAddress(Integer addressId);
}
