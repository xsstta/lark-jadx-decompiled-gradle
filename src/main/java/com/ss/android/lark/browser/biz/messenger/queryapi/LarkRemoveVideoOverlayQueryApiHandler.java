package com.ss.android.lark.browser.biz.messenger.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.ss.android.lark.log.Log;

public class LarkRemoveVideoOverlayQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<LarkRemoveVideoOverlayQueryApiHandler> CREATOR = new Parcelable.Creator<LarkRemoveVideoOverlayQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.messenger.queryapi.LarkRemoveVideoOverlayQueryApiHandler.C298741 */

        /* renamed from: a */
        public LarkRemoveVideoOverlayQueryApiHandler[] newArray(int i) {
            return new LarkRemoveVideoOverlayQueryApiHandler[i];
        }

        /* renamed from: a */
        public LarkRemoveVideoOverlayQueryApiHandler createFromParcel(Parcel parcel) {
            return new LarkRemoveVideoOverlayQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public LarkRemoveVideoOverlayQueryApiHandler() {
    }

    protected LarkRemoveVideoOverlayQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        boolean a = mo91867a(str, false);
        Log.m165389i("LarkRemoveVideoOverlay", "remove overlay is " + a);
        mo91999w().mo67309b(a ^ true);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
