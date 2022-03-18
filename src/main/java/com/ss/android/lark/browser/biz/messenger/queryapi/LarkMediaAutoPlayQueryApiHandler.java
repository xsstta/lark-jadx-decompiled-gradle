package com.ss.android.lark.browser.biz.messenger.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.ss.android.lark.log.Log;

public class LarkMediaAutoPlayQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<LarkMediaAutoPlayQueryApiHandler> CREATOR = new Parcelable.Creator<LarkMediaAutoPlayQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.messenger.queryapi.LarkMediaAutoPlayQueryApiHandler.C298731 */

        /* renamed from: a */
        public LarkMediaAutoPlayQueryApiHandler[] newArray(int i) {
            return new LarkMediaAutoPlayQueryApiHandler[i];
        }

        /* renamed from: a */
        public LarkMediaAutoPlayQueryApiHandler createFromParcel(Parcel parcel) {
            return new LarkMediaAutoPlayQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public LarkMediaAutoPlayQueryApiHandler() {
    }

    protected LarkMediaAutoPlayQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        boolean a = mo91867a(str, false);
        Log.m165389i("LarkMediaAutoPlay", "media auto play is " + a);
        mo91999w().mo67314g().getSettings().setMediaPlaybackRequiresUserGesture(a ^ true);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
