package com.ss.android.lark.browser.biz.dybrid.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class GetLarkEnvHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetLarkEnvHandlerV2> CREATOR = new Parcelable.Creator<GetLarkEnvHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.dybrid.jsapi.GetLarkEnvHandlerV2.C297641 */

        /* renamed from: a */
        public GetLarkEnvHandlerV2[] newArray(int i) {
            return new GetLarkEnvHandlerV2[i];
        }

        /* renamed from: a */
        public GetLarkEnvHandlerV2 createFromParcel(Parcel parcel) {
            return new GetLarkEnvHandlerV2(parcel);
        }
    };

    public enum DEPLOY_ENV_ENUM {
        RELEASE,
        STAGING,
        PRE_RELEASE,
        OVERSEA_RELEASE,
        OVERSEA_STAGING
    }

    public enum LOGIN_ENV_ENUM {
        FEISHU,
        LARK,
        KA
    }

    public enum PKG_ENV_ENUM {
        FEISHU_RELEASE,
        FEISHU_INHOURSE,
        LARK_RELEASE,
        LARK_INHOURSE
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

    public GetLarkEnvHandlerV2() {
    }

    protected GetLarkEnvHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        LOGIN_ENV_ENUM login_env_enum;
        int i;
        if (cVar != null) {
            boolean isOverseaTenantBrand = C29638a.m109622a().isOverseaTenantBrand();
            boolean isGooglePlay = C29638a.m109622a().isGooglePlay();
            JSONObject jSONObject = new JSONObject();
            if (isOverseaTenantBrand) {
                login_env_enum = LOGIN_ENV_ENUM.LARK;
            } else {
                login_env_enum = LOGIN_ENV_ENUM.FEISHU;
            }
            jSONObject.put("loginEnv", (Object) Integer.valueOf(login_env_enum.ordinal()));
            if (isGooglePlay) {
                i = PKG_ENV_ENUM.LARK_RELEASE.ordinal();
            } else {
                i = PKG_ENV_ENUM.FEISHU_RELEASE.ordinal();
            }
            jSONObject.put("pkgEnv", (Object) Integer.valueOf(i));
            jSONObject.put("deployEnv", (Object) Integer.valueOf(C29638a.m109622a().getEnvType()));
            cVar.mo91902a(jSONObject.toJSONString());
        }
    }
}
