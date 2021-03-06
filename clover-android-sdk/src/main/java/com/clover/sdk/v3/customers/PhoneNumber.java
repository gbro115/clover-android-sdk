/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

/*
 * Copyright (C) 2019 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.customers;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getPhoneNumber phoneNumber}</li>
 * <li>{@link #getCustomer customer}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PhoneNumber extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.String getPhoneNumber() {
    return genClient.cacheGet(CacheKey.phoneNumber);
  }

  /**
   * Customer who this phone number belongs to.
   */
  public com.clover.sdk.v3.base.Reference getCustomer() {
    return genClient.cacheGet(CacheKey.customer);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    id
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    phoneNumber
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    customer
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Reference.JSON_CREATOR)),
      ;

    private final com.clover.sdk.extractors.ExtractionStrategy extractionStrategy;

    private CacheKey(com.clover.sdk.extractors.ExtractionStrategy s) {
      extractionStrategy = s;
    }

    @Override
    public com.clover.sdk.extractors.ExtractionStrategy getExtractionStrategy() {
      return extractionStrategy;
    }
  }

  private final GenericClient<PhoneNumber> genClient;

  /**
   * Constructs a new empty instance.
   */
  public PhoneNumber() {
    genClient = new GenericClient<PhoneNumber>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected PhoneNumber(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PhoneNumber(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PhoneNumber(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PhoneNumber(PhoneNumber src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {

    genClient.validateNotNull(CacheKey.phoneNumber, getPhoneNumber());
    genClient.validateReferences(CacheKey.customer);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'phoneNumber' field is set and is not null */
  public boolean isNotNullPhoneNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.phoneNumber);
  }

  /** Checks whether the 'customer' field is set and is not null */
  public boolean isNotNullCustomer() {
    return genClient.cacheValueIsNotNull(CacheKey.customer);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'phoneNumber' field has been set, however the value could be null */
  public boolean hasPhoneNumber() {
    return genClient.cacheHasKey(CacheKey.phoneNumber);
  }

  /** Checks whether the 'customer' field has been set, however the value could be null */
  public boolean hasCustomer() {
    return genClient.cacheHasKey(CacheKey.customer);
  }


  /**
   * Sets the field 'id'.
   */
  public PhoneNumber setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'phoneNumber'.
   */
  public PhoneNumber setPhoneNumber(java.lang.String phoneNumber) {
    return genClient.setOther(phoneNumber, CacheKey.phoneNumber);
  }

  /**
   * Sets the field 'customer'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public PhoneNumber setCustomer(com.clover.sdk.v3.base.Reference customer) {
    return genClient.setRecord(customer, CacheKey.customer);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'phoneNumber' field, the 'has' method for this field will now return false */
  public void clearPhoneNumber() {
    genClient.clear(CacheKey.phoneNumber);
  }
  /** Clears the 'customer' field, the 'has' method for this field will now return false */
  public void clearCustomer() {
    genClient.clear(CacheKey.customer);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public PhoneNumber copyChanges() {
    PhoneNumber copy = new PhoneNumber();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PhoneNumber src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PhoneNumber(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PhoneNumber> CREATOR = new android.os.Parcelable.Creator<PhoneNumber>() {
    @Override
    public PhoneNumber createFromParcel(android.os.Parcel in) {
      PhoneNumber instance = new PhoneNumber(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PhoneNumber[] newArray(int size) {
      return new PhoneNumber[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PhoneNumber> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PhoneNumber>() {
    public Class<PhoneNumber> getCreatedClass() {
      return PhoneNumber.class;
    }

    @Override
    public PhoneNumber create(org.json.JSONObject jsonObject) {
      return new PhoneNumber(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean ID_IS_REQUIRED = false;
    public static final boolean PHONENUMBER_IS_REQUIRED = true;
    public static final boolean CUSTOMER_IS_REQUIRED = false;
  }

}
