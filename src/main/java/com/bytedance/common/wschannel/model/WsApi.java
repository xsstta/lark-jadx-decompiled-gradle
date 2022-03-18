package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;

public class WsApi implements Parcelable {
    public static final Parcelable.Creator<WsApi> CREATOR = new Parcelable.Creator<WsApi>() {
        /* class com.bytedance.common.wschannel.model.WsApi.C36691 */

        @Override // android.os.Parcelable.Creator
        public WsApi[] newArray(int i) {
            return new WsApi[i];
        }

        @Override // android.os.Parcelable.Creator
        public WsApi createFromParcel(Parcel parcel) {
            WsApi wsApi = new WsApi();
            wsApi.service = parcel.readInt();
            wsApi.method = parcel.readInt();
            return wsApi;
        }
    };
    int method;
    int service;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
    }
}
