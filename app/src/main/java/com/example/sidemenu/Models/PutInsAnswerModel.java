package com.example.sidemenu.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PutInsAnswerModel {
    @SerializedName("answerintext")
    @Expose
    private String answerintext;
    @SerializedName("answerid")
    @Expose
    private Integer answerid;

    public PutInsAnswerModel(String answerintext, Integer answerid) {
        this.answerintext = answerintext;
        this.answerid = answerid;
    }

    public String getAnswerintext() {
        return answerintext;
    }

    public void setAnswerintext(String answerintext) {
        this.answerintext = answerintext;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }
}
