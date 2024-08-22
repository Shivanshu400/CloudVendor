package com.first.rest_shivanshu.Service.Implementaion;

import com.first.rest_shivanshu.Repository.CloudVendorRepository;
import com.first.rest_shivanshu.Service.CloudVendorService;
import com.first.rest_shivanshu.model.Cloudvendor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImplement implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImplement(CloudVendorRepository cloudVendorRepository)
    {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String CreateCloudVendor(Cloudvendor cloudvendor)
    {
        cloudVendorRepository.save(cloudvendor);
        return "Successfull Data is Created";
    }

    @Override
    public String UpdateCloudVendor(Cloudvendor cloudvendor)
    {
        cloudVendorRepository.save(cloudvendor);
        return "Successfull Data is Updated";
    }

    @Override
    public String DeleteCloudVendor(String vendorId)
    {
        cloudVendorRepository.deleteById(vendorId);
        return "Deletion success";
    }

    @Override
    public Cloudvendor GetCloudVendor(String vendorId)
    {
       return cloudVendorRepository.findById(vendorId).get();

    }

    @Override
    public List<Cloudvendor> GetAllCloudVendor()
    {
        return cloudVendorRepository.findAll();
    }
}
