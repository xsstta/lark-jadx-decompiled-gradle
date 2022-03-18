package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolylineOptions implements Parcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new Parcelable.Creator<PolylineOptions>() {
        /* class com.huawei.hms.maps.model.PolylineOptions.C237211 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
            return new PolylineOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PolylineOptions[] newArray(int i) {
            return new PolylineOptions[i];
        }
    };

    /* renamed from: a */
    private final List<LatLng> f58786a;

    /* renamed from: b */
    private int f58787b;

    /* renamed from: c */
    private float f58788c;

    /* renamed from: d */
    private float f58789d;

    /* renamed from: e */
    private boolean f58790e;

    /* renamed from: f */
    private boolean f58791f;

    /* renamed from: g */
    private boolean f58792g;

    /* renamed from: h */
    private Cap f58793h;

    /* renamed from: i */
    private Cap f58794i;

    /* renamed from: j */
    private int f58795j;

    /* renamed from: k */
    private List<PatternItem> f58796k;

    public PolylineOptions() {
        this.f58786a = new ArrayList();
        this.f58788c = 10.0f;
        this.f58787b = -16777216;
        this.f58791f = false;
        this.f58792g = false;
        this.f58790e = true;
        this.f58793h = new ButtCap();
        this.f58794i = new ButtCap();
        this.f58795j = 0;
        this.f58796k = null;
    }

    protected PolylineOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58786a = parcelReader.createTypedList(2, LatLng.CREATOR, new ArrayList());
        this.f58787b = parcelReader.readInt(3, 0);
        this.f58788c = parcelReader.readFloat(4, 10.0f);
        this.f58789d = parcelReader.readFloat(5, BitmapDescriptorFactory.HUE_RED);
        this.f58790e = parcelReader.readBoolean(6, true);
        this.f58791f = parcelReader.readBoolean(7, false);
        this.f58792g = parcelReader.readBoolean(8, false);
        this.f58793h = (Cap) parcelReader.readParcelable(9, Cap.CREATOR, null);
        this.f58794i = (Cap) parcelReader.readParcelable(10, Cap.CREATOR, null);
        this.f58795j = parcelReader.readInt(11, 0);
        this.f58796k = parcelReader.createTypedList(12, PatternItem.CREATOR, null);
    }

    public PolylineOptions add(LatLng latLng) {
        this.f58786a.add(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        this.f58786a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.f58786a.add(latLng);
        }
        return this;
    }

    public PolylineOptions clickable(boolean z) {
        this.f58791f = z;
        return this;
    }

    public PolylineOptions color(int i) {
        this.f58787b = i;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions endCap(Cap cap) {
        this.f58794i = cap;
        return this;
    }

    public PolylineOptions geodesic(boolean z) {
        this.f58792g = z;
        return this;
    }

    public int getColor() {
        return this.f58787b;
    }

    public Cap getEndCap() {
        return this.f58794i;
    }

    public int getJointType() {
        return this.f58795j;
    }

    public List<PatternItem> getPattern() {
        return this.f58796k;
    }

    public List<LatLng> getPoints() {
        return this.f58786a;
    }

    public Cap getStartCap() {
        return this.f58793h;
    }

    public float getWidth() {
        return this.f58788c;
    }

    public float getZIndex() {
        return this.f58789d;
    }

    public boolean isClickable() {
        return this.f58791f;
    }

    public boolean isGeodesic() {
        return this.f58792g;
    }

    public boolean isVisible() {
        return this.f58790e;
    }

    public PolylineOptions jointType(int i) {
        this.f58795j = i;
        return this;
    }

    public PolylineOptions pattern(List<PatternItem> list) {
        this.f58796k = list;
        return this;
    }

    public PolylineOptions startCap(Cap cap) {
        this.f58793h = cap;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.f58790e = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.f58788c = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedList(2, this.f58786a, false);
        parcelWrite.writeInt(3, this.f58787b);
        parcelWrite.writeFloat(4, this.f58788c);
        parcelWrite.writeFloat(5, this.f58789d);
        parcelWrite.writeBoolean(6, this.f58790e);
        parcelWrite.writeBoolean(7, this.f58791f);
        parcelWrite.writeBoolean(8, this.f58792g);
        parcelWrite.writeParcelable(9, this.f58793h, i, false);
        parcelWrite.writeParcelable(10, this.f58794i, i, false);
        parcelWrite.writeInt(11, this.f58795j);
        parcelWrite.writeTypedList(12, this.f58796k, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public PolylineOptions zIndex(float f) {
        this.f58789d = f;
        return this;
    }
}
