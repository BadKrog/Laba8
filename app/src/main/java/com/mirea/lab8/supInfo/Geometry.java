package com.mirea.lab8.supInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mirea.lab8.supInfo.Coordinate;

public class Geometry {
    @SerializedName("location")
    @Expose
    public Coordinate coordinate;
}
