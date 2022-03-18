package com.larksuite.framework.apiplugin.p1177c;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.common.LKFireEvent;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel;
import com.larksuite.framework.apiplugin.core.AbstractC25928e;
import com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback;
import com.larksuite.framework.apiplugin.core.LKTransActivity;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* renamed from: com.larksuite.framework.apiplugin.c.a */
public class C25916a implements AbstractC25928e {

    /* renamed from: a */
    private AbstractC25891b f64201a;

    /* renamed from: b */
    private Context f64202b;

    /* renamed from: c */
    private Object f64203c;

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public Context mo92207a() {
        return this.f64202b;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public void mo92214a(String str, Object obj) {
        if (this.f64201a == null) {
            Log.m165383e("LKBridgeContextImpl", "source node not bind.");
        } else {
            mo92210a("fireEvent", m93824c(str, obj), LKFireEvent.Response.class);
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: b */
    public void mo92215b() {
        Log.m165389i("LKBridgeContextImpl", "release");
        this.f64201a = null;
        this.f64202b = null;
    }

    public C25916a(AbstractC25891b bVar) {
        this.f64201a = bVar;
        this.f64202b = bVar.mo49749b();
    }

    @Override // com.larksuite.framework.apiplugin.core.AbstractC25928e
    /* renamed from: a */
    public void mo92220a(Activity activity) {
        this.f64202b = activity;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public void mo92212a(OPMonitorReportModel.Request request) {
        Object obj;
        if (request == null) {
            Log.m165383e("LKBridgeContextImpl", "monitorRequest is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("monitor code:");
        if (request.mMonitorCode != null) {
            obj = Integer.valueOf(request.mMonitorCode.mCode);
        } else {
            obj = "";
        }
        sb.append(obj);
        sb.append(" name:");
        sb.append(request.mEventName);
        Log.m165389i("LKBridgeContextImpl", sb.toString());
        mo92210a("innerMonitorReport", request, OPMonitorReportModel.Response.class);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public void mo92213a(LKCallProxyActivityCallback lKCallProxyActivityCallback) {
        if (this.f64202b instanceof Activity) {
            Log.m165389i("LKBridgeContextImpl", "context is activity");
            lKCallProxyActivityCallback.onCreated((Activity) this.f64202b);
            return;
        }
        LKTransActivity.m93850a(lKCallProxyActivityCallback, this.f64201a);
    }

    @Override // com.larksuite.framework.apiplugin.core.AbstractC25928e
    /* renamed from: a */
    public void mo92221a(Object obj) {
        if (this.f64203c == null) {
            Log.m165389i("LKBridgeContextImpl", "set appContext");
            this.f64203c = obj;
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public <T> T mo92208a(String str, Class<T> cls) {
        return (T) mo92209a(str, null, null, cls);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: b */
    public void mo92216b(String str, Object obj) {
        if (this.f64201a == null) {
            Log.m165383e("LKBridgeContextImpl", "source node not bind.");
        } else {
            mo92210a("fireEvent", m93826d(str, obj), LKFireEvent.Response.class);
        }
    }

    /* renamed from: c */
    private LKFireEvent.Request m93824c(String str, Object obj) {
        Object obj2;
        LKFireEvent.Request request = new LKFireEvent.Request();
        request.mAction = str;
        if (obj instanceof JSONObject) {
            Log.m165389i("LKBridgeContextImpl", "fast json");
            request.mData = (JSONObject) obj;
        } else {
            request.mData = JSON.parseObject(JSON.toJSONString(obj));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("action:");
        sb.append(str);
        sb.append(" length:");
        if (request.mData != null) {
            obj2 = Integer.valueOf(request.mData.size());
        } else {
            obj2 = "";
        }
        sb.append(obj2);
        Log.m165389i("LKBridgeContextImpl", sb.toString());
        return request;
    }

    /* renamed from: d */
    private LKFireEvent.Request m93826d(String str, Object obj) {
        Object obj2;
        LKFireEvent.Request request = new LKFireEvent.Request();
        if (obj instanceof C25921b) {
            request.mAction = str;
            int i = ((C25921b) obj).mErrorCode;
            JSONObject parseObject = JSON.parseObject(JSON.toJSONString(obj));
            parseObject.put("errCode", (Object) Integer.valueOf(i));
            request.mData = parseObject;
        } else {
            request = m93824c(str, obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("action:");
        sb.append(str);
        sb.append(" length:");
        if (request.mData != null) {
            obj2 = Integer.valueOf(request.mData.size());
        } else {
            obj2 = "";
        }
        sb.append(obj2);
        Log.m165389i("LKBridgeContextImpl", sb.toString());
        return request;
    }

    /* renamed from: a */
    public <T> T mo92219a(LKEvent lKEvent, Class<T> cls) {
        ILogger b = lKEvent.mo92134c().mo92190b();
        if (this.f64201a == null) {
            b.mo92223e("LKBridgeContextImpl", "source node not bind.");
            return null;
        }
        Object obj = this.f64203c;
        if (obj != null) {
            lKEvent.mo92125a(obj);
        }
        T t = (T) this.f64201a.mo92179b(lKEvent);
        if (t != null) {
            if (LKBasePluginResult.class.isAssignableFrom(cls)) {
                b.mo92224i("LKBridgeContextImpl", "base plugin result");
                return t;
            } else if (t.mo92270e() != null) {
                T t2 = (T) JSON.parseObject(t.mo92270e().toString(), cls);
                if (C25921b.class.isAssignableFrom(cls)) {
                    b.mo92224i("LKBridgeContextImpl", "base response model. sync");
                    t2 = t2;
                    t2.mErrorCode = t.mo92267c();
                    if (!t.mo92268d()) {
                        t2.proceed();
                    }
                }
                return t2;
            } else {
                try {
                    T newInstance = cls.newInstance();
                    if (newInstance instanceof C25921b) {
                        T t3 = newInstance;
                        t3.mErrorCode = t.mo92267c();
                        if (!t.mo92268d()) {
                            t3.proceed();
                        }
                        return t3;
                    }
                    Log.m165383e("LKBridgeContextImpl", "invalid tClass");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    Log.m165384e("LKBridgeContextImpl", "IllegalAccessException", e);
                } catch (InstantiationException e2) {
                    Log.m165384e("LKBridgeContextImpl", "InstantiationException", e2);
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m93825c(String str, Object obj, Class cls) {
        mo92209a(str, obj, null, cls);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public <T> T mo92210a(String str, Object obj, Class<T> cls) {
        return (T) mo92209a(str, obj, null, cls);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: b */
    public <T> void mo92217b(String str, Object obj, Class<T> cls) {
        Executors.newSingleThreadExecutor().submit(new Runnable(str, obj, cls) {
            /* class com.larksuite.framework.apiplugin.p1177c.$$Lambda$a$pkb0xIhwqxP9xqMNu3RmNyhOjYo */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Object f$2;
            public final /* synthetic */ Class f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C25916a.lambda$pkb0xIhwqxP9xqMNu3RmNyhOjYo(C25916a.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public <T> T mo92209a(String str, Object obj, final AbstractC25897h<T> hVar, final Class<T> cls) {
        Object obj2;
        LKEvent.C25888a a = new LKEvent.C25888a().mo92162a(this.f64202b).mo92168a(str);
        if (obj != null) {
            try {
                if (obj instanceof org.json.JSONObject) {
                    a.mo92169a((org.json.JSONObject) obj);
                } else {
                    a.mo92169a(new org.json.JSONObject(JSON.toJSONString(obj)));
                }
            } catch (JSONException e) {
                Log.m165384e("LKBridgeContextImpl", "JSONException:", e);
            }
        }
        a.mo92164a(this.f64201a);
        a.mo92170a(true);
        LKEvent a2 = a.mo92171a();
        final ILogger b = a2.mo92134c().mo92190b();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append("action:");
        sb.append(str);
        if (a2.mo92147n() != null) {
            obj2 = Integer.valueOf(a2.mo92147n().length());
        } else {
            obj2 = "";
        }
        sb.append(obj2);
        objArr[0] = sb.toString();
        b.mo92224i("LKBridgeContextImpl", objArr);
        if (hVar != null) {
            a2.mo92122a((AbstractC25894e) new AbstractC25894e() {
                /* class com.larksuite.framework.apiplugin.p1177c.C25916a.C259171 */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48104a(int i, org.json.JSONObject jSONObject) {
                    if (jSONObject != null) {
                        hVar.callback(JSON.parseObject(jSONObject.toString(), cls));
                        return;
                    }
                    b.mo92223e("LKBridgeContextImpl", "callback params is null");
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25894e
                /* renamed from: a */
                public void mo48103a(int i, int i2, org.json.JSONObject jSONObject) {
                    ILogger aVar = b;
                    aVar.mo92224i("LKBridgeContextImpl", "errorCode:" + i2);
                    if (jSONObject == null) {
                        b.mo92223e("LKBridgeContextImpl", "callback params is null");
                        return;
                    }
                    Object parseObject = JSON.parseObject(jSONObject.toString(), cls);
                    if (C25921b.class.isAssignableFrom(cls)) {
                        b.mo92224i("LKBridgeContextImpl", "base response model");
                        C25921b bVar = (C25921b) parseObject;
                        bVar.mErrorCode = i2;
                        hVar.callback(bVar);
                        return;
                    }
                    hVar.callback(parseObject);
                }
            });
        }
        return (T) mo92219a(a2, cls);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25905b
    /* renamed from: a */
    public <T> T mo92211a(String str, Object obj, Object obj2, AbstractC25897h<T> hVar, Class<T> cls) {
        this.f64203c = obj2;
        return (T) mo92209a(str, obj, hVar, cls);
    }
}
