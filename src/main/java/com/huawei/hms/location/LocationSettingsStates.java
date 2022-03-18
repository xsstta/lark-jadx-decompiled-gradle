package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.internal.safeparcel.SafeParcelableSerializer;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

public class LocationSettingsStates extends AbstractSafeParcelable implements IMessageEntity {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C23641a();
    @Packed
    private boolean blePresent;
    @Packed
    private boolean bleUsable;
    @Packed
    private boolean gnssPresent;
    @Packed
    private boolean gnssUsable;
    @Packed
    private boolean gpsPresent;
    @Packed
    private boolean gpsUsable;
    @Packed
    private boolean hmsLocationPresent = true;
    @Packed
    private boolean hmsLocationUsable = true;
    @Packed
    private boolean locationPresent;
    @Packed
    private boolean locationUsable;
    @Packed
    private boolean networkLocationPresent;
    @Packed
    private boolean networkLocationUsable;

    /* renamed from: com.huawei.hms.location.LocationSettingsStates$a */
    static class C23641a implements Parcelable.Creator<LocationSettingsStates> {
        C23641a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsStates createFromParcel(Parcel parcel) {
            return new LocationSettingsStates(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LocationSettingsStates[] newArray(int i) {
            return new LocationSettingsStates[i];
        }
    }

    public LocationSettingsStates() {
    }

    protected LocationSettingsStates(Parcel parcel) {
        boolean z = true;
        this.blePresent = parcel.readByte() != 0;
        this.bleUsable = parcel.readByte() != 0;
        this.gpsPresent = parcel.readByte() != 0;
        this.gpsUsable = parcel.readByte() != 0;
        this.locationPresent = parcel.readByte() != 0;
        this.locationUsable = parcel.readByte() != 0;
        this.networkLocationPresent = parcel.readByte() != 0;
        this.networkLocationUsable = parcel.readByte() != 0;
        this.hmsLocationUsable = parcel.readByte() != 0;
        this.hmsLocationPresent = parcel.readByte() != 0;
        this.gnssUsable = parcel.readByte() != 0;
        this.gnssPresent = parcel.readByte() == 0 ? false : z;
    }

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.gpsUsable = z;
        this.networkLocationUsable = z2;
        this.bleUsable = z3;
        this.gpsPresent = z4;
        this.networkLocationPresent = z5;
        this.blePresent = z6;
        this.hmsLocationUsable = z7;
        this.hmsLocationPresent = z8;
        this.gnssUsable = z;
        this.gnssPresent = z4;
    }

    public static LocationSettingsStates fromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        LocationSettingsStates locationSettingsStates = (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.huawei.hms.location.LOCATION_SETTINGS_STATES", CREATOR);
        locationSettingsStates.setGnssUsable(locationSettingsStates.isGpsUsable());
        locationSettingsStates.setGnssPresent(locationSettingsStates.isGpsPresent());
        return locationSettingsStates;
    }

    public boolean isBlePresent() {
        return this.blePresent;
    }

    public boolean isBleUsable() {
        return this.bleUsable;
    }

    public boolean isGnssPresent() {
        return this.gnssPresent;
    }

    public boolean isGnssUsable() {
        return this.gnssUsable;
    }

    public boolean isGpsPresent() {
        return this.gpsPresent;
    }

    public boolean isGpsUsable() {
        return this.gpsUsable;
    }

    public boolean isHMSLocationPresent() {
        return this.hmsLocationPresent;
    }

    public boolean isHMSLocationUsable() {
        return this.hmsLocationUsable;
    }

    public boolean isLocationPresent() {
        return this.locationPresent;
    }

    public boolean isLocationUsable() {
        return this.locationUsable;
    }

    public boolean isNetworkLocationPresent() {
        return this.networkLocationPresent;
    }

    public boolean isNetworkLocationUsable() {
        return this.networkLocationUsable;
    }

    public void setBlePresent(boolean z) {
        this.blePresent = z;
    }

    public void setBleUsable(boolean z) {
        this.bleUsable = z;
    }

    public void setGnssPresent(boolean z) {
        this.gnssPresent = z;
    }

    public void setGnssUsable(boolean z) {
        this.gnssUsable = z;
    }

    public void setGpsPresent(boolean z) {
        this.gpsPresent = z;
    }

    public void setGpsUsable(boolean z) {
        this.gpsUsable = z;
    }

    public void setHMSLocationPresent(boolean z) {
        this.hmsLocationPresent = z;
    }

    public void setHmsLocationUsable(boolean z) {
        this.hmsLocationUsable = z;
    }

    public void setLocationPresent(boolean z) {
        this.locationPresent = z;
    }

    public void setLocationUsable(boolean z) {
        this.locationUsable = z;
    }

    public void setNetworkLocationPresent(boolean z) {
        this.networkLocationPresent = z;
    }

    public void setNetworkLocationUsable(boolean z) {
        this.networkLocationUsable = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.writeBoolean(parcel, 7, isHMSLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 8, isHMSLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 9, isGnssUsable());
        SafeParcelWriter.writeBoolean(parcel, 10, isGnssPresent());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
