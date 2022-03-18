package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.InsertUserInfoThreeElementHandlerV2;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.log.Log;

public class InsertUserInfoThreeElementHandlerV2 extends AbstractInjectJSApiHandler<String> implements Parcelable {
    public static final Parcelable.Creator<InsertUserInfoThreeElementHandlerV2> CREATOR = new Parcelable.Creator<InsertUserInfoThreeElementHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.InsertUserInfoThreeElementHandlerV2.C297991 */

        /* renamed from: a */
        public InsertUserInfoThreeElementHandlerV2[] newArray(int i) {
            return new InsertUserInfoThreeElementHandlerV2[i];
        }

        /* renamed from: a */
        public InsertUserInfoThreeElementHandlerV2 createFromParcel(Parcel parcel) {
            return new InsertUserInfoThreeElementHandlerV2(parcel);
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

    public InsertUserInfoThreeElementHandlerV2() {
    }

    protected InsertUserInfoThreeElementHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private void m110185a(AbstractC25832c cVar) {
        mo107333a(cVar, "something error", -1);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo91861a(String str, final AbstractC25832c cVar) {
        Log.m165389i("InsertUserInfoThreeElementHandler", "invoke api");
        if (cVar == null) {
            Log.m165383e("InsertUserInfoThreeElementHandler", "handle userInfoThreeElement v2 fail: callback is null");
        } else if (str == null) {
            m110185a(cVar);
            Log.m165383e("InsertUserInfoThreeElementHandler", "handle userInfoThreeElement v2 fail: json is null");
        } else {
            C29638a.m109622a().getManisDependency().mo107696a(str, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.InsertUserInfoThreeElementHandlerV2.C298002 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    UICallbackExecutor.post(new Runnable(str) {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$InsertUserInfoThreeElementHandlerV2$2$rgT3vo76Nh9Ux00ERSJeBDig4Ko */
                        public final /* synthetic */ String f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            InsertUserInfoThreeElementHandlerV2.C298002.lambda$rgT3vo76Nh9Ux00ERSJeBDig4Ko(AbstractC25832c.this, this.f$1);
                        }
                    });
                    Log.m165389i("InsertUserInfoThreeElementHandler", "userInfoThreeElementV2 callback success");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.post(new Runnable(cVar, errorResult) {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$InsertUserInfoThreeElementHandlerV2$2$tEpk8YpMt6QsgUrAxUEaZMj156o */
                        public final /* synthetic */ AbstractC25832c f$1;
                        public final /* synthetic */ ErrorResult f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            InsertUserInfoThreeElementHandlerV2.C298002.lambda$tEpk8YpMt6QsgUrAxUEaZMj156o(InsertUserInfoThreeElementHandlerV2.C298002.this, this.f$1, this.f$2);
                        }
                    });
                    Log.m165383e("InsertUserInfoThreeElementHandler", "userInfoThreeElementV2 callback fail: msg:" + errorResult.getDebugMsg() + " code:" + errorResult.getErrorCode());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m110193a(AbstractC25832c cVar, ErrorResult errorResult) {
                    InsertUserInfoThreeElementHandlerV2.this.mo107333a(cVar, errorResult.getDebugMsg(), errorResult.getErrorCode());
                }
            });
        }
    }

    /* renamed from: a */
    private void m110186a(String str, int i) {
        if (i != 10100) {
            switch (i) {
                case UpdateDialogStatusCode.DISMISS:
                    C29929a.m110673a(C29931b.f74671b).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
                    return;
                case UpdateDialogStatusCode.SHOW:
                    C29929a.m110673a(C29931b.f74672c).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
                    return;
                case 10003:
                    C29929a.m110673a(C29931b.f74673d).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
                    return;
                case 10004:
                    C29929a.m110673a(C29931b.f74674e).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
                    return;
                default:
                    C29929a.m110673a(C29931b.f74679j).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
                    return;
            }
        } else {
            C29929a.m110673a(C29931b.f74686q).addTag("InsertUserInfoThreeElementHandler").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
        }
    }

    /* renamed from: a */
    public void mo107333a(AbstractC25832c cVar, String str, int i) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("errorMessage", str);
        jsonObject.addProperty("errorCode", Integer.valueOf(i));
        cVar.mo91904b(jsonObject.toString());
        m110186a(str, i);
    }
}
