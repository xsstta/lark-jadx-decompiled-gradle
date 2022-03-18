package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.internal.C22026c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C22030k();

    /* renamed from: a */
    private Boolean f53458a;

    /* renamed from: b */
    private Boolean f53459b;

    /* renamed from: c */
    private int f53460c = -1;

    /* renamed from: d */
    private CameraPosition f53461d;

    /* renamed from: e */
    private Boolean f53462e;

    /* renamed from: f */
    private Boolean f53463f;

    /* renamed from: g */
    private Boolean f53464g;

    /* renamed from: h */
    private Boolean f53465h;

    /* renamed from: i */
    private Boolean f53466i;

    /* renamed from: j */
    private Boolean f53467j;

    /* renamed from: k */
    private Boolean f53468k;

    /* renamed from: l */
    private Boolean f53469l;

    /* renamed from: m */
    private Boolean f53470m;

    /* renamed from: n */
    private Float f53471n;

    /* renamed from: o */
    private Float f53472o;

    /* renamed from: p */
    private LatLngBounds f53473p;

    /* renamed from: q */
    private Boolean f53474q;

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.f53458a = C22026c.m79513a(b);
        this.f53459b = C22026c.m79513a(b2);
        this.f53460c = i;
        this.f53461d = cameraPosition;
        this.f53462e = C22026c.m79513a(b3);
        this.f53463f = C22026c.m79513a(b4);
        this.f53464g = C22026c.m79513a(b5);
        this.f53465h = C22026c.m79513a(b6);
        this.f53466i = C22026c.m79513a(b7);
        this.f53467j = C22026c.m79513a(b8);
        this.f53468k = C22026c.m79513a(b9);
        this.f53469l = C22026c.m79513a(b10);
        this.f53470m = C22026c.m79513a(b11);
        this.f53471n = f;
        this.f53472o = f2;
        this.f53473p = latLngBounds;
        this.f53474q = C22026c.m79513a(b12);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, C22026c.m79512a(this.f53458a));
        SafeParcelWriter.writeByte(parcel, 3, C22026c.m79512a(this.f53459b));
        SafeParcelWriter.writeInt(parcel, 4, mo74454a());
        SafeParcelWriter.writeParcelable(parcel, 5, mo74462b(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, C22026c.m79512a(this.f53462e));
        SafeParcelWriter.writeByte(parcel, 7, C22026c.m79512a(this.f53463f));
        SafeParcelWriter.writeByte(parcel, 8, C22026c.m79512a(this.f53464g));
        SafeParcelWriter.writeByte(parcel, 9, C22026c.m79512a(this.f53465h));
        SafeParcelWriter.writeByte(parcel, 10, C22026c.m79512a(this.f53466i));
        SafeParcelWriter.writeByte(parcel, 11, C22026c.m79512a(this.f53467j));
        SafeParcelWriter.writeByte(parcel, 12, C22026c.m79512a(this.f53468k));
        SafeParcelWriter.writeByte(parcel, 14, C22026c.m79512a(this.f53469l));
        SafeParcelWriter.writeByte(parcel, 15, C22026c.m79512a(this.f53470m));
        SafeParcelWriter.writeFloatObject(parcel, 16, mo74464c(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, mo74466d(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, mo74468e(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, C22026c.m79512a(this.f53474q));
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GoogleMapOptions() {
    }

    /* renamed from: a */
    public final GoogleMapOptions mo74459a(boolean z) {
        this.f53458a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo74461b(boolean z) {
        this.f53459b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo74456a(int i) {
        this.f53460c = i;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo74457a(CameraPosition cameraPosition) {
        this.f53461d = cameraPosition;
        return this;
    }

    /* renamed from: c */
    public final GoogleMapOptions mo74463c(boolean z) {
        this.f53462e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final GoogleMapOptions mo74465d(boolean z) {
        this.f53463f = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final GoogleMapOptions mo74467e(boolean z) {
        this.f53464g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public final GoogleMapOptions mo74469f(boolean z) {
        this.f53465h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public final GoogleMapOptions mo74470g(boolean z) {
        this.f53466i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    public final GoogleMapOptions mo74471h(boolean z) {
        this.f53467j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: i */
    public final GoogleMapOptions mo74472i(boolean z) {
        this.f53474q = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: j */
    public final GoogleMapOptions mo74473j(boolean z) {
        this.f53468k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: k */
    public final GoogleMapOptions mo74474k(boolean z) {
        this.f53469l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: l */
    public final GoogleMapOptions mo74475l(boolean z) {
        this.f53470m = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo74455a(float f) {
        this.f53471n = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo74460b(float f) {
        this.f53472o = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo74458a(LatLngBounds latLngBounds) {
        this.f53473p = latLngBounds;
        return this;
    }

    /* renamed from: a */
    public final int mo74454a() {
        return this.f53460c;
    }

    /* renamed from: b */
    public final CameraPosition mo74462b() {
        return this.f53461d;
    }

    /* renamed from: c */
    public final Float mo74464c() {
        return this.f53471n;
    }

    /* renamed from: d */
    public final Float mo74466d() {
        return this.f53472o;
    }

    /* renamed from: e */
    public final LatLngBounds mo74468e() {
        return this.f53473p;
    }

    /* renamed from: a */
    public static GoogleMapOptions m79370a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.ambientEnabled, R.attr.cameraBearing, R.attr.cameraMaxZoomPreference, R.attr.cameraMinZoomPreference, R.attr.cameraTargetLat, R.attr.cameraTargetLng, R.attr.cameraTilt, R.attr.cameraZoom, R.attr.latLngBoundsNorthEastLatitude, R.attr.latLngBoundsNorthEastLongitude, R.attr.latLngBoundsSouthWestLatitude, R.attr.latLngBoundsSouthWestLongitude, R.attr.liteMode, R.attr.mapType, R.attr.uiCompass, R.attr.uiMapToolbar, R.attr.uiRotateGestures, R.attr.uiScrollGestures, R.attr.uiScrollGesturesDuringRotateOrZoom, R.attr.uiTiltGestures, R.attr.uiZoomControls, R.attr.uiZoomGestures, R.attr.useViewLifecycle, R.attr.zOrderOnTop});
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.mo74456a(obtainAttributes.getInt(13, -1));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.mo74459a(obtainAttributes.getBoolean(23, false));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.mo74461b(obtainAttributes.getBoolean(22, false));
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.mo74465d(obtainAttributes.getBoolean(14, true));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.mo74471h(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.mo74472i(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.mo74467e(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.mo74470g(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.mo74469f(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.mo74463c(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.mo74473j(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.mo74474k(obtainAttributes.getBoolean(15, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.mo74475l(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.mo74455a(obtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.mo74460b(obtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.mo74458a(m79371b(context, attributeSet));
        googleMapOptions.mo74457a(m79372c(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: b */
    public static LatLngBounds m79371b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.ambientEnabled, R.attr.cameraBearing, R.attr.cameraMaxZoomPreference, R.attr.cameraMinZoomPreference, R.attr.cameraTargetLat, R.attr.cameraTargetLng, R.attr.cameraTilt, R.attr.cameraZoom, R.attr.latLngBoundsNorthEastLatitude, R.attr.latLngBoundsNorthEastLongitude, R.attr.latLngBoundsSouthWestLatitude, R.attr.latLngBoundsSouthWestLongitude, R.attr.liteMode, R.attr.mapType, R.attr.uiCompass, R.attr.uiMapToolbar, R.attr.uiRotateGestures, R.attr.uiScrollGestures, R.attr.uiScrollGesturesDuringRotateOrZoom, R.attr.uiTiltGestures, R.attr.uiZoomControls, R.attr.uiZoomGestures, R.attr.useViewLifecycle, R.attr.zOrderOnTop});
        Float valueOf = obtainAttributes.hasValue(10) ? Float.valueOf(obtainAttributes.getFloat(10, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf2 = obtainAttributes.hasValue(11) ? Float.valueOf(obtainAttributes.getFloat(11, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf3 = obtainAttributes.hasValue(8) ? Float.valueOf(obtainAttributes.getFloat(8, BitmapDescriptorFactory.HUE_RED)) : null;
        Float valueOf4 = obtainAttributes.hasValue(9) ? Float.valueOf(obtainAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    /* renamed from: c */
    public static CameraPosition m79372c(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.ambientEnabled, R.attr.cameraBearing, R.attr.cameraMaxZoomPreference, R.attr.cameraMinZoomPreference, R.attr.cameraTargetLat, R.attr.cameraTargetLng, R.attr.cameraTilt, R.attr.cameraZoom, R.attr.latLngBoundsNorthEastLatitude, R.attr.latLngBoundsNorthEastLongitude, R.attr.latLngBoundsSouthWestLatitude, R.attr.latLngBoundsSouthWestLongitude, R.attr.liteMode, R.attr.mapType, R.attr.uiCompass, R.attr.uiMapToolbar, R.attr.uiRotateGestures, R.attr.uiScrollGestures, R.attr.uiScrollGesturesDuringRotateOrZoom, R.attr.uiTiltGestures, R.attr.uiZoomControls, R.attr.uiZoomGestures, R.attr.useViewLifecycle, R.attr.zOrderOnTop});
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(4) ? obtainAttributes.getFloat(4, BitmapDescriptorFactory.HUE_RED) : BitmapDescriptorFactory.HUE_RED), (double) (obtainAttributes.hasValue(5) ? obtainAttributes.getFloat(5, BitmapDescriptorFactory.HUE_RED) : BitmapDescriptorFactory.HUE_RED));
        CameraPosition.C22033a a = CameraPosition.m79527a();
        a.mo74781a(latLng);
        if (obtainAttributes.hasValue(7)) {
            a.mo74780a(obtainAttributes.getFloat(7, BitmapDescriptorFactory.HUE_RED));
        }
        if (obtainAttributes.hasValue(1)) {
            a.mo74784c(obtainAttributes.getFloat(1, BitmapDescriptorFactory.HUE_RED));
        }
        if (obtainAttributes.hasValue(6)) {
            a.mo74783b(obtainAttributes.getFloat(6, BitmapDescriptorFactory.HUE_RED));
        }
        obtainAttributes.recycle();
        return a.mo74782a();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.f53460c)).add("LiteMode", this.f53468k).add("Camera", this.f53461d).add("CompassEnabled", this.f53463f).add("ZoomControlsEnabled", this.f53462e).add("ScrollGesturesEnabled", this.f53464g).add("ZoomGesturesEnabled", this.f53465h).add("TiltGesturesEnabled", this.f53466i).add("RotateGesturesEnabled", this.f53467j).add("ScrollGesturesEnabledDuringRotateOrZoom", this.f53474q).add("MapToolbarEnabled", this.f53469l).add("AmbientEnabled", this.f53470m).add("MinZoomPreference", this.f53471n).add("MaxZoomPreference", this.f53472o).add("LatLngBoundsForCameraTarget", this.f53473p).add("ZOrderOnTop", this.f53458a).add("UseViewLifecycleInFragment", this.f53459b).toString();
    }
}
