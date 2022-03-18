package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonOptions implements Parcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new Parcelable.Creator<PolygonOptions>() {
        /* class com.huawei.hms.maps.model.PolygonOptions.C237201 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PolygonOptions createFromParcel(Parcel parcel) {
            return new PolygonOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PolygonOptions[] newArray(int i) {
            return new PolygonOptions[i];
        }
    };

    /* renamed from: a */
    private final List<LatLng> f58774a;

    /* renamed from: b */
    private final List<List<LatLng>> f58775b;

    /* renamed from: c */
    private float f58776c;

    /* renamed from: d */
    private int f58777d;

    /* renamed from: e */
    private int f58778e;

    /* renamed from: f */
    private float f58779f;

    /* renamed from: g */
    private boolean f58780g;

    /* renamed from: h */
    private boolean f58781h;

    /* renamed from: i */
    private boolean f58782i;

    /* renamed from: j */
    private int f58783j;

    /* renamed from: k */
    private List<PatternItem> f58784k;

    public PolygonOptions() {
        this.f58776c = 10.0f;
        this.f58777d = -16777216;
        this.f58780g = true;
        this.f58774a = new ArrayList();
        this.f58775b = new ArrayList();
        this.f58784k = new ArrayList();
    }

    protected PolygonOptions(Parcel parcel) {
        this.f58776c = 10.0f;
        this.f58777d = -16777216;
        this.f58780g = true;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.f58774a = parcelReader.createTypedList(2, LatLng.CREATOR, new ArrayList());
        ArrayList arrayList = new ArrayList();
        parcelReader.readList(3, arrayList, LatLng.class.getClassLoader());
        this.f58775b = arrayList;
        this.f58776c = parcelReader.readFloat(4, BitmapDescriptorFactory.HUE_RED);
        this.f58777d = parcelReader.readInt(5, 0);
        this.f58778e = parcelReader.readInt(6, 0);
        this.f58779f = parcelReader.readFloat(7, BitmapDescriptorFactory.HUE_RED);
        this.f58780g = parcelReader.readBoolean(8, true);
        this.f58781h = parcelReader.readBoolean(9, true);
        this.f58782i = parcelReader.readBoolean(10, true);
        this.f58783j = parcelReader.readInt(11, 0);
        this.f58784k = parcelReader.createTypedList(12, PatternItem.CREATOR, null);
    }

    public PolygonOptions add(LatLng latLng) {
        this.f58774a.add(latLng);
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        this.f58774a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.f58774a.add(latLng);
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.f58775b.add(arrayList);
        return this;
    }

    public PolygonOptions clickable(boolean z) {
        this.f58782i = z;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int i) {
        this.f58778e = i;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.f58781h = z;
        return this;
    }

    public int getFillColor() {
        return this.f58778e;
    }

    public List<List<LatLng>> getHoles() {
        return this.f58775b;
    }

    public List<LatLng> getPoints() {
        return this.f58774a;
    }

    public int getStrokeColor() {
        return this.f58777d;
    }

    public int getStrokeJointType() {
        return this.f58783j;
    }

    public List<PatternItem> getStrokePattern() {
        return this.f58784k;
    }

    public float getStrokeWidth() {
        return this.f58776c;
    }

    public float getZIndex() {
        return this.f58779f;
    }

    public boolean isClickable() {
        return this.f58782i;
    }

    public boolean isGeodesic() {
        return this.f58781h;
    }

    public boolean isVisible() {
        return this.f58780g;
    }

    public PolygonOptions strokeColor(int i) {
        this.f58777d = i;
        return this;
    }

    public PolygonOptions strokeJointType(int i) {
        this.f58783j = i;
        return this;
    }

    public PolygonOptions strokePattern(List<PatternItem> list) {
        this.f58784k = list;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.f58776c = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.f58780g = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeTypedList(2, this.f58774a, false);
        parcelWrite.writeList(3, this.f58775b, false);
        parcelWrite.writeFloat(4, this.f58776c);
        parcelWrite.writeInt(5, this.f58777d);
        parcelWrite.writeInt(6, this.f58778e);
        parcelWrite.writeFloat(7, this.f58779f);
        parcelWrite.writeBoolean(8, this.f58780g);
        parcelWrite.writeBoolean(9, this.f58781h);
        parcelWrite.writeBoolean(10, this.f58782i);
        parcelWrite.writeInt(11, this.f58783j);
        parcelWrite.writeTypedList(12, this.f58784k, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public PolygonOptions zIndex(float f) {
        this.f58779f = f;
        return this;
    }
}
