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
 * <li>{@link #getBusinessName businessName}</li>
 * <li>{@link #getNote note}</li>
 * <li>{@link #getDobYear dobYear}</li>
 * <li>{@link #getDobMonth dobMonth}</li>
 * <li>{@link #getDobDay dobDay}</li>
 * <li>{@link #getModifiedTime modifiedTime}</li>
 * <li>{@link #getCustomer customer}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CustomerMetadata extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The name of the business the customer is associated with.
   */
  public java.lang.String getBusinessName() {
    return genClient.cacheGet(CacheKey.businessName);
  }

  /**
   * A note about the customer.
   */
  public java.lang.String getNote() {
    return genClient.cacheGet(CacheKey.note);
  }

  /**
   * The year part of the date of birth for this customer. This part of the date of birth is optional, i.e., it's possible that only dobMonth and dobDay are populated.
   */
  public java.lang.Integer getDobYear() {
    return genClient.cacheGet(CacheKey.dobYear);
  }

  /**
   * The month part of the date of birth for this customer.
   */
  public java.lang.Integer getDobMonth() {
    return genClient.cacheGet(CacheKey.dobMonth);
  }

  /**
   * The day part of the date of birth for this customer.
   */
  public java.lang.Integer getDobDay() {
    return genClient.cacheGet(CacheKey.dobDay);
  }

  /**
   * The timestamp from when this customer's data was last updated.
   */
  public java.lang.Long getModifiedTime() {
    return genClient.cacheGet(CacheKey.modifiedTime);
  }

  /**
   * Customer who this metadata belongs to.
   */
  public com.clover.sdk.v3.base.Reference getCustomer() {
    return genClient.cacheGet(CacheKey.customer);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    businessName
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    note
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    dobYear
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
    dobMonth
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
    dobDay
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
    modifiedTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
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

  private final GenericClient<CustomerMetadata> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CustomerMetadata() {
    genClient = new GenericClient<CustomerMetadata>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CustomerMetadata(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CustomerMetadata(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CustomerMetadata(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CustomerMetadata(CustomerMetadata src) {
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
    genClient.validateLength(getBusinessName(), 127);

    genClient.validateLength(getNote(), 2000);
  }

  /** Checks whether the 'businessName' field is set and is not null */
  public boolean isNotNullBusinessName() {
    return genClient.cacheValueIsNotNull(CacheKey.businessName);
  }

  /** Checks whether the 'note' field is set and is not null */
  public boolean isNotNullNote() {
    return genClient.cacheValueIsNotNull(CacheKey.note);
  }

  /** Checks whether the 'dobYear' field is set and is not null */
  public boolean isNotNullDobYear() {
    return genClient.cacheValueIsNotNull(CacheKey.dobYear);
  }

  /** Checks whether the 'dobMonth' field is set and is not null */
  public boolean isNotNullDobMonth() {
    return genClient.cacheValueIsNotNull(CacheKey.dobMonth);
  }

  /** Checks whether the 'dobDay' field is set and is not null */
  public boolean isNotNullDobDay() {
    return genClient.cacheValueIsNotNull(CacheKey.dobDay);
  }

  /** Checks whether the 'modifiedTime' field is set and is not null */
  public boolean isNotNullModifiedTime() {
    return genClient.cacheValueIsNotNull(CacheKey.modifiedTime);
  }

  /** Checks whether the 'customer' field is set and is not null */
  public boolean isNotNullCustomer() {
    return genClient.cacheValueIsNotNull(CacheKey.customer);
  }



  /** Checks whether the 'businessName' field has been set, however the value could be null */
  public boolean hasBusinessName() {
    return genClient.cacheHasKey(CacheKey.businessName);
  }

  /** Checks whether the 'note' field has been set, however the value could be null */
  public boolean hasNote() {
    return genClient.cacheHasKey(CacheKey.note);
  }

  /** Checks whether the 'dobYear' field has been set, however the value could be null */
  public boolean hasDobYear() {
    return genClient.cacheHasKey(CacheKey.dobYear);
  }

  /** Checks whether the 'dobMonth' field has been set, however the value could be null */
  public boolean hasDobMonth() {
    return genClient.cacheHasKey(CacheKey.dobMonth);
  }

  /** Checks whether the 'dobDay' field has been set, however the value could be null */
  public boolean hasDobDay() {
    return genClient.cacheHasKey(CacheKey.dobDay);
  }

  /** Checks whether the 'modifiedTime' field has been set, however the value could be null */
  public boolean hasModifiedTime() {
    return genClient.cacheHasKey(CacheKey.modifiedTime);
  }

  /** Checks whether the 'customer' field has been set, however the value could be null */
  public boolean hasCustomer() {
    return genClient.cacheHasKey(CacheKey.customer);
  }


  /**
   * Sets the field 'businessName'.
   */
  public CustomerMetadata setBusinessName(java.lang.String businessName) {
    return genClient.setOther(businessName, CacheKey.businessName);
  }

  /**
   * Sets the field 'note'.
   */
  public CustomerMetadata setNote(java.lang.String note) {
    return genClient.setOther(note, CacheKey.note);
  }

  /**
   * Sets the field 'dobYear'.
   */
  public CustomerMetadata setDobYear(java.lang.Integer dobYear) {
    return genClient.setOther(dobYear, CacheKey.dobYear);
  }

  /**
   * Sets the field 'dobMonth'.
   */
  public CustomerMetadata setDobMonth(java.lang.Integer dobMonth) {
    return genClient.setOther(dobMonth, CacheKey.dobMonth);
  }

  /**
   * Sets the field 'dobDay'.
   */
  public CustomerMetadata setDobDay(java.lang.Integer dobDay) {
    return genClient.setOther(dobDay, CacheKey.dobDay);
  }

  /**
   * Sets the field 'modifiedTime'.
   */
  public CustomerMetadata setModifiedTime(java.lang.Long modifiedTime) {
    return genClient.setOther(modifiedTime, CacheKey.modifiedTime);
  }

  /**
   * Sets the field 'customer'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CustomerMetadata setCustomer(com.clover.sdk.v3.base.Reference customer) {
    return genClient.setRecord(customer, CacheKey.customer);
  }


  /** Clears the 'businessName' field, the 'has' method for this field will now return false */
  public void clearBusinessName() {
    genClient.clear(CacheKey.businessName);
  }
  /** Clears the 'note' field, the 'has' method for this field will now return false */
  public void clearNote() {
    genClient.clear(CacheKey.note);
  }
  /** Clears the 'dobYear' field, the 'has' method for this field will now return false */
  public void clearDobYear() {
    genClient.clear(CacheKey.dobYear);
  }
  /** Clears the 'dobMonth' field, the 'has' method for this field will now return false */
  public void clearDobMonth() {
    genClient.clear(CacheKey.dobMonth);
  }
  /** Clears the 'dobDay' field, the 'has' method for this field will now return false */
  public void clearDobDay() {
    genClient.clear(CacheKey.dobDay);
  }
  /** Clears the 'modifiedTime' field, the 'has' method for this field will now return false */
  public void clearModifiedTime() {
    genClient.clear(CacheKey.modifiedTime);
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
  public CustomerMetadata copyChanges() {
    CustomerMetadata copy = new CustomerMetadata();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CustomerMetadata src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CustomerMetadata(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CustomerMetadata> CREATOR = new android.os.Parcelable.Creator<CustomerMetadata>() {
    @Override
    public CustomerMetadata createFromParcel(android.os.Parcel in) {
      CustomerMetadata instance = new CustomerMetadata(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CustomerMetadata[] newArray(int size) {
      return new CustomerMetadata[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CustomerMetadata> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CustomerMetadata>() {
    @Override
    public CustomerMetadata create(org.json.JSONObject jsonObject) {
      return new CustomerMetadata(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean BUSINESSNAME_IS_REQUIRED = false;
    public static final long BUSINESSNAME_MAX_LEN = 127;
    public static final boolean NOTE_IS_REQUIRED = false;
    public static final long NOTE_MAX_LEN = 2000;
    public static final boolean DOBYEAR_IS_REQUIRED = false;
    public static final boolean DOBMONTH_IS_REQUIRED = false;
    public static final boolean DOBDAY_IS_REQUIRED = false;
    public static final boolean MODIFIEDTIME_IS_REQUIRED = false;
    public static final boolean CUSTOMER_IS_REQUIRED = false;

  }

}
