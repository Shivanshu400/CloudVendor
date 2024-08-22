package com.first.rest_shivanshu.Controller;

import com.first.rest_shivanshu.Service.CloudVendorService;
import com.first.rest_shivanshu.model.Cloudvendor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService)
    {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public Cloudvendor get_details(@PathVariable("vendorId") String vendorId)
    {

      return cloudVendorService.GetCloudVendor(vendorId);

//                new Cloudvendor("c1","shivanshu","baddhopur","7007188774");
    }

    @GetMapping()
    public List<Cloudvendor> get_all_details()
    {
        return cloudVendorService.GetAllCloudVendor();
    }

    //post mapping is used to set the value
    @PostMapping
    public String Create_cloud_vendor_details(@RequestBody Cloudvendor cloudvendor)
    {
        cloudVendorService.CreateCloudVendor(cloudvendor);
        return "Creation is Success";
    }

    // putmapping is used to update the existing method values

    @PutMapping
    public String Update_values(@RequestBody Cloudvendor cloudvendor)
    {
        cloudVendorService.UpdateCloudVendor(cloudvendor);
        return "Updation is done ";
    }

    // delete the

    @DeleteMapping("{vendorId}")
    public String Delete(@PathVariable String vendorId)
    {
      cloudVendorService.DeleteCloudVendor(vendorId);
      return "Deletion is done";
    }

}
