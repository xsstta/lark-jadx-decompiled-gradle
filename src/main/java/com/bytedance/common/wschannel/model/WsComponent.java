package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class WsComponent implements Parcelable {
    public static final Parcelable.Creator<WsComponent> CREATOR = new Parcelable.Creator<WsComponent>() {
        /* class com.bytedance.common.wschannel.model.WsComponent.C36721 */

        @Override // android.os.Parcelable.Creator
        public WsComponent[] newArray(int i) {
            return new WsComponent[i];
        }

        @Override // android.os.Parcelable.Creator
        public WsComponent createFromParcel(Parcel parcel) {
            WsComponent wsComponent = new WsComponent();
            wsComponent.componentName = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            wsComponent.acceptApis = parcel.createTypedArrayList(WsApi.CREATOR);
            return wsComponent;
        }
    };
    List<WsApi> acceptApis;
    ComponentName componentName;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.componentName, i);
        parcel.writeTypedList(this.acceptApis);
    }
}
