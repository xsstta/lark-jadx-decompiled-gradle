package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.biz.messenger.C29773b;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.browser.impl.statistics.BrowserHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareHandlerV2 extends AbstractInjectJSApiHandler<ShareModel> implements Parcelable {
    public static final Parcelable.Creator<ShareHandlerV2> CREATOR = new Parcelable.Creator<ShareHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.ShareHandlerV2.C298321 */

        /* renamed from: a */
        public ShareHandlerV2[] newArray(int i) {
            return new ShareHandlerV2[i];
        }

        /* renamed from: a */
        public ShareHandlerV2 createFromParcel(Parcel parcel) {
            return new ShareHandlerV2(parcel);
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

    public ShareHandlerV2() {
    }

    protected ShareHandlerV2(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110289a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m110290b(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91902a(jSONObject.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(ShareModel shareModel, AbstractC25832c cVar) {
        BrowserHitPoint.f74663a.mo107797b("", "app_customize");
        C29929a.m110673a(C29931b.f74694y).addCategoryValue("op_tracking", "opshare_h5_sdk_api").flush();
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(shareModel.getUrl())) {
            sb.append("url");
        }
        if (TextUtils.isEmpty(shareModel.getTitle())) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append(",");
            }
            sb.append("title");
        }
        if (!TextUtils.isEmpty(sb)) {
            Log.m165397w("ShareHandlerV2", "ShareHandlerV2->onRequest param is empty!" + ((Object) sb));
            C29929a.m110673a(C29931b.f74695z).addCategoryValue("param_name", sb.toString()).flush();
            mo107422a(false, cVar, "url or title is empty");
            return;
        }
        Fragment v = mo91998v();
        Log.m165389i("ShareHandlerV2", " h5 use new card share ");
        if (v == null) {
            Log.m165383e("ShareHandlerV2", " fragment is null ");
            mo107422a(false, cVar, "fragment is null");
            return;
        }
        ViewGroup f = mo91999w().mo67313f();
        if (f == null) {
            Log.m165383e("ShareHandlerV2", " rootView is null ");
            mo107422a(false, cVar, "rootView is null");
            return;
        }
        C29773b.m110111a(v, f, shareModel.getUrl(), shareModel.getTitle(), shareModel.getContent(), shareModel.getImage());
        BrowserHitPoint.f74663a.mo107798c("", "app_customize");
        mo107422a(true, cVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo107422a(boolean z, AbstractC25832c cVar, String str) {
        if (cVar == null) {
            Log.m165383e("ShareHandlerV2", " share handler v2 callback null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            UICallbackExecutor.post(new Runnable(jSONObject) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$ShareHandlerV2$XTIdW7MVKErPQ931JVMrPucRP3g */
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ShareHandlerV2.lambda$XTIdW7MVKErPQ931JVMrPucRP3g(AbstractC25832c.this, this.f$1);
                }
            });
            return;
        }
        try {
            jSONObject.put("errorMessage", str);
        } catch (JSONException e) {
            Log.m165386e("ShareHandlerV2", e);
        }
        UICallbackExecutor.post(new Runnable(jSONObject) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$ShareHandlerV2$_zwn2XQMTOigSQuRkwpFzNUvjA */
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ShareHandlerV2.m270292lambda$_zwn2XQMTOigSQuRkwpFzNUvjA(AbstractC25832c.this, this.f$1);
            }
        });
    }
}
