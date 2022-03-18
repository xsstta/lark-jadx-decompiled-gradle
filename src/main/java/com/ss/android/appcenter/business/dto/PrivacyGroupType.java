package com.ss.android.appcenter.business.dto;

import android.os.Parcel;
import android.os.Parcelable;

public enum PrivacyGroupType implements Parcelable {
    APPINFO(0),
    NORMALLEVEL(1),
    HIGHLEVEL(2);
    
    public static final Parcelable.Creator<ModuleType> CREATOR = new Parcelable.Creator<ModuleType>() {
        /* class com.ss.android.appcenter.business.dto.PrivacyGroupType.C276911 */

        /* renamed from: a */
        public ModuleType[] newArray(int i) {
            return new ModuleType[i];
        }

        /* renamed from: a */
        public ModuleType createFromParcel(Parcel parcel) {
            return ModuleType.values()[parcel.readInt()];
        }
    };
    private int value;

    public int describeContents() {
        return 0;
    }

    public int getValue() {
        return this.value;
    }

    public static PrivacyGroupType fromValue(int i) {
        if (i == 0) {
            return APPINFO;
        }
        if (i == 1) {
            return NORMALLEVEL;
        }
        if (i != 2) {
            return null;
        }
        return HIGHLEVEL;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
    }

    private PrivacyGroupType(int i) {
        this.value = i;
    }
}
