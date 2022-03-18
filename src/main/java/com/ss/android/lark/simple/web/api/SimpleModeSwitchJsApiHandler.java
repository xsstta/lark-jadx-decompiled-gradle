package com.ss.android.lark.simple.web.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.simple.switcher.SimpleModeSwitcher;

public class SimpleModeSwitchJsApiHandler extends AbstractInjectJSApiHandler<SimpleModeSwitchConfig> implements Parcelable {
    public static final Parcelable.Creator<SimpleModeSwitchJsApiHandler> CREATOR = new Parcelable.Creator<SimpleModeSwitchJsApiHandler>() {
        /* class com.ss.android.lark.simple.web.api.SimpleModeSwitchJsApiHandler.C549012 */

        /* renamed from: a */
        public SimpleModeSwitchJsApiHandler[] newArray(int i) {
            return new SimpleModeSwitchJsApiHandler[i];
        }

        /* renamed from: a */
        public SimpleModeSwitchJsApiHandler createFromParcel(Parcel parcel) {
            return new SimpleModeSwitchJsApiHandler(parcel);
        }
    };

    public static class SimpleModeSwitchConfig implements BaseJSModel {
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

    public SimpleModeSwitchJsApiHandler() {
    }

    protected SimpleModeSwitchJsApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(SimpleModeSwitchConfig simpleModeSwitchConfig, AbstractC25832c cVar) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.simple.web.api.SimpleModeSwitchJsApiHandler.RunnableC549001 */

            public void run() {
                SimpleModeSwitcher.m212746a(SimpleModeSwitchJsApiHandler.this.mo91997u(), 0, false);
            }
        });
    }
}
