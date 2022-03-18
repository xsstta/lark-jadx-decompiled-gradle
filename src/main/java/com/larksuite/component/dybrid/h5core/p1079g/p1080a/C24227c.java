package com.larksuite.component.dybrid.h5core.p1079g.p1080a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.sdk.AbstractC19831c;
import com.bytedance.lark.sdk.Sdk;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a.c */
public class C24227c implements AbstractC24169l {
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a(AbstractC24169l.C24170a.f59751a);
        aVar.mo86723a(AbstractC24169l.C24170a.f59752b);
    }

    /* renamed from: c */
    private synchronized boolean m88496c(final H5Event h5Event) {
        byte[] bArr;
        final int a = C24246a.m88550a(h5Event.mo86710d(), "command", -1);
        String a2 = C24246a.m88559a(h5Event.mo86710d(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (a == -1) {
            h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            return true;
        }
        if (!TextUtils.isEmpty(a2)) {
            bArr = Base64.decode(a2, 0);
        } else {
            bArr = new byte[0];
        }
        Sdk.invokeAsync(Command.fromValue(a), bArr, null, new AbstractC19831c() {
            /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242281 */

            @Override // com.bytedance.lark.sdk.AbstractC19831c
            /* renamed from: a */
            public boolean mo67179a() {
                return false;
            }

            @Override // com.bytedance.lark.sdk.AbstractC19831c
            public void AsyncCallback(boolean z, byte[] bArr) {
                try {
                    final JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put("success", false);
                        jSONObject.put("msg", Base64.encodeToString(bArr, 0));
                        C24174b.m88296a("H5RustPlugin", "command:" + a + " error:" + jSONObject.toString());
                        return;
                    }
                    C24174b.m88296a("H5RustPlugin", "command:" + a);
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, Base64.encodeToString(bArr, 0));
                    CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                        /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242281.RunnableC242291 */

                        public void run() {
                            h5Event.mo86708b(jSONObject);
                        }
                    });
                } catch (JSONException e) {
                    C24174b.m88297a("H5RustPlugin", "JSONException", e);
                }
            }
        }, null);
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        if (AbstractC24169l.C24170a.f59751a.equals(b)) {
            if (!h5Event.mo86715i()) {
                return false;
            }
            m88496c(h5Event);
            return true;
        } else if (!AbstractC24169l.C24170a.f59752b.equals(b)) {
            return true;
        } else {
            m88497d(h5Event);
            return true;
        }
    }

    /* renamed from: d */
    private void m88497d(final H5Event h5Event) {
        JSONObject d = h5Event.mo86710d();
        if (d != null) {
            C24174b.m88296a("H5RustPlugin", "http request params :" + d.toString());
            String a = C24246a.m88560a(d, "method", "GET");
            String a2 = C24246a.m88559a(d, "url");
            if (TextUtils.isEmpty(a2)) {
                h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
                return;
            }
            SendHttpRequest.C15253a aVar = new SendHttpRequest.C15253a();
            aVar.mo55528a(a2);
            JSONObject a3 = C24246a.m88562a(d, "headers", (JSONObject) null);
            if (a3 != null) {
                Map<String, String> map = (Map) new Gson().fromJson(a3.toString(), Map.class);
                aVar.mo55529a(map);
                aVar.mo55532b(map.get("X-Request-ID"));
            }
            JSONObject a4 = C24246a.m88562a(d, "body", (JSONObject) null);
            if ("POST".equalsIgnoreCase(a)) {
                aVar.mo55526a(SendHttpRequest.Method.POST);
                if (a4 == null) {
                    h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
                    return;
                }
                aVar.mo55533c(a4.toString());
            } else {
                aVar.mo55526a(SendHttpRequest.Method.GET);
            }
            SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, aVar, new IGetDataCallback<SendHttpResponse>() {
                /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242302 */

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                    try {
                        final JSONObject jSONObject = new JSONObject();
                        jSONObject.put("http_status_code", sendHttpResponse.http_status_code);
                        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, sendHttpResponse.json_body);
                        C24246a.m88563a((Runnable) new Runnable() {
                            /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242302.RunnableC242311 */

                            public void run() {
                                h5Event.mo86708b(jSONObject);
                            }
                        });
                    } catch (JSONException e) {
                        C24174b.m88297a("H5RustPlugin", "JSONException", e);
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    try {
                        final JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error_code", errorResult.getErrorCode());
                        jSONObject.put("display_msg", errorResult.getDisplayMsg());
                        jSONObject.put("debug_msg", errorResult.getDebugMsg());
                        C24246a.m88563a((Runnable) new Runnable() {
                            /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242302.RunnableC242322 */

                            public void run() {
                                h5Event.mo86708b(jSONObject);
                            }
                        });
                    } catch (JSONException e) {
                        C24174b.m88297a("H5RustPlugin", "JSONException", e);
                    }
                }
            }, new SdkSender.IParser<SendHttpResponse>() {
                /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24227c.C242333 */

                /* renamed from: a */
                public SendHttpResponse parse(byte[] bArr) throws IOException {
                    return SendHttpResponse.ADAPTER.decode(bArr);
                }
            });
        }
    }
}
