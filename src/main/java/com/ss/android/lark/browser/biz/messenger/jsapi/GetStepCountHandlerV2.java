package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.PermissionChecker;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.common.utility.Logger;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dto.StepCountInfo;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;

public class GetStepCountHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetStepCountHandlerV2> CREATOR = new Parcelable.Creator<GetStepCountHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetStepCountHandlerV2.C297911 */

        /* renamed from: a */
        public GetStepCountHandlerV2[] newArray(int i) {
            return new GetStepCountHandlerV2[i];
        }

        /* renamed from: a */
        public GetStepCountHandlerV2 createFromParcel(Parcel parcel) {
            return new GetStepCountHandlerV2(parcel);
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

    public GetStepCountHandlerV2() {
    }

    protected GetStepCountHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private void m110151a(final AbstractC25832c cVar) {
        C29638a.m109622a().getManisDependency().mo107700b(new IGetDataCallback<StepCountInfo>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetStepCountHandlerV2.C297922 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                GetStepCountHandlerV2.this.mo107293a(cVar, "Failed to get steps", 373002);
            }

            /* renamed from: a */
            public void onSuccess(StepCountInfo stepCountInfo) {
                int a = stepCountInfo.mo107762a();
                JSONObject jSONObject = new JSONObject();
                Logger.m15173i("GetStepCountHandler", "path getStep:" + stepCountInfo);
                if (a < 0) {
                    GetStepCountHandlerV2.this.mo107293a(cVar, "Failed to get steps", 373002);
                    return;
                }
                jSONObject.put("stepcount", (Object) Integer.valueOf(a));
                cVar.mo91902a(jSONObject.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m110153a(AbstractC25832c cVar, Boolean bool) throws Exception {
        m110151a(cVar);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110152a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toJSONString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, AbstractC25832c cVar) {
        Activity u = mo91997u();
        if (u == null) {
            mo107293a(cVar, "Failed to get steps", 373002);
        } else if (Build.VERSION.SDK_INT < 29) {
            m110151a(cVar);
        } else if (PermissionChecker.checkSelfPermission(u, "android.permission.ACTIVITY_RECOGNITION") == 0) {
            m110151a(cVar);
        } else {
            new C51331a(u).mo176924c("android.permission.ACTIVITY_RECOGNITION").subscribe(new Consumer(cVar) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$GetStepCountHandlerV2$x2bypqUHdtqblbrNfUuGYgFnA */
                public final /* synthetic */ AbstractC25832c f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    GetStepCountHandlerV2.this.m110153a((GetStepCountHandlerV2) this.f$1, (AbstractC25832c) ((Boolean) obj));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo107293a(AbstractC25832c cVar, String str, int i) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", (Object) str);
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            UICallbackExecutor.post(new Runnable(jSONObject) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$GetStepCountHandlerV2$qxq0uVSjJEWuvpcAS4XQJt6pkk */
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    GetStepCountHandlerV2.m110152a(AbstractC25832c.this, this.f$1);
                }
            });
        }
    }
}
