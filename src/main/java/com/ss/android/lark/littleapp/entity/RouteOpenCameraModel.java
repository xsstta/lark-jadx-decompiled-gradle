package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteOpenCameraModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteOpenCameraModel> CREATOR = new Parcelable.Creator<RouteOpenCameraModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteOpenCameraModel.C413351 */

        /* renamed from: a */
        public RouteOpenCameraModel[] newArray(int i) {
            return new RouteOpenCameraModel[i];
        }

        /* renamed from: a */
        public RouteOpenCameraModel createFromParcel(Parcel parcel) {
            return new RouteOpenCameraModel(parcel);
        }
    };

    /* renamed from: a */
    private boolean f105133a;

    /* renamed from: b */
    public boolean mo148835b() {
        return this.f105133a;
    }

    public RouteOpenCameraModel(boolean z) {
        this.f105133a = z;
    }

    public RouteOpenCameraModel(Parcel parcel) {
        super(parcel);
        this.f105133a = parcel.readByte() != 1 ? false : true;
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f105133a ? (byte) 1 : 0);
    }
}
