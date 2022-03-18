package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;

public class MarkerOptions implements Parcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new Parcelable.Creator<MarkerOptions>() {
        /* class com.huawei.hms.maps.model.MarkerOptions.C237171 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
            return new MarkerOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MarkerOptions[] newArray(int i) {
            return new MarkerOptions[i];
        }
    };

    /* renamed from: a */
    private LatLng f58755a;

    /* renamed from: b */
    private String f58756b;

    /* renamed from: c */
    private String f58757c;

    /* renamed from: d */
    private BitmapDescriptor f58758d;

    /* renamed from: e */
    private float f58759e = 0.5f;

    /* renamed from: f */
    private float f58760f = 1.0f;

    /* renamed from: g */
    private boolean f58761g;

    /* renamed from: h */
    private boolean f58762h = true;

    /* renamed from: i */
    private boolean f58763i;

    /* renamed from: j */
    private float f58764j;

    /* renamed from: k */
    private float f58765k = 0.5f;

    /* renamed from: l */
    private float f58766l;

    /* renamed from: m */
    private float f58767m = 1.0f;

    /* renamed from: n */
    private float f58768n;

    /* renamed from: o */
    private boolean f58769o;

    /* renamed from: p */
    private float f58770p = 0.5f;

    /* renamed from: q */
    private float f58771q = 1.0f;

    /* renamed from: r */
    private boolean f58772r = true;

    public MarkerOptions() {
    }

    protected MarkerOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58755a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.f58756b = parcelReader.createString(3, null);
        this.f58757c = parcelReader.createString(4, null);
        this.f58759e = parcelReader.readFloat(5, BitmapDescriptorFactory.HUE_RED);
        this.f58760f = parcelReader.readFloat(6, BitmapDescriptorFactory.HUE_RED);
        this.f58761g = parcelReader.readBoolean(7, true);
        this.f58762h = parcelReader.readBoolean(8, true);
        this.f58763i = parcelReader.readBoolean(9, true);
        this.f58764j = parcelReader.readFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.f58765k = parcelReader.readFloat(11, BitmapDescriptorFactory.HUE_RED);
        this.f58766l = parcelReader.readFloat(12, BitmapDescriptorFactory.HUE_RED);
        this.f58767m = parcelReader.readFloat(13, BitmapDescriptorFactory.HUE_RED);
        this.f58768n = parcelReader.readFloat(14, BitmapDescriptorFactory.HUE_RED);
        this.f58769o = parcelReader.readBoolean(15, false);
        IBinder readIBinder = parcelReader.readIBinder(16, null);
        if (readIBinder != null) {
            this.f58758d = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(readIBinder));
        }
        this.f58770p = parcelReader.readFloat(17, BitmapDescriptorFactory.HUE_RED);
        this.f58771q = parcelReader.readFloat(18, BitmapDescriptorFactory.HUE_RED);
        this.f58772r = parcelReader.readBoolean(19, false);
    }

    public MarkerOptions alpha(float f) {
        this.f58767m = f;
        return this;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.f58772r = false;
        this.f58759e = f;
        this.f58760f = f2;
        return this;
    }

    public MarkerOptions anchorMarker(float f, float f2) {
        this.f58772r = true;
        this.f58770p = f;
        this.f58771q = f2;
        return this;
    }

    public MarkerOptions clusterable(boolean z) {
        this.f58769o = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean z) {
        this.f58761g = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.f58763i = z;
        return this;
    }

    public float getAlpha() {
        return this.f58767m;
    }

    public float getAnchorU() {
        return this.f58759e;
    }

    public float getAnchorV() {
        return this.f58760f;
    }

    public BitmapDescriptor getIcon() {
        return this.f58758d;
    }

    public float getInfoWindowAnchorU() {
        return this.f58765k;
    }

    public float getInfoWindowAnchorV() {
        return this.f58766l;
    }

    public float getMarkerAnchorU() {
        return this.f58770p;
    }

    public float getMarkerAnchorV() {
        return this.f58771q;
    }

    public final LatLng getPosition() {
        return this.f58755a;
    }

    public float getRotation() {
        return this.f58764j;
    }

    public String getSnippet() {
        return this.f58757c;
    }

    public String getTitle() {
        return this.f58756b;
    }

    public float getZIndex() {
        return this.f58768n;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.f58758d = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.f58765k = f;
        this.f58766l = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.f58761g;
    }

    public boolean isFlat() {
        return this.f58763i;
    }

    public boolean isNewAnchorSetting() {
        return this.f58772r;
    }

    public boolean isVisible() {
        return this.f58762h;
    }

    public boolean ismClusterable() {
        return this.f58769o;
    }

    public MarkerOptions position(LatLng latLng) {
        this.f58755a = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.f58764j = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.f58757c = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.f58756b = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.f58762h = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.f58755a, i, false);
        parcelWrite.writeString(3, this.f58756b, false);
        parcelWrite.writeString(4, this.f58757c, false);
        parcelWrite.writeFloat(5, this.f58759e);
        parcelWrite.writeFloat(6, this.f58760f);
        parcelWrite.writeBoolean(7, this.f58761g);
        parcelWrite.writeBoolean(8, this.f58762h);
        parcelWrite.writeBoolean(9, this.f58763i);
        parcelWrite.writeFloat(10, this.f58764j);
        parcelWrite.writeFloat(11, this.f58765k);
        parcelWrite.writeFloat(12, this.f58766l);
        parcelWrite.writeFloat(13, this.f58767m);
        parcelWrite.writeFloat(14, this.f58768n);
        parcelWrite.writeBoolean(15, this.f58769o);
        BitmapDescriptor bitmapDescriptor = this.f58758d;
        parcelWrite.writeIBinder(16, bitmapDescriptor != null ? bitmapDescriptor.getObject().asBinder() : null, true);
        parcelWrite.writeFloat(17, this.f58770p);
        parcelWrite.writeFloat(18, this.f58771q);
        parcelWrite.writeBoolean(19, this.f58772r);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public MarkerOptions zIndex(float f) {
        this.f58768n = f;
        return this;
    }
}
