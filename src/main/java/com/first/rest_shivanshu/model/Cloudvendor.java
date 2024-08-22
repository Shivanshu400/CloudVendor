package com.first.rest_shivanshu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CloudVendor") lombok
public class Cloudvendor
{
    @Id
    private String vendorId;

    private String vendorName;
    private String vendorAddress;
    private String vendorno;

    public Cloudvendor()
    {

    }

    public Cloudvendor(String vendorId, String vendorName, String vendorAddress, String vendorno)
    {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorno = vendorno;
    }

    public String getVendorId()
    {
        return vendorId;
    }

    public void setVendorId(String vendorId)
    {
        this.vendorId = vendorId;
    }

    public String getVendorName()
    {
        return vendorName;
    }

    public void setVendorName(String vendorName)
    {
        this.vendorName = vendorName;
    }

    public String getVendorAddress()
    {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress)
    {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorno()
    {
        return vendorno;
    }

    public void setVendorno(String vendorno)
    {
        this.vendorno = vendorno;
    }


}
