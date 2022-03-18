package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class ParseQRCodeModel extends BaseRouteModel {
    public static final Parcelable.Creator<ParseQRCodeModel> CREATOR = new Parcelable.Creator<ParseQRCodeModel>() {
        /* class com.ss.android.lark.littleapp.entity.ParseQRCodeModel.C413321 */

        /* renamed from: a */
        public ParseQRCodeModel[] newArray(int i) {
            return new ParseQRCodeModel[i];
        }

        /* renamed from: a */
        public ParseQRCodeModel createFromParcel(Parcel parcel) {
            return new ParseQRCodeModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105125a;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public ParseQRCodeModel() {
    }

    /* renamed from: b */
    public String mo148817b() {
        return this.f105125a;
    }

    /* renamed from: b */
    public void mo148818b(String str) {
        this.f105125a = str;
    }

    public ParseQRCodeModel(Parcel parcel) {
        super(parcel);
        this.f105125a = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105125a);
    }
}
