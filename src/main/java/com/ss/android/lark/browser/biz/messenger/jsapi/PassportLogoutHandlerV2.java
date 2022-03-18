package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class PassportLogoutHandlerV2 extends AbstractInjectJSApiHandler<LogoutConfig> implements Parcelable {
    public static final Parcelable.Creator<PassportLogoutHandlerV2> CREATOR = new Parcelable.Creator<PassportLogoutHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.PassportLogoutHandlerV2.C298241 */

        /* renamed from: a */
        public PassportLogoutHandlerV2[] newArray(int i) {
            return new PassportLogoutHandlerV2[i];
        }

        /* renamed from: a */
        public PassportLogoutHandlerV2 createFromParcel(Parcel parcel) {
            return new PassportLogoutHandlerV2(parcel);
        }
    };

    public static class LogoutConfig implements BaseJSModel {
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

    public PassportLogoutHandlerV2() {
    }

    protected PassportLogoutHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LogoutConfig logoutConfig, final AbstractC25832c cVar) {
        C29638a.m109622a().getLoginDependency().mo107678a(mo91997u(), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.PassportLogoutHandlerV2.C298252 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                PassportLogoutHandlerV2.this.mo107402a(cVar, 441001, errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", (Object) 0);
                cVar.mo91902a(jSONObject.toJSONString());
            }
        });
    }

    /* renamed from: a */
    public void mo107402a(AbstractC25832c cVar, int i, String str) {
        if (cVar == null) {
            Log.m165383e("PassportLogoutHandlerV2", "handleError, callback is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            jSONObject.put("errorMessage", (Object) str);
        } catch (Throwable th) {
            Log.m165383e("PassportLogoutHandlerV2", "handleError, error：" + th.getMessage());
        }
        cVar.mo91904b(jSONObject.toString());
    }
}
