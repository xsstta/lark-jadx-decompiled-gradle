package com.huawei.hms.support.api.entity.location.fence;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.Geofence;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class GeofenceEntity implements Parcelable, IMessageEntity, Geofence {
    public static final Parcelable.Creator<GeofenceEntity> CREATOR = new C23794a();
    @Packed
    private int conversions;
    @Packed
    private int dwellDelayTime;
    @Packed
    private double latitude;
    @Packed
    private double longitude;
    @Packed
    private int notificationInterval;
    @Packed
    private float radius;
    @Packed
    private String uniqueId;
    @Packed
    private long validDuration;

    /* renamed from: com.huawei.hms.support.api.entity.location.fence.GeofenceEntity$a */
    static class C23794a implements Parcelable.Creator<GeofenceEntity> {
        C23794a() {
        }

        @Override // android.os.Parcelable.Creator
        public GeofenceEntity createFromParcel(Parcel parcel) {
            return new GeofenceEntity(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public GeofenceEntity[] newArray(int i) {
            return new GeofenceEntity[i];
        }
    }

    private GeofenceEntity(Parcel parcel) {
        this.dwellDelayTime = -1;
        this.uniqueId = parcel.readString();
        this.conversions = parcel.readInt();
        this.validDuration = parcel.readLong();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.radius = parcel.readFloat();
        this.notificationInterval = parcel.readInt();
        this.dwellDelayTime = parcel.readInt();
    }

    /* synthetic */ GeofenceEntity(Parcel parcel, C23794a aVar) {
        this(parcel);
    }

    public GeofenceEntity(String str, int i, double d, double d2, float f, long j, int i2, int i3) {
        this.dwellDelayTime = -1;
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            throw new IllegalArgumentException(TextUtils.isEmpty(str) ? "uniqueId is null" : "uniqueId is too long: ".concat(str));
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("invalid radius: " + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude");
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude");
        } else if ((i & 7) != 0) {
            this.uniqueId = str;
            this.latitude = d;
            this.longitude = d2;
            this.radius = f;
            this.validDuration = j;
            this.conversions = i;
            this.notificationInterval = i2;
            this.dwellDelayTime = i3;
        } else {
            throw new IllegalArgumentException("invalid conversions: " + i);
        }
    }

    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.location.Geofence
    public final String getUniqueId() {
        return this.uniqueId;
    }

    public String toString() {
        return "GeofenceEntity{uniqueId='" + this.uniqueId + '\'' + ", conversions=" + this.conversions + ", validDuration=" + this.validDuration + ", radius=" + this.radius + ", notificationInterval=" + this.notificationInterval + ", dwellDelayTime=" + this.dwellDelayTime + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uniqueId);
        parcel.writeInt(this.conversions);
        parcel.writeLong(this.validDuration);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeFloat(this.radius);
        parcel.writeInt(this.notificationInterval);
        parcel.writeInt(this.dwellDelayTime);
    }
}
