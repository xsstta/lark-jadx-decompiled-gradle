package com.larksuite.component.webview.container.impl.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;

public class InjectQueryApiWrapper implements Parcelable {
    public static final Parcelable.Creator<InjectQueryApiWrapper> CREATOR = new Parcelable.Creator<InjectQueryApiWrapper>() {
        /* class com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper.C258751 */

        /* renamed from: a */
        public InjectQueryApiWrapper[] newArray(int i) {
            return new InjectQueryApiWrapper[i];
        }

        /* renamed from: a */
        public InjectQueryApiWrapper createFromParcel(Parcel parcel) {
            return new InjectQueryApiWrapper(parcel);
        }
    };

    /* renamed from: a */
    public String f64003a;

    /* renamed from: b */
    public AbstractInjectQueryApiHandler f64004b;

    public int describeContents() {
        return 0;
    }

    protected InjectQueryApiWrapper(Parcel parcel) {
        this.f64003a = parcel.readString();
        this.f64004b = (AbstractInjectQueryApiHandler) parcel.readParcelable(AbstractInjectQueryApiHandler.class.getClassLoader());
    }

    public InjectQueryApiWrapper(String str, AbstractInjectQueryApiHandler abstractInjectQueryApiHandler) {
        this.f64003a = str;
        this.f64004b = abstractInjectQueryApiHandler;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f64003a);
        parcel.writeParcelable(this.f64004b, i);
    }
}
