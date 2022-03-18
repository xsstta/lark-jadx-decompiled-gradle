package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.C25819a;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.C29935c;
import com.ss.android.lark.browser.p1411a.C29639e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.LinkItem;
import java.util.HashMap;
import java.util.Map;

public class OpenLinkHandlerV2 extends AbstractInjectJSApiHandler<LinkItem> implements Parcelable {
    public static final Parcelable.Creator<OpenLinkHandlerV2> CREATOR = new Parcelable.Creator<OpenLinkHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenLinkHandlerV2.C298221 */

        /* renamed from: a */
        public OpenLinkHandlerV2[] newArray(int i) {
            return new OpenLinkHandlerV2[i];
        }

        /* renamed from: a */
        public OpenLinkHandlerV2 createFromParcel(Parcel parcel) {
            return new OpenLinkHandlerV2(parcel);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public OpenLinkHandlerV2() {
    }

    protected OpenLinkHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LinkItem linkItem, AbstractC25832c cVar) {
        m110251a(mo91997u(), linkItem);
    }

    /* renamed from: a */
    private void m110251a(Context context, LinkItem linkItem) {
        if (context == null || linkItem == null) {
            Log.m165389i("OpenLinkHandlerV2", "context == null || item == null");
            return;
        }
        String url = linkItem.getUrl();
        if (C29639e.m109680a(url)) {
            Log.m165389i("OpenLinkHandlerV2", "Messenger intercepted url");
            C29639e.m109678a(context, url);
        } else if (C25819a.m93327a(url)) {
            Log.m165389i("OpenLinkHandlerV2", "WebContainer intercepted url");
            C25819a.m93325a(context, url);
        } else {
            IBrowserModuleDependency a = C29638a.m109622a();
            a.getPerfEnterChatMonitor().mo107770a();
            if (C29935c.m110676a().mo107803a(url, a.getDocsDependency().mo107660a(), (Map<String, String>) null)) {
                Log.m165389i("OpenLinkHandlerV2", "url open doc");
            } else if (mo91999w().mo67314g() == null || linkItem.getNewTab().booleanValue()) {
                Log.m165389i("OpenLinkHandlerV2", "open url in new window");
                C29935c.m110676a().mo107801a(context, url, UrlParams.m108857a().mo105519a(linkItem.getTitle()).mo105523a());
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("Accept-Language", C29638a.m109622a().getLanguageDependency().mo107673a().toLanguageTag());
                Log.m165389i("OpenLinkHandlerV2", "current webview is opening url directly");
                mo91999w().mo67314g().loadUrl(linkItem.getUrl(), hashMap);
            }
        }
    }
}
