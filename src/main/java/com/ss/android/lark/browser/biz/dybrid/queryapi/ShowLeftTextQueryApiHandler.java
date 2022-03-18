package com.ss.android.lark.browser.biz.dybrid.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;

public class ShowLeftTextQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<ShowLeftTextQueryApiHandler> CREATOR = new Parcelable.Creator<ShowLeftTextQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.dybrid.queryapi.ShowLeftTextQueryApiHandler.C297671 */

        /* renamed from: a */
        public ShowLeftTextQueryApiHandler[] newArray(int i) {
            return new ShowLeftTextQueryApiHandler[i];
        }

        /* renamed from: a */
        public ShowLeftTextQueryApiHandler createFromParcel(Parcel parcel) {
            return new ShowLeftTextQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public ShowLeftTextQueryApiHandler() {
    }

    protected ShowLeftTextQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        if (!mo91867a(str, true)) {
            mo91999w().mo67308b().mo67320a("");
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
