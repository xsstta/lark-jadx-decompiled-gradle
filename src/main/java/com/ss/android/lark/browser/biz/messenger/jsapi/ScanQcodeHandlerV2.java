package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.ScanQcodeHandlerV2;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.List;

public class ScanQcodeHandlerV2 extends AbstractInjectJSApiHandler<C29831a> implements Parcelable {
    public static final Parcelable.Creator<ScanQcodeHandlerV2> CREATOR = new Parcelable.Creator<ScanQcodeHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.ScanQcodeHandlerV2.C298302 */

        /* renamed from: a */
        public ScanQcodeHandlerV2[] newArray(int i) {
            return new ScanQcodeHandlerV2[i];
        }

        /* renamed from: a */
        public ScanQcodeHandlerV2 createFromParcel(Parcel parcel) {
            return new ScanQcodeHandlerV2(parcel);
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
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.ScanQcodeHandlerV2$a */
    public static class C29831a implements BaseJSModel {
        public boolean barCodeInput;
        public List<String> type;

        C29831a() {
        }
    }

    public ScanQcodeHandlerV2() {
    }

    protected ScanQcodeHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29831a aVar, final AbstractC25832c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int[] iArr;
        if (aVar == null || !aVar.barCodeInput) {
            z = false;
        } else {
            z = true;
        }
        if (aVar == null || aVar.type == null) {
            z3 = false;
            z2 = false;
        } else {
            z3 = false;
            z2 = false;
            for (String str : aVar.type) {
                if (TextUtils.equals(str, "barCode")) {
                    z3 = true;
                } else if (TextUtils.equals(str, "qrCode")) {
                    z2 = true;
                }
            }
        }
        if (!z3 || z2) {
            iArr = (z3 || !z2) ? new int[]{0, 1} : new int[]{0};
        } else {
            iArr = new int[]{1};
        }
        C29638a.m109622a().getManisDependency().mo107698a(iArr, z, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.ScanQcodeHandlerV2.C298291 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text", (Object) str);
                UICallbackExecutor.post(new Runnable(jSONObject) {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$ScanQcodeHandlerV2$1$BF41PKifENHU05jIWwqU8gN_bM */
                    public final /* synthetic */ JSONObject f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ScanQcodeHandlerV2.C298291.m270291lambda$BF41PKifENHU05jIWwqU8gN_bM(AbstractC25832c.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m110285a(AbstractC25832c cVar, JSONObject jSONObject) {
                cVar.mo91902a(jSONObject.toJSONString());
            }
        });
    }
}
