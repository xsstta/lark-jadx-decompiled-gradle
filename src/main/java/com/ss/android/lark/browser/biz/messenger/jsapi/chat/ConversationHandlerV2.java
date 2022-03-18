package com.ss.android.lark.browser.biz.messenger.jsapi.chat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class ConversationHandlerV2 extends AbstractInjectJSApiHandler<C29845a> implements Parcelable {
    public static final Parcelable.Creator<ConversationHandlerV2> CREATOR = new Parcelable.Creator<ConversationHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.chat.ConversationHandlerV2.C298441 */

        /* renamed from: a */
        public ConversationHandlerV2[] newArray(int i) {
            return new ConversationHandlerV2[i];
        }

        /* renamed from: a */
        public ConversationHandlerV2 createFromParcel(Parcel parcel) {
            return new ConversationHandlerV2(parcel);
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
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.chat.ConversationHandlerV2$a */
    public static class C29845a implements BaseJSModel {
        public String chatId;

        C29845a() {
        }
    }

    public ConversationHandlerV2() {
    }

    protected ConversationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public String mo107444a(String str) {
        C29638a.m109622a().getManisDependency().mo107695a(str);
        return "0";
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    private void m110329a(AbstractC25832c cVar, String str) {
        cVar.mo91902a("{" + "\"code\":" + str + "}");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29845a aVar, AbstractC25832c cVar) {
        if (cVar != null) {
            if (mo91997u() == null) {
                m110329a(cVar, "1");
                return;
            }
            String str = aVar.chatId;
            if (TextUtils.isEmpty(str)) {
                m110329a(cVar, "1");
            } else {
                m110329a(cVar, mo107444a(str));
            }
        }
    }
}
