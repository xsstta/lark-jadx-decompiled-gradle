package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.location.fence.GeofenceEntity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GeofenceRequest implements Parcelable, IMessageEntity {
    public static final int COORDINATE_TYPE_GCJ_02 = 0;
    public static final int COORDINATE_TYPE_WGS_84 = 1;
    public static final Parcelable.Creator<GeofenceRequest> CREATOR = new C23634a();
    public static final int DWELL_INIT_CONVERSION = 4;
    public static final int ENTER_INIT_CONVERSION = 1;
    public static final int EXIT_INIT_CONVERSION = 2;
    @Packed
    private int coordinateType;
    @Packed
    private List<GeofenceEntity> geofenceList;
    @Packed
    private int initConversions;

    public static final class Builder {

        /* renamed from: a */
        private final List<GeofenceEntity> f58378a = new ArrayList();

        /* renamed from: b */
        private int f58379b = 5;

        /* renamed from: c */
        private int f58380c = 1;

        public GeofenceRequest build() {
            Preconditions.checkArgument(!this.f58378a.isEmpty(), "No geofence has been added.");
            int i = this.f58380c;
            if (!(i == 0 || i == 1)) {
                this.f58380c = 1;
            }
            HashSet hashSet = new HashSet();
            for (GeofenceEntity geofenceEntity : this.f58378a) {
                hashSet.add(geofenceEntity.getUniqueId());
            }
            if (hashSet.size() == this.f58378a.size()) {
                int i2 = this.f58379b;
                if (((i2 & 7) != 0 || i2 == 0) && i2 >= 0) {
                    return new GeofenceRequest(this.f58378a, i2, this.f58380c);
                }
                throw new IllegalArgumentException("invalid initConversions");
            }
            throw new IllegalArgumentException("more than one geofence has same requestId.");
        }

        public Builder createGeofence(Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof GeofenceEntity, "Geofence must be instanceof GeofenceEntity");
            this.f58378a.add((GeofenceEntity) geofence);
            return this;
        }

        public Builder createGeofenceList(List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        createGeofence(geofence);
                    }
                }
            }
            return this;
        }

        public Builder setCoordinateType(int i) {
            this.f58380c = i;
            return this;
        }

        public Builder setInitConversions(int i) {
            this.f58379b = i;
            return this;
        }
    }

    /* renamed from: com.huawei.hms.location.GeofenceRequest$a */
    static class C23634a implements Parcelable.Creator<GeofenceRequest> {
        C23634a() {
        }

        @Override // android.os.Parcelable.Creator
        public GeofenceRequest createFromParcel(Parcel parcel) {
            return new GeofenceRequest(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public GeofenceRequest[] newArray(int i) {
            return new GeofenceRequest[i];
        }
    }

    public GeofenceRequest() {
    }

    private GeofenceRequest(Parcel parcel) {
        this.geofenceList = parcel.createTypedArrayList(GeofenceEntity.CREATOR);
        this.initConversions = parcel.readInt();
        this.coordinateType = parcel.readInt();
    }

    /* synthetic */ GeofenceRequest(Parcel parcel, C23634a aVar) {
        this(parcel);
    }

    GeofenceRequest(List<GeofenceEntity> list, int i, int i2) {
        this.geofenceList = list;
        this.initConversions = i;
        this.coordinateType = i2;
    }

    public int describeContents() {
        return 0;
    }

    public int getCoordinateType() {
        return this.coordinateType;
    }

    public List<Geofence> getGeofences() {
        List<GeofenceEntity> list = this.geofenceList;
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    public int getInitConversions() {
        return this.initConversions;
    }

    public String toString() {
        return "GeofenceRequest{geofenceList=" + this.geofenceList + ", initConversions=" + this.initConversions + ", coordinateType=" + this.coordinateType + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.geofenceList);
        parcel.writeInt(this.initConversions);
        parcel.writeInt(this.coordinateType);
    }
}
