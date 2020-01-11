package com.example.star_wars;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StarWars {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("height")
    @Expose
    private int height;

    @SerializedName("mass")
    @Expose
    private int mass;

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("homeworld")
    @Expose
    private String homeworld;
    @SerializedName("wiki")
    @Expose
    private String wiki;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("born")
    @Expose
    private int born;
    @SerializedName("bornLocation")
    @Expose
    private String bornLocation;
    @SerializedName("died")
    @Expose
    private int died;
    @SerializedName("diedLocation")
    @Expose
    private String diedLocation;
    @SerializedName("species")
    @Expose
    private String species;
    @SerializedName("hairColor")
    @Expose
    private String hairColor;
    @SerializedName("eyeColor")
    @Expose
    private String eyeColor;
    @SerializedName("skinColor")
    @Expose
    private String skinColor;
    @SerializedName("cybernetics")
    @Expose
    private String cybernetics;
    @SerializedName("affiliations")
    @Expose
    private List<String> affiliations = null;
    @SerializedName("masters")
    @Expose
    private List<String> masters = null;
    @SerializedName("apprentices")
    @Expose
    private List<String> apprentices = null;
    @SerializedName("formerAffiliations")
    @Expose
    private List<Object> formerAffiliations = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StarWars() {

    }

    /**
     * 
     * @param image
     * @param homeworld
     * @param gender
     * @param cybernetics
     * @param skinColor
     * @param mass
     * @param wiki
     * @param born
     * @param diedLocation
     * @param affiliations
     * @param masters
     * @param died
     * @param formerAffiliations
     * @param bornLocation
     * @param eyeColor
     * @param species
     * @param name
     * @param id
     * @param hairColor
     * @param apprentices
     * @param height
     */
    public StarWars(int id, String name, int height, int mass, String gender, String homeworld, String wiki, String image, int born, String bornLocation, int died, String diedLocation, String species, String hairColor, String eyeColor, String skinColor, String cybernetics, List<String> affiliations, List<String> masters, List<String> apprentices, List<Object> formerAffiliations) {
        super();
        this.id = id;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.gender = gender;
        this.homeworld = homeworld;
        this.wiki = wiki;
        this.image = image;
        this.born = born;
        this.bornLocation = bornLocation;
        this.died = died;
        this.diedLocation = diedLocation;
        this.species = species;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.cybernetics = cybernetics;
        this.affiliations = affiliations;
        this.masters = masters;
        this.apprentices = apprentices;
        this.formerAffiliations = formerAffiliations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getBornLocation() {
        return bornLocation;
    }

    public void setBornLocation(String bornLocation) {
        this.bornLocation = bornLocation;
    }

    public int getDied() {
        return died;
    }

    public void setDied(int died) {
        this.died = died;
    }

    public String getDiedLocation() {
        return diedLocation;
    }

    public void setDiedLocation(String diedLocation) {
        this.diedLocation = diedLocation;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getCybernetics() {
        return cybernetics;
    }

    public void setCybernetics(String cybernetics) {
        this.cybernetics = cybernetics;
    }

    public List<String> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<String> affiliations) {
        this.affiliations = affiliations;
    }

    public List<String> getMasters() {
        return masters;
    }

    public void setMasters(List<String> masters) {
        this.masters = masters;
    }

    public List<String> getApprentices() {
        return apprentices;
    }

    public void setApprentices(List<String> apprentices) {
        this.apprentices = apprentices;
    }

    public List<Object> getFormerAffiliations() {
        return formerAffiliations;
    }

    public void setFormerAffiliations(List<Object> formerAffiliations) {
        this.formerAffiliations = formerAffiliations;
    }

}
