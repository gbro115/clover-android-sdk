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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getBillingAddress billingAddress}</li>
 * <li>{@link #getBillingZip billingZip}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PurchaseCardBillingInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * billing address for l2.
   */
  public String getBillingAddress() {
    return genClient.cacheGet(CacheKey.billingAddress);
  }

  /**
   * billing zip for l2.
   */
  public String getBillingZip() {
    return genClient.cacheGet(CacheKey.billingZip);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    billingAddress
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
    billingZip
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(String.class)),
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

  private final GenericClient<PurchaseCardBillingInfo> genClient;

  /**
   * Constructs a new empty instance.
   */
  public PurchaseCardBillingInfo() {
    genClient = new GenericClient<PurchaseCardBillingInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected PurchaseCardBillingInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PurchaseCardBillingInfo(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public PurchaseCardBillingInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PurchaseCardBillingInfo(PurchaseCardBillingInfo src) {
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
    genClient.validateLength(CacheKey.billingAddress, getBillingAddress(), 5);
  }

  /** Checks whether the 'billingAddress' field is set and is not null */
  public boolean isNotNullBillingAddress() {
    return genClient.cacheValueIsNotNull(CacheKey.billingAddress);
  }

  /** Checks whether the 'billingZip' field is set and is not null */
  public boolean isNotNullBillingZip() {
    return genClient.cacheValueIsNotNull(CacheKey.billingZip);
  }



  /** Checks whether the 'billingAddress' field has been set, however the value could be null */
  public boolean hasBillingAddress() {
    return genClient.cacheHasKey(CacheKey.billingAddress);
  }

  /** Checks whether the 'billingZip' field has been set, however the value could be null */
  public boolean hasBillingZip() {
    return genClient.cacheHasKey(CacheKey.billingZip);
  }


  /**
   * Sets the field 'billingAddress'.
   */
  public PurchaseCardBillingInfo setBillingAddress(String billingAddress) {
    return genClient.setOther(billingAddress, CacheKey.billingAddress);
  }

  /**
   * Sets the field 'billingZip'.
   */
  public PurchaseCardBillingInfo setBillingZip(String billingZip) {
    return genClient.setOther(billingZip, CacheKey.billingZip);
  }


  /** Clears the 'billingAddress' field, the 'has' method for this field will now return false */
  public void clearBillingAddress() {
    genClient.clear(CacheKey.billingAddress);
  }
  /** Clears the 'billingZip' field, the 'has' method for this field will now return false */
  public void clearBillingZip() {
    genClient.clear(CacheKey.billingZip);
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
  public PurchaseCardBillingInfo copyChanges() {
    PurchaseCardBillingInfo copy = new PurchaseCardBillingInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PurchaseCardBillingInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PurchaseCardBillingInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PurchaseCardBillingInfo> CREATOR = new android.os.Parcelable.Creator<PurchaseCardBillingInfo>() {
    @Override
    public PurchaseCardBillingInfo createFromParcel(android.os.Parcel in) {
      PurchaseCardBillingInfo instance = new PurchaseCardBillingInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PurchaseCardBillingInfo[] newArray(int size) {
      return new PurchaseCardBillingInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PurchaseCardBillingInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PurchaseCardBillingInfo>() {
    public Class<PurchaseCardBillingInfo> getCreatedClass() {
      return PurchaseCardBillingInfo.class;
    }

    @Override
    public PurchaseCardBillingInfo create(org.json.JSONObject jsonObject) {
      return new PurchaseCardBillingInfo(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean BILLINGADDRESS_IS_REQUIRED = false;
    public static final long BILLINGADDRESS_MAX_LEN = 5;
    public static final boolean BILLINGZIP_IS_REQUIRED = false;
  }

}
