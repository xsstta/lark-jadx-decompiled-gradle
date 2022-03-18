package com.ss.android.lark.browser.biz.messenger.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebSettings;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;

public class AudioAutoPlayQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<AudioAutoPlayQueryApiHandler> CREATOR = new Parcelable.Creator<AudioAutoPlayQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.messenger.queryapi.AudioAutoPlayQueryApiHandler.C298711 */

        /* renamed from: a */
        public AudioAutoPlayQueryApiHandler[] newArray(int i) {
            return new AudioAutoPlayQueryApiHandler[i];
        }

        /* renamed from: a */
        public AudioAutoPlayQueryApiHandler createFromParcel(Parcel parcel) {
            return new AudioAutoPlayQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public AudioAutoPlayQueryApiHandler() {
    }

    protected AudioAutoPlayQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        boolean z = false;
        int a = mo91865a(str, 0);
        WebSettings settings = mo91999w().mo67314g().getSettings();
        if (a == 0) {
            z = true;
        }
        settings.setMediaPlaybackRequiresUserGesture(z);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
