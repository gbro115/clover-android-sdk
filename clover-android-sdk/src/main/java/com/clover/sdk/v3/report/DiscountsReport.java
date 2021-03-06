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

package com.clover.sdk.v3.report;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getRevenueItems revenueItems}</li>
 * <li>{@link #getNonRevenueItems nonRevenueItems}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class DiscountsReport extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.report.ReportDiscountGroupTotal getRevenueItems() {
    return genClient.cacheGet(CacheKey.revenueItems);
  }

  public com.clover.sdk.v3.report.ReportDiscountGroupTotal getNonRevenueItems() {
    return genClient.cacheGet(CacheKey.nonRevenueItems);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    revenueItems
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.report.ReportDiscountGroupTotal.JSON_CREATOR)),
    nonRevenueItems
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.report.ReportDiscountGroupTotal.JSON_CREATOR)),
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

  private final GenericClient<DiscountsReport> genClient;

  /**
   * Constructs a new empty instance.
   */
  public DiscountsReport() {
    genClient = new GenericClient<DiscountsReport>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected DiscountsReport(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DiscountsReport(String json) throws IllegalArgumentException {
    this();
    genClient.initJsonObject(json);
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public DiscountsReport(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DiscountsReport(DiscountsReport src) {
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

  /** Checks whether the 'revenueItems' field is set and is not null */
  public boolean isNotNullRevenueItems() {
    return genClient.cacheValueIsNotNull(CacheKey.revenueItems);
  }

  /** Checks whether the 'nonRevenueItems' field is set and is not null */
  public boolean isNotNullNonRevenueItems() {
    return genClient.cacheValueIsNotNull(CacheKey.nonRevenueItems);
  }



  /** Checks whether the 'revenueItems' field has been set, however the value could be null */
  public boolean hasRevenueItems() {
    return genClient.cacheHasKey(CacheKey.revenueItems);
  }

  /** Checks whether the 'nonRevenueItems' field has been set, however the value could be null */
  public boolean hasNonRevenueItems() {
    return genClient.cacheHasKey(CacheKey.nonRevenueItems);
  }


  /**
   * Sets the field 'revenueItems'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public DiscountsReport setRevenueItems(com.clover.sdk.v3.report.ReportDiscountGroupTotal revenueItems) {
    return genClient.setRecord(revenueItems, CacheKey.revenueItems);
  }

  /**
   * Sets the field 'nonRevenueItems'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public DiscountsReport setNonRevenueItems(com.clover.sdk.v3.report.ReportDiscountGroupTotal nonRevenueItems) {
    return genClient.setRecord(nonRevenueItems, CacheKey.nonRevenueItems);
  }


  /** Clears the 'revenueItems' field, the 'has' method for this field will now return false */
  public void clearRevenueItems() {
    genClient.clear(CacheKey.revenueItems);
  }
  /** Clears the 'nonRevenueItems' field, the 'has' method for this field will now return false */
  public void clearNonRevenueItems() {
    genClient.clear(CacheKey.nonRevenueItems);
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
  public DiscountsReport copyChanges() {
    DiscountsReport copy = new DiscountsReport();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DiscountsReport src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DiscountsReport(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<DiscountsReport> CREATOR = new android.os.Parcelable.Creator<DiscountsReport>() {
    @Override
    public DiscountsReport createFromParcel(android.os.Parcel in) {
      DiscountsReport instance = new DiscountsReport(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DiscountsReport[] newArray(int size) {
      return new DiscountsReport[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DiscountsReport> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DiscountsReport>() {
    public Class<DiscountsReport> getCreatedClass() {
      return DiscountsReport.class;
    }

    @Override
    public DiscountsReport create(org.json.JSONObject jsonObject) {
      return new DiscountsReport(jsonObject);
    }
  };

  public interface Constraints {
    public static final boolean REVENUEITEMS_IS_REQUIRED = false;
    public static final boolean NONREVENUEITEMS_IS_REQUIRED = false;
  }

}
