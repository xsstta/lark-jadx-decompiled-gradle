package com.larksuite.component.openplatform.core.loader.jsbundle.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class ReadyJSComponent extends AbstractC24546b implements Parcelable {
    public static final Parcelable.Creator<ReadyJSComponent> CREATOR = new Parcelable.Creator<ReadyJSComponent>() {
        /* class com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent.C245441 */

        /* renamed from: a */
        public ReadyJSComponent[] newArray(int i) {
            return new ReadyJSComponent[i];
        }

        /* renamed from: a */
        public ReadyJSComponent createFromParcel(Parcel parcel) {
            return new ReadyJSComponent(parcel);
        }
    };
    @SerializedName("path")

    /* renamed from: c */
    private String f60512c;

    public int describeContents() {
        return 0;
    }

    public ReadyJSComponent() {
    }

    /* renamed from: a */
    public String mo87445a() {
        return this.f60512c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(" ReadyJSComponent:");
        stringBuffer.append(" name:");
        stringBuffer.append(this.f60515a);
        stringBuffer.append(" version:");
        stringBuffer.append(this.f60516b);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo87446a(String str) {
        this.f60512c = str;
    }

    protected ReadyJSComponent(Parcel parcel) {
        this.f60512c = parcel.readString();
        this.f60515a = parcel.readString();
        this.f60516b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60512c);
        parcel.writeString(this.f60515a);
        parcel.writeString(this.f60516b);
    }
}
