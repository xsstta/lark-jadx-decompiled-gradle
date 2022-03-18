package com.larksuite.framework.apiplugin;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.plugin_annotation.bean.C12925b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25890a;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25898i;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25908c;
import com.larksuite.framework.apiplugin.p1178d.C25933a;
import com.larksuite.framework.apiplugin.p1178d.C25936b;
import com.larksuite.framework.apiplugin.p1179e.C25938a;
import com.larksuite.framework.apiplugin.validator.C25944a;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.framework.apiplugin.a */
public abstract class AbstractC25889a extends AbstractC25937e {
    private Map<String, C12925b> mEvent2Method = Collections.EMPTY_MAP;
    private final AtomicBoolean mIsInit = new AtomicBoolean(false);

    public AbstractC25889a() {
        checkInit();
    }

    /* access modifiers changed from: protected */
    public JSONObject generateParamsInvalidResult() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C25906a.f64072b.f64117J);
            return jSONObject;
        } catch (JSONException e) {
            Log.m165383e("AutoRegisterLKPlugin", "put errMsg jsonException: " + e.getMessage());
            return jSONObject;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.larksuite.framework.apiplugin.d.a */
    /* JADX WARN: Multi-variable type inference failed */
    private void checkInit() {
        if (!this.mIsInit.get()) {
            this.mIsInit.set(true);
            Map<String, C12925b> a = C25933a.m93899a().mo92257a((Class<? extends AbstractC25937e>) getClass());
            if (a == null || a.isEmpty()) {
                Method[] declaredMethods = getClass().getDeclaredMethods();
                HashMap hashMap = new HashMap();
                if (declaredMethods != null) {
                    for (Method method : declaredMethods) {
                        LKPluginFunction lKPluginFunction = (LKPluginFunction) method.getAnnotation(LKPluginFunction.class);
                        if (lKPluginFunction != null && C25936b.m93907a(method)) {
                            boolean async = lKPluginFunction.async();
                            C12925b bVar = new C12925b();
                            bVar.f34419b = method;
                            bVar.f34420c = async;
                            String[] eventName = lKPluginFunction.eventName();
                            for (String str : eventName) {
                                bVar.f34418a = str;
                                hashMap.put(str, bVar);
                            }
                        }
                    }
                }
                C25933a.m93899a().mo92258a(getClass(), hashMap);
                this.mEvent2Method = hashMap;
                if (hashMap == null) {
                    Log.m165383e("AutoRegisterLKPlugin", "mEvent2Method is null." + getClass().getName());
                    return;
                }
                return;
            }
            Iterator<Map.Entry<String, C12925b>> it = a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, C12925b> next = it.next();
                if (!(next == null || next.getValue() == null || C25936b.m93907a(next.getValue().f34419b))) {
                    it.remove();
                }
            }
            this.mEvent2Method = a;
        }
    }

    public C25921b createFailedResponse(C25908c cVar) {
        return createFailedResponse(cVar, cVar.f64117J);
    }

    /* access modifiers changed from: protected */
    public C25921b generateParamsInvalidResponse(String str) {
        return createFailedResponse(C25906a.f64072b, str);
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        checkInit();
        Map<String, C12925b> map = this.mEvent2Method;
        if (map != null) {
            for (String str : map.keySet()) {
                gVar.mo92192a(str);
            }
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        Map<String, C12925b> map = this.mEvent2Method;
        if (map != null) {
            C12925b bVar = map.get(m);
            if (bVar != null) {
                try {
                    AbstractC25898i j = lKEvent.mo92143j();
                    if (j != null) {
                        j.onEventHandleStart(bVar.f34420c);
                    }
                    Method method = bVar.f34419b;
                    if (!bVar.f34420c) {
                        return syncHandle(lKEvent, method, m);
                    }
                    if (!asyncHandle(lKEvent, m, method)) {
                        return lKEvent.mo92155v();
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    Log.m165384e("AutoRegisterLKPlugin", "You added the LKPluginFunction annotation to the relevant method of the plugin, but the method call failed ：", e);
                }
            }
        } else {
            Log.m165384e("AutoRegisterLKPlugin", "handleEvent mEvent2Method is null", new Throwable());
        }
        return super.handleEvent(lKEvent);
    }

    public C25921b createFailedResponse(C25908c cVar, String str) {
        C25921b bVar = new C25921b();
        fillFailedResponse(bVar, cVar, str);
        return bVar;
    }

    public /* synthetic */ void lambda$asyncHandle$0$a(LKEvent lKEvent, Method method) {
        C25944a a = C25936b.m93905a(lKEvent, method);
        if (!a.f64255a) {
            lKEvent.mo92132b(generateParamsInvalidResponse(a.f64256b));
            return;
        }
        try {
            Object[] b = C25936b.m93908b(lKEvent, method);
            try {
                synchronized (this) {
                    method.invoke(this, b);
                }
            } catch (Exception e) {
                Log.m165384e("AutoRegisterLKPlugin", "invoke Exception: ", e);
                lKEvent.mo92132b(createFailedResponse(C25906a.f64080j, e.getMessage()));
            }
        } catch (Exception e2) {
            Log.m165384e("AutoRegisterLKPlugin", "async JSON.parseObject error", e2);
            lKEvent.mo92132b(createFailedResponse(C25906a.f64072b, e2.getMessage()));
        }
    }

    public <T extends C25921b> void fillFailedResponse(T t, C25908c cVar, String str) {
        C25938a.m93910a(t, cVar, str);
    }

    private boolean asyncHandle(LKEvent lKEvent, String str, Method method) {
        AbstractC25890a i = lKEvent.mo92142i();
        if (i != null) {
            i.executeAsyncApiHandle(str, new Runnable(lKEvent, method) {
                /* class com.larksuite.framework.apiplugin.$$Lambda$a$xQGDgFVpySQ6YNLmq_sw2hXidGw */
                public final /* synthetic */ LKEvent f$1;
                public final /* synthetic */ Method f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    AbstractC25889a.this.lambda$asyncHandle$0$a(this.f$1, this.f$2);
                }
            });
            return true;
        }
        Log.m165383e("AutoRegisterLKPlugin", "lkAsyncHandleEventExecutor is null,proceed handle");
        return false;
    }

    private LKPluginHandleResult syncHandle(LKEvent lKEvent, Method method, String str) throws InvocationTargetException, IllegalAccessException {
        if (!C25936b.m93905a(lKEvent, method).f64255a) {
            Log.m165389i("AutoRegisterLKPlugin", "invalid params");
            return lKEvent.mo92130b(C25906a.f64072b.f64115H, generateParamsInvalidResult());
        }
        try {
            Object invoke = method.invoke(this, C25936b.m93908b(lKEvent, method));
            if (invoke instanceof LKPluginHandleResult) {
                return (LKPluginHandleResult) invoke;
            }
            if (invoke instanceof C25921b) {
                C25921b bVar = (C25921b) invoke;
                String jSONString = JSON.toJSONString(invoke);
                LKPluginHandleResult.C25942a aVar = new LKPluginHandleResult.C25942a();
                try {
                    aVar.mo92280a(new JSONObject(jSONString));
                } catch (JSONException e) {
                    Log.m165384e("AutoRegisterLKPlugin", "JSONException", e);
                }
                if (bVar.mErrorCode != Integer.MIN_VALUE) {
                    aVar.mo92277a(bVar.mErrorCode);
                }
                if (bVar.mIsArrayBuffer && bVar.getArrayBuffers() != null) {
                    Log.m165389i("AutoRegisterLKPlugin", "eventName:" + str + " is arrayBuffer");
                    aVar.mo92279a(bVar.getArrayBuffers());
                }
                aVar.mo92282a(bVar.isCease());
                return aVar.mo92283a();
            } else if (invoke instanceof AbstractC25903n) {
                return lKEvent.mo92115a((AbstractC25903n) invoke);
            } else {
                try {
                    return lKEvent.mo92131b(new JSONObject(JSON.toJSONString(invoke)));
                } catch (JSONException e2) {
                    Log.m165384e("AutoRegisterLKPlugin", "JSONException", e2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, e2.getMessage());
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    return lKEvent.mo92130b(C25906a.f64080j.f64115H, jSONObject);
                }
            }
        } catch (Exception e4) {
            Log.m165384e("AutoRegisterLKPlugin", "Exception", e4);
            return lKEvent.mo92130b(C25906a.f64072b.f64115H, generateParamsInvalidResult());
        }
    }
}
