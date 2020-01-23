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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getQueryStatus queryStatus}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class QueryStatusEnum extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.remotepay.QueryStatus getQueryStatus() {
    return genClient.cacheGet(CacheKey.queryStatus);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    queryStatus
        (com.clover.sdk.extractors.EnumExtractionStrategy.instance(com.clover.sdk.v3.remotepay.QueryStatus.class)),
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

  private final GenericClient<QueryStatusEnum> genClient;

  /**
   * Constructs a new empty instance.
   */
  public QueryStatusEnum() {
    genClient = new GenericClient<QueryStatusEnum>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected QueryStatusEnum(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public QueryStatusEnum(String json) throws IllegalArgumentException {
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
  public QueryStatusEnum(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public QueryStatusEnum(QueryStatusEnum src) {
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

  /** Checks whether the 'queryStatus' field is set and is not null */
  public boolean isNotNullQueryStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.queryStatus);
  }



  /** Checks whether the 'queryStatus' field has been set, however the value could be null */
  public boolean hasQueryStatus() {
    return genClient.cacheHasKey(CacheKey.queryStatus);
  }


  /**
   * Sets the field 'queryStatus'.
   */
  public QueryStatusEnum setQueryStatus(com.clover.sdk.v3.remotepay.QueryStatus queryStatus) {
    return genClient.setOther(queryStatus, CacheKey.queryStatus);
  }


  /** Clears the 'queryStatus' field, the 'has' method for this field will now return false */
  public void clearQueryStatus() {
    genClient.clear(CacheKey.queryStatus);
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
  public QueryStatusEnum copyChanges() {
    QueryStatusEnum copy = new QueryStatusEnum();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(QueryStatusEnum src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new QueryStatusEnum(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<QueryStatusEnum> CREATOR = new android.os.Parcelable.Creator<QueryStatusEnum>() {
    @Override
    public QueryStatusEnum createFromParcel(android.os.Parcel in) {
      QueryStatusEnum instance = new QueryStatusEnum(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public QueryStatusEnum[] newArray(int size) {
      return new QueryStatusEnum[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<QueryStatusEnum> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<QueryStatusEnum>() {
    @Override
    public QueryStatusEnum create(org.json.JSONObject jsonObject) {
      return new QueryStatusEnum(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean QUERYSTATUS_IS_REQUIRED = false;

  }

}
