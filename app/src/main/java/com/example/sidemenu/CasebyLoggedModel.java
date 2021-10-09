package com.example.sidemenu;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CasebyLoggedModel {

@SerializedName("pageOfItems")
    @Expose
private ArrayList<PageOfItem> pageOfItems;

    public ArrayList<PageOfItem> getPageOfItems() {
        return pageOfItems;
    }

    @Override
    public String toString() {
        return "CasebyLoggedModel{" +
                "pageOfItems=" + pageOfItems +
                '}';
    }
}
