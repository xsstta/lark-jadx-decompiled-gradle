package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;

public class LocationSettingsResult extends Result implements Parcelable {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C23640a();
    @Packed
    private LocationSettingsStates locationSettingsStates;
    @Packed
    private Status status;

    /* renamed from: com.huawei.hms.location.LocationSettingsResult$a */
    static class C23640a implements Parcelable.Creator<LocationSettingsResult> {
        C23640a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsResult createFromParcel(Parcel parcel) {
            return new LocationSettingsResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsResult[] newArray(int i) {
            return new LocationSettingsResult[i];
        }
    }

    public LocationSettingsResult() {
    }

    protected LocationSettingsResult(Parcel parcel) {
        this.status = (Status) parcel.readParcelable(Status.class.getClassLoader());
        this.locationSettingsStates = (LocationSettingsStates) parcel.readParcelable(LocationSettingsStates.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return this.locationSettingsStates;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
        return this.status;
    }

    public void setLocationSettingsStates(LocationSettingsStates locationSettingsStates2) {
        this.locationSettingsStates = locationSettingsStates2;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.status, i);
        parcel.writeParcelable(this.locationSettingsStates, i);
    }
}
