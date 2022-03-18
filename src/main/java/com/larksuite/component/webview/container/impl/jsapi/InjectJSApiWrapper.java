package com.larksuite.component.webview.container.impl.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;

public class InjectJSApiWrapper implements Parcelable {
    public static final Parcelable.Creator<InjectJSApiWrapper> CREATOR = new Parcelable.Creator<InjectJSApiWrapper>() {
        /* class com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper.C258681 */

        /* renamed from: a */
        public InjectJSApiWrapper[] newArray(int i) {
            return new InjectJSApiWrapper[i];
        }

        /* renamed from: a */
        public InjectJSApiWrapper createFromParcel(Parcel parcel) {
            return new InjectJSApiWrapper(parcel);
        }
    };

    /* renamed from: a */
    public String f63993a;

    /* renamed from: b */
    public AbstractInjectJSApiHandler f63994b;

    public int describeContents() {
        return 0;
    }

    protected InjectJSApiWrapper(Parcel parcel) {
        this.f63993a = parcel.readString();
        this.f63994b = (AbstractInjectJSApiHandler) parcel.readParcelable(AbstractInjectJSApiHandler.class.getClassLoader());
    }

    public InjectJSApiWrapper(String str, AbstractInjectJSApiHandler abstractInjectJSApiHandler) {
        this.f63993a = str;
        this.f63994b = abstractInjectJSApiHandler;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63993a);
        parcel.writeParcelable(this.f63994b, i);
    }
}
