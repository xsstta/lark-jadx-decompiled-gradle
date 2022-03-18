package com.larksuite.framework.apiplugin.p1178d;

import com.alibaba.fastjson.JSON;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25901l;
import com.larksuite.framework.apiplugin.validator.C25944a;
import com.larksuite.framework.apiplugin.validator.C25958b;
import com.larksuite.framework.apiplugin.validator.p1183b.C25961b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.framework.apiplugin.d.b */
public class C25936b {
    /* renamed from: a */
    public static JSONObject m93906a(C25921b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("innerCode", bVar.mInnerCode);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, bVar.mErrorMessage);
            jSONObject.put("innerMsg", bVar.mInnerMsg);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r5 != false) goto L_0x005a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m93907a(java.lang.reflect.Method r10) {
        /*
            java.lang.Class[] r0 = r10.getParameterTypes()
            java.lang.annotation.Annotation[][] r10 = r10.getParameterAnnotations()
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L_0x0059
            r1 = 0
            r4 = 0
            r5 = 0
        L_0x0010:
            int r6 = r10.length
            if (r1 >= r6) goto L_0x0054
            r6 = r10[r1]
            int r7 = r6.length
            if (r7 == 0) goto L_0x0027
            int r7 = r6.length
            r8 = 0
        L_0x001a:
            if (r8 >= r7) goto L_0x0051
            r9 = r6[r8]
            boolean r9 = r9 instanceof com.larksuite.framework.apiplugin.annotation.LKPluginParam
            if (r9 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0051
        L_0x0024:
            int r8 = r8 + 1
            goto L_0x001a
        L_0x0027:
            r6 = r0[r1]
            java.lang.Class<com.larksuite.framework.apiplugin.LKEvent> r7 = com.larksuite.framework.apiplugin.LKEvent.class
            if (r6 == r7) goto L_0x0051
            java.lang.Class<com.larksuite.framework.apiplugin.a.h> r6 = com.larksuite.framework.apiplugin.p1175a.AbstractC25897h.class
            r7 = r0[r1]
            if (r6 == r7) goto L_0x0051
            java.lang.Class<com.larksuite.framework.apiplugin.b> r6 = com.larksuite.framework.apiplugin.AbstractC25905b.class
            r7 = r0[r1]
            if (r6 == r7) goto L_0x0051
            java.lang.Class<com.larksuite.framework.apiplugin.a.f> r6 = com.larksuite.framework.apiplugin.p1175a.AbstractC25895f.class
            r7 = r0[r1]
            if (r6 == r7) goto L_0x0051
            java.lang.Class<com.larksuite.framework.apiplugin.a.l> r6 = com.larksuite.framework.apiplugin.p1175a.AbstractC25901l.class
            r7 = r0[r1]
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 != 0) goto L_0x0051
            java.lang.Class<com.ss.android.lark.optrace.api.a> r6 = com.ss.android.lark.optrace.api.ILogger.class
            r7 = r0[r1]
            if (r6 != r7) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r4 = 1
        L_0x0051:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0054:
            if (r4 == 0) goto L_0x0059
            if (r5 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            if (r2 != 0) goto L_0x0063
            java.lang.String r10 = "PluginUtil"
            java.lang.String r0 = "You added the LKPluginFunction annotation to the relevant methods of Plugin, every annotation of param need LKPluginParam except the first param \n"
            com.ss.android.lark.log.Log.m165383e(r10, r0)
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.apiplugin.p1178d.C25936b.m93907a(java.lang.reflect.Method):boolean");
    }

    /* renamed from: a */
    public static C25944a m93905a(LKEvent lKEvent, Method method) {
        String str;
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < length; i++) {
            if (!(LKEvent.class == parameterTypes[i] || AbstractC25897h.class == parameterTypes[i] || AbstractC25905b.class == parameterTypes[i] || AbstractC25895f.class == parameterTypes[i] || ILogger.class == parameterTypes[i] || AbstractC25901l.class.isAssignableFrom(parameterTypes[i]) || parameterAnnotations[i].length != 0)) {
                Class<?> cls = method.getParameterTypes()[i];
                JSONObject n = lKEvent.mo92147n();
                if (n != null) {
                    C25944a a = new C25958b.C25959a().mo92295a(n.toString()).mo92294a(cls).mo92293a(new C25961b()).mo92296a().mo92292a();
                    if (a.f64255a) {
                        str = "param check success";
                    } else {
                        str = "param check fail";
                    }
                    Log.m165379d("PluginUtil", str);
                    if (!a.f64255a) {
                        return a;
                    }
                } else {
                    continue;
                }
            }
        }
        return new C25944a(true);
    }

    /* renamed from: b */
    public static Object[] m93908b(LKEvent lKEvent, Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        Object[] objArr = new Object[length];
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < length; i++) {
            if (LKEvent.class == parameterTypes[i]) {
                objArr[i] = lKEvent;
            } else if (AbstractC25897h.class == parameterTypes[i]) {
                lKEvent.getClass();
                objArr[i] = new AbstractC25897h() {
                    /* class com.larksuite.framework.apiplugin.p1178d.$$Lambda$uNBftHRH72nTXdNvjZ30ALWW8gM */

                    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25897h
                    public final void callback(Object obj) {
                        LKEvent.this.mo92132b(obj);
                    }
                };
            } else if (AbstractC25905b.class == parameterTypes[i]) {
                objArr[i] = lKEvent.mo92136d();
            } else if (AbstractC25895f.class == parameterTypes[i]) {
                objArr[i] = lKEvent.mo92134c();
            } else if (ILogger.class == parameterTypes[i]) {
                objArr[i] = lKEvent.mo92134c().mo92190b();
            } else if (!AbstractC25901l.class.isAssignableFrom(parameterTypes[i]) || lKEvent.mo92148o() == null) {
                JSONObject n = lKEvent.mo92147n();
                if (n != null) {
                    Annotation[] annotationArr = parameterAnnotations[i];
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof LKPluginParam) {
                            objArr[i] = n.opt(((LKPluginParam) annotation).value());
                        }
                    }
                    if (annotationArr.length == 0) {
                        Map<String, Object> g = lKEvent.mo92140g();
                        if (g != null) {
                            for (String str : g.keySet()) {
                                Log.m165389i("PluginUtil", "common key:" + str);
                                try {
                                    n.put(str, g.get(str));
                                } catch (JSONException e) {
                                    Log.m165384e("PluginUtil", "JSONException", e);
                                }
                            }
                        }
                        Object parseObject = JSON.parseObject(n.toString(), method.getParameterTypes()[i]);
                        if (lKEvent.mo92150q() && (parseObject instanceof C25920a)) {
                            ((C25920a) parseObject).setArrayBuffer(lKEvent.mo92149p());
                        }
                        objArr[i] = parseObject;
                    }
                }
            } else {
                Log.m165389i("PluginUtil", "input params:" + lKEvent.mo92146m());
                objArr[i] = lKEvent.mo92148o();
            }
        }
        return objArr;
    }
}
