package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;

public class NativeLogHandlerV2 extends AbstractInjectJSApiHandler<NativeLogConfig> implements Parcelable {
    public static final Parcelable.Creator<NativeLogHandlerV2> CREATOR = new Parcelable.Creator<NativeLogHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.NativeLogHandlerV2.C298101 */

        /* renamed from: a */
        public NativeLogHandlerV2[] newArray(int i) {
            return new NativeLogHandlerV2[i];
        }

        /* renamed from: a */
        public NativeLogHandlerV2 createFromParcel(Parcel parcel) {
            return new NativeLogHandlerV2(parcel);
        }
    };

    public static class NativeLogConfig implements BaseJSModel {
        public int level;
        public String msg;
        public String tag;
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

    public NativeLogHandlerV2() {
    }

    protected NativeLogHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(NativeLogConfig nativeLogConfig, AbstractC25832c cVar) {
        if (nativeLogConfig == null || nativeLogConfig.msg == null) {
            Log.m165383e("NativeLogHandlerV2", "handleError, callback is null");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) "1015");
            cVar.mo91904b(jSONObject.toJSONString());
            return;
        }
        String str = "biz.util.nativeLog";
        if (nativeLogConfig.tag != null) {
            str = str.concat(nativeLogConfig.tag);
        }
        int i = nativeLogConfig.level;
        if (i == 0) {
            Log.m165389i(str, nativeLogConfig.msg);
        } else if (i == 1) {
            Log.m165393v(str, nativeLogConfig.msg);
        } else if (i == 2) {
            Log.m165379d(str, nativeLogConfig.msg);
        } else if (i == 3) {
            Log.m165397w(str, nativeLogConfig.msg);
        } else if (i != 4) {
            Log.m165389i(str, nativeLogConfig.msg);
        } else {
            Log.m165383e(str, nativeLogConfig.msg);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) 0);
        cVar.mo91902a(jSONObject2.toJSONString());
    }
}
