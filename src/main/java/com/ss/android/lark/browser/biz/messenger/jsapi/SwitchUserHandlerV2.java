package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.SwitchUserHandlerV2;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class SwitchUserHandlerV2 extends AbstractInjectJSApiHandler<SwitchUserData> implements Parcelable {
    public static final Parcelable.Creator<SwitchUserHandlerV2> CREATOR = new Parcelable.Creator<SwitchUserHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.SwitchUserHandlerV2.C298331 */

        /* renamed from: a */
        public SwitchUserHandlerV2[] newArray(int i) {
            return new SwitchUserHandlerV2[i];
        }

        /* renamed from: a */
        public SwitchUserHandlerV2 createFromParcel(Parcel parcel) {
            return new SwitchUserHandlerV2(parcel);
        }
    };

    public static class SwitchUserData implements BaseJSModel {
        public String userId;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.SwitchUserHandlerV2$a */
    public static class C29835a implements BaseJSModel {
        public String session;

        C29835a() {
        }
    }

    public SwitchUserHandlerV2() {
    }

    protected SwitchUserHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo107429a(ViewUtils.C57751a aVar) {
        if (aVar != null) {
            aVar.mo196042e();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110297a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(SwitchUserData switchUserData, final AbstractC25832c cVar) {
        String str;
        if (switchUserData != null) {
            str = switchUserData.userId;
        } else {
            str = null;
        }
        Log.m165389i("SwitchUserHandlerV2", "switchUser, onRequest, userId: " + str);
        final ViewUtils.C57751a a = ViewUtils.m224143a(mo91997u(), UIHelper.getString(R.string.Lark_Setting_SwitchUserLoadingTip));
        a.mo196039b();
        C29638a.m109622a().getManisDependency().mo107705c(str, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.SwitchUserHandlerV2.C298342 */

            /* renamed from: a */
            public void onSuccess(String str) {
                Log.m165389i("SwitchUserHandlerV2", "switch user success");
                UICallbackExecutor.post(new Runnable(str, cVar) {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$SwitchUserHandlerV2$2$B5iJNOM9iIi4kDYaF7IpzkkBEt8 */
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ AbstractC25832c f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        SwitchUserHandlerV2.C298342.lambda$B5iJNOM9iIi4kDYaF7IpzkkBEt8(this.f$0, this.f$1);
                    }
                });
                SwitchUserHandlerV2.this.mo107429a(a);
                C29638a.m109622a().getMainDependency().mo107689a(SwitchUserHandlerV2.this.mo91997u());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("SwitchUserHandlerV2", "switch user error: " + errorResult.getDisplayMsg() + ", code: " + errorResult.getErrorCode());
                SwitchUserHandlerV2.this.mo107427a(cVar, errorResult.getErrorCode(), errorResult.getDisplayMsg());
                SwitchUserHandlerV2.this.mo107429a(a);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m110305a(String str, AbstractC25832c cVar) {
                C29835a aVar = new C29835a();
                aVar.session = str;
                cVar.mo91902a(C38760a.m153057a(aVar));
            }
        });
    }

    /* renamed from: a */
    public void mo107427a(AbstractC25832c cVar, int i, String str) {
        if (cVar == null) {
            Log.m165383e("SwitchUserHandlerV2", "handleError, callback is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i);
            jSONObject.put("errorMessage", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        UICallbackExecutor.post(new Runnable(jSONObject) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$SwitchUserHandlerV2$xpAtPdTf2OkQvt1WFvuYZOD_vng */
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                SwitchUserHandlerV2.lambda$xpAtPdTf2OkQvt1WFvuYZOD_vng(AbstractC25832c.this, this.f$1);
            }
        });
    }
}
