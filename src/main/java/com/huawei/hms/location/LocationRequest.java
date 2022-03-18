package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LocationRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C23637a();
    private static final double FASTEST_INTERVAL_FACTOR = 6.0d;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HD_ACCURACY = 200;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_INDOOR = 300;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    @Packed
    private String countryCode;
    @Packed
    private long expirationTime;
    @Packed
    private Map<String, String> extras;
    @Packed
    private long fastestInterval;
    @Packed
    private long interval;
    @Packed
    private boolean isFastestIntervalExplicitlySet;
    @Packed
    private String language;
    @Packed
    private long maxWaitTime;
    @Packed
    private boolean needAddress;
    @Packed
    private int numUpdates;
    @Packed
    private int priority;
    @Packed
    private float smallestDisplacement;

    /* renamed from: com.huawei.hms.location.LocationRequest$a */
    static class C23637a implements Parcelable.Creator<LocationRequest> {
        C23637a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocationRequest createFromParcel(Parcel parcel) {
            return new LocationRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LocationRequest[] newArray(int i) {
            return new LocationRequest[i];
        }
    }

    public LocationRequest() {
        this.priority = 102;
        this.interval = 3600000;
        this.fastestInterval = (long) (((double) 3600000) / FASTEST_INTERVAL_FACTOR);
        this.isFastestIntervalExplicitlySet = false;
        this.expirationTime = Long.MAX_VALUE;
        this.numUpdates = Integer.MAX_VALUE;
        this.smallestDisplacement = BitmapDescriptorFactory.HUE_RED;
        this.maxWaitTime = 0;
        this.needAddress = false;
        this.language = "";
        this.countryCode = "";
    }

    protected LocationRequest(Parcel parcel) {
        this.priority = parcel.readInt();
        this.interval = parcel.readLong();
        this.fastestInterval = parcel.readLong();
        boolean z = true;
        this.isFastestIntervalExplicitlySet = parcel.readByte() != 0;
        this.expirationTime = parcel.readLong();
        this.numUpdates = parcel.readInt();
        this.smallestDisplacement = parcel.readFloat();
        this.maxWaitTime = parcel.readLong();
        this.needAddress = parcel.readByte() == 0 ? false : z;
        this.language = parcel.readString();
        this.countryCode = parcel.readString();
        HashMap hashMap = new HashMap();
        this.extras = hashMap;
        parcel.readMap(hashMap, LocationRequest.class.getClassLoader());
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj == null || LocationRequest.class != obj.getClass()) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        boolean z = this.expirationTime == locationRequest.expirationTime && this.isFastestIntervalExplicitlySet == locationRequest.isFastestIntervalExplicitlySet && this.fastestInterval == locationRequest.fastestInterval && this.interval == locationRequest.interval && this.maxWaitTime == locationRequest.maxWaitTime && this.numUpdates == locationRequest.numUpdates && this.priority == locationRequest.priority && this.needAddress == locationRequest.needAddress && Float.compare(this.smallestDisplacement, locationRequest.smallestDisplacement) == 0;
        String str3 = this.language;
        boolean z2 = str3 != null && (str2 = locationRequest.language) != null && z && str3.equals(str2);
        String str4 = this.countryCode;
        return str4 != null && (str = locationRequest.countryCode) != null && z2 && str4.equals(str);
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public long getExpirationTime() {
        return this.expirationTime;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public long getFastestInterval() {
        return this.fastestInterval;
    }

    public long getInterval() {
        return this.interval;
    }

    public String getLanguage() {
        return this.language;
    }

    public long getMaxWaitTime() {
        long j = this.maxWaitTime;
        long j2 = this.interval;
        return j < j2 ? j2 : j;
    }

    public boolean getNeedAddress() {
        return this.needAddress;
    }

    public int getNumUpdates() {
        return this.numUpdates;
    }

    public int getPriority() {
        return this.priority;
    }

    public float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.priority), Long.valueOf(this.interval), Long.valueOf(this.fastestInterval), Boolean.valueOf(this.isFastestIntervalExplicitlySet), Long.valueOf(this.expirationTime), Integer.valueOf(this.numUpdates), Float.valueOf(this.smallestDisplacement), Long.valueOf(this.maxWaitTime), Boolean.valueOf(this.needAddress), this.language, this.countryCode);
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.isFastestIntervalExplicitlySet;
    }

    public void putExtras(String str, String str2) {
        if (this.extras == null) {
            this.extras = new HashMap();
        }
        this.extras.put(str, str2);
    }

    public LocationRequest setCountryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.expirationTime = j2;
        if (j2 < 0) {
            j2 = 0;
        }
        this.expirationTime = j2;
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        if (j < 0) {
            j = 0;
        }
        this.expirationTime = j;
        return this;
    }

    public LocationRequest setFastestInterval(long j) throws IllegalArgumentException {
        if (j >= 0) {
            this.isFastestIntervalExplicitlySet = true;
            this.fastestInterval = j;
            return this;
        }
        throw new IllegalArgumentException("FastestInterval is invalid");
    }

    public LocationRequest setInterval(long j) throws IllegalArgumentException {
        if (j >= 0) {
            this.interval = j;
            this.fastestInterval = this.isFastestIntervalExplicitlySet ? this.fastestInterval : (long) (((double) j) / FASTEST_INTERVAL_FACTOR);
            return this;
        }
        throw new IllegalArgumentException("interval is invalid");
    }

    public LocationRequest setLanguage(String str) {
        this.language = str;
        return this;
    }

    public LocationRequest setMaxWaitTime(long j) {
        this.maxWaitTime = j;
        return this;
    }

    public LocationRequest setNeedAddress(boolean z) {
        this.needAddress = z;
        return this;
    }

    public LocationRequest setNumUpdates(int i) throws IllegalArgumentException {
        if (i > 0) {
            this.numUpdates = i;
            return this;
        }
        throw new IllegalArgumentException("numUpdates is invalid");
    }

    public LocationRequest setPriority(int i) {
        if (i == 102 || i == 100 || i == 104 || i == 105 || i == 200 || i == 300) {
            this.priority = i;
            return this;
        }
        throw new IllegalArgumentException("priority is not a known constant");
    }

    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.smallestDisplacement = f;
            return this;
        }
        throw new IllegalArgumentException("smallestDisplacement param invalid");
    }

    public String toString() {
        return "LocationRequest{priority=" + this.priority + ", interval=" + this.interval + ", fastestInterval=" + this.fastestInterval + ", isFastestIntervalExplicitlySet=" + this.isFastestIntervalExplicitlySet + ", expirationTime=" + this.expirationTime + ", numUpdates=" + this.numUpdates + ", smallestDisplacement=" + this.smallestDisplacement + ", maxWaitTime=" + this.maxWaitTime + ", needAddress=" + this.needAddress + ", language=" + this.language + ", countryCode=" + this.countryCode + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priority);
        parcel.writeLong(this.interval);
        parcel.writeLong(this.fastestInterval);
        parcel.writeByte(this.isFastestIntervalExplicitlySet ? (byte) 1 : 0);
        parcel.writeLong(this.expirationTime);
        parcel.writeInt(this.numUpdates);
        parcel.writeFloat(this.smallestDisplacement);
        parcel.writeLong(this.maxWaitTime);
        parcel.writeByte(this.needAddress ? (byte) 1 : 0);
        parcel.writeString(this.language);
        parcel.writeString(this.countryCode);
        parcel.writeMap(this.extras);
    }
}
