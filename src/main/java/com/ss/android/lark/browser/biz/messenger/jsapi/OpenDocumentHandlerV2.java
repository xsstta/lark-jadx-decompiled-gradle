package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class OpenDocumentHandlerV2 extends AbstractInjectJSApiHandler<C29821a> implements Parcelable {
    public static final Parcelable.Creator<OpenDocumentHandlerV2> CREATOR = new Parcelable.Creator<OpenDocumentHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2.C298171 */

        /* renamed from: a */
        public OpenDocumentHandlerV2[] newArray(int i) {
            return new OpenDocumentHandlerV2[i];
        }

        /* renamed from: a */
        public OpenDocumentHandlerV2 createFromParcel(Parcel parcel) {
            return new OpenDocumentHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private static final List<String> f74542a = Arrays.asList("doc", "docx", "xls", "xlsx", "ppt", "pptx", "pdf");

    /* renamed from: a */
    public static Thread m110239a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

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
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2$a */
    public static class C29821a implements BaseJSModel {
        public String body;
        public String fileType;
        public Map<String, String> header;
        public String method;
        public String url;

        C29821a() {
        }
    }

    public OpenDocumentHandlerV2() {
    }

    protected OpenDocumentHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110240a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toJSONString());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91861a(com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2.C29821a r13, final com.larksuite.component.webview.container.dto.AbstractC25832c r14) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2.mo91861a(com.ss.android.lark.browser.biz.messenger.jsapi.OpenDocumentHandlerV2$a, com.larksuite.component.webview.container.dto.c):void");
    }

    /* renamed from: a */
    public void mo107381a(AbstractC25832c cVar, String str, int i) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", (Object) str);
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            UICallbackExecutor.post(new Runnable(jSONObject) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$OpenDocumentHandlerV2$Gu_BAewt0f8OJAoFwnKBRSRxgPk */
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    OpenDocumentHandlerV2.lambda$Gu_BAewt0f8OJAoFwnKBRSRxgPk(AbstractC25832c.this, this.f$1);
                }
            });
        }
    }
}
