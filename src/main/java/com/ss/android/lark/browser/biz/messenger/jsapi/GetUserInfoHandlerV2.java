package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoHandlerV2;
import com.ss.android.lark.browser.dto.Profile;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40637d;
import org.json.JSONException;
import org.json.JSONObject;

public class GetUserInfoHandlerV2 extends AbstractInjectJSApiHandler<BaseJSModel> implements Parcelable {
    public static final Parcelable.Creator<GetUserInfoHandlerV2> CREATOR = new Parcelable.Creator<GetUserInfoHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoHandlerV2.C297971 */

        /* renamed from: a */
        public GetUserInfoHandlerV2[] newArray(int i) {
            return new GetUserInfoHandlerV2[i];
        }

        /* renamed from: a */
        public GetUserInfoHandlerV2 createFromParcel(Parcel parcel) {
            return new GetUserInfoHandlerV2(parcel);
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

    public GetUserInfoHandlerV2() {
    }

    /* renamed from: b */
    public void mo107327b() {
        new OPMonitor("mp_old_js_user_info_sum", C40637d.f103069a).reportPlatform(2).flush();
    }

    protected GetUserInfoHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public String mo107324a(Profile profile) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", profile.getName());
            jSONObject.put("gender", profile.getGender());
            jSONObject.put("email", profile.getEmail());
            jSONObject.put("employeeId", profile.getEmployeeId());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110174a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(BaseJSModel baseJSModel, final AbstractC25832c cVar) {
        if (C29638a.m109622a().isFeatureGatingEnable("gadget.web.browser.geouserinfo.open")) {
            mo107325a(cVar, 343001, "api is close,please use tt.getUserInfo");
            Logger.m15173i("GetUserInfoHandler", "get user info is close");
            return;
        }
        C29638a.m109622a().getManisDependency().mo107694a(new IGetDataCallback<Profile>() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.GetUserInfoHandlerV2.C297982 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                GetUserInfoHandlerV2.this.mo107325a(cVar, 343001, "Failed to get user information");
            }

            /* renamed from: a */
            public void onSuccess(Profile profile) {
                if (profile == null) {
                    GetUserInfoHandlerV2.this.mo107325a(cVar, 343001, "Failed to get user information");
                    return;
                }
                Logger.m15173i("GetUserInfoHandler", "path getUserInfo:" + profile);
                UICallbackExecutor.post(new Runnable(cVar, profile) {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$GetUserInfoHandlerV2$2$VR5xP77dagWjWV79bRNn4S2usR0 */
                    public final /* synthetic */ AbstractC25832c f$1;
                    public final /* synthetic */ Profile f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        GetUserInfoHandlerV2.C297982.this.m110183a(this.f$1, this.f$2);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m110183a(AbstractC25832c cVar, Profile profile) {
                cVar.mo91902a(GetUserInfoHandlerV2.this.mo107324a(profile));
            }
        });
        mo107327b();
    }

    /* renamed from: a */
    public void mo107325a(AbstractC25832c cVar, int i, String str) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i);
                jSONObject.put("errorMessage", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            UICallbackExecutor.post(new Runnable(jSONObject) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$GetUserInfoHandlerV2$hLopU9j5IWyQfjWnl1woO7mYcRU */
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    GetUserInfoHandlerV2.m110174a(AbstractC25832c.this, this.f$1);
                }
            });
        }
    }
}
