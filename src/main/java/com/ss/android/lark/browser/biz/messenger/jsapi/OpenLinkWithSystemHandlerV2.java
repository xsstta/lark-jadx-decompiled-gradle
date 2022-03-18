package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.LinkItem;

public class OpenLinkWithSystemHandlerV2 extends AbstractInjectJSApiHandler<LinkItem> implements Parcelable {
    public static final Parcelable.Creator<OpenLinkWithSystemHandlerV2> CREATOR = new Parcelable.Creator<OpenLinkWithSystemHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenLinkWithSystemHandlerV2.C298231 */

        /* renamed from: a */
        public OpenLinkWithSystemHandlerV2[] newArray(int i) {
            return new OpenLinkWithSystemHandlerV2[i];
        }

        /* renamed from: a */
        public OpenLinkWithSystemHandlerV2 createFromParcel(Parcel parcel) {
            return new OpenLinkWithSystemHandlerV2(parcel);
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

    public OpenLinkWithSystemHandlerV2() {
    }

    protected OpenLinkWithSystemHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LinkItem linkItem, AbstractC25832c cVar) {
        m110257a(mo91997u(), linkItem);
    }

    /* renamed from: a */
    private void m110257a(Context context, LinkItem linkItem) {
        if (context == null || linkItem == null) {
            Log.m165389i("OpenLinkWithSystemHandlerV2", "context == null || item == null");
            return;
        }
        String url = linkItem.getUrl();
        if (TextUtils.isEmpty(url)) {
            Log.m165383e("OpenLinkWithSystemHandlerV2", "url is null");
        } else {
            m110258a(context, url);
        }
    }

    /* renamed from: a */
    private void m110258a(Context context, String str) {
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Log.m165384e("OpenLinkWithSystemHandlerV2", "contentUrl is null", (Throwable) null);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(parse);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            Log.m165386e("OpenLinkWithSystemHandlerV2", e);
        }
    }
}
