package com.bytedance.ee.falcon.inspector;

import com.bytedance.ee.falcon.inspector.json.C12653a;
import com.bytedance.ee.falcon.inspector.jsonrpc.AbstractC12655b;
import com.bytedance.ee.falcon.inspector.jsonrpc.JsonRpcException;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12658a;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.C12659b;
import com.bytedance.ee.falcon.inspector.jsonrpc.protocol.JsonRpcError;
import com.bytedance.ee.falcon.inspector.protocol.AbstractC12688a;
import com.bytedance.ee.falcon.inspector.protocol.ChromeDevtoolsMethod;
import com.bytedance.ee.falcon.inspector.utils.C12700a;
import com.bytedance.ee.falcon.inspector.utils.C12701b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.c */
public class C12651c {

    /* renamed from: a */
    private Map<String, C12652a> f33888a;

    /* renamed from: b */
    private final C12653a f33889b;

    /* renamed from: c */
    private final Iterable<AbstractC12688a> f33890c;

    /* renamed from: a */
    private synchronized C12652a m52449a(String str) {
        if (this.f33888a == null) {
            this.f33888a = m52450a(this.f33889b, this.f33890c);
        }
        return this.f33888a.get(str);
    }

    /* renamed from: a */
    private static boolean m52451a(Method method) throws IllegalArgumentException {
        boolean z;
        if (!method.isAnnotationPresent(ChromeDevtoolsMethod.class)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        String str = method.getDeclaringClass().getSimpleName() + "." + method.getName();
        if (parameterTypes.length == 2) {
            z = true;
        } else {
            z = false;
        }
        C12701b.m52569a(z, "%s: expected 2 args, got %s", str, Integer.valueOf(parameterTypes.length));
        C12701b.m52569a(parameterTypes[0].equals(C12659b.class), "%s: expected 1st arg of JsonRpcPeer, got %s", str, parameterTypes[0].getName());
        C12701b.m52569a(parameterTypes[1].equals(JSONObject.class), "%s: expected 2nd arg of JSONObject, got %s", str, parameterTypes[1].getName());
        Class<?> returnType = method.getReturnType();
        if (!returnType.equals(Void.TYPE)) {
            C12701b.m52569a(AbstractC12655b.class.isAssignableFrom(returnType), "%s: expected JsonRpcResult return type, got %s", str, returnType.getName());
        }
        return true;
    }

    public C12651c(C12653a aVar, Iterable<AbstractC12688a> iterable) {
        this.f33889b = aVar;
        this.f33890c = iterable;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.falcon.inspector.c$a */
    public static class C12652a {

        /* renamed from: a */
        private final C12653a f33891a;

        /* renamed from: b */
        private final AbstractC12688a f33892b;

        /* renamed from: c */
        private final Method f33893c;

        /* renamed from: a */
        public JSONObject mo48025a(C12659b bVar, JSONObject jSONObject) throws InvocationTargetException, IllegalAccessException, JSONException, JsonRpcException {
            Object invoke = this.f33893c.invoke(this.f33892b, bVar, jSONObject);
            if (invoke == null || (invoke instanceof C12658a)) {
                return new JSONObject();
            }
            return (JSONObject) this.f33891a.mo48027a((AbstractC12655b) invoke, JSONObject.class);
        }

        public C12652a(C12653a aVar, AbstractC12688a aVar2, Method method) {
            this.f33891a = aVar;
            this.f33892b = aVar2;
            this.f33893c = method;
        }
    }

    /* renamed from: a */
    private static Map<String, C12652a> m52450a(C12653a aVar, Iterable<AbstractC12688a> iterable) {
        C12701b.m52567a(aVar);
        HashMap hashMap = new HashMap();
        for (AbstractC12688a aVar2 : (Iterable) C12701b.m52567a(iterable)) {
            Class<?> cls = aVar2.getClass();
            String simpleName = cls.getSimpleName();
            Method[] methods = cls.getMethods();
            for (Method method : methods) {
                if (m52451a(method)) {
                    hashMap.put(simpleName + "." + method.getName(), new C12652a(aVar, aVar2, method));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public JSONObject mo48024a(C12659b bVar, String str, JSONObject jSONObject) throws JsonRpcException {
        C12652a a = m52449a(str);
        if (a != null) {
            try {
                return a.mo48025a(bVar, jSONObject);
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                C12700a.m52566a(cause, JsonRpcException.class);
                throw C12700a.m52565a(cause);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (JSONException e3) {
                throw new JsonRpcException(new JsonRpcError(JsonRpcError.ErrorCode.INTERNAL_ERROR, e3.toString(), null));
            }
        } else {
            JsonRpcError.ErrorCode errorCode = JsonRpcError.ErrorCode.METHOD_NOT_FOUND;
            throw new JsonRpcException(new JsonRpcError(errorCode, "Not implemented: " + str, null));
        }
    }
}
