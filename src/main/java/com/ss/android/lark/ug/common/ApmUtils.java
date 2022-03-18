package com.ss.android.lark.ug.common;

import android.os.SystemClock;
import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ug.common.a */
public final class ApmUtils {

    /* renamed from: a */
    public static final ApmUtils f141331a = new ApmUtils();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Long> f141332b = new ConcurrentHashMap<>();

    private ApmUtils() {
    }

    /* renamed from: com.ss.android.lark.ug.common.a$a */
    public static class GetDataCallback<T> implements IGetDataCallback<T> {

        /* renamed from: a */
        private final IGetDataCallback<T> f141333a;

        /* renamed from: b */
        private final String f141334b;

        /* renamed from: c */
        private final Map<String, Object> f141335c;

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(T t) {
            this.f141333a.onSuccess(t);
            String str = this.f141334b;
            Map mapOf = MapsKt.mapOf(TuplesKt.to("isSuccess", true));
            Map<String, Object> map = this.f141335c;
            if (map == null) {
                map = MapsKt.emptyMap();
            }
            ApmUtils.m222517a(str, MapsKt.plus(mapOf, map), null, null, 12, null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Map map;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f141333a.onError(errorResult);
            String str = this.f141334b;
            Map mapOf = MapsKt.mapOf(TuplesKt.to("isSuccess", false), TuplesKt.to("errorCode", Integer.valueOf(errorResult.getErrorCode())));
            Map<String, Object> map2 = this.f141335c;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            Map plus = MapsKt.plus(mapOf, map2);
            if (errorResult.getDebugMsg() == null) {
                map = null;
            } else {
                map = MapsKt.mapOf(TuplesKt.to(ApiHandler.API_CALLBACK_ERRMSG, String.valueOf(errorResult.getDebugMsg())));
            }
            ApmUtils.m222516a(str, plus, null, map);
        }

        public GetDataCallback(IGetDataCallback<T> iGetDataCallback, String str, Map<String, ? extends Object> map) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "delegate");
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.f141333a = iGetDataCallback;
            this.f141334b = str;
            this.f141335c = map;
            ApmUtils aVar = ApmUtils.f141331a;
            ApmUtils.f141332b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GetDataCallback(IGetDataCallback iGetDataCallback, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(iGetDataCallback, str, (i & 4) != 0 ? null : map);
        }
    }

    /* renamed from: a */
    private final JSONObject m222515a(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final void m222516a(String str, Map<String, ? extends Object> map, Map<String, ? extends Number> map2, Map<String, ? extends Object> map3) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        ApmUtils aVar = f141331a;
        ApmAgent.monitorEvent(str, aVar.m222515a(map), aVar.m222515a(aVar.m222518b(str, map, map2, map3)), aVar.m222515a(map3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r8v1. Raw type applied. Possible types: java.util.Map<java.lang.String, java.lang.Number> */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.Number> m222518b(java.lang.String r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, java.util.Map<java.lang.String, ? extends java.lang.Number> r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r9 = com.ss.android.lark.ug.common.ApmUtils.f141332b
            java.lang.Object r0 = r9.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 0
            if (r7 == 0) goto L_0x0012
            java.lang.String r2 = "errorCode"
            java.lang.Object r7 = r7.get(r2)
            goto L_0x0013
        L_0x0012:
            r7 = r1
        L_0x0013:
            boolean r2 = r7 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = r7
        L_0x0019:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0048
            if (r0 == 0) goto L_0x0048
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.longValue()
            long r1 = r1 - r3
            java.lang.String r7 = "latency"
            if (r8 != 0) goto L_0x0039
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            java.util.Map r8 = kotlin.collections.MapsKt.mapOf(r7)
            goto L_0x0045
        L_0x0039:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r7, r1)
            kotlin.collections.MapsKt.plus(r8, r0)
        L_0x0045:
            r9.remove(r6)
        L_0x0048:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.common.ApmUtils.m222518b(java.lang.String, java.util.Map, java.util.Map, java.util.Map):java.util.Map");
    }

    /* renamed from: a */
    public static /* synthetic */ void m222517a(String str, Map map, Map map2, Map map3, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        if ((i & 8) != 0) {
            map3 = null;
        }
        m222516a(str, map, map2, map3);
    }
}
