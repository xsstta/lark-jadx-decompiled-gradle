package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RoutePhotoPickerModel extends BaseRouteModel {
    public static final Parcelable.Creator<RoutePhotoPickerModel> CREATOR = new Parcelable.Creator<RoutePhotoPickerModel>() {
        /* class com.ss.android.lark.littleapp.entity.RoutePhotoPickerModel.C413371 */

        /* renamed from: a */
        public RoutePhotoPickerModel[] newArray(int i) {
            return new RoutePhotoPickerModel[i];
        }

        /* renamed from: a */
        public RoutePhotoPickerModel createFromParcel(Parcel parcel) {
            return new RoutePhotoPickerModel(parcel);
        }
    };

    /* renamed from: a */
    private int f105136a;

    /* renamed from: b */
    private boolean f105137b;

    /* renamed from: c */
    private boolean f105138c;

    /* renamed from: d */
    private boolean f105139d;

    /* renamed from: b */
    public int mo148846b() {
        return this.f105136a;
    }

    /* renamed from: c */
    public boolean mo148847c() {
        return this.f105137b;
    }

    /* renamed from: d */
    public boolean mo148848d() {
        return this.f105138c;
    }

    /* renamed from: e */
    public boolean mo148849e() {
        return this.f105139d;
    }

    public String toString() {
        return String.format("RoutePhotoPickerModel{mSelectMaxCount=%d, mShowOriginOption=%s, mKeepOrigin=%s, mContainsCamera=%s}", Integer.valueOf(this.f105136a), Boolean.valueOf(this.f105137b), Boolean.valueOf(this.f105138c), Boolean.valueOf(this.f105139d));
    }

    public RoutePhotoPickerModel(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        this.f105136a = parcel.readInt();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f105137b = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f105138c = z2;
        this.f105139d = parcel.readInt() == 1 ? true : z3;
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f105136a);
        parcel.writeInt(this.f105137b ? 1 : 0);
        parcel.writeInt(this.f105138c ? 1 : 0);
        parcel.writeInt(this.f105139d ? 1 : 0);
    }

    public RoutePhotoPickerModel(int i, boolean z, boolean z2, boolean z3) {
        this.f105136a = i;
        this.f105137b = z;
        this.f105138c = z2;
        this.f105139d = z3;
    }
}
