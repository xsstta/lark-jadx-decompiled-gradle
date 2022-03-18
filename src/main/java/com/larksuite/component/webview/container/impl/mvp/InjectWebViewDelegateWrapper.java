package com.larksuite.component.webview.container.impl.mvp;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;

public class InjectWebViewDelegateWrapper implements Parcelable {
    public static final Parcelable.Creator<InjectWebViewDelegateWrapper> CREATOR = new Parcelable.Creator<InjectWebViewDelegateWrapper>() {
        /* class com.larksuite.component.webview.container.impl.mvp.InjectWebViewDelegateWrapper.C258741 */

        /* renamed from: a */
        public InjectWebViewDelegateWrapper[] newArray(int i) {
            return new InjectWebViewDelegateWrapper[i];
        }

        /* renamed from: a */
        public InjectWebViewDelegateWrapper createFromParcel(Parcel parcel) {
            return new InjectWebViewDelegateWrapper(parcel);
        }
    };

    /* renamed from: a */
    public AbstractInjectWebViewDelegate f64002a;

    public int describeContents() {
        return 0;
    }

    public InjectWebViewDelegateWrapper(AbstractInjectWebViewDelegate abstractInjectWebViewDelegate) {
        this.f64002a = abstractInjectWebViewDelegate;
    }

    protected InjectWebViewDelegateWrapper(Parcel parcel) {
        this.f64002a = (AbstractInjectWebViewDelegate) parcel.readParcelable(AbstractInjectWebViewDelegate.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f64002a, i);
    }
}
