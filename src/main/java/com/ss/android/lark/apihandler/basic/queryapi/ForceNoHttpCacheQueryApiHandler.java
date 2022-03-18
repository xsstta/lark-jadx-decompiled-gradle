package com.ss.android.lark.apihandler.basic.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.ss.android.lark.log.Log;

public class ForceNoHttpCacheQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<ForceNoHttpCacheQueryApiHandler> CREATOR = new Parcelable.Creator<ForceNoHttpCacheQueryApiHandler>() {
        /* class com.ss.android.lark.apihandler.basic.queryapi.ForceNoHttpCacheQueryApiHandler.C288251 */

        /* renamed from: a */
        public ForceNoHttpCacheQueryApiHandler[] newArray(int i) {
            return new ForceNoHttpCacheQueryApiHandler[i];
        }

        /* renamed from: a */
        public ForceNoHttpCacheQueryApiHandler createFromParcel(Parcel parcel) {
            return new ForceNoHttpCacheQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public ForceNoHttpCacheQueryApiHandler() {
    }

    /* renamed from: a */
    private boolean m105600a() {
        AbstractC25820a a = C25821b.m93347a();
        if (a == null) {
            Log.m165383e("ForceNoHttpCacheQueryApiHandler", "WebContainerDependency.getDependency() is null");
            return false;
        }
        boolean z = !a.mo91848a("lark.browser.webview.forbidden.no.http.cache");
        Log.m165389i("ForceNoHttpCacheQueryApiHandler", "fgIsOpen---" + z);
        return z;
    }

    protected ForceNoHttpCacheQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        if (!m105600a()) {
            Log.m165389i("ForceNoHttpCacheQueryApiHandler", "FG is close");
            return;
        }
        boolean a = mo91867a(str, true);
        Log.m165389i("ForceNoHttpCacheQueryApiHandler", "forceNoCache---" + a);
        if (a) {
            WebView g = mo91999w().mo67314g();
            if (g == null) {
                Log.m165383e("ForceNoHttpCacheQueryApiHandler", "webview is null");
                return;
            }
            WebSettings settings = g.getSettings();
            if (settings == null) {
                Log.m165383e("ForceNoHttpCacheQueryApiHandler", "webSettings is null");
                return;
            }
            settings.setCacheMode(2);
            Log.m165389i("ForceNoHttpCacheQueryApiHandler", "set no cache success");
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
