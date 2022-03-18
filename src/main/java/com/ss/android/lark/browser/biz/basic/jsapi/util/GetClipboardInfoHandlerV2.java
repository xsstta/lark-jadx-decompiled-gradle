package com.ss.android.lark.browser.biz.basic.jsapi.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.CopyText;
import org.json.JSONException;
import org.json.JSONObject;

public class GetClipboardInfoHandlerV2 extends AbstractInjectJSApiHandler<CopyText> implements Parcelable {
    public static final Parcelable.Creator<GetClipboardInfoHandlerV2> CREATOR = new Parcelable.Creator<GetClipboardInfoHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.GetClipboardInfoHandlerV2.C297421 */

        /* renamed from: a */
        public GetClipboardInfoHandlerV2[] newArray(int i) {
            return new GetClipboardInfoHandlerV2[i];
        }

        /* renamed from: a */
        public GetClipboardInfoHandlerV2 createFromParcel(Parcel parcel) {
            return new GetClipboardInfoHandlerV2(parcel);
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

    public GetClipboardInfoHandlerV2() {
    }

    /* renamed from: b */
    private String m109986b() {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) mo91997u().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return "";
        }
        return text.toString();
    }

    protected GetClipboardInfoHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(CopyText copyText, AbstractC25832c cVar) {
        Log.m165389i("GetClipboardInfoV2", "get clipboard v2 .....");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("text", m109986b());
        } catch (JSONException e) {
            Log.m165397w("GetClipboardInfoV2", "get clipboard v2 error:" + e.getMessage());
        }
        cVar.mo91902a(jSONObject.toString());
    }
}
