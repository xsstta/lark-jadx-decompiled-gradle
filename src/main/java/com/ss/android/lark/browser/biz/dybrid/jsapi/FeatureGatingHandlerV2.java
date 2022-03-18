package com.ss.android.lark.browser.biz.dybrid.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.dybrid.model.FeatureGatingModel;

public class FeatureGatingHandlerV2 extends AbstractInjectJSApiHandler<FeatureGatingModel> implements Parcelable {
    public static final Parcelable.Creator<FeatureGatingHandlerV2> CREATOR = new Parcelable.Creator<FeatureGatingHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.dybrid.jsapi.FeatureGatingHandlerV2.C297631 */

        /* renamed from: a */
        public FeatureGatingHandlerV2[] newArray(int i) {
            return new FeatureGatingHandlerV2[i];
        }

        /* renamed from: a */
        public FeatureGatingHandlerV2 createFromParcel(Parcel parcel) {
            return new FeatureGatingHandlerV2(parcel);
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

    public FeatureGatingHandlerV2() {
    }

    protected FeatureGatingHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(FeatureGatingModel featureGatingModel, AbstractC25832c cVar) {
        if (cVar != null && featureGatingModel != null) {
            boolean isFeatureGatingEnable = C29638a.m109622a().isFeatureGatingEnable(featureGatingModel.getKey());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", (Object) Boolean.valueOf(isFeatureGatingEnable));
            cVar.mo91902a(jSONObject.toJSONString());
        }
    }
}
