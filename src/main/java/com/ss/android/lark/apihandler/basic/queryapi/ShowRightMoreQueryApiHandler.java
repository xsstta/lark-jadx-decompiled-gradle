package com.ss.android.lark.apihandler.basic.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;

public class ShowRightMoreQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<ShowRightMoreQueryApiHandler> CREATOR = new Parcelable.Creator<ShowRightMoreQueryApiHandler>() {
        /* class com.ss.android.lark.apihandler.basic.queryapi.ShowRightMoreQueryApiHandler.C288271 */

        /* renamed from: a */
        public ShowRightMoreQueryApiHandler[] newArray(int i) {
            return new ShowRightMoreQueryApiHandler[i];
        }

        /* renamed from: a */
        public ShowRightMoreQueryApiHandler createFromParcel(Parcel parcel) {
            return new ShowRightMoreQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public ShowRightMoreQueryApiHandler() {
    }

    protected ShowRightMoreQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        if (!mo91867a(str, true)) {
            mo91999w().mo67308b().removeAllActions();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
