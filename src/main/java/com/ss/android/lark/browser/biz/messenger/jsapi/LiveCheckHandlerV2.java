package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.LiveCheckHandlerV2;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.log.Log;

public class LiveCheckHandlerV2 extends AbstractInjectJSApiHandler<String> implements Parcelable {
    public static final Parcelable.Creator<LiveCheckHandlerV2> CREATOR = new Parcelable.Creator<LiveCheckHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.LiveCheckHandlerV2.C298011 */

        /* renamed from: a */
        public LiveCheckHandlerV2[] newArray(int i) {
            return new LiveCheckHandlerV2[i];
        }

        /* renamed from: a */
        public LiveCheckHandlerV2 createFromParcel(Parcel parcel) {
            return new LiveCheckHandlerV2(parcel);
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

    public LiveCheckHandlerV2() {
    }

    protected LiveCheckHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private void m110196a(AbstractC25832c cVar) {
        mo107341a(cVar, "something error", -1);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public void mo107340a(AbstractC25832c cVar, String str) {
        UICallbackExecutor.post(new Runnable(str) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$LiveCheckHandlerV2$qbFsC9jLFzFLhtYjGr_z3XIXFfk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                LiveCheckHandlerV2.lambda$qbFsC9jLFzFLhtYjGr_z3XIXFfk(AbstractC25832c.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m110198b(AbstractC25832c cVar, String str) {
        cVar.mo91902a(str);
        C29929a.m110673a(C29931b.f74684o).addTag("LiveCheckHandlerV2").flush();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo91861a(String str, final AbstractC25832c cVar) {
        Log.m165389i("LiveCheckHandlerV2", "invoke api");
        if (cVar == null) {
            Log.m165383e("LiveCheckHandlerV2", "LiveCheckHandlerV2 fail, callback is null");
        } else if (str == null) {
            Log.m165383e("LiveCheckHandlerV2", "handle LiveCheckHandler fail: json is null");
            m110196a(cVar);
        } else if (mo91997u() == null) {
            Log.m165383e("LiveCheckHandlerV2", "LiveCheckHandlerV2 fail, getActivity is null");
            m110196a(cVar);
        } else {
            C29638a.m109622a().getManisDependency().mo107693a(mo91997u(), str, new IGetDataCallback<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.LiveCheckHandlerV2.C298022 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    LiveCheckHandlerV2.this.mo107340a(cVar, str);
                    Log.m165389i("LiveCheckHandlerV2", "LiveCheckHandlerV2 callback success");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.post(new Runnable(cVar, errorResult) {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$LiveCheckHandlerV2$2$cUsNooZycLNBDV_EFSZyvZrpXDE */
                        public final /* synthetic */ AbstractC25832c f$1;
                        public final /* synthetic */ ErrorResult f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            LiveCheckHandlerV2.C298022.lambda$cUsNooZycLNBDV_EFSZyvZrpXDE(LiveCheckHandlerV2.C298022.this, this.f$1, this.f$2);
                        }
                    });
                    Log.m165383e("LiveCheckHandlerV2", "LiveCheckHandlerV2 callback fail: msg:" + errorResult.getDebugMsg() + " code:" + errorResult.getErrorCode());
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m110206a(AbstractC25832c cVar, ErrorResult errorResult) {
                    LiveCheckHandlerV2.this.mo107341a(cVar, errorResult.getDebugMsg(), errorResult.getErrorCode());
                }
            });
        }
    }

    /* renamed from: a */
    private void m110197a(String str, int i) {
        if (i == -3006 || i == -3005 || i == -3003 || i == -3002) {
            C29929a.m110673a(C29931b.f74684o).addTag("LiveCheckHandlerV2").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
        } else if (i != -1006) {
            C29929a.m110673a(C29931b.f74685p).addTag("LiveCheckHandlerV2").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
        } else {
            C29929a.m110673a(C29931b.f74682m).addTag("LiveCheckHandlerV2").setErrorCode(String.valueOf(i)).setErrorMessage(str).flush();
        }
    }

    /* renamed from: a */
    public void mo107341a(AbstractC25832c cVar, String str, int i) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("errorMessage", str);
        jsonObject.addProperty("errorCode", Integer.valueOf(i));
        cVar.mo91904b(jsonObject.toString());
        m110197a(str, i);
    }
}
