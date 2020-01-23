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
 * <li>{@link #getId id}</li>
 * <li>{@link #getNum num}</li>
 * <li>{@link #getSegmentLabel segmentLabel}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getAmount amount}</li>
 * <li>{@link #getTipAmount tipAmount}</li>
 * <li>{@link #getTaxAmount taxAmount}</li>
 * <li>{@link #getServiceChargeAmount serviceChargeAmount}</li>
 * <li>{@link #getStartTimestamp startTimestamp}</li>
 * <li>{@link #getEndTimestamp endTimestamp}</li>
 * <li>{@link #getAmountWithoutTips amountWithoutTips}</li>
 * <li>{@link #getNetQuantity netQuantity}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Summary extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  public java.lang.Long getNum() {
    return genClient.cacheGet(CacheKey.num);
  }

  /**
   * An identifier that may be used to align report segments across different merchants.
   */
  public java.lang.Integer getSegmentLabel() {
    return genClient.cacheGet(CacheKey.segmentLabel);
  }

  /**
   * Optional name field relevant in some scenarios, for example while storing name of line item for top 5 items sold
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * The amount paid or refunded. This includes tax, discounts and service charge. This is not supposed to include tip, though there are times when refunds mistakenly include tips. A new field amountWithoutTips has been added for those incorrect endpoints.
   */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  public java.lang.Long getTipAmount() {
    return genClient.cacheGet(CacheKey.tipAmount);
  }

  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }

  public java.lang.Long getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }

  /**
   * Beginning of the time period for this summary
   */
  public java.lang.Long getStartTimestamp() {
    return genClient.cacheGet(CacheKey.startTimestamp);
  }

  /**
   * End of the time period for this summary
   */
  public java.lang.Long getEndTimestamp() {
    return genClient.cacheGet(CacheKey.endTimestamp);
  }

  /**
   * The amount paid or refunded. This includes tax, discounts and service charge. This does not include tip.
   */
  public java.lang.Long getAmountWithoutTips() {
    return genClient.cacheGet(CacheKey.amountWithoutTips);
  }

  /**
   * Optional field, total quantity of items sold
   */
  public java.lang.Double getNetQuantity() {
    return genClient.cacheGet(CacheKey.netQuantity);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    id
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    num
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    segmentLabel
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Integer.class)),
    name
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    amount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    tipAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    taxAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    serviceChargeAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    startTimestamp
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    endTimestamp
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    amountWithoutTips
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    netQuantity
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Double.class)),
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

  private final GenericClient<Summary> genClient;

  /**
   * Constructs a new empty instance.
   */
  public Summary() {
    genClient = new GenericClient<Summary>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected Summary(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Summary(String json) throws IllegalArgumentException {
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
  public Summary(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Summary(Summary src) {
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

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'num' field is set and is not null */
  public boolean isNotNullNum() {
    return genClient.cacheValueIsNotNull(CacheKey.num);
  }

  /** Checks whether the 'segmentLabel' field is set and is not null */
  public boolean isNotNullSegmentLabel() {
    return genClient.cacheValueIsNotNull(CacheKey.segmentLabel);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'startTimestamp' field is set and is not null */
  public boolean isNotNullStartTimestamp() {
    return genClient.cacheValueIsNotNull(CacheKey.startTimestamp);
  }

  /** Checks whether the 'endTimestamp' field is set and is not null */
  public boolean isNotNullEndTimestamp() {
    return genClient.cacheValueIsNotNull(CacheKey.endTimestamp);
  }

  /** Checks whether the 'amountWithoutTips' field is set and is not null */
  public boolean isNotNullAmountWithoutTips() {
    return genClient.cacheValueIsNotNull(CacheKey.amountWithoutTips);
  }

  /** Checks whether the 'netQuantity' field is set and is not null */
  public boolean isNotNullNetQuantity() {
    return genClient.cacheValueIsNotNull(CacheKey.netQuantity);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'num' field has been set, however the value could be null */
  public boolean hasNum() {
    return genClient.cacheHasKey(CacheKey.num);
  }

  /** Checks whether the 'segmentLabel' field has been set, however the value could be null */
  public boolean hasSegmentLabel() {
    return genClient.cacheHasKey(CacheKey.segmentLabel);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return genClient.cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'startTimestamp' field has been set, however the value could be null */
  public boolean hasStartTimestamp() {
    return genClient.cacheHasKey(CacheKey.startTimestamp);
  }

  /** Checks whether the 'endTimestamp' field has been set, however the value could be null */
  public boolean hasEndTimestamp() {
    return genClient.cacheHasKey(CacheKey.endTimestamp);
  }

  /** Checks whether the 'amountWithoutTips' field has been set, however the value could be null */
  public boolean hasAmountWithoutTips() {
    return genClient.cacheHasKey(CacheKey.amountWithoutTips);
  }

  /** Checks whether the 'netQuantity' field has been set, however the value could be null */
  public boolean hasNetQuantity() {
    return genClient.cacheHasKey(CacheKey.netQuantity);
  }


  /**
   * Sets the field 'id'.
   */
  public Summary setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'num'.
   */
  public Summary setNum(java.lang.Long num) {
    return genClient.setOther(num, CacheKey.num);
  }

  /**
   * Sets the field 'segmentLabel'.
   */
  public Summary setSegmentLabel(java.lang.Integer segmentLabel) {
    return genClient.setOther(segmentLabel, CacheKey.segmentLabel);
  }

  /**
   * Sets the field 'name'.
   */
  public Summary setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'amount'.
   */
  public Summary setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public Summary setTipAmount(java.lang.Long tipAmount) {
    return genClient.setOther(tipAmount, CacheKey.tipAmount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public Summary setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   */
  public Summary setServiceChargeAmount(java.lang.Long serviceChargeAmount) {
    return genClient.setOther(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }

  /**
   * Sets the field 'startTimestamp'.
   */
  public Summary setStartTimestamp(java.lang.Long startTimestamp) {
    return genClient.setOther(startTimestamp, CacheKey.startTimestamp);
  }

  /**
   * Sets the field 'endTimestamp'.
   */
  public Summary setEndTimestamp(java.lang.Long endTimestamp) {
    return genClient.setOther(endTimestamp, CacheKey.endTimestamp);
  }

  /**
   * Sets the field 'amountWithoutTips'.
   */
  public Summary setAmountWithoutTips(java.lang.Long amountWithoutTips) {
    return genClient.setOther(amountWithoutTips, CacheKey.amountWithoutTips);
  }

  /**
   * Sets the field 'netQuantity'.
   */
  public Summary setNetQuantity(java.lang.Double netQuantity) {
    return genClient.setOther(netQuantity, CacheKey.netQuantity);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'num' field, the 'has' method for this field will now return false */
  public void clearNum() {
    genClient.clear(CacheKey.num);
  }
  /** Clears the 'segmentLabel' field, the 'has' method for this field will now return false */
  public void clearSegmentLabel() {
    genClient.clear(CacheKey.segmentLabel);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    genClient.clear(CacheKey.tipAmount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
  }
  /** Clears the 'startTimestamp' field, the 'has' method for this field will now return false */
  public void clearStartTimestamp() {
    genClient.clear(CacheKey.startTimestamp);
  }
  /** Clears the 'endTimestamp' field, the 'has' method for this field will now return false */
  public void clearEndTimestamp() {
    genClient.clear(CacheKey.endTimestamp);
  }
  /** Clears the 'amountWithoutTips' field, the 'has' method for this field will now return false */
  public void clearAmountWithoutTips() {
    genClient.clear(CacheKey.amountWithoutTips);
  }
  /** Clears the 'netQuantity' field, the 'has' method for this field will now return false */
  public void clearNetQuantity() {
    genClient.clear(CacheKey.netQuantity);
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
  public Summary copyChanges() {
    Summary copy = new Summary();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Summary src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Summary(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Summary> CREATOR = new android.os.Parcelable.Creator<Summary>() {
    @Override
    public Summary createFromParcel(android.os.Parcel in) {
      Summary instance = new Summary(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Summary[] newArray(int size) {
      return new Summary[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Summary> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Summary>() {
    @Override
    public Summary create(org.json.JSONObject jsonObject) {
      return new Summary(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final boolean NUM_IS_REQUIRED = false;
    public static final boolean SEGMENTLABEL_IS_REQUIRED = false;
    public static final boolean NAME_IS_REQUIRED = false;
    public static final boolean AMOUNT_IS_REQUIRED = false;
    public static final boolean TIPAMOUNT_IS_REQUIRED = false;
    public static final boolean TAXAMOUNT_IS_REQUIRED = false;
    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;
    public static final boolean STARTTIMESTAMP_IS_REQUIRED = false;
    public static final boolean ENDTIMESTAMP_IS_REQUIRED = false;
    public static final boolean AMOUNTWITHOUTTIPS_IS_REQUIRED = false;
    public static final boolean NETQUANTITY_IS_REQUIRED = false;

  }

}
