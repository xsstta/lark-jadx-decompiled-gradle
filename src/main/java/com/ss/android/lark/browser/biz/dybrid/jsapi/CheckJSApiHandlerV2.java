package com.ss.android.lark.browser.biz.dybrid.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.biz.dybrid.model.CheckJSApiEntity;

public class CheckJSApiHandlerV2 extends AbstractInjectJSApiHandler<CheckJSApiEntity> implements Parcelable {
    public static final Parcelable.Creator<CheckJSApiHandlerV2> CREATOR = new Parcelable.Creator<CheckJSApiHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.dybrid.jsapi.CheckJSApiHandlerV2.C297621 */

        /* renamed from: a */
        public CheckJSApiHandlerV2[] newArray(int i) {
            return new CheckJSApiHandlerV2[i];
        }

        /* renamed from: a */
        public CheckJSApiHandlerV2 createFromParcel(Parcel parcel) {
            return new CheckJSApiHandlerV2(parcel);
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

    public CheckJSApiHandlerV2() {
    }

    protected CheckJSApiHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(CheckJSApiEntity checkJSApiEntity, AbstractC25832c cVar) {
        if (checkJSApiEntity != null && cVar != null) {
            String api = checkJSApiEntity.getApi();
            if (!TextUtils.isEmpty(api)) {
                boolean a = mo92000x().mo67342b().mo67345a(api);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("available", (Object) Boolean.valueOf(a));
                cVar.mo91902a(jSONObject.toJSONString());
            }
        }
    }
}
