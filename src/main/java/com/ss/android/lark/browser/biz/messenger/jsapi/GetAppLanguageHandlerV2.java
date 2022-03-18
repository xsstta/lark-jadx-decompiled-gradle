package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class GetAppLanguageHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetAppLanguageHandlerV2> CREATOR = new Parcelable.Creator<GetAppLanguageHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetAppLanguageHandlerV2.C297901 */

        /* renamed from: a */
        public GetAppLanguageHandlerV2[] newArray(int i) {
            return new GetAppLanguageHandlerV2[i];
        }

        /* renamed from: a */
        public GetAppLanguageHandlerV2 createFromParcel(Parcel parcel) {
            return new GetAppLanguageHandlerV2(parcel);
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

    public GetAppLanguageHandlerV2() {
    }

    protected GetAppLanguageHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        if (cVar != null) {
            Locale a = C29638a.m109622a().getLanguageDependency().mo107673a();
            String str = a.getLanguage() + "_" + a.getCountry();
            if ("in_ID".equals(str)) {
                str = "id_ID";
            }
            String displayLanguage = a.getDisplayLanguage();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", str);
                jSONObject.put("name", displayLanguage);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            cVar.mo91902a(jSONObject.toString());
        }
    }
}
