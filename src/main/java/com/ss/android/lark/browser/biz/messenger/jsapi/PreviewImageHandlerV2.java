package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26317s;
import com.ss.android.lark.biz.core.api.browser.AbstractC29554c;
import com.ss.android.lark.biz.core.api.browser.PreviewV2Request;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.PreviewImageHandlerV2;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.utils.C57782ag;
import java.util.ArrayList;
import java.util.List;

public class PreviewImageHandlerV2 extends AbstractInjectJSApiHandler<C29828a> implements Parcelable {
    public static final Parcelable.Creator<PreviewImageHandlerV2> CREATOR = new Parcelable.Creator<PreviewImageHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.PreviewImageHandlerV2.C298261 */

        /* renamed from: a */
        public PreviewImageHandlerV2[] newArray(int i) {
            return new PreviewImageHandlerV2[i];
        }

        /* renamed from: a */
        public PreviewImageHandlerV2 createFromParcel(Parcel parcel) {
            return new PreviewImageHandlerV2(parcel);
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

    public PreviewImageHandlerV2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.PreviewImageHandlerV2$a */
    public static class C29828a implements BaseJSModel {
        public String current = "";
        public List<PreviewV2Request> requests;
        public List<String> urls;

        C29828a() {
        }
    }

    protected PreviewImageHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    private AbstractC29554c m110271a(final AbstractC25832c cVar) {
        return new AbstractC29554c() {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.PreviewImageHandlerV2.C298272 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m110280a(AbstractC25832c cVar, JSONObject jSONObject) {
                cVar.mo91902a(jSONObject.toJSONString());
            }

            @Override // com.ss.android.lark.biz.core.api.browser.AbstractC29554c
            /* renamed from: a */
            public void mo105681a(int i, String str) {
                Log.m165389i("PreviewImageHandlerV2", "onPreviewResult code:" + i + " msg:" + str);
                if (i == 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", (Object) 0);
                    UICallbackExecutor.post(new Runnable(jSONObject) {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$PreviewImageHandlerV2$2$q0lC3dagD7zcoOxqw2yDN6UNjo */
                        public final /* synthetic */ JSONObject f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            PreviewImageHandlerV2.C298272.m270290lambda$q0lC3dagD7zcoOxqw2yDN6UNjo(AbstractC25832c.this, this.f$1);
                        }
                    });
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "failed to load image";
                }
                if (i == -1) {
                    i = 433001;
                }
                PreviewImageHandlerV2.this.mo107409a(cVar, str, i);
            }
        };
    }

    /* renamed from: a */
    private boolean m110273a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("http")) {
            return false;
        }
        return true;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m110272a(AbstractC25832c cVar, JSONObject jSONObject) {
        cVar.mo91904b(jSONObject.toJSONString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29828a aVar, AbstractC25832c cVar) {
        Log.m165389i("PreviewImageHandlerV2", "invoke api");
        if (aVar == null) {
            Log.m165389i("PreviewImageHandlerV2", "params is null");
            mo107409a(cVar, "invalid param", 1015);
        } else if (!mo91998v().isAdded() || mo91998v().getActivity() == null) {
            Log.m165389i("PreviewImageHandlerV2", "Fragment is not active");
            mo107409a(cVar, "Fragment is not active", 433001);
        } else {
            boolean a = C26317s.m95316a(aVar.urls);
            boolean a2 = C26317s.m95316a(aVar.requests);
            if (a && a2) {
                Log.m165389i("PreviewImageHandlerV2", "urls and requests is empty");
                mo107409a(cVar, "urls and requests is empty", 433002);
            } else if (a || a2) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                if (!a) {
                    int i2 = 0;
                    while (i < aVar.urls.size()) {
                        String str = aVar.urls.get(i);
                        if (m110273a(str)) {
                            Log.m165389i("PreviewImageHandlerV2", "invaild url");
                            mo107409a(cVar, "invaild url", 433004);
                            return;
                        }
                        if (C57782ag.m224242a(str, aVar.current)) {
                            i2 = i;
                        }
                        arrayList.add(new PreviewV2Request(str));
                        i++;
                    }
                    i = i2;
                } else {
                    for (int i3 = 0; i3 < aVar.requests.size(); i3++) {
                        PreviewV2Request previewV2Request = aVar.requests.get(i3);
                        if (m110273a(previewV2Request.url)) {
                            Log.m165389i("PreviewImageHandlerV2", "invaild url");
                            mo107409a(cVar, "invaild url", 433004);
                            return;
                        }
                        if (previewV2Request.method != null) {
                            previewV2Request.method = previewV2Request.method.toUpperCase();
                            if (!TextUtils.equals("GET", previewV2Request.method) && !TextUtils.equals("POST", previewV2Request.method)) {
                                Log.m165389i("PreviewImageHandlerV2", "invaild method");
                                mo107409a(cVar, "invaild method", 433005);
                                return;
                            }
                        }
                    }
                    arrayList.addAll(aVar.requests);
                }
                Log.m165389i("PreviewImageHandlerV2", "invoke startPreviewImage");
                C29638a.m109622a().startPreviewImageV2(mo91998v(), arrayList, i, m110271a(cVar));
            } else {
                Log.m165389i("PreviewImageHandlerV2", "urls and requests is mutually exclusive");
                mo107409a(cVar, "urls and requests is mutually exclusive", 433003);
            }
        }
    }

    /* renamed from: a */
    public void mo107409a(AbstractC25832c cVar, String str, int i) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMessage", (Object) str);
            jSONObject.put("errorCode", (Object) Integer.valueOf(i));
            UICallbackExecutor.post(new Runnable(jSONObject) {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.$$Lambda$PreviewImageHandlerV2$VFLg4Us4ogDZCepE_hhlyaGHRs */
                public final /* synthetic */ JSONObject f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    PreviewImageHandlerV2.m270289lambda$VFLg4Us4ogDZCepE_hhlyaGHRs(AbstractC25832c.this, this.f$1);
                }
            });
        }
    }
}
