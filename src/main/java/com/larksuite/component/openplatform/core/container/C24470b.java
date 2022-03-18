package com.larksuite.component.openplatform.core.container;

import android.text.TextUtils;
import com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.OpenPlatform;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.ss.android.lark.optrace.api.ILogger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.container.b */
public class C24470b {

    /* renamed from: a */
    public LKEvent f60384a;

    /* renamed from: b */
    public ILogger f60385b;

    /* renamed from: c */
    private String f60386c;

    /* renamed from: d */
    private final Class<? extends IHostProcessHandleEvent> f60387d;

    /* renamed from: a */
    public LKBasePluginResult mo87306a() {
        final IHostProcessHandleEvent a = C25529d.m91129a(this.f60384a.mo92145l(), this.f60387d);
        if (a != null) {
            return a.dispatchEventToHostProcess(this.f60386c, this.f60384a, new IHostProcessHandleEvent.HandleEventCallback() {
                /* class com.larksuite.component.openplatform.core.container.C24470b.C244711 */

                @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                public void onLinkTraceId(String str) {
                    AbstractC25905b d = C24470b.this.f60384a.mo92136d();
                    if (d != null) {
                        OpenPlatform.Requests.LinkTrace linkTrace = new OpenPlatform.Requests.LinkTrace();
                        linkTrace.mLinkTraceId = str;
                        linkTrace.mOriginTrace = C24470b.this.f60384a.mo92134c().mo92188a().serialize();
                        d.mo92217b("linkTrace", linkTrace, OpenPlatform.Responses.LinkTrace.class);
                    }
                    ILogger aVar = C24470b.this.f60385b;
                    aVar.mo92224i("OPHandleCrossEvent", "link traceId:" + str);
                }

                @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                public void onSuccess(String str) {
                    JSONObject jSONObject;
                    if (!TextUtils.isEmpty(str)) {
                        C24470b.this.f60385b.mo92224i("OPHandleCrossEvent", "callback success result");
                        try {
                            jSONObject = new JSONObject(str);
                        } catch (JSONException e) {
                            C24470b.this.f60385b.mo92223e("OPHandleCrossEvent", "JSONException", e);
                            jSONObject = new JSONObject();
                        }
                    } else {
                        ILogger aVar = C24470b.this.f60385b;
                        aVar.mo92223e("OPHandleCrossEvent", "result is null。event:" + C24470b.this.f60384a.mo92146m());
                        jSONObject = new JSONObject();
                    }
                    C24470b.this.f60384a.mo92127a(jSONObject);
                }

                @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                public LKBasePluginResult dispatchEventToAppProcess(LKEvent lKEvent, final long j) {
                    Object obj;
                    String m = lKEvent.mo92146m();
                    JSONObject n = lKEvent.mo92147n();
                    LKEvent.EventSourceEnv h = lKEvent.mo92141h();
                    ILogger aVar = C24470b.this.f60385b;
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("dispatchEventToAppProcess event:");
                    sb.append(m);
                    sb.append(" params.length:");
                    if (n != null) {
                        obj = Integer.valueOf(n.length());
                    } else {
                        obj = "";
                    }
                    sb.append(obj);
                    sb.append("env:");
                    sb.append(h);
                    objArr[0] = sb.toString();
                    aVar.mo92224i("OPHandleCrossEvent", objArr);
                    return C25529d.m91133a(lKEvent, new IHostProcessHandleEvent.HandleEventCallback() {
                        /* class com.larksuite.component.openplatform.core.container.C24470b.C244711.C244721 */

                        @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                        public LKBasePluginResult dispatchEventToAppProcess(LKEvent lKEvent, long j) {
                            return null;
                        }

                        @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                        public void onLinkTraceId(String str) {
                        }

                        @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                        public void onSuccess(String str) {
                            C24470b.this.f60385b.mo92224i("OPHandleCrossEvent", "onSuccess");
                            ILogger aVar = C24470b.this.f60385b;
                            aVar.mo92222d("OPHandleCrossEvent", "successResult:" + str);
                            a.sendAsyncHandleResultToHostProcess(j, str, Integer.MIN_VALUE, "");
                        }

                        @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                        public void onFail(int i, String str) {
                            ILogger aVar = C24470b.this.f60385b;
                            aVar.mo92224i("OPHandleCrossEvent", "errorCode:" + i + " failResult:" + str);
                            a.sendAsyncHandleResultToHostProcess(j, "", i, str);
                        }
                    }, C24470b.this.f60384a.mo92151r(), C24470b.this.f60384a.mo92145l(), C24470b.this.f60384a.mo92138e());
                }

                @Override // com.larksuite.component.openplatform.core.container.crossprocess.IHostProcessHandleEvent.HandleEventCallback
                public void onFail(int i, String str) {
                    ILogger aVar = C24470b.this.f60385b;
                    aVar.mo92224i("OPHandleCrossEvent", "errorCode:" + i + " failResult:" + str);
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            jSONObject = new JSONObject(str);
                        } catch (JSONException e) {
                            C24470b.this.f60385b.mo92223e("OPHandleCrossEvent", "JSONException", e);
                        }
                    }
                    C24470b.this.f60384a.mo92116a(i, jSONObject);
                }
            }, (long) this.f60384a.mo92144k());
        }
        this.f60385b.mo92223e("OPHandleCrossEvent", "hostProcessHandleEvent is null");
        return LKBasePluginResult.f64237b;
    }

    public C24470b(String str, Class<? extends IHostProcessHandleEvent> cls, LKEvent lKEvent) {
        this.f60386c = str;
        this.f60387d = cls;
        this.f60384a = lKEvent;
        this.f60385b = lKEvent.mo92134c().mo92190b();
    }
}
