package com.huawei.hms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.locationSdk.w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocationResult implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationResult> CREATOR = new C23638a();
    private static final String EXTRA_KEY = "com.huawei.hms.location.EXTRA_LOCATION_RESULT";
    private static final String TAG = "LocationResult";
    @Packed
    private List<HWLocation> locations;

    /* renamed from: com.huawei.hms.location.LocationResult$a */
    static class C23638a implements Parcelable.Creator<LocationResult> {
        C23638a() {
        }

        @Override // android.os.Parcelable.Creator
        public LocationResult createFromParcel(Parcel parcel) {
            return new LocationResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LocationResult[] newArray(int i) {
            return new LocationResult[i];
        }
    }

    protected LocationResult(Parcel parcel) {
        this.locations = parcel.createTypedArrayList(HWLocation.CREATOR);
    }

    LocationResult(List<HWLocation> list) {
        this.locations = list;
    }

    public static LocationResult create(List<HWLocation> list) {
        return new LocationResult(list);
    }

    public static LocationResult extractResult(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            if (!intent.hasExtra(EXTRA_KEY)) {
                return null;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra(EXTRA_KEY);
            if (!(parcelableExtra instanceof LocationResult)) {
                if (!(parcelableExtra instanceof Bundle)) {
                    return null;
                }
                parcelableExtra = ((Bundle) parcelableExtra).getParcelable(EXTRA_KEY);
            }
            return (LocationResult) parcelableExtra;
        } catch (Exception unused) {
            Log.e(TAG, "get extra exception");
            return null;
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(EXTRA_KEY);
        } catch (Exception unused) {
            Log.e(TAG, "check extra exception");
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LocationResult.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.locations, ((LocationResult) obj).locations);
    }

    public final List<HWLocation> getHWLocationList() {
        return this.locations;
    }

    public final HWLocation getLastHWLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return this.locations.get(size - 1);
    }

    public final Location getLastLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return w0.m86118a(this.locations.get(size - 1));
    }

    public final List<Location> getLocations() {
        ArrayList arrayList = new ArrayList();
        for (HWLocation hWLocation : this.locations) {
            Location a = w0.m86118a(hWLocation);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return Objects.hash(this.locations);
    }

    public String toString() {
        return "LocationResult{locations=" + this.locations + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.locations);
    }
}
