package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.ConfigHandlerV2;
import com.ss.android.lark.openapi.jsapi.entity.ConfigData;
import com.ss.android.lark.openapi.permission.AbstractC48767b;
import com.ss.android.lark.openapi.permission.C48765a;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.ss.android.lark.sdk.C53241h;

public class ConfigHandlerV2 extends AbstractInjectJSApiHandler<ConfigData> implements Parcelable {
    public static final Parcelable.Creator<ConfigHandlerV2> CREATOR = new Parcelable.Creator<ConfigHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.ConfigHandlerV2.C297881 */

        /* renamed from: a */
        public ConfigHandlerV2[] newArray(int i) {
            return new ConfigHandlerV2[i];
        }

        /* renamed from: a */
        public ConfigHandlerV2 createFromParcel(Parcel parcel) {
            return new ConfigHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    private String f74507a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public ConfigHandlerV2() {
    }

    protected ConfigHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        String e = C29638a.m109622a().getLoginDependency().mo107685e();
        this.f74507a = e;
        if (TextUtils.isEmpty(e)) {
            this.f74507a = "";
        }
    }

    /* renamed from: a */
    private C48772b m110136a(ConfigData configData) {
        if (configData == null) {
            return null;
        }
        C48772b.C48774a aVar = new C48772b.C48774a();
        aVar.mo170356a(configData.getAppId()).mo170362e(this.f74507a).mo170361d(configData.getSignature()).mo170360c(configData.getNonceStr()).mo170359b(configData.getTimestamp()).mo170363f(C48765a.m192097a(mo91999w().mo67314g().getUrl())).mo170357a(configData.getJsApiList());
        return aVar.mo170358a();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(ConfigData configData, final AbstractC25832c cVar) {
        if (C29638a.m109622a().isFeatureGatingEnable("lark.h5api.verify")) {
            C53241h.m205898b("ConfigHandlerV2", "config handle disable verify...");
            cVar.mo91902a(C48768a.m192107a().mo51069b());
            return;
        }
        mo92000x().mo67342b().mo67344a().mo170323a(C29638a.m109622a().getOpenApiUrl(), C29638a.m109622a().getLoginDependency().mo107682b(), m110136a(configData), new AbstractC48767b() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.ConfigHandlerV2.C297892 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m110142a(AbstractC25832c cVar) {
                if (cVar != null) {
                    cVar.mo91902a("{" + "\"code\":" + "0" + "}");
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m110143a(AbstractC25832c cVar, String str) {
                if (cVar != null) {
                    cVar.mo91904b(str);
                }
            }

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50795a(C48772b bVar, VerifyResponse verifyResponse) {
                ConfigHandlerV2.this.mo91999w().mo67314g().post(new Runnable() {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$ConfigHandlerV2$2$Hd1RuJLlPUazfkolWiTXooFZzo */

                    public final void run() {
                        ConfigHandlerV2.C297892.m110142a(AbstractC25832c.this);
                    }
                });
            }

            @Override // com.ss.android.lark.openapi.permission.AbstractC48767b
            /* renamed from: a */
            public void mo50796a(C48772b bVar, String str) {
                ConfigHandlerV2.this.mo91999w().mo67314g().post(new Runnable(str) {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$ConfigHandlerV2$2$1jkaCKWDN0dwKnsJcfPyL1caXC8 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ConfigHandlerV2.C297892.m110143a(AbstractC25832c.this, this.f$1);
                    }
                });
            }
        });
    }
}
