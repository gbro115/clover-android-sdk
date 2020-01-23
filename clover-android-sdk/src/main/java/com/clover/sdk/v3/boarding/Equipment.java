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

package com.clover.sdk.v3.boarding;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchantId merchantId}</li>
 * <li>{@link #getBoarded boarded}</li>
 * <li>{@link #getProvisioned provisioned}</li>
 * <li>{@link #getEquipmentNumber equipmentNumber}</li>
 * <li>{@link #getSerialNumber serialNumber}</li>
 * <li>{@link #getEquipmentCode equipmentCode}</li>
 * <li>{@link #getEquipmentCodeDesc equipmentCodeDesc}</li>
 * <li>{@link #getProvisionedDeviceType provisionedDeviceType}</li>
 * <li>{@link #getBoardedBundleIndicator boardedBundleIndicator}</li>
 * <li>{@link #getBoardedBundleId boardedBundleId}</li>
 * <li>{@link #getProvisionedBundleIndicator provisionedBundleIndicator}</li>
 * <li>{@link #getProvisionedBundleId provisionedBundleId}</li>
 * <li>{@link #getProvisionBundleEffectiveTime provisionBundleEffectiveTime}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Equipment extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getMerchantId() {
    return genClient.cacheGet(CacheKey.merchantId);
  }

  /**
   * Signifies if the equipment information has been provided as part of boarding messages
   */
  public java.lang.Boolean getBoarded() {
    return genClient.cacheGet(CacheKey.boarded);
  }

  /**
   * Signifies if the equipment has been provisioned or not
   */
  public java.lang.Boolean getProvisioned() {
    return genClient.cacheGet(CacheKey.provisioned);
  }

  /**
   * The equipment number from FDPOS assigned to this merchant
   */
  public java.lang.String getEquipmentNumber() {
    return genClient.cacheGet(CacheKey.equipmentNumber);
  }

  /**
   * The serial number associate with the device.
   */
  public java.lang.String getSerialNumber() {
    return genClient.cacheGet(CacheKey.serialNumber);
  }

  /**
   * The equipment code for the equipment received through boarding.
   */
  public java.lang.String getEquipmentCode() {
    return genClient.cacheGet(CacheKey.equipmentCode);
  }

  /**
   * Human friendly description of the equipment code
   */
  public java.lang.String getEquipmentCodeDesc() {
    return genClient.cacheGet(CacheKey.equipmentCodeDesc);
  }

  /**
   * The device type assigned to the provisioned portion of this equipment.
   */
  public java.lang.String getProvisionedDeviceType() {
    return genClient.cacheGet(CacheKey.provisionedDeviceType);
  }

  /**
   * The bundle indicator that was provided for the equipment during boarding
   */
  public java.lang.String getBoardedBundleIndicator() {
    return genClient.cacheGet(CacheKey.boardedBundleIndicator);
  }

  public java.lang.String getBoardedBundleId() {
    return genClient.cacheGet(CacheKey.boardedBundleId);
  }

  /**
   * The bundle indicator that was provided during provisioning.
   */
  public java.lang.String getProvisionedBundleIndicator() {
    return genClient.cacheGet(CacheKey.provisionedBundleIndicator);
  }

  public java.lang.String getProvisionedBundleId() {
    return genClient.cacheGet(CacheKey.provisionedBundleId);
  }

  /**
   * The time that the bundle is associated with the provisioned device.
   */
  public java.lang.Long getProvisionBundleEffectiveTime() {
    return genClient.cacheGet(CacheKey.provisionBundleEffectiveTime);
  }




  private enum CacheKey implements com.clover.sdk.ExtractionStrategyEnum {
    merchantId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    boarded
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    provisioned
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Boolean.class)),
    equipmentNumber
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    serialNumber
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    equipmentCode
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    equipmentCodeDesc
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    provisionedDeviceType
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    boardedBundleIndicator
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    boardedBundleId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    provisionedBundleIndicator
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    provisionedBundleId
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.String.class)),
    provisionBundleEffectiveTime
        (com.clover.sdk.extractors.BasicExtractionStrategy.instance(java.lang.Long.class)),
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

  private final GenericClient<Equipment> genClient;

  /**
   * Constructs a new empty instance.
   */
  public Equipment() {
    genClient = new GenericClient<Equipment>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
   * Constructs a new empty instance.
   */
  protected Equipment(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Equipment(String json) throws IllegalArgumentException {
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
  public Equipment(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Equipment(Equipment src) {
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
    genClient.validateLength(getMerchantId(), 13);

    genClient.validateLength(getEquipmentNumber(), 14);

    genClient.validateLength(getSerialNumber(), 50);

    genClient.validateLength(getBoardedBundleIndicator(), 32);

    genClient.validateLength(getBoardedBundleId(), 13);

    genClient.validateLength(getProvisionedBundleIndicator(), 32);

    genClient.validateLength(getProvisionedBundleId(), 13);
  }

  /** Checks whether the 'merchantId' field is set and is not null */
  public boolean isNotNullMerchantId() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantId);
  }

  /** Checks whether the 'boarded' field is set and is not null */
  public boolean isNotNullBoarded() {
    return genClient.cacheValueIsNotNull(CacheKey.boarded);
  }

  /** Checks whether the 'provisioned' field is set and is not null */
  public boolean isNotNullProvisioned() {
    return genClient.cacheValueIsNotNull(CacheKey.provisioned);
  }

  /** Checks whether the 'equipmentNumber' field is set and is not null */
  public boolean isNotNullEquipmentNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.equipmentNumber);
  }

  /** Checks whether the 'serialNumber' field is set and is not null */
  public boolean isNotNullSerialNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.serialNumber);
  }

  /** Checks whether the 'equipmentCode' field is set and is not null */
  public boolean isNotNullEquipmentCode() {
    return genClient.cacheValueIsNotNull(CacheKey.equipmentCode);
  }

  /** Checks whether the 'equipmentCodeDesc' field is set and is not null */
  public boolean isNotNullEquipmentCodeDesc() {
    return genClient.cacheValueIsNotNull(CacheKey.equipmentCodeDesc);
  }

  /** Checks whether the 'provisionedDeviceType' field is set and is not null */
  public boolean isNotNullProvisionedDeviceType() {
    return genClient.cacheValueIsNotNull(CacheKey.provisionedDeviceType);
  }

  /** Checks whether the 'boardedBundleIndicator' field is set and is not null */
  public boolean isNotNullBoardedBundleIndicator() {
    return genClient.cacheValueIsNotNull(CacheKey.boardedBundleIndicator);
  }

  /** Checks whether the 'boardedBundleId' field is set and is not null */
  public boolean isNotNullBoardedBundleId() {
    return genClient.cacheValueIsNotNull(CacheKey.boardedBundleId);
  }

  /** Checks whether the 'provisionedBundleIndicator' field is set and is not null */
  public boolean isNotNullProvisionedBundleIndicator() {
    return genClient.cacheValueIsNotNull(CacheKey.provisionedBundleIndicator);
  }

  /** Checks whether the 'provisionedBundleId' field is set and is not null */
  public boolean isNotNullProvisionedBundleId() {
    return genClient.cacheValueIsNotNull(CacheKey.provisionedBundleId);
  }

  /** Checks whether the 'provisionBundleEffectiveTime' field is set and is not null */
  public boolean isNotNullProvisionBundleEffectiveTime() {
    return genClient.cacheValueIsNotNull(CacheKey.provisionBundleEffectiveTime);
  }



  /** Checks whether the 'merchantId' field has been set, however the value could be null */
  public boolean hasMerchantId() {
    return genClient.cacheHasKey(CacheKey.merchantId);
  }

  /** Checks whether the 'boarded' field has been set, however the value could be null */
  public boolean hasBoarded() {
    return genClient.cacheHasKey(CacheKey.boarded);
  }

  /** Checks whether the 'provisioned' field has been set, however the value could be null */
  public boolean hasProvisioned() {
    return genClient.cacheHasKey(CacheKey.provisioned);
  }

  /** Checks whether the 'equipmentNumber' field has been set, however the value could be null */
  public boolean hasEquipmentNumber() {
    return genClient.cacheHasKey(CacheKey.equipmentNumber);
  }

  /** Checks whether the 'serialNumber' field has been set, however the value could be null */
  public boolean hasSerialNumber() {
    return genClient.cacheHasKey(CacheKey.serialNumber);
  }

  /** Checks whether the 'equipmentCode' field has been set, however the value could be null */
  public boolean hasEquipmentCode() {
    return genClient.cacheHasKey(CacheKey.equipmentCode);
  }

  /** Checks whether the 'equipmentCodeDesc' field has been set, however the value could be null */
  public boolean hasEquipmentCodeDesc() {
    return genClient.cacheHasKey(CacheKey.equipmentCodeDesc);
  }

  /** Checks whether the 'provisionedDeviceType' field has been set, however the value could be null */
  public boolean hasProvisionedDeviceType() {
    return genClient.cacheHasKey(CacheKey.provisionedDeviceType);
  }

  /** Checks whether the 'boardedBundleIndicator' field has been set, however the value could be null */
  public boolean hasBoardedBundleIndicator() {
    return genClient.cacheHasKey(CacheKey.boardedBundleIndicator);
  }

  /** Checks whether the 'boardedBundleId' field has been set, however the value could be null */
  public boolean hasBoardedBundleId() {
    return genClient.cacheHasKey(CacheKey.boardedBundleId);
  }

  /** Checks whether the 'provisionedBundleIndicator' field has been set, however the value could be null */
  public boolean hasProvisionedBundleIndicator() {
    return genClient.cacheHasKey(CacheKey.provisionedBundleIndicator);
  }

  /** Checks whether the 'provisionedBundleId' field has been set, however the value could be null */
  public boolean hasProvisionedBundleId() {
    return genClient.cacheHasKey(CacheKey.provisionedBundleId);
  }

  /** Checks whether the 'provisionBundleEffectiveTime' field has been set, however the value could be null */
  public boolean hasProvisionBundleEffectiveTime() {
    return genClient.cacheHasKey(CacheKey.provisionBundleEffectiveTime);
  }


  /**
   * Sets the field 'merchantId'.
   */
  public Equipment setMerchantId(java.lang.String merchantId) {
    return genClient.setOther(merchantId, CacheKey.merchantId);
  }

  /**
   * Sets the field 'boarded'.
   */
  public Equipment setBoarded(java.lang.Boolean boarded) {
    return genClient.setOther(boarded, CacheKey.boarded);
  }

  /**
   * Sets the field 'provisioned'.
   */
  public Equipment setProvisioned(java.lang.Boolean provisioned) {
    return genClient.setOther(provisioned, CacheKey.provisioned);
  }

  /**
   * Sets the field 'equipmentNumber'.
   */
  public Equipment setEquipmentNumber(java.lang.String equipmentNumber) {
    return genClient.setOther(equipmentNumber, CacheKey.equipmentNumber);
  }

  /**
   * Sets the field 'serialNumber'.
   */
  public Equipment setSerialNumber(java.lang.String serialNumber) {
    return genClient.setOther(serialNumber, CacheKey.serialNumber);
  }

  /**
   * Sets the field 'equipmentCode'.
   */
  public Equipment setEquipmentCode(java.lang.String equipmentCode) {
    return genClient.setOther(equipmentCode, CacheKey.equipmentCode);
  }

  /**
   * Sets the field 'equipmentCodeDesc'.
   */
  public Equipment setEquipmentCodeDesc(java.lang.String equipmentCodeDesc) {
    return genClient.setOther(equipmentCodeDesc, CacheKey.equipmentCodeDesc);
  }

  /**
   * Sets the field 'provisionedDeviceType'.
   */
  public Equipment setProvisionedDeviceType(java.lang.String provisionedDeviceType) {
    return genClient.setOther(provisionedDeviceType, CacheKey.provisionedDeviceType);
  }

  /**
   * Sets the field 'boardedBundleIndicator'.
   */
  public Equipment setBoardedBundleIndicator(java.lang.String boardedBundleIndicator) {
    return genClient.setOther(boardedBundleIndicator, CacheKey.boardedBundleIndicator);
  }

  /**
   * Sets the field 'boardedBundleId'.
   */
  public Equipment setBoardedBundleId(java.lang.String boardedBundleId) {
    return genClient.setOther(boardedBundleId, CacheKey.boardedBundleId);
  }

  /**
   * Sets the field 'provisionedBundleIndicator'.
   */
  public Equipment setProvisionedBundleIndicator(java.lang.String provisionedBundleIndicator) {
    return genClient.setOther(provisionedBundleIndicator, CacheKey.provisionedBundleIndicator);
  }

  /**
   * Sets the field 'provisionedBundleId'.
   */
  public Equipment setProvisionedBundleId(java.lang.String provisionedBundleId) {
    return genClient.setOther(provisionedBundleId, CacheKey.provisionedBundleId);
  }

  /**
   * Sets the field 'provisionBundleEffectiveTime'.
   */
  public Equipment setProvisionBundleEffectiveTime(java.lang.Long provisionBundleEffectiveTime) {
    return genClient.setOther(provisionBundleEffectiveTime, CacheKey.provisionBundleEffectiveTime);
  }


  /** Clears the 'merchantId' field, the 'has' method for this field will now return false */
  public void clearMerchantId() {
    genClient.clear(CacheKey.merchantId);
  }
  /** Clears the 'boarded' field, the 'has' method for this field will now return false */
  public void clearBoarded() {
    genClient.clear(CacheKey.boarded);
  }
  /** Clears the 'provisioned' field, the 'has' method for this field will now return false */
  public void clearProvisioned() {
    genClient.clear(CacheKey.provisioned);
  }
  /** Clears the 'equipmentNumber' field, the 'has' method for this field will now return false */
  public void clearEquipmentNumber() {
    genClient.clear(CacheKey.equipmentNumber);
  }
  /** Clears the 'serialNumber' field, the 'has' method for this field will now return false */
  public void clearSerialNumber() {
    genClient.clear(CacheKey.serialNumber);
  }
  /** Clears the 'equipmentCode' field, the 'has' method for this field will now return false */
  public void clearEquipmentCode() {
    genClient.clear(CacheKey.equipmentCode);
  }
  /** Clears the 'equipmentCodeDesc' field, the 'has' method for this field will now return false */
  public void clearEquipmentCodeDesc() {
    genClient.clear(CacheKey.equipmentCodeDesc);
  }
  /** Clears the 'provisionedDeviceType' field, the 'has' method for this field will now return false */
  public void clearProvisionedDeviceType() {
    genClient.clear(CacheKey.provisionedDeviceType);
  }
  /** Clears the 'boardedBundleIndicator' field, the 'has' method for this field will now return false */
  public void clearBoardedBundleIndicator() {
    genClient.clear(CacheKey.boardedBundleIndicator);
  }
  /** Clears the 'boardedBundleId' field, the 'has' method for this field will now return false */
  public void clearBoardedBundleId() {
    genClient.clear(CacheKey.boardedBundleId);
  }
  /** Clears the 'provisionedBundleIndicator' field, the 'has' method for this field will now return false */
  public void clearProvisionedBundleIndicator() {
    genClient.clear(CacheKey.provisionedBundleIndicator);
  }
  /** Clears the 'provisionedBundleId' field, the 'has' method for this field will now return false */
  public void clearProvisionedBundleId() {
    genClient.clear(CacheKey.provisionedBundleId);
  }
  /** Clears the 'provisionBundleEffectiveTime' field, the 'has' method for this field will now return false */
  public void clearProvisionBundleEffectiveTime() {
    genClient.clear(CacheKey.provisionBundleEffectiveTime);
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
  public Equipment copyChanges() {
    Equipment copy = new Equipment();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Equipment src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Equipment(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Equipment> CREATOR = new android.os.Parcelable.Creator<Equipment>() {
    @Override
    public Equipment createFromParcel(android.os.Parcel in) {
      Equipment instance = new Equipment(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Equipment[] newArray(int size) {
      return new Equipment[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Equipment> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Equipment>() {
    @Override
    public Equipment create(org.json.JSONObject jsonObject) {
      return new Equipment(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MERCHANTID_IS_REQUIRED = false;
    public static final long MERCHANTID_MAX_LEN = 13;
    public static final boolean BOARDED_IS_REQUIRED = false;
    public static final boolean PROVISIONED_IS_REQUIRED = false;
    public static final boolean EQUIPMENTNUMBER_IS_REQUIRED = false;
    public static final long EQUIPMENTNUMBER_MAX_LEN = 14;
    public static final boolean SERIALNUMBER_IS_REQUIRED = false;
    public static final long SERIALNUMBER_MAX_LEN = 50;
    public static final boolean EQUIPMENTCODE_IS_REQUIRED = false;
    public static final boolean EQUIPMENTCODEDESC_IS_REQUIRED = false;
    public static final boolean PROVISIONEDDEVICETYPE_IS_REQUIRED = false;
    public static final boolean BOARDEDBUNDLEINDICATOR_IS_REQUIRED = false;
    public static final long BOARDEDBUNDLEINDICATOR_MAX_LEN = 32;
    public static final boolean BOARDEDBUNDLEID_IS_REQUIRED = false;
    public static final long BOARDEDBUNDLEID_MAX_LEN = 13;
    public static final boolean PROVISIONEDBUNDLEINDICATOR_IS_REQUIRED = false;
    public static final long PROVISIONEDBUNDLEINDICATOR_MAX_LEN = 32;
    public static final boolean PROVISIONEDBUNDLEID_IS_REQUIRED = false;
    public static final long PROVISIONEDBUNDLEID_MAX_LEN = 13;
    public static final boolean PROVISIONBUNDLEEFFECTIVETIME_IS_REQUIRED = false;

  }

}
