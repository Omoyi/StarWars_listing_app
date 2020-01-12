package com.example.star_wars;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class StarWar implements Serializable
{

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<StarConstructor> data = null;
    private final static long serialVersionUID = 7307753418891247755L;

    /**
     * No args constructor for use in serialization
     *
     */
    public StarWar() {
    }

    /**
     *
     * @param data
     * @param message
     * @param status
     */
    public StarWar(Integer status, String message, List<StarConstructor> data) {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<StarConstructor> getData() {
        return data;
    }

    public void setData(List<StarConstructor> data) {
        this.data = data;
    }



}

