package com.mirea.lab8.supInfo;

import com.google.gson.annotations.SerializedName;
import com.mirea.lab8.supInfo.Address;

import java.util.List;

public class GeocodingResponse {
    @SerializedName("results")
    public List<Address> addressList;
}
