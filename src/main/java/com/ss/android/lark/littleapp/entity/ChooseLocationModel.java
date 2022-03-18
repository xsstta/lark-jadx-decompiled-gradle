package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class ChooseLocationModel extends BaseRouteModel {
    public static final Parcelable.Creator<ChooseLocationModel> CREATOR = new Parcelable.Creator<ChooseLocationModel>() {
        /* class com.ss.android.lark.littleapp.entity.ChooseLocationModel.C413281 */

        /* renamed from: a */
        public ChooseLocationModel[] newArray(int i) {
            return new ChooseLocationModel[i];
        }

        /* renamed from: a */
        public ChooseLocationModel createFromParcel(Parcel parcel) {
            return new ChooseLocationModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105120a;

    public ChooseLocationModel() {
    }

    /* renamed from: b */
    public String mo148784b() {
        return this.f105120a;
    }

    /* renamed from: b */
    public void mo148785b(String str) {
        this.f105120a = str;
    }

    public ChooseLocationModel(Parcel parcel) {
        super(parcel);
        this.f105120a = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105120a);
    }
}
