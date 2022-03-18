package com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.http.model.ErrorResult;
import com.ss.android.lark.http.model.http.AbstractC38765a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.GetSDKInfoParams;

public class SDKConfigHandler extends AbstractInjectJSApiHandler<GetSDKInfoParams> implements Parcelable {
    public static final Parcelable.Creator<SDKConfigHandler> CREATOR = new Parcelable.Creator<SDKConfigHandler>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKConfigHandler.C298551 */

        /* renamed from: a */
        public SDKConfigHandler[] newArray(int i) {
            return new SDKConfigHandler[i];
        }

        /* renamed from: a */
        public SDKConfigHandler createFromParcel(Parcel parcel) {
            return new SDKConfigHandler(parcel);
        }
    };

    /* renamed from: a */
    private IBrowserModuleDependency.AbstractC29891h f74586a = C29638a.m109622a().getLoginDependency();

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public SDKConfigHandler() {
    }

    protected SDKConfigHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(GetSDKInfoParams getSDKInfoParams, final AbstractC25832c cVar) {
        String d = this.f74586a.mo107684d();
        String e = this.f74586a.mo107685e();
        String deviceId = C29638a.m109622a().getDeviceId();
        String str = Build.VERSION.RELEASE;
        String a = C26246a.m94977a(C29638a.m109622a().getContext());
        if (mo91999w().mo67314g() != null) {
            String url = mo91999w().mo67314g().getUrl();
            C29860a aVar = new C29860a();
            aVar.mo107509a(d);
            aVar.mo107511b(e);
            aVar.mo107519f(deviceId);
            aVar.mo107513c("android");
            aVar.mo107517e(a);
            aVar.mo107515d(str);
            aVar.mo107521g(url);
            if (getSDKInfoParams != null) {
                aVar.mo107523h(getSDKInfoParams.getParam());
                Log.m165379d("SDKConfigHandler", "jsonParams:" + getSDKInfoParams);
            }
            new SDKInfoRequest(aVar).request(new AbstractC38765a<SDKInfoResponse>() {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKConfigHandler.C298562 */

                /* renamed from: a */
                public void mo50782a(final SDKInfoResponse sDKInfoResponse) {
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKConfigHandler.C298562.RunnableC298582 */

                        public void run() {
                            cVar.mo91902a(sDKInfoResponse.getData());
                        }
                    });
                }

                @Override // com.ss.android.lark.http.model.http.AbstractC38765a
                /* renamed from: a */
                public void mo50780a(final ErrorResult errorResult) {
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.sdkconfig.SDKConfigHandler.C298562.RunnableC298571 */

                        public void run() {
                            cVar.mo91904b(errorResult.getErrorMessage());
                        }
                    });
                }
            });
        }
    }
}
