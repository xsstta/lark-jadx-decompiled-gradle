package com.huawei.hms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.api.R$styleable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;

public final class HuaweiMapOptions implements Parcelable {
    public static final Parcelable.Creator<HuaweiMapOptions> CREATOR = new Parcelable.Creator<HuaweiMapOptions>() {
        /* class com.huawei.hms.maps.HuaweiMapOptions.C236871 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HuaweiMapOptions createFromParcel(Parcel parcel) {
            return new HuaweiMapOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HuaweiMapOptions[] newArray(int i) {
            return new HuaweiMapOptions[i];
        }
    };

    /* renamed from: a */
    private int f58501a = -1;

    /* renamed from: b */
    private Boolean f58502b;

    /* renamed from: c */
    private Boolean f58503c;

    /* renamed from: d */
    private CameraPosition f58504d;

    /* renamed from: e */
    private Boolean f58505e = Boolean.TRUE;

    /* renamed from: f */
    private Boolean f58506f = Boolean.TRUE;

    /* renamed from: g */
    private Boolean f58507g = Boolean.TRUE;

    /* renamed from: h */
    private Boolean f58508h = Boolean.TRUE;

    /* renamed from: i */
    private Boolean f58509i = Boolean.TRUE;

    /* renamed from: j */
    private Boolean f58510j = Boolean.TRUE;

    /* renamed from: k */
    private Boolean f58511k = Boolean.FALSE;

    /* renamed from: l */
    private Boolean f58512l;

    /* renamed from: m */
    private Boolean f58513m;

    /* renamed from: n */
    private Float f58514n = Float.valueOf(3.0f);

    /* renamed from: o */
    private Float f58515o = Float.valueOf(20.0f);

    /* renamed from: p */
    private LatLngBounds f58516p = null;

    /* renamed from: q */
    private Boolean f58517q;

    public HuaweiMapOptions() {
    }

    protected HuaweiMapOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58501a = parcelReader.readInt(2, this.f58501a);
        this.f58502b = parcelReader.readBooleanObject(3, null);
        this.f58503c = parcelReader.readBooleanObject(4, null);
        this.f58505e = parcelReader.readBooleanObject(5, null);
        this.f58506f = parcelReader.readBooleanObject(6, null);
        this.f58507g = parcelReader.readBooleanObject(7, null);
        this.f58508h = parcelReader.readBooleanObject(8, null);
        this.f58509i = parcelReader.readBooleanObject(9, null);
        this.f58510j = parcelReader.readBooleanObject(10, null);
        this.f58511k = parcelReader.readBooleanObject(11, null);
        this.f58512l = parcelReader.readBooleanObject(12, null);
        this.f58513m = parcelReader.readBooleanObject(13, null);
        this.f58514n = parcelReader.readFloatObject(14, null);
        this.f58515o = parcelReader.readFloatObject(15, null);
        this.f58516p = (LatLngBounds) parcelReader.readParcelable(16, LatLngBounds.CREATOR, null);
        this.f58504d = (CameraPosition) parcelReader.readParcelable(17, CameraPosition.CREATOR, null);
        this.f58517q = parcelReader.readBooleanObject(18, null);
    }

