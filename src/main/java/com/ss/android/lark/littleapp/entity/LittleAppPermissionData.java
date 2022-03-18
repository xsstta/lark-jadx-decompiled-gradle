package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class LittleAppPermissionData implements Parcelable {
    public static final Parcelable.Creator<LittleAppPermissionData> CREATOR = new Parcelable.Creator<LittleAppPermissionData>() {
        /* class com.ss.android.lark.littleapp.entity.LittleAppPermissionData.C413291 */

        /* renamed from: a */
        public LittleAppPermissionData[] newArray(int i) {
            return new LittleAppPermissionData[i];
        }

        /* renamed from: a */
        public LittleAppPermissionData createFromParcel(Parcel parcel) {
            return new LittleAppPermissionData(parcel);
        }
    };
    private boolean isGranted;
    private String name;
    private int permission;

    public int describeContents() {
        return 0;
    }

    public LittleAppPermissionData() {
    }

    public String getName() {
        return this.name;
    }

    public int getPermission() {
        return this.permission;
    }

    public boolean isGranted() {
        return this.isGranted;
    }

    public void setGranted(boolean z) {
        this.isGranted = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPermission(int i) {
        this.permission = i;
    }

    protected LittleAppPermissionData(Parcel parcel) {
        boolean z;
        this.permission = parcel.readInt();
        this.name = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isGranted = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.permission);
        parcel.writeString(this.name);
        parcel.writeByte(this.isGranted ? (byte) 1 : 0);
    }

    public LittleAppPermissionData(int i, String str, boolean z) {
        this.permission = i;
        this.name = str;
        this.isGranted = z;
    }
}
