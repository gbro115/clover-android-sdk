/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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
 * <li>{@link #getLanguageIndicator languageIndicator}</li>
 * <li>{@link #getAccountSelection accountSelection}</li>
 * <li>{@link #getFiscalInvoiceNumber fiscalInvoiceNumber}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class TransactionInfo extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getLanguageIndicator() {
    return genClient.cacheGet(CacheKey.languageIndicator);
  }

  public com.clover.sdk.v3.payments.AccountType getAccountSelection() {
    return genClient.cacheGet(CacheKey.accountSelection);
  }

  /**
   * Consists of 4 digits prefix + 8 digits
   */
  public java.lang.String getFiscalInvoiceNumber() {
    return genClient.cacheGet(CacheKey.fiscalInvoiceNumber);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<TransactionInfo> {
    languageIndicator {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("languageIndicator", java.lang.String.class);
      }
    },
    accountSelection {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractEnum("accountSelection", com.clover.sdk.v3.payments.AccountType.class);
      }
    },
    fiscalInvoiceNumber {
      @Override
      public Object extractValue(TransactionInfo instance) {
        return instance.genClient.extractOther("fiscalInvoiceNumber", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<TransactionInfo> genClient;

  /**
  * Constructs a new empty instance.
  */
  public TransactionInfo() {
    genClient = new GenericClient<TransactionInfo>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected TransactionInfo(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public TransactionInfo(String json) throws IllegalArgumentException {
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
  public TransactionInfo(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public TransactionInfo(TransactionInfo src) {
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
    genClient.validateLength(getLanguageIndicator(), 2);

    genClient.validateLength(getFiscalInvoiceNumber(), 12);
  }

  /** Checks whether the 'languageIndicator' field is set and is not null */
  public boolean isNotNullLanguageIndicator() {
    return genClient.cacheValueIsNotNull(CacheKey.languageIndicator);
  }

  /** Checks whether the 'accountSelection' field is set and is not null */
  public boolean isNotNullAccountSelection() {
    return genClient.cacheValueIsNotNull(CacheKey.accountSelection);
  }

  /** Checks whether the 'fiscalInvoiceNumber' field is set and is not null */
  public boolean isNotNullFiscalInvoiceNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.fiscalInvoiceNumber);
  }



  /** Checks whether the 'languageIndicator' field has been set, however the value could be null */
  public boolean hasLanguageIndicator() {
    return genClient.cacheHasKey(CacheKey.languageIndicator);
  }

  /** Checks whether the 'accountSelection' field has been set, however the value could be null */
  public boolean hasAccountSelection() {
    return genClient.cacheHasKey(CacheKey.accountSelection);
  }

  /** Checks whether the 'fiscalInvoiceNumber' field has been set, however the value could be null */
  public boolean hasFiscalInvoiceNumber() {
    return genClient.cacheHasKey(CacheKey.fiscalInvoiceNumber);
  }


  /**
   * Sets the field 'languageIndicator'.
   */
  public TransactionInfo setLanguageIndicator(java.lang.String languageIndicator) {
    return genClient.setOther(languageIndicator, CacheKey.languageIndicator);
  }

  /**
   * Sets the field 'accountSelection'.
   */
  public TransactionInfo setAccountSelection(com.clover.sdk.v3.payments.AccountType accountSelection) {
    return genClient.setOther(accountSelection, CacheKey.accountSelection);
  }

  /**
   * Sets the field 'fiscalInvoiceNumber'.
   */
  public TransactionInfo setFiscalInvoiceNumber(java.lang.String fiscalInvoiceNumber) {
    return genClient.setOther(fiscalInvoiceNumber, CacheKey.fiscalInvoiceNumber);
  }


  /** Clears the 'languageIndicator' field, the 'has' method for this field will now return false */
  public void clearLanguageIndicator() {
    genClient.clear(CacheKey.languageIndicator);
  }
  /** Clears the 'accountSelection' field, the 'has' method for this field will now return false */
  public void clearAccountSelection() {
    genClient.clear(CacheKey.accountSelection);
  }
  /** Clears the 'fiscalInvoiceNumber' field, the 'has' method for this field will now return false */
  public void clearFiscalInvoiceNumber() {
    genClient.clear(CacheKey.fiscalInvoiceNumber);
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
  public TransactionInfo copyChanges() {
    TransactionInfo copy = new TransactionInfo();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(TransactionInfo src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new TransactionInfo(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<TransactionInfo> CREATOR = new android.os.Parcelable.Creator<TransactionInfo>() {
    @Override
    public TransactionInfo createFromParcel(android.os.Parcel in) {
      TransactionInfo instance = new TransactionInfo(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public TransactionInfo[] newArray(int size) {
      return new TransactionInfo[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<TransactionInfo> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<TransactionInfo>() {
    @Override
    public TransactionInfo create(org.json.JSONObject jsonObject) {
      return new TransactionInfo(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean LANGUAGEINDICATOR_IS_REQUIRED = false;
    public static final long LANGUAGEINDICATOR_MAX_LEN = 2;
    public static final boolean ACCOUNTSELECTION_IS_REQUIRED = false;
    public static final boolean FISCALINVOICENUMBER_IS_REQUIRED = false;
    public static final long FISCALINVOICENUMBER_MAX_LEN = 12;

  }

}
