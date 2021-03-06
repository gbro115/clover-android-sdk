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

package com.clover.sdk.v3.order;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 * * `CREATED`: The print event is created
* `PRINTING`: The print event is received by merchant and being processed
* `FAILED`: The primary printing device failed to print
* `DONE`: The print event is sent to device and get printed
 */
@SuppressWarnings("all")
public enum PrintState implements Parcelable {
  CREATED, PRINTING, FAILED, DONE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<PrintState> CREATOR = new Creator<PrintState>() {
    @Override
    public PrintState createFromParcel(final Parcel source) {
      return PrintState.valueOf(source.readString());
    }

    @Override
    public PrintState[] newArray(final int size) {
      return new PrintState[size];
    }
  };
}
