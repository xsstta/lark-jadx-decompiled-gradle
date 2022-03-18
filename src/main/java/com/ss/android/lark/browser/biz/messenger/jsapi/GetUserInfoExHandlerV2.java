package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.sdk.C53241h;

public class GetUserInfoExHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetUserInfoExHandlerV2> CREATOR = new Parcelable.Creator<GetUserInfoExHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoExHandlerV2.C297962 */

        /* renamed from: a */
        public GetUserInfoExHandlerV2[] newArray(int i) {
            return new GetUserInfoExHandlerV2[i];
        }

        /* renamed from: a */
        public GetUserInfoExHandlerV2 createFromParcel(Parcel parcel) {
            return new GetUserInfoExHandlerV2(parcel);
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

    public GetUserInfoExHandlerV2() {
    }

    protected GetUserInfoExHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, final AbstractC25832c cVar) {
        C29638a.m109622a().getLoginDependency().mo107679a(new IGetDataCallback<String>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoExHandlerV2.C297951 */

            /* renamed from: a */
            public void onSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    C53241h.m205898b("GetUserInfoExHandler", "getIdpIdentity success");
                    cVar.mo91902a(str);
                    return;
                }
                C53241h.m205898b("GetUserInfoExHandler", "getIdpIdentity error: idpIdentity is empty");
                GetUserInfoExHandlerV2.this.mo107317a(cVar, 393002, "Need login in KA-H5 web");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("GetUserInfoExHandler", "getIdpIdentity error:" + errorResult);
                GetUserInfoExHandlerV2.this.mo107317a(cVar, 393002, "Need login in KA-H5 web");
            }
        });
    }

    /* renamed from: a */
    public void mo107317a(AbstractC25832c cVar, int i, String str) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", (Object) Integer.valueOf(i));
                jSONObject.put("errorMessage", (Object) str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            cVar.mo91904b(jSONObject.toString());
        }
    }
}
