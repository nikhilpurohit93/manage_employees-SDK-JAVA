/*
 * Manage Employees APIs
 * This API supports all services required to manage Employees on HR system
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Employee
 */

public class Employee {
  @SerializedName("birthdate")
  private String birthdate = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("created")
  private BigDecimal created = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("email_verified")
  private String emailVerified = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("formatted")
  private String formatted = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("house_name")
  private String houseName = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("locality")
  private String locality = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("mobileNumber")
  private String mobileNumber = null;

  @SerializedName("modified")
  private BigDecimal modified = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("picture")
  private String picture = null;

  @SerializedName("postal_code")
  private BigDecimal postalCode = null;

  @SerializedName("preferred_username")
  private String preferredUsername = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("street_address")
  private String streetAddress = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("zoneinfo")
  private String zoneinfo = null;

  public Employee birthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }

   /**
   * Get birthdate
   * @return birthdate
  **/
  @ApiModelProperty(example = "1980-02-19T18:30:00.000Z", value = "")
  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public Employee country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "UK", value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Employee created(BigDecimal created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "1.458819236312E12", value = "")
  public BigDecimal getCreated() {
    return created;
  }

  public void setCreated(BigDecimal created) {
    this.created = created;
  }

  public Employee customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(example = "62936395", value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "example@example.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee emailVerified(String emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @ApiModelProperty(example = "false", value = "")
  public String getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(String emailVerified) {
    this.emailVerified = emailVerified;
  }

  public Employee familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(example = "Henne", value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Employee formatted(String formatted) {
    this.formatted = formatted;
    return this;
  }

   /**
   * Get formatted
   * @return formatted
  **/
  @ApiModelProperty(example = "87 London Road, Oxford", value = "")
  public String getFormatted() {
    return formatted;
  }

  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }

  public Employee fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "Graham Green", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Employee fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "Janie D Henne", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Employee gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "female", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Employee givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(example = "Janie", value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Employee houseName(String houseName) {
    this.houseName = houseName;
    return this;
  }

   /**
   * Get houseName
   * @return houseName
  **/
  @ApiModelProperty(example = "87", value = "")
  public String getHouseName() {
    return houseName;
  }

  public void setHouseName(String houseName) {
    this.houseName = houseName;
  }

  public Employee locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en_UK", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Employee locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @ApiModelProperty(example = "Oxford", value = "")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public Employee middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(example = "D", value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Employee mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(example = "442683476728", value = "")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public Employee modified(BigDecimal modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "1.467183216386E12", value = "")
  public BigDecimal getModified() {
    return modified;
  }

  public void setModified(BigDecimal modified) {
    this.modified = modified;
  }

  public Employee nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @ApiModelProperty(example = "jh", value = "")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Employee password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "Test12345", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Employee picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @ApiModelProperty(example = "http://www.example.com", value = "")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Employee postalCode(BigDecimal postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @ApiModelProperty(example = "32989.0", value = "")
  public BigDecimal getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(BigDecimal postalCode) {
    this.postalCode = postalCode;
  }

  public Employee preferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
    return this;
  }

   /**
   * Get preferredUsername
   * @return preferredUsername
  **/
  @ApiModelProperty(example = "jh", value = "")
  public String getPreferredUsername() {
    return preferredUsername;
  }

  public void setPreferredUsername(String preferredUsername) {
    this.preferredUsername = preferredUsername;
  }

  public Employee profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(example = "http://www.example.com", value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Employee region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(example = "London", value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Employee street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @ApiModelProperty(example = "London Road", value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Employee streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Get streetAddress
   * @return streetAddress
  **/
  @ApiModelProperty(example = "87 London Road", value = "")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public Employee username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Employee website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "http://www.example.com", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Employee zoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
    return this;
  }

   /**
   * Get zoneinfo
   * @return zoneinfo
  **/
  @ApiModelProperty(example = "Europe/London", value = "")
  public String getZoneinfo() {
    return zoneinfo;
  }

  public void setZoneinfo(String zoneinfo) {
    this.zoneinfo = zoneinfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.birthdate, employee.birthdate) &&
        Objects.equals(this.country, employee.country) &&
        Objects.equals(this.created, employee.created) &&
        Objects.equals(this.customerId, employee.customerId) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.emailVerified, employee.emailVerified) &&
        Objects.equals(this.familyName, employee.familyName) &&
        Objects.equals(this.formatted, employee.formatted) &&
        Objects.equals(this.fullName, employee.fullName) &&
        Objects.equals(this.fullName, employee.fullName) &&
        Objects.equals(this.gender, employee.gender) &&
        Objects.equals(this.givenName, employee.givenName) &&
        Objects.equals(this.houseName, employee.houseName) &&
        Objects.equals(this.locale, employee.locale) &&
        Objects.equals(this.locality, employee.locality) &&
        Objects.equals(this.middleName, employee.middleName) &&
        Objects.equals(this.mobileNumber, employee.mobileNumber) &&
        Objects.equals(this.modified, employee.modified) &&
        Objects.equals(this.nickname, employee.nickname) &&
        Objects.equals(this.password, employee.password) &&
        Objects.equals(this.picture, employee.picture) &&
        Objects.equals(this.postalCode, employee.postalCode) &&
        Objects.equals(this.preferredUsername, employee.preferredUsername) &&
        Objects.equals(this.profile, employee.profile) &&
        Objects.equals(this.region, employee.region) &&
        Objects.equals(this.street, employee.street) &&
        Objects.equals(this.streetAddress, employee.streetAddress) &&
        Objects.equals(this.username, employee.username) &&
        Objects.equals(this.website, employee.website) &&
        Objects.equals(this.zoneinfo, employee.zoneinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthdate, country, created, customerId, email, emailVerified, familyName, formatted, fullName, fullName, gender, givenName, houseName, locale, locality, middleName, mobileNumber, modified, nickname, password, picture, postalCode, preferredUsername, profile, region, street, streetAddress, username, website, zoneinfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    houseName: ").append(toIndentedString(houseName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    preferredUsername: ").append(toIndentedString(preferredUsername)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    zoneinfo: ").append(toIndentedString(zoneinfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

