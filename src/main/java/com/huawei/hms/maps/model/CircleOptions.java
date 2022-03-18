package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.List;

public class CircleOptions implements Parcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new Parcelable.Creator<CircleOptions>() {
        /* class com.huawei.hms.maps.model.CircleOptions.C237111 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CircleOptions createFromParcel(Parcel parcel) {
            return new CircleOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CircleOptions[] newArray(int i) {
            return new CircleOptions[i];
        }
    };

    /* renamed from: a */
    private LatLng f58723a;

    /* renamed from: b */
    private int f58724b;

    /* renamed from: c */
    private double f58725c;

    /* renamed from: d */
    private int f58726d = -16777216;

    /* renamed from: e */
    private List<PatternItem> f58727e;

    /* renamed from: f */
    private float f58728f = 10.0f;

    /* renamed from: g */
    private float f58729g;

    /* renamed from: h */
    private boolean f58730h;

    /* renamed from: i */
    private boolean f58731i = true;

    public CircleOptions() {
    }

    protected CircleOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58723a = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.f58724b = parcelReader.readInt(3, 0);
        this.f58725c = parcelReader.readDouble(4, 0.0d);
        this.f58726d = parcelReader.readInt(5, 0);
        this.f58727e = parcelReader.createTypedList(6, PatternItem.CREATOR, null);
        this.f58728f = parcelReader.readFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.f58729g = parcelReader.readFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f58730h = parcelReader.readBoolean(9, true);
        this.f58731i = parcelReader.readBoolean(10, true);
    }

    public CircleOptions center(LatLng latLng) {
        this.f58723a = latLng;
        return this;
    }

    public CircleOptions clickable(boolean z) {
        this.f58730h = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i) {
        this.f58724b = i;
        return this;
    }

    public LatLng getCenter() {
        return this.f58723a;
    }

    public int getFillColor() {
        return this.f58724b;
    }

    public double getRadius() {
        return this.f58725c;
    }

    public int getStrokeColor() {
        return this.f58726d;
    }

    public List<PatternItem> getStrokePattern() {
        return this.f58727e;
    }

    public float getStrokeWidth() {
        return this.f58728f;
    }

    public float getZIndex() {
        return this.f58729g;
    }

    public boolean isClickable() {
        return this.f58730h;
    }

    public boolean isVisible() {
        return this.f58731i;
    }

    public CircleOptions radius(double d) {
        this.f58725c = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.f58726d = i;
        return this;
    }

    public CircleOptions strokePattern(List<PatternItem> list) {
        this.f58727e = list;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.f58728f = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.f58731i = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.f58723a, i, false);
        parcelWrite.writeInt(3, this.f58724b);
        parcelWrite.writeDouble(4, this.f58725c);
        parcelWrite.writeInt(5, this.f58726d);
        parcelWrite.writeTypedList(6, this.f58727e, false);
        parcelWrite.writeFloat(7, this.f58728f);
        parcelWrite.writeFloat(8, this.f58729g);
        parcelWrite.writeBoolean(9, this.f58730h);
        parcelWrite.writeBoolean(10, this.f58731i);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public CircleOptions zIndex(float f) {
        this.f58729g = f;
        return this;
    }
}
