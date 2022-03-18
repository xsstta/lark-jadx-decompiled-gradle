package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.util.Objects;

public class GroundOverlayOptions implements Parcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new Parcelable.Creator<GroundOverlayOptions>() {
        /* class com.huawei.hms.maps.model.GroundOverlayOptions.C237121 */

        @Override // android.os.Parcelable.Creator
        public final GroundOverlayOptions createFromParcel(Parcel parcel) {
            return new GroundOverlayOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroundOverlayOptions[] newArray(int i) {
            return new GroundOverlayOptions[i];
        }
    };
    public static final float NO_DIMENSION = -1.0f;

    /* renamed from: a */
    private float f58733a = 0.5f;

    /* renamed from: b */
    private float f58734b = 0.5f;

    /* renamed from: c */
    private float f58735c;

    /* renamed from: d */
    private LatLngBounds f58736d;

    /* renamed from: e */
    private float f58737e;

    /* renamed from: f */
    private BitmapDescriptor f58738f;

    /* renamed from: g */
    private LatLng f58739g;

    /* renamed from: h */
    private float f58740h;

    /* renamed from: i */
    private float f58741i;

    /* renamed from: j */
    private float f58742j;

    /* renamed from: k */
    private boolean f58743k;

    /* renamed from: l */
    private boolean f58744l = true;

    public GroundOverlayOptions() {
    }

    protected GroundOverlayOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58733a = parcelReader.readFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.f58734b = parcelReader.readFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.f58735c = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
        this.f58736d = (LatLngBounds) parcelReader.readParcelable(5, LatLngBounds.CREATOR, null);
        this.f58737e = parcelReader.readFloat(6, BitmapDescriptorFactory.HUE_RED);
        IBinder readIBinder = parcelReader.readIBinder(7, null);
        if (readIBinder != null) {
            this.f58738f = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
        }
        this.f58739g = (LatLng) parcelReader.readParcelable(8, LatLng.CREATOR, null);
        this.f58740h = parcelReader.readFloat(9, BitmapDescriptorFactory.HUE_RED);
        this.f58741i = parcelReader.readFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.f58742j = parcelReader.readFloat(11, BitmapDescriptorFactory.HUE_RED);
        this.f58743k = parcelReader.readBoolean(12, true);
        this.f58744l = parcelReader.readBoolean(13, true);
    }

    /* renamed from: a */
    private static boolean m86902a(float f) {
        return f < BitmapDescriptorFactory.HUE_RED;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.f58733a = f;
        this.f58734b = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.f58735c = f;
        return this;
    }

    public GroundOverlayOptions clickable(boolean z) {
        this.f58743k = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.f58733a;
    }

    public float getAnchorV() {
        return this.f58734b;
    }

    public float getBearing() {
        return this.f58735c;
    }

    public LatLngBounds getBounds() {
        return this.f58736d;
    }

    public float getHeight() {
        return this.f58737e;
    }

    public BitmapDescriptor getImage() {
        return this.f58738f;
    }

    public LatLng getLocation() {
        return this.f58739g;
    }

    public float getTransparency() {
        return this.f58740h;
    }

    public float getWidth() {
        return this.f58741i;
    }

    public float getZIndex() {
        return this.f58742j;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        Objects.requireNonNull(bitmapDescriptor, "image descriptor can not be null.");
        this.f58738f = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.f58743k;
    }

    public boolean isSetPosition() {
        return (this.f58736d == null && this.f58739g == null) ? false : true;
    }

    public boolean isVisible() {
        return this.f58744l;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        if (this.f58739g != null || this.f58736d != null) {
            throw new IllegalStateException("GroundOverlay location is illegal,position has been set positionFromBounds function,this value can not reassign.");
        } else if (latLng == null) {
            throw new IllegalArgumentException("Location must be specified");
        } else if (!m86902a(f)) {
            this.f58739g = latLng;
            this.f58741i = f;
            this.f58737e = -1.0f;
            return this;
        } else {
            throw new IllegalArgumentException("GroundOverlay width value is illegal ,this value must be non-negative");
        }
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        if (this.f58739g != null || this.f58736d != null) {
            throw new IllegalStateException("GroundOverlay location is illegal,position has been set by positionFromBounds function,this value can not reassign.");
        } else if (m86902a(f)) {
            throw new IllegalArgumentException("GroundOverlay width value is illegal ,this value must be non-negative");
        } else if (m86902a(f2)) {
            throw new IllegalArgumentException("GroundOverlay height value is illegal,this value must be non-negative");
        } else if (latLng != null) {
            this.f58739g = latLng;
            this.f58741i = f;
            this.f58737e = f2;
            return this;
        } else {
            throw new IllegalArgumentException("Location must be specified");
        }
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        if (this.f58739g == null) {
            this.f58736d = latLngBounds;
            return this;
        }
        throw new IllegalStateException("Set position from LatLngBounds failed,position has been set by position function,this value can not reassign.");
    }

    public GroundOverlayOptions transparency(float f) {
        if (f > 1.0f) {
            throw new IllegalArgumentException("The transparency value  is illegal,this value must be less than 1");
        } else if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f58740h = f;
            return this;
        } else {
            throw new IllegalArgumentException("The transparency value  is illegal,this value must be greater than 0");
        }
    }

    public GroundOverlayOptions visible(boolean z) {
        this.f58744l = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.f58733a);
        parcelWrite.writeFloat(3, this.f58734b);
        parcelWrite.writeFloat(4, this.f58735c);
        parcelWrite.writeParcelable(5, this.f58736d, i, false);
        parcelWrite.writeFloat(6, this.f58737e);
        parcelWrite.writeIBinder(7, this.f58738f.getObject().asBinder(), false);
        parcelWrite.writeParcelable(8, this.f58739g, i, false);
        parcelWrite.writeFloat(9, this.f58740h);
        parcelWrite.writeFloat(10, this.f58741i);
        parcelWrite.writeFloat(11, this.f58742j);
        parcelWrite.writeBoolean(12, this.f58743k);
        parcelWrite.writeBoolean(13, this.f58744l);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public GroundOverlayOptions zIndex(float f) {
        this.f58742j = f;
        return this;
    }
}
