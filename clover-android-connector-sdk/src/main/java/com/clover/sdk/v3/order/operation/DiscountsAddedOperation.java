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

package com.clover.sdk.v3.order.operation;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getIds ids}</li>
 * <li>{@link #getOrderId orderId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class DiscountsAddedOperation extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.util.List<java.lang.String> getIds() {
    return genClient.cacheGet(CacheKey.ids);
  }

  public java.lang.String getOrderId() {
    return genClient.cacheGet(CacheKey.orderId);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    ids
        (com.clover.sdk.extractors.BasicListExtractionStrategy.instance(java.lang.String.class)),
    orderId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
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

  private final GenericClient<DiscountsAddedOperation> genClient;

  /**
   * Constructs a new empty instance.
   */
  public DiscountsAddedOperation() {
    genClient = new GenericClient<DiscountsAddedOperation>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected DiscountsAddedOperation(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DiscountsAddedOperation(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public DiscountsAddedOperation(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DiscountsAddedOperation(DiscountsAddedOperation src) {
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

  /** Checks whether the 'ids' field is set and is not null */
  public boolean isNotNullIds() {
    return genClient.cacheValueIsNotNull(CacheKey.ids);
  }

  /** Checks whether the 'ids' field is set and is not null and is not empty */
  public boolean isNotEmptyIds() { return isNotNullIds() && !getIds().isEmpty(); }

  /** Checks whether the 'orderId' field is set and is not null */
  public boolean isNotNullOrderId() {
    return genClient.cacheValueIsNotNull(CacheKey.orderId);
  }



  /** Checks whether the 'ids' field has been set, however the value could be null */
  public boolean hasIds() {
    return genClient.cacheHasKey(CacheKey.ids);
  }

  /** Checks whether the 'orderId' field has been set, however the value could be null */
  public boolean hasOrderId() {
    return genClient.cacheHasKey(CacheKey.orderId);
  }


  /**
   * Sets the field 'ids'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public DiscountsAddedOperation setIds(java.util.List<java.lang.String> ids) {
    return genClient.setArrayOther(ids, CacheKey.ids);
  }

  /**
   * Sets the field 'orderId'.
   */
  public DiscountsAddedOperation setOrderId(java.lang.String orderId) {
    return genClient.setOther(orderId, CacheKey.orderId);
  }


  /** Clears the 'ids' field, the 'has' method for this field will now return false */
  public void clearIds() {
    genClient.clear(CacheKey.ids);
  }
  /** Clears the 'orderId' field, the 'has' method for this field will now return false */
  public void clearOrderId() {
    genClient.clear(CacheKey.orderId);
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
  public DiscountsAddedOperation copyChanges() {
    DiscountsAddedOperation copy = new DiscountsAddedOperation();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DiscountsAddedOperation src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DiscountsAddedOperation(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<DiscountsAddedOperation> CREATOR = new android.os.Parcelable.Creator<DiscountsAddedOperation>() {
    @Override
    public DiscountsAddedOperation createFromParcel(android.os.Parcel in) {
      DiscountsAddedOperation instance = new DiscountsAddedOperation(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DiscountsAddedOperation[] newArray(int size) {
      return new DiscountsAddedOperation[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DiscountsAddedOperation> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DiscountsAddedOperation>() {
    public Class<DiscountsAddedOperation> getCreatedClass() {
      return DiscountsAddedOperation.class;
    }

    @Override
    public DiscountsAddedOperation create(org.json.JSONObject jsonObject) {
      return new DiscountsAddedOperation(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean IDS_IS_REQUIRED = false;
    public static final boolean ORDERID_IS_REQUIRED = false;
  }

}
