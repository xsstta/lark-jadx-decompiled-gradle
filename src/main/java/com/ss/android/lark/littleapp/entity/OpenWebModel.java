package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class OpenWebModel extends BaseRouteModel {
    public static final Parcelable.Creator<OpenWebModel> CREATOR = new Parcelable.Creator<OpenWebModel>() {
        /* class com.ss.android.lark.littleapp.entity.OpenWebModel.C413311 */

        /* renamed from: a */
        public OpenWebModel[] newArray(int i) {
            return new OpenWebModel[i];
        }

        /* renamed from: a */
        public OpenWebModel createFromParcel(Parcel parcel) {
            return new OpenWebModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105122a;

    /* renamed from: b */
    private String f105123b;

    /* renamed from: c */
    private int f105124c;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public OpenWebModel() {
    }

    /* renamed from: b */
    public String mo148809b() {
        return this.f105122a;
    }

    /* renamed from: c */
    public String mo148811c() {
        return this.f105123b;
    }

    /* renamed from: b */
    public void mo148810b(String str) {
        this.f105122a = str;
    }

    /* renamed from: c */
    public void mo148812c(String str) {
        this.f105123b = str;
    }

    public OpenWebModel(Parcel parcel) {
        super(parcel);
        this.f105122a = parcel.readString();
        this.f105123b = parcel.readString();
        this.f105124c = parcel.readInt();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105122a);
        parcel.writeString(this.f105123b);
        parcel.writeInt(this.f105124c);
    }
}
