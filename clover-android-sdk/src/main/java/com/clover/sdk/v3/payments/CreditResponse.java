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
 * <li>{@link #getRequestSuccessful requestSuccessful}</li>
 * <li>{@link #getResponseErrorMessage responseErrorMessage}</li>
 * <li>{@link #getCredit credit}</li>
 * <li>{@link #getClientData clientData}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CreditResponse extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.Boolean getRequestSuccessful() {
    return genClient.cacheGet(CacheKey.requestSuccessful);
  }

  public java.lang.String getResponseErrorMessage() {
    return genClient.cacheGet(CacheKey.responseErrorMessage);
  }

  public com.clover.sdk.v3.payments.Credit getCredit() {
    return genClient.cacheGet(CacheKey.credit);
  }

  /**
   * Additional data sent back from the gateway
   */
  public java.util.Map<java.lang.String,java.lang.String> getClientData() {
    return genClient.cacheGet(CacheKey.clientData);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    requestSuccessful
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    responseErrorMessage
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    credit
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.payments.Credit.JSON_CREATOR)),
    clientData
        (com.clover.sdk.extractors.MapExtractionStrategy.instance()),
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

  private final GenericClient<CreditResponse> genClient;

  /**
   * Constructs a new empty instance.
   */
  public CreditResponse() {
    genClient = new GenericClient<CreditResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected CreditResponse(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CreditResponse(String json) throws IllegalArgumentException {
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
  public CreditResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CreditResponse(CreditResponse src) {
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
  }

  /** Checks whether the 'requestSuccessful' field is set and is not null */
  public boolean isNotNullRequestSuccessful() {
    return genClient.cacheValueIsNotNull(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'responseErrorMessage' field is set and is not null */
  public boolean isNotNullResponseErrorMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.responseErrorMessage);
  }

  /** Checks whether the 'credit' field is set and is not null */
  public boolean isNotNullCredit() {
    return genClient.cacheValueIsNotNull(CacheKey.credit);
  }

  /** Checks whether the 'clientData' field is set and is not null */
  public boolean isNotNullClientData() {
    return genClient.cacheValueIsNotNull(CacheKey.clientData);
  }

  /** Checks whether the 'clientData' field is set and is not null and is not empty */
  public boolean isNotEmptyClientData() { return isNotNullClientData() && !getClientData().isEmpty(); }



  /** Checks whether the 'requestSuccessful' field has been set, however the value could be null */
  public boolean hasRequestSuccessful() {
    return genClient.cacheHasKey(CacheKey.requestSuccessful);
  }

  /** Checks whether the 'responseErrorMessage' field has been set, however the value could be null */
  public boolean hasResponseErrorMessage() {
    return genClient.cacheHasKey(CacheKey.responseErrorMessage);
  }

  /** Checks whether the 'credit' field has been set, however the value could be null */
  public boolean hasCredit() {
    return genClient.cacheHasKey(CacheKey.credit);
  }

  /** Checks whether the 'clientData' field has been set, however the value could be null */
  public boolean hasClientData() {
    return genClient.cacheHasKey(CacheKey.clientData);
  }


  /**
   * Sets the field 'requestSuccessful'.
   */
  public CreditResponse setRequestSuccessful(java.lang.Boolean requestSuccessful) {
    return genClient.setOther(requestSuccessful, CacheKey.requestSuccessful);
  }

  /**
   * Sets the field 'responseErrorMessage'.
   */
  public CreditResponse setResponseErrorMessage(java.lang.String responseErrorMessage) {
    return genClient.setOther(responseErrorMessage, CacheKey.responseErrorMessage);
  }

  /**
   * Sets the field 'credit'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CreditResponse setCredit(com.clover.sdk.v3.payments.Credit credit) {
    return genClient.setRecord(credit, CacheKey.credit);
  }

  /**
   * Sets the field 'clientData'.
   */
  public CreditResponse setClientData(java.util.Map<java.lang.String,java.lang.String> clientData) {
    return genClient.setOther(clientData, CacheKey.clientData);
  }


  /** Clears the 'requestSuccessful' field, the 'has' method for this field will now return false */
  public void clearRequestSuccessful() {
    genClient.clear(CacheKey.requestSuccessful);
  }
  /** Clears the 'responseErrorMessage' field, the 'has' method for this field will now return false */
  public void clearResponseErrorMessage() {
    genClient.clear(CacheKey.responseErrorMessage);
  }
  /** Clears the 'credit' field, the 'has' method for this field will now return false */
  public void clearCredit() {
    genClient.clear(CacheKey.credit);
  }
  /** Clears the 'clientData' field, the 'has' method for this field will now return false */
  public void clearClientData() {
    genClient.clear(CacheKey.clientData);
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
  public CreditResponse copyChanges() {
    CreditResponse copy = new CreditResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CreditResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CreditResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CreditResponse> CREATOR = new android.os.Parcelable.Creator<CreditResponse>() {
    @Override
    public CreditResponse createFromParcel(android.os.Parcel in) {
      CreditResponse instance = new CreditResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CreditResponse[] newArray(int size) {
      return new CreditResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CreditResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CreditResponse>() {
    @Override
    public CreditResponse create(org.json.JSONObject jsonObject) {
      return new CreditResponse(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean REQUESTSUCCESSFUL_IS_REQUIRED = false;
    public static final boolean RESPONSEERRORMESSAGE_IS_REQUIRED = false;
    public static final boolean CREDIT_IS_REQUIRED = false;
    public static final boolean CLIENTDATA_IS_REQUIRED = false;

  }

}
