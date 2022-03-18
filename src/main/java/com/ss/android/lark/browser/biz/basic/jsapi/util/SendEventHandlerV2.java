package com.ss.android.lark.browser.biz.basic.jsapi.util;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.SendEvent;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONObject;

public class SendEventHandlerV2 extends AbstractInjectJSApiHandler<SendEvent> implements Parcelable {
    public static final Parcelable.Creator<SendEventHandlerV2> CREATOR = new Parcelable.Creator<SendEventHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.basic.jsapi.util.SendEventHandlerV2.C297491 */

        /* renamed from: a */
        public SendEventHandlerV2[] newArray(int i) {
            return new SendEventHandlerV2[i];
        }

        /* renamed from: a */
        public SendEventHandlerV2 createFromParcel(Parcel parcel) {
            return new SendEventHandlerV2(parcel);
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

    public SendEventHandlerV2() {
    }

    protected SendEventHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(SendEvent sendEvent, AbstractC25832c cVar) {
        if (sendEvent != null && sendEvent.getAction() != null && sendEvent.getParams() != null) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(sendEvent.getParams());
            } catch (Exception e) {
                Log.m165386e("SendEventHandler", e);
            }
            Statistics.sendEvent(sendEvent.getAction(), jSONObject);
        }
    }
}
