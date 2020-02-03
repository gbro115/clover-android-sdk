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
 * Each instance of this represents a payment summary, a tender stats, a card type, or a DCC row in the payments report summary table. Only a subset of fields are populated in each section.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getName name}</li>
 * <li>{@link #getNumTransactions numTransactions}</li>
 * <li>{@link #getNet net}</li>
 * <li>{@link #getPaymentAmount paymentAmount}</li>
 * <li>{@link #getRevenueAmount revenueAmount}</li>
 * <li>{@link #getTaxAmount taxAmount}</li>
 * <li>{@link #getTipAmount tipAmount}</li>
 * <li>{@link #getRefundTipAmount refundTipAmount}</li>
 * <li>{@link #getServiceChargeAmount serviceChargeAmount}</li>
 * <li>{@link #getRefundAmount refundAmount}</li>
 * <li>{@link #getCreditAmount creditAmount}</li>
 * <li>{@link #getRefundAndCreditAmount refundAndCreditAmount}</li>
 * <li>{@link #getTender tender}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ReportPaymentsV2Row extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The name of the row, like Gross Online Payments, Credit Card, Master Card, etc.
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * Total number of transactions of this type.
   */
  public java.lang.Long getNumTransactions() {
    return genClient.cacheGet(CacheKey.numTransactions);
  }

  /**
   * Revenue plus tax plus tips minus refunds minus manual refunds. Revenue includes service charge.
   */
  public java.lang.Long getNet() {
    return genClient.cacheGet(CacheKey.net);
  }

  /**
   * Revenue plus tax. Revenue includes service charge. Does not include tips except in the tenders section of the legacy payments report when it does include tip.
   */
  public java.lang.Long getPaymentAmount() {
    return genClient.cacheGet(CacheKey.paymentAmount);
  }

  /**
   * Revenue includes service charge. It does not include either tax or tip.
   */
  public java.lang.Long getRevenueAmount() {
    return genClient.cacheGet(CacheKey.revenueAmount);
  }

  /**
   * Total amount of taxes collected.
   */
  public java.lang.Long getTaxAmount() {
    return genClient.cacheGet(CacheKey.taxAmount);
  }

  /**
   * Total amount of tips.
   */
  public java.lang.Long getTipAmount() {
    return genClient.cacheGet(CacheKey.tipAmount);
  }

  /**
   * Amount of tip that was refunded.
   */
  public java.lang.Long getRefundTipAmount() {
    return genClient.cacheGet(CacheKey.refundTipAmount);
  }

  /**
   * Total amount of service charges. This is included in revenue.
   */
  public java.lang.Long getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }

  /**
   * Total amount of refunds. This amount includes tax, tip and service charge.
   */
  public java.lang.Long getRefundAmount() {
    return genClient.cacheGet(CacheKey.refundAmount);
  }

  /**
   * Total amount of manual refunds. This amount includes tax.
   */
  public java.lang.Long getCreditAmount() {
    return genClient.cacheGet(CacheKey.creditAmount);
  }

  /**
   * Total amount of refunds and manual refunds. This amount includes tax, tip and service charge.
   */
  public java.lang.Long getRefundAndCreditAmount() {
    return genClient.cacheGet(CacheKey.refundAndCreditAmount);
  }

  /**
   * For card type sales, this is the parent tender type that this card type belongs to.
   */
  public com.clover.sdk.v3.base.Tender getTender() {
    return genClient.cacheGet(CacheKey.tender);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    name
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    numTransactions
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    net
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    paymentAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    revenueAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    taxAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    tipAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    refundTipAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    serviceChargeAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    refundAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    creditAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    refundAndCreditAmount
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
    tender
        (com.clover.sdk.extractors.RecordExtractionStrategy.instance(com.clover.sdk.v3.base.Tender.JSON_CREATOR)),
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

  private final GenericClient<ReportPaymentsV2Row> genClient;

  /**
   * Constructs a new empty instance.
   */
  public ReportPaymentsV2Row() {
    genClient = new GenericClient<ReportPaymentsV2Row>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected ReportPaymentsV2Row(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ReportPaymentsV2Row(String json) throws IllegalArgumentException {
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
  public ReportPaymentsV2Row(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ReportPaymentsV2Row(ReportPaymentsV2Row src) {
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

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'numTransactions' field is set and is not null */
  public boolean isNotNullNumTransactions() {
    return genClient.cacheValueIsNotNull(CacheKey.numTransactions);
  }

  /** Checks whether the 'net' field is set and is not null */
  public boolean isNotNullNet() {
    return genClient.cacheValueIsNotNull(CacheKey.net);
  }

  /** Checks whether the 'paymentAmount' field is set and is not null */
  public boolean isNotNullPaymentAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.paymentAmount);
  }

  /** Checks whether the 'revenueAmount' field is set and is not null */
  public boolean isNotNullRevenueAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.revenueAmount);
  }

  /** Checks whether the 'taxAmount' field is set and is not null */
  public boolean isNotNullTaxAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.taxAmount);
  }

  /** Checks whether the 'tipAmount' field is set and is not null */
  public boolean isNotNullTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.tipAmount);
  }

  /** Checks whether the 'refundTipAmount' field is set and is not null */
  public boolean isNotNullRefundTipAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.refundTipAmount);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'refundAmount' field is set and is not null */
  public boolean isNotNullRefundAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.refundAmount);
  }

  /** Checks whether the 'creditAmount' field is set and is not null */
  public boolean isNotNullCreditAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.creditAmount);
  }

  /** Checks whether the 'refundAndCreditAmount' field is set and is not null */
  public boolean isNotNullRefundAndCreditAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.refundAndCreditAmount);
  }

  /** Checks whether the 'tender' field is set and is not null */
  public boolean isNotNullTender() {
    return genClient.cacheValueIsNotNull(CacheKey.tender);
  }



  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'numTransactions' field has been set, however the value could be null */
  public boolean hasNumTransactions() {
    return genClient.cacheHasKey(CacheKey.numTransactions);
  }

  /** Checks whether the 'net' field has been set, however the value could be null */
  public boolean hasNet() {
    return genClient.cacheHasKey(CacheKey.net);
  }

  /** Checks whether the 'paymentAmount' field has been set, however the value could be null */
  public boolean hasPaymentAmount() {
    return genClient.cacheHasKey(CacheKey.paymentAmount);
  }

  /** Checks whether the 'revenueAmount' field has been set, however the value could be null */
  public boolean hasRevenueAmount() {
    return genClient.cacheHasKey(CacheKey.revenueAmount);
  }

  /** Checks whether the 'taxAmount' field has been set, however the value could be null */
  public boolean hasTaxAmount() {
    return genClient.cacheHasKey(CacheKey.taxAmount);
  }

  /** Checks whether the 'tipAmount' field has been set, however the value could be null */
  public boolean hasTipAmount() {
    return genClient.cacheHasKey(CacheKey.tipAmount);
  }

  /** Checks whether the 'refundTipAmount' field has been set, however the value could be null */
  public boolean hasRefundTipAmount() {
    return genClient.cacheHasKey(CacheKey.refundTipAmount);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'refundAmount' field has been set, however the value could be null */
  public boolean hasRefundAmount() {
    return genClient.cacheHasKey(CacheKey.refundAmount);
  }

  /** Checks whether the 'creditAmount' field has been set, however the value could be null */
  public boolean hasCreditAmount() {
    return genClient.cacheHasKey(CacheKey.creditAmount);
  }

  /** Checks whether the 'refundAndCreditAmount' field has been set, however the value could be null */
  public boolean hasRefundAndCreditAmount() {
    return genClient.cacheHasKey(CacheKey.refundAndCreditAmount);
  }

  /** Checks whether the 'tender' field has been set, however the value could be null */
  public boolean hasTender() {
    return genClient.cacheHasKey(CacheKey.tender);
  }


  /**
   * Sets the field 'name'.
   */
  public ReportPaymentsV2Row setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'numTransactions'.
   */
  public ReportPaymentsV2Row setNumTransactions(java.lang.Long numTransactions) {
    return genClient.setOther(numTransactions, CacheKey.numTransactions);
  }

  /**
   * Sets the field 'net'.
   */
  public ReportPaymentsV2Row setNet(java.lang.Long net) {
    return genClient.setOther(net, CacheKey.net);
  }

  /**
   * Sets the field 'paymentAmount'.
   */
  public ReportPaymentsV2Row setPaymentAmount(java.lang.Long paymentAmount) {
    return genClient.setOther(paymentAmount, CacheKey.paymentAmount);
  }

  /**
   * Sets the field 'revenueAmount'.
   */
  public ReportPaymentsV2Row setRevenueAmount(java.lang.Long revenueAmount) {
    return genClient.setOther(revenueAmount, CacheKey.revenueAmount);
  }

  /**
   * Sets the field 'taxAmount'.
   */
  public ReportPaymentsV2Row setTaxAmount(java.lang.Long taxAmount) {
    return genClient.setOther(taxAmount, CacheKey.taxAmount);
  }

  /**
   * Sets the field 'tipAmount'.
   */
  public ReportPaymentsV2Row setTipAmount(java.lang.Long tipAmount) {
    return genClient.setOther(tipAmount, CacheKey.tipAmount);
  }

  /**
   * Sets the field 'refundTipAmount'.
   */
  public ReportPaymentsV2Row setRefundTipAmount(java.lang.Long refundTipAmount) {
    return genClient.setOther(refundTipAmount, CacheKey.refundTipAmount);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   */
  public ReportPaymentsV2Row setServiceChargeAmount(java.lang.Long serviceChargeAmount) {
    return genClient.setOther(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }

  /**
   * Sets the field 'refundAmount'.
   */
  public ReportPaymentsV2Row setRefundAmount(java.lang.Long refundAmount) {
    return genClient.setOther(refundAmount, CacheKey.refundAmount);
  }

  /**
   * Sets the field 'creditAmount'.
   */
  public ReportPaymentsV2Row setCreditAmount(java.lang.Long creditAmount) {
    return genClient.setOther(creditAmount, CacheKey.creditAmount);
  }

  /**
   * Sets the field 'refundAndCreditAmount'.
   */
  public ReportPaymentsV2Row setRefundAndCreditAmount(java.lang.Long refundAndCreditAmount) {
    return genClient.setOther(refundAndCreditAmount, CacheKey.refundAndCreditAmount);
  }

  /**
   * Sets the field 'tender'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public ReportPaymentsV2Row setTender(com.clover.sdk.v3.base.Tender tender) {
    return genClient.setRecord(tender, CacheKey.tender);
  }


  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'numTransactions' field, the 'has' method for this field will now return false */
  public void clearNumTransactions() {
    genClient.clear(CacheKey.numTransactions);
  }
  /** Clears the 'net' field, the 'has' method for this field will now return false */
  public void clearNet() {
    genClient.clear(CacheKey.net);
  }
  /** Clears the 'paymentAmount' field, the 'has' method for this field will now return false */
  public void clearPaymentAmount() {
    genClient.clear(CacheKey.paymentAmount);
  }
  /** Clears the 'revenueAmount' field, the 'has' method for this field will now return false */
  public void clearRevenueAmount() {
    genClient.clear(CacheKey.revenueAmount);
  }
  /** Clears the 'taxAmount' field, the 'has' method for this field will now return false */
  public void clearTaxAmount() {
    genClient.clear(CacheKey.taxAmount);
  }
  /** Clears the 'tipAmount' field, the 'has' method for this field will now return false */
  public void clearTipAmount() {
    genClient.clear(CacheKey.tipAmount);
  }
  /** Clears the 'refundTipAmount' field, the 'has' method for this field will now return false */
  public void clearRefundTipAmount() {
    genClient.clear(CacheKey.refundTipAmount);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
  }
  /** Clears the 'refundAmount' field, the 'has' method for this field will now return false */
  public void clearRefundAmount() {
    genClient.clear(CacheKey.refundAmount);
  }
  /** Clears the 'creditAmount' field, the 'has' method for this field will now return false */
  public void clearCreditAmount() {
    genClient.clear(CacheKey.creditAmount);
  }
  /** Clears the 'refundAndCreditAmount' field, the 'has' method for this field will now return false */
  public void clearRefundAndCreditAmount() {
    genClient.clear(CacheKey.refundAndCreditAmount);
  }
  /** Clears the 'tender' field, the 'has' method for this field will now return false */
  public void clearTender() {
    genClient.clear(CacheKey.tender);
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
  public ReportPaymentsV2Row copyChanges() {
    ReportPaymentsV2Row copy = new ReportPaymentsV2Row();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ReportPaymentsV2Row src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ReportPaymentsV2Row(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ReportPaymentsV2Row> CREATOR = new android.os.Parcelable.Creator<ReportPaymentsV2Row>() {
    @Override
    public ReportPaymentsV2Row createFromParcel(android.os.Parcel in) {
      ReportPaymentsV2Row instance = new ReportPaymentsV2Row(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ReportPaymentsV2Row[] newArray(int size) {
      return new ReportPaymentsV2Row[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ReportPaymentsV2Row> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ReportPaymentsV2Row>() {
    @Override
    public ReportPaymentsV2Row create(org.json.JSONObject jsonObject) {
      return new ReportPaymentsV2Row(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean NAME_IS_REQUIRED = false;
    public static final boolean NUMTRANSACTIONS_IS_REQUIRED = false;
    public static final boolean NET_IS_REQUIRED = false;
    public static final boolean PAYMENTAMOUNT_IS_REQUIRED = false;
    public static final boolean REVENUEAMOUNT_IS_REQUIRED = false;
    public static final boolean TAXAMOUNT_IS_REQUIRED = false;
    public static final boolean TIPAMOUNT_IS_REQUIRED = false;
    public static final boolean REFUNDTIPAMOUNT_IS_REQUIRED = false;
    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;
    public static final boolean REFUNDAMOUNT_IS_REQUIRED = false;
    public static final boolean CREDITAMOUNT_IS_REQUIRED = false;
    public static final boolean REFUNDANDCREDITAMOUNT_IS_REQUIRED = false;
    public static final boolean TENDER_IS_REQUIRED = false;

  }

}