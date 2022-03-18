package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new C21960o();

    /* renamed from: a */
    private final List<LocationRequest> f53412a;

    /* renamed from: b */
    private final boolean f53413b;

    /* renamed from: c */
    private final boolean f53414c;

    /* renamed from: d */
    private zzae f53415d;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C21938a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f53416a = new ArrayList<>();

        /* renamed from: b */
        private boolean f53417b = false;

        /* renamed from: c */
        private boolean f53418c = false;

        /* renamed from: d */
        private zzae f53419d = null;

        /* renamed from: a */
        public final C21938a mo74335a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f53416a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest mo74336a() {
            return new LocationSettingsRequest(this.f53416a, this.f53417b, this.f53418c, null);
        }
    }

    LocationSettingsRequest(List<LocationRequest> list, boolean z, boolean z2, zzae zzae) {
        this.f53412a = list;
        this.f53413b = z;
        this.f53414c = z2;
        this.f53415d = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.f53412a), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f53413b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f53414c);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f53415d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
