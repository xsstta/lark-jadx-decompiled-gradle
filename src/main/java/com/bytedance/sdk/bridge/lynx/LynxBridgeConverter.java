package com.bytedance.sdk.bridge.lynx;

import com.bytedance.sdk.bridge.Logger;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import java.util.Iterator;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0003J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxBridgeConverter;", "", "()V", "TAG", "", "convertJSONArray2JavaOnlyArray", "Lcom/lynx/react/bridge/JavaOnlyArray;", "arrays", "Lorg/json/JSONArray;", "convertJSONObject2JavaOnlyMap", "Lcom/lynx/react/bridge/JavaOnlyMap;", "obj", "Lorg/json/JSONObject;", "getNumber", "", "rawNumber", "revertJavaOnlyArray2JSONArray", "array", "revertJavaOnlyMap2JSONObject", "map", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.g */
public final class LynxBridgeConverter {

    /* renamed from: a */
    public static final LynxBridgeConverter f50526a = new LynxBridgeConverter();

    private LynxBridgeConverter() {
    }

    @JvmStatic
    /* renamed from: a */
    private static final JavaOnlyArray m75311a(JSONArray jSONArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONArray) {
                javaOnlyArray.add(m75311a((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                javaOnlyArray.add(m75312a((JSONObject) opt));
            } else {
                javaOnlyArray.add(opt);
            }
        }
        return javaOnlyArray;
    }

    @JvmStatic
    /* renamed from: a */
    public static final JavaOnlyMap m75312a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "obj");
        Iterator<String> keys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                javaOnlyMap.put(next, m75312a((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyMap.put(next, m75311a((JSONArray) opt));
            } else {
                javaOnlyMap.put(next, opt);
            }
        }
        return javaOnlyMap;
    }

    @JvmStatic
    /* renamed from: a */
    private static final Number m75313a(Number number) {
        Object obj;
        int i;
        Object obj2;
        double d;
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl(Integer.valueOf(number.intValue()));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        Double d2 = null;
        if (Result.m271575isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        try {
            Result.Companion aVar3 = Result.Companion;
            obj2 = Result.m271569constructorimpl(Double.valueOf(number.doubleValue()));
        } catch (Throwable th2) {
            Result.Companion aVar4 = Result.Companion;
            obj2 = Result.m271569constructorimpl(C69097g.m265890a(th2));
        }
        if (!Result.m271575isFailureimpl(obj2)) {
            d2 = obj2;
        }
        Double d3 = d2;
        if (d3 != null) {
            d = d3.doubleValue();
        } else {
            d = 0.0d;
        }
        if (Double.compare((double) i, d) == 0) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (Double.compare(d, (double) j) == 0) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }

    @JvmStatic
    /* renamed from: a */
    private static final JSONArray m75314a(JavaOnlyArray javaOnlyArray) {
        JSONArray jSONArray = new JSONArray();
        int size = javaOnlyArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = javaOnlyArray.get(i);
            try {
                ReadableType type = javaOnlyArray.getType(i);
                if (type != null) {
                    int i2 = C20677h.f50527a[type.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (obj != null) {
                                    jSONArray.put(m75313a((Number) obj));
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                }
                            }
                        } else if (obj != null) {
                            jSONArray.put(m75314a((JavaOnlyArray) obj));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyArray");
                        }
                    } else if (obj != null) {
                        jSONArray.put(m75315a((JavaOnlyMap) obj));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                    }
                }
                jSONArray.put(obj);
            } catch (Throwable th) {
                Logger lVar = Logger.f50514b;
                lVar.mo69735c("LynxBridgeConverter", "revertJavaOnlyArray2JSONArray " + th);
            }
        }
        return jSONArray;
    }

    @JvmStatic
    /* renamed from: a */
    public static final JSONObject m75315a(JavaOnlyMap javaOnlyMap) {
        Intrinsics.checkParameterIsNotNull(javaOnlyMap, "map");
        JSONObject jSONObject = new JSONObject();
        if (javaOnlyMap.isEmpty()) {
            return jSONObject;
        }
        ReadableMapKeySetIterator keySetIterator = javaOnlyMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Object obj = javaOnlyMap.get(nextKey);
            try {
                ReadableType type = javaOnlyMap.getType(nextKey);
                if (type != null) {
                    int i = C20677h.f50528b[type.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (obj != null) {
                                    jSONObject.put(nextKey, m75313a((Number) obj));
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                }
                            }
                        } else if (obj != null) {
                            jSONObject.putOpt(nextKey, m75315a((JavaOnlyMap) obj));
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyMap");
                        }
                    } else if (obj != null) {
                        jSONObject.putOpt(nextKey, m75314a((JavaOnlyArray) obj));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.lynx.react.bridge.JavaOnlyArray");
                    }
                }
                jSONObject.putOpt(nextKey, obj);
            } catch (Throwable th) {
                Logger lVar = Logger.f50514b;
                lVar.mo69735c("LynxBridgeConverter", "revertJavaOnlyMap2JSONObject " + th);
            }
        }
        return jSONObject;
    }
}
