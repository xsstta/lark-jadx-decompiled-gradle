package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LocationSettingsRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C23639a();
    @Packed
    public boolean alwaysShow;
    @Packed
    public boolean needBle;
    @Packed
    public List<LocationRequest> requests;

    public static class Builder {

        /* renamed from: a */
        private List<LocationRequest> f58383a = new ArrayList();

        /* renamed from: b */
        private boolean f58384b = false;

        /* renamed from: c */
        private boolean f58385c = false;

        public Builder addAllLocationRequests(Collection<LocationRequest> collection) {
            this.f58383a.addAll(collection);
            return this;
        }

        public Builder addLocationRequest(LocationRequest locationRequest) {
            this.f58383a.add(locationRequest);
            return this;
        }

        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.f58383a, this.f58384b, this.f58385c, null);
        }

        public Builder setAlwaysShow(boolean z) {
            this.f58384b = z;
            return this;
        }

        public Builder setNeedBle(boolean z) {
            this.f58385c = z;
            return this;
        }
    }

    /* renamed from: com.huawei.hms.location.LocationSettingsRequest$a */
    static class C23639a implements Parcelable.Creator<LocationSettingsRequest> {
        C23639a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsRequest createFromParcel(Parcel parcel) {
            return new LocationSettingsRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsRequest[] newArray(int i) {
            return new LocationSettingsRequest[i];
        }
    }

    private LocationSettingsRequest() {
    }

    protected LocationSettingsRequest(Parcel parcel) {
        boolean z = true;
        this.alwaysShow = parcel.readByte() != 0;
        this.needBle = parcel.readByte() == 0 ? false : z;
    }

    private LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2) {
        this.requests = list;
        this.alwaysShow = z;
        this.needBle = z2;
    }

    /* synthetic */ LocationSettingsRequest(List list, boolean z, boolean z2, C23639a aVar) {
        this(list, z, z2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.requests);
        parcel.writeByte(this.alwaysShow ? (byte) 1 : 0);
        parcel.writeByte(this.needBle ? (byte) 1 : 0);
    }
}
