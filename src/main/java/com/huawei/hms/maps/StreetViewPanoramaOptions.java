package com.huawei.hms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.StreetViewPanoramaCamera;
import com.huawei.hms.maps.model.StreetViewSource;

public final class StreetViewPanoramaOptions implements Parcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new Parcelable.Creator<StreetViewPanoramaOptions>() {
        /* class com.huawei.hms.maps.StreetViewPanoramaOptions.C236941 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
            return new StreetViewPanoramaOptions((byte) 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StreetViewPanoramaOptions[] newArray(int i) {
            return new StreetViewPanoramaOptions[i];
        }
    };

    /* renamed from: a */
    private StreetViewPanoramaCamera f58578a;

    /* renamed from: b */
    private String f58579b;

    /* renamed from: c */
    private LatLng f58580c;

    /* renamed from: d */
    private Integer f58581d;

    /* renamed from: e */
    private Boolean f58582e = Boolean.TRUE;

    /* renamed from: f */
    private Boolean f58583f = Boolean.TRUE;

    /* renamed from: g */
    private Boolean f58584g = Boolean.TRUE;

    /* renamed from: h */
    private Boolean f58585h = Boolean.TRUE;

    /* renamed from: i */
    private Boolean f58586i;

    /* renamed from: j */
    private StreetViewSource f58587j;

    public StreetViewPanoramaOptions() {
    }

    protected StreetViewPanoramaOptions(byte b) {
    }

    public final int describeContents() {
        return 0;
    }

    public final Boolean getPanningGesturesEnabled() {
        return Boolean.FALSE;
    }

    public final String getPanoramaId() {
        return "";
    }

    public final LatLng getPosition() {
        return new LatLng(0.0d, 0.0d);
    }

    public final Integer getRadius() {
        return 0;
    }

    public final StreetViewSource getSource() {
        return this.f58587j;
    }

    public final Boolean getStreetNamesEnabled() {
        return Boolean.FALSE;
    }

    public final StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.f58578a;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return Boolean.FALSE;
    }

    public final Boolean getUserNavigationEnabled() {
        return Boolean.FALSE;
    }

    public final Boolean getZoomGesturesEnabled() {
        return Boolean.FALSE;
    }

    public final StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.f58584g = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f58578a = streetViewPanoramaCamera;
        return this;
    }

    public final StreetViewPanoramaOptions panoramaId(String str) {
        this.f58579b = str;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng) {
        this.f58580c = latLng;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.f58580c = latLng;
        this.f58587j = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.f58580c = latLng;
        this.f58581d = num;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.f58580c = latLng;
        this.f58581d = num;
        this.f58587j = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.f58585h = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return "";
    }

    public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.f58586i = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.f58582e = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f58583f = Boolean.valueOf(z);
        return this;
    }
}
