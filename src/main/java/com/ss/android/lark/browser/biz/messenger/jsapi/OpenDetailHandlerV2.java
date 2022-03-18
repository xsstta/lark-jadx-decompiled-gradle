package com.ss.android.lark.browser.biz.messenger.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.biz.messenger.jsapi.p1419a.C29837a;
import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class OpenDetailHandlerV2 extends AbstractInjectJSApiHandler<C29816a> implements Parcelable {
    public static final Parcelable.Creator<OpenDetailHandlerV2> CREATOR = new Parcelable.Creator<OpenDetailHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2.C298152 */

        /* renamed from: a */
        public OpenDetailHandlerV2[] newArray(int i) {
            return new OpenDetailHandlerV2[i];
        }

        /* renamed from: a */
        public OpenDetailHandlerV2 createFromParcel(Parcel parcel) {
            return new OpenDetailHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    public int mo107371a(int i) {
        if (i == 10100) {
            return 383100;
        }
        if (i == 10150) {
            return 383150;
        }
        if (i == 10214) {
            return 383214;
        }
        if (i == 10221) {
            return 383221;
        }
        if (i != 10223) {
            return i != 10224 ? 383050 : 383224;
        }
        return 383223;
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
    /* renamed from: com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2$a */
    public static class C29816a implements BaseJSModel {
        public String openId;

        C29816a() {
        }
    }

    public OpenDetailHandlerV2() {
    }

    /* renamed from: b */
    private String m110230b() {
        return "https://" + C29638a.m109622a().getManisDependency().mo107691a(DomainSettings.Alias.OPEN) + "/open-apis/mina/jssdk/get-userid";
    }

    protected OpenDetailHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m110229a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr).json_body;
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* renamed from: a */
    public String mo107372a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            try {
                jSONObject.put("code", i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            jSONObject.put("errorMessage", str);
            jSONObject.put("errorCode", i);
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(C29816a aVar, final AbstractC25832c cVar) {
        try {
            String str = aVar.openId;
            if (TextUtils.isEmpty(str)) {
                cVar.mo91904b(mo107372a(1015, "invalid param"));
                C53241h.m205894a("JsApi-openDetail", "openId: invalid param");
                return;
            }
            String b = mo92000x().mo67342b().mo67346b();
            final C29837a aVar2 = new C29837a(mo91997u());
            String a = aVar2.mo107440a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("openId", str);
            String a2 = aVar2.mo107441a(jSONObject.toString());
            if (a2 == null) {
                cVar.mo91904b(mo107372a(383050, "inner error"));
                C53241h.m205894a("JsApi-openDetail", "openId encrypt failed");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("session", b);
            jSONObject2.put("ttcode", a);
            jSONObject2.put("encryptedParam", a2);
            SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(m110230b()).mo55526a(SendHttpRequest.Method.POST).mo55533c(jSONObject2.toString()), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2.C298121 */

                /* renamed from: a */
                public void onSuccess(final String str) {
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2.C298121.RunnableC298131 */

                        public void run() {
                            try {
                                JSONObject jSONObject = new JSONObject(str);
                                if (!jSONObject.has("error") || !jSONObject.has("message")) {
                                    throw new JSONException("error or msg isn't exist");
                                }
                                int i = jSONObject.getInt("error");
                                String string = jSONObject.getString("message");
                                if (i == 0) {
                                    C29638a.m109622a().getManisDependency().mo107704c(new JSONObject(aVar2.mo107442b(jSONObject.getString("encryptedData"))).getString("userID"));
                                    cVar.mo91902a("{\"code\":0}");
                                    return;
                                }
                                cVar.mo91904b(OpenDetailHandlerV2.this.mo107372a(OpenDetailHandlerV2.this.mo107371a(i), string));
                                C53241h.m205894a("JsApi-openDetail", OpenDetailHandlerV2.this.mo107372a(OpenDetailHandlerV2.this.mo107371a(i), string));
                            } catch (JSONException e) {
                                cVar.mo91904b(OpenDetailHandlerV2.this.mo107372a(383050, "inner error"));
                                C53241h.m205894a("JsApi-openDetail", e.getMessage());
                            }
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.lark.browser.biz.messenger.jsapi.OpenDetailHandlerV2.C298121.RunnableC298142 */

                        public void run() {
                            cVar.mo91904b(OpenDetailHandlerV2.this.mo107372a(1014, "network error"));
                            C53241h.m205894a("JsApi-openDetail", "network failed");
                        }
                    });
                }
            }, $$Lambda$OpenDetailHandlerV2$Ykaj4QNx2_iByYAWslQg5jTN32E.INSTANCE);
        } catch (Exception e) {
            cVar.mo91904b(mo107372a(383050, "inner error"));
            C53241h.m205894a("JsApi-openDetail", e.getMessage());
        }
    }
}
