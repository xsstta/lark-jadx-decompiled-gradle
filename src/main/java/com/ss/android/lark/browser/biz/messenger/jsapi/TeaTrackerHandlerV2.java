package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.statistics.Statistics;
import java.util.Map;
import org.json.JSONObject;

public class TeaTrackerHandlerV2 extends AbstractInjectJSApiHandler<TeaTrackerConfig> implements Parcelable {
    public static final Parcelable.Creator<TeaTrackerHandlerV2> CREATOR = new Parcelable.Creator<TeaTrackerHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.TeaTrackerHandlerV2.C298361 */

        /* renamed from: a */
        public TeaTrackerHandlerV2[] newArray(int i) {
            return new TeaTrackerHandlerV2[i];
        }

        /* renamed from: a */
        public TeaTrackerHandlerV2 createFromParcel(Parcel parcel) {
            return new TeaTrackerHandlerV2(parcel);
        }
    };

    public static class TeaTrackerConfig implements BaseJSModel {
        public String eventName;
        public Map<String, String> eventParams;
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

    public TeaTrackerHandlerV2() {
    }

    protected TeaTrackerHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(TeaTrackerConfig teaTrackerConfig, AbstractC25832c cVar) {
        if (teaTrackerConfig == null || teaTrackerConfig.eventName == null) {
            Log.m165383e("TeaTrackerHandlerV2", "onRequest, callback is null");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", "1016");
            } catch (Throwable th) {
                Log.m165383e("TeaTrackerHandlerV2", "onRequest " + th.getMessage());
            }
            cVar.mo91904b(jSONObject.toString());
            return;
        }
        JSONObject jSONObject2 = null;
        if (teaTrackerConfig.eventParams != null) {
            try {
                jSONObject2 = new JSONObject(teaTrackerConfig.eventParams.toString());
            } catch (Throwable th2) {
                Log.m165383e("TeaTrackerHandlerV2", "onRequest " + th2.getMessage());
            }
        }
        Statistics.sendEvent(teaTrackerConfig.eventName, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("code", 0);
        } catch (Throwable th3) {
            Log.m165383e("TeaTrackerHandlerV2", "onRequest " + th3.getMessage());
        }
        cVar.mo91902a(jSONObject3.toString());
    }
}
