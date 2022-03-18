package com.ss.android.appcenter.business.dto;

import android.os.Parcel;
import android.os.Parcelable;

public enum ModuleType implements Parcelable {
    RECENT(0),
    RECENT2(100),
    BANNER(1),
    DUTY(2),
    CATEGORY(3),
    MOMENT(4),
    APPLIST(5),
    DIVIDER(6),
    UNKNOWN(7),
    MOMENT1(8),
    MOMENT2(9);
    
    public static final Parcelable.Creator<ModuleType> CREATOR = new Parcelable.Creator<ModuleType>() {
        /* class com.ss.android.appcenter.business.dto.ModuleType.C276901 */

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

    public static ModuleType fromValue(int i) {
        switch (i) {
            case 0:
                return RECENT;
            case 1:
                return BANNER;
            case 2:
                return DUTY;
            case 3:
                return CATEGORY;
            case 4:
                return MOMENT;
            case 5:
                return APPLIST;
            case 6:
                return DIVIDER;
            case 7:
            default:
                return UNKNOWN;
            case 8:
                return MOMENT1;
            case 9:
                return MOMENT2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
    }

    private ModuleType(int i) {
        this.value = i;
    }
}
