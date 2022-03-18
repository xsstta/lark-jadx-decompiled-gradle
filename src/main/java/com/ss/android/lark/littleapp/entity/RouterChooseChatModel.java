package com.ss.android.lark.littleapp.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class RouterChooseChatModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouterChooseChatModel> CREATOR = new Parcelable.Creator<RouterChooseChatModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouterChooseChatModel.C413411 */

        /* renamed from: a */
        public RouterChooseChatModel[] newArray(int i) {
            return new RouterChooseChatModel[i];
        }

        /* renamed from: a */
        public RouterChooseChatModel createFromParcel(Parcel parcel) {
            return new RouterChooseChatModel(parcel);
        }
    };

    /* renamed from: a */
    private Bundle f105148a;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public Bundle mo148880b() {
        return this.f105148a;
    }

    public RouterChooseChatModel(Bundle bundle) {
        this.f105148a = bundle;
    }

    protected RouterChooseChatModel(Parcel parcel) {
        this.f105148a = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f105148a);
    }
}