    public static CameraPosition buildCameraPosition(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(R$styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(R$styleable.MapAttrs_cameraTargetLat, BitmapDescriptorFactory.HUE_RED) : BitmapDescriptorFactory.HUE_RED), (double) (obtainAttributes.hasValue(R$styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(R$styleable.MapAttrs_cameraTargetLng, BitmapDescriptorFactory.HUE_RED) : BitmapDescriptorFactory.HUE_RED));
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(R$styleable.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(R$styleable.MapAttrs_cameraZoom, BitmapDescriptorFactory.HUE_RED));
        }
        if (obtainAttributes.hasValue(R$styleable.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(R$styleable.MapAttrs_cameraBearing, BitmapDescriptorFactory.HUE_RED));
        }
        if (obtainAttributes.hasValue(R$styleable.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(R$styleable.MapAttrs_cameraTilt, BitmapDescriptorFactory.HUE_RED));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds buildLatLngBounds(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(R$styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(R$styleable.MapAttrs_latLngBoundsSouthWestLatitude, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf2 = obtainAttributes.hasValue(R$styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(R$styleable.MapAttrs_latLngBoundsSouthWestLongitude, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf3 = obtainAttributes.hasValue(R$styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(R$styleable.MapAttrs_latLngBoundsNorthEastLatitude, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf4 = obtainAttributes.hasValue(R$styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(R$styleable.MapAttrs_latLngBoundsNorthEastLongitude, BitmapDescriptorFactory.HUE_RED)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static HuaweiMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        HuaweiMapOptions huaweiMapOptions = new HuaweiMapOptions();
        if (attributeSet == null) {
            mcq.m86886b("ContentValues", "createFromAttributes() attrs is null");
            return huaweiMapOptions;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MapAttrs, 0, 0);
        try {
            int i = obtainStyledAttributes.getInt(R$styleable.MapAttrs_mapType, 1);
            mcq.m86886b("ContentValues", "createFromAttributes() mapyType is ".concat(String.valueOf(i)));
            if (i == 0) {
                huaweiMapOptions.f58501a = 0;
            } else {
                huaweiMapOptions.f58501a = 1;
            }
            huaweiMapOptions.f58504d = CameraPosition.createFromAttributes(context, attributeSet);
            huaweiMapOptions.f58505e = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiZoomControls, true));
            huaweiMapOptions.f58506f = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiCompass, true));
            if (obtainStyledAttributes.hasValue(R$styleable.MapAttrs_uiZoomGestures)) {
                huaweiMapOptions.f58508h = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiZoomGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.MapAttrs_uiScrollGestures)) {
                huaweiMapOptions.f58507g = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiScrollGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.MapAttrs_uiRotateGestures)) {
                huaweiMapOptions.f58510j = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiRotateGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R$styleable.MapAttrs_uiTiltGestures)) {
                huaweiMapOptions.f58509i = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiTiltGestures, true));
            }
            huaweiMapOptions.f58502b = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_zOrderOnTop, false));
            huaweiMapOptions.f58503c = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_useViewLifecycle, true));
            huaweiMapOptions.f58511k = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_liteMode, false));
            huaweiMapOptions.f58517q = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, false));
            huaweiMapOptions.f58512l = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_uiMapToolbar, false));
            huaweiMapOptions.f58513m = Boolean.valueOf(obtainStyledAttributes.getBoolean(R$styleable.MapAttrs_ambientEnabled, false));
            huaweiMapOptions.f58514n = Float.valueOf(obtainStyledAttributes.getFloat(R$styleable.MapAttrs_cameraMinZoomPreference, BitmapDescriptorFactory.HUE_RED));
            huaweiMapOptions.f58515o = Float.valueOf(obtainStyledAttributes.getFloat(R$styleable.MapAttrs_cameraMaxZoomPreference, 22.0f));
            huaweiMapOptions.latLngBoundsForCameraTarget(buildLatLngBounds(context, attributeSet));
            return huaweiMapOptions;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final HuaweiMapOptions ambientEnabled(boolean z) {
        this.f58513m = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions camera(CameraPosition cameraPosition) {
        this.f58504d = cameraPosition;
        return this;
    }

    public final HuaweiMapOptions compassEnabled(boolean z) {
        this.f58506f = Boolean.valueOf(z);
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final Boolean getAmbientEnabled() {
        return Boolean.FALSE;
    }

    public final CameraPosition getCamera() {
        return this.f58504d;
    }

    public final Boolean getCompassEnabled() {
        return this.f58506f;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.f58516p;
    }

    public final Boolean getLiteMode() {
        return this.f58511k;
    }

    public final Boolean getMapToolbarEnabled() {
        return Boolean.FALSE;
    }

    public final int getMapType() {
        return this.f58501a;
    }

    public final Float getMaxZoomPreference() {
        return this.f58515o;
    }

    public final Float getMinZoomPreference() {
        return this.f58514n;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.f58510j;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.f58507g;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.f58509i;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.f58503c;
    }

    public final Boolean getZOrderOnTop() {
        return this.f58502b;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.f58505e;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.f58508h;
    }

    public final HuaweiMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.f58516p = latLngBounds;
        return this;
    }

    public final HuaweiMapOptions liteMode(boolean z) {
        this.f58511k = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions mapToolbarEnabled(boolean z) {
        this.f58512l = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions mapType(int i) {
        this.f58501a = i;
        return this;
    }

    public final HuaweiMapOptions maxZoomPreference(float f) {
        this.f58515o = Float.valueOf(f);
        return this;
    }

    public final HuaweiMapOptions minZoomPreference(float f) {
        this.f58514n = Float.valueOf(f);
        return this;
    }

    public final HuaweiMapOptions rotateGesturesEnabled(boolean z) {
        this.f58510j = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions scrollGesturesEnabled(boolean z) {
        this.f58507g = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions tiltGesturesEnabled(boolean z) {
        this.f58509i = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return "HuaweiMapOptions{mapType=" + this.f58501a + ", zOrderOnTop=" + this.f58502b + ", isUseViewLifecycleInFragment=" + this.f58503c + ", cameraPosition=" + this.f58504d + ", isZoomControlsEnabled=" + this.f58505e + ", isCompassEnabled=" + this.f58506f + ", isScrollGesturesEnabled=" + this.f58507g + ", isZoomGesturesEnabled=" + this.f58508h + ", isTiltGesturesEnabled=" + this.f58509i + ", isRotateGesturesEnabled=" + this.f58510j + ", isLiteMode=" + this.f58511k + ", isMapToolbarEnabled=" + this.f58512l + ", isAmbientEnabled=" + this.f58513m + ", minZoomLevel=" + this.f58514n + ", maxZoomLevel=" + this.f58515o + ", latLngBounds=" + this.f58516p + '}';
    }

    public final HuaweiMapOptions useViewLifecycleInFragment(boolean z) {
        this.f58503c = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f58501a);
        parcelWrite.writeBooleanObject(3, this.f58502b);
        parcelWrite.writeBooleanObject(4, this.f58503c);
        parcelWrite.writeBooleanObject(5, this.f58505e);
        parcelWrite.writeBooleanObject(6, this.f58506f);
        parcelWrite.writeBooleanObject(7, this.f58507g);
        parcelWrite.writeBooleanObject(8, this.f58508h);
        parcelWrite.writeBooleanObject(9, this.f58509i);
        parcelWrite.writeBooleanObject(10, this.f58510j);
        parcelWrite.writeBooleanObject(11, this.f58511k);
        parcelWrite.writeBooleanObject(12, this.f58512l);
        parcelWrite.writeBooleanObject(13, this.f58513m);
        parcelWrite.writeFloatObject(14, this.f58514n, true);
        parcelWrite.writeFloatObject(15, this.f58515o, true);
        parcelWrite.writeParcelable(16, this.f58516p, i, false);
        parcelWrite.writeParcelable(17, this.f58504d, i, false);
        parcelWrite.writeBooleanObject(18, this.f58517q);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public final HuaweiMapOptions zOrderOnTop(boolean z) {
        this.f58502b = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions zoomControlsEnabled(boolean z) {
        this.f58505e = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions zoomGesturesEnabled(boolean z) {
        this.f58508h = Boolean.valueOf(z);
        return this;
    }
}
