package com.ss.android.lark.browser.biz.messenger.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.ss.android.lark.log.Log;

public class InterceptBackQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<InterceptBackQueryApiHandler> CREATOR = new Parcelable.Creator<InterceptBackQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.messenger.queryapi.InterceptBackQueryApiHandler.C298721 */

        /* renamed from: a */
        public InterceptBackQueryApiHandler[] newArray(int i) {
            return new InterceptBackQueryApiHandler[i];
        }

        /* renamed from: a */
        public InterceptBackQueryApiHandler createFromParcel(Parcel parcel) {
            return new InterceptBackQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public InterceptBackQueryApiHandler() {
    }

    protected InterceptBackQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        boolean a = mo91867a(str, false);
        Log.m165389i("InterceptBackQueryApi", "intercept back value is " + a);
        mo91992a("KEY_INTERCEPT_BACK", Boolean.valueOf(a));
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
