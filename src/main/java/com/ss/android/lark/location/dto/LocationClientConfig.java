package com.ss.android.lark.location.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class LocationClientConfig implements Parcelable {
    public static final Parcelable.Creator<LocationClientConfig> CREATOR = new Parcelable.Creator<LocationClientConfig>() {
        /* class com.ss.android.lark.location.dto.LocationClientConfig.C415781 */

        /* renamed from: a */
        public LocationClientConfig[] newArray(int i) {
            return new LocationClientConfig[i];
        }

        /* renamed from: a */
        public LocationClientConfig createFromParcel(Parcel parcel) {
            return new LocationClientConfig(parcel);
        }
    };

    /* renamed from: a */
    private boolean f105658a;

    public int describeContents() {
        return 0;
    }

    public LocationClientConfig() {
    }

    /* renamed from: a */
    public boolean mo149628a() {
        return this.f105658a;
    }

    /* renamed from: a */
    public void mo149627a(boolean z) {
        this.f105658a = z;
    }

    protected LocationClientConfig(Parcel parcel) {
        boolean z;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105658a = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f105658a ? 1 : 0);
    }
}
