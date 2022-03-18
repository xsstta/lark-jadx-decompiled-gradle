package com.ss.android.lark.browser.biz.messenger.jsapi.chat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class P2pChatHandlerV2 extends AbstractInjectJSApiHandler<C29847a> implements Parcelable {
    public static final Parcelable.Creator<P2pChatHandlerV2> CREATOR = new Parcelable.Creator<P2pChatHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.chat.P2pChatHandlerV2.C298461 */

        /* renamed from: a */
        public P2pChatHandlerV2[] newArray(int i) {
            return new P2pChatHandlerV2[i];
        }

        /* renamed from: a */
        public P2pChatHandlerV2 createFromParcel(Parcel parcel) {
            return new P2pChatHandlerV2(parcel);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.chat.P2pChatHandlerV2$a */
    public static class C29847a implements BaseJSModel {
        public String chatterId;

        C29847a() {
        }
    }

    public P2pChatHandlerV2() {
    }

    protected P2pChatHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public int mo107450a(String str) {
        if (mo91997u() == null) {
            return 1;
        }
        C29638a.m109622a().getManisDependency().mo107701b(str);
        return 0;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    private void m110336a(AbstractC25832c cVar, int i) {
        if (cVar != null) {
            cVar.mo91902a("{" + "\"code\":" + String.valueOf(i) + "}");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29847a aVar, AbstractC25832c cVar) {
        String str = aVar.chatterId;
        if (TextUtils.isEmpty(str) || mo91997u() == null) {
            m110336a(cVar, 1);
        } else {
            m110336a(cVar, mo107450a(str));
        }
    }
}
