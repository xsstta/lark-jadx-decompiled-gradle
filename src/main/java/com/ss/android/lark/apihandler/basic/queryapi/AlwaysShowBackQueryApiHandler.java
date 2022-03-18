package com.ss.android.lark.apihandler.basic.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;

public class AlwaysShowBackQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<AlwaysShowBackQueryApiHandler> CREATOR = new Parcelable.Creator<AlwaysShowBackQueryApiHandler>() {
        /* class com.ss.android.lark.apihandler.basic.queryapi.AlwaysShowBackQueryApiHandler.C288241 */

        /* renamed from: a */
        public AlwaysShowBackQueryApiHandler[] newArray(int i) {
            return new AlwaysShowBackQueryApiHandler[i];
        }

        /* renamed from: a */
        public AlwaysShowBackQueryApiHandler createFromParcel(Parcel parcel) {
            return new AlwaysShowBackQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public AlwaysShowBackQueryApiHandler() {
    }

    protected AlwaysShowBackQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        mo91999w().mo67308b().mo67321a(mo91867a(str, true));
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
