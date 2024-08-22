package com.first.rest_shivanshu.Service;

import com.first.rest_shivanshu.model.Cloudvendor;

import java.util.List;

public interface CloudVendorService
{
public String CreateCloudVendor(Cloudvendor cloudvendor);
public String UpdateCloudVendor(Cloudvendor cloudvendor);
public String DeleteCloudVendor(String vendorId);
public Cloudvendor GetCloudVendor(String vendorId);
public List<Cloudvendor> GetAllCloudVendor();


}
