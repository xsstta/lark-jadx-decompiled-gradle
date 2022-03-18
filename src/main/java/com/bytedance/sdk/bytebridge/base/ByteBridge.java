package com.bytedance.sdk.bytebridge.base;

import android.text.TextUtils;
import com.bytedance.sdk.bridge.annotation.BridgeContext;
import com.bytedance.sdk.bridge.annotation.BridgeMethodAsync;
import com.bytedance.sdk.bridge.annotation.BridgeMethodSync;
import com.bytedance.sdk.bridge.annotation.BridgeParam;
import com.bytedance.sdk.bytebridge.base.build.IBridgeIndex;
import com.bytedance.sdk.bytebridge.base.model.BridgeConfig;
import com.bytedance.sdk.bytebridge.base.model.BridgeSyncTypeEnum;
import com.bytedance.sdk.bytebridge.base.model.C20685c;
import com.bytedance.sdk.bytebridge.base.model.C20686e;
import com.bytedance.sdk.bytebridge.base.model.C20687f;
import com.bytedance.sdk.bytebridge.base.p899b.C20681a;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010 \u001a\u0004\u0018\u00010\u001d2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0012J\u0014\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\u0015J\u0012\u0010$\u001a\u00020\u00132\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u0012J\b\u0010%\u001a\u00020\u001fH\u0002J\u0006\u0010&\u001a\u00020\u001fJ\b\u0010'\u001a\u00020\u001fH\u0002J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0015J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0015H\u0002J\u001c\u0010+\u001a\u00020\u001f2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010,\u001a\u00020\u0013H\u0002J(\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u001d0\u0011X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/ByteBridge;", "", "()V", "alreadyInit", "", "bridgeConfig", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;", "getBridgeConfig", "()Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;", "bridgeConfig$delegate", "Lkotlin/Lazy;", "bridgeIndexList", "", "Lcom/bytedance/sdk/bytebridge/base/build/IBridgeIndex;", "kotlin.jvm.PlatformType", "", "bridgeModuleClass2SubscriberInfoMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lcom/bytedance/sdk/bytebridge/base/model/SubscriberInfo;", "bridgeName2ModuleClassMap", "", "bridgeService", "Lcom/bytedance/sdk/bytebridge/base/BridgeService;", "getBridgeService", "()Lcom/bytedance/sdk/bytebridge/base/BridgeService;", "setBridgeService", "(Lcom/bytedance/sdk/bytebridge/base/BridgeService;)V", "class2DestroyMethodMap", "Ljava/lang/reflect/Method;", "custom", "", "getDestroyMethodByModuleClass", "clazz", "getModuleClassByBridgeName", "bridgeName", "getSubscriberInfoByModuleClass", "initBridgeName2ModuleClassMap", "initByteBridge", "initClass2DestroyMethodMap", "initSubscriberInfoMap", "isSystemClass", "name", "parseBridgeClass", "subscriberInfo", "parseBridgeMethodInfo", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeMethodInfo;", "method", "bridgeMethodName", "methodPrivilege", "syncTypeEnum", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeSyncTypeEnum;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.d */
public final class ByteBridge {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50572a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ByteBridge.class), "bridgeConfig", "getBridgeConfig()Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;"))};

    /* renamed from: b */
    public static final ByteBridge f50573b = new ByteBridge();

    /* renamed from: c */
    private static BridgeService f50574c = new BridgeService();

    /* renamed from: d */
    private static boolean f50575d;

    /* renamed from: e */
    private static final Lazy f50576e = LazyKt.lazy(C20683a.INSTANCE);

    /* renamed from: f */
    private static final List<IBridgeIndex> f50577f = C20681a.m75362a();

    /* renamed from: g */
    private static final ConcurrentHashMap<String, Class<?>> f50578g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static final ConcurrentHashMap<Class<?>, C20687f> f50579h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final ConcurrentHashMap<Class<?>, Method> f50580i = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final BridgeConfig mo69803b() {
        Lazy lazy = f50576e;
        KProperty kProperty = f50572a[0];
        return (BridgeConfig) lazy.getValue();
    }

    private ByteBridge() {
    }

    /* renamed from: a */
    public final BridgeService mo69800a() {
        return f50574c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/sdk/bytebridge/base/model/BridgeConfig;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.base.d$a */
    static final class C20683a extends Lambda implements Function0<BridgeConfig> {
        public static final C20683a INSTANCE = new C20683a();

        C20683a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BridgeConfig invoke() {
            return ByteBridge.f50573b.mo69800a().mo69783a();
        }
    }

    /* renamed from: d */
    private final void m75387d() {
        if (f50578g.isEmpty()) {
            List<IBridgeIndex> list = f50577f;
            Intrinsics.checkExpressionValueIsNotNull(list, "bridgeIndexList");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo69781a(f50578g);
            }
        }
    }

    /* renamed from: c */
    public final void mo69805c() {
        if (!f50575d) {
            f50574c.mo69784b();
            f50574c.mo69785c();
            f50575d = true;
        }
    }

    /* renamed from: c */
    private final boolean m75386c(String str) {
        if (StringsKt.startsWith$default(str, "java.", false, 2, (Object) null) || StringsKt.startsWith$default(str, "javax.", false, 2, (Object) null) || StringsKt.startsWith$default(str, "android.", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Class<?> mo69802a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        m75387d();
        Class<?> cls = f50578g.get(str);
        if (cls != null) {
            return cls;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo69804b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        HashMap hashMap = new HashMap();
        List<IBridgeIndex> list = f50577f;
        Intrinsics.checkExpressionValueIsNotNull(list, "bridgeIndexList");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            HashMap hashMap2 = hashMap;
            it.next().mo69782a(hashMap2, str);
            if (!hashMap2.isEmpty()) {
                break;
            }
        }
        f50579h.putAll(hashMap);
    }

    /* renamed from: a */
    public final C20687f mo69801a(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        C20687f fVar = new C20687f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class<?> cls2 = (Class) linkedList.remove();
            Intrinsics.checkExpressionValueIsNotNull(cls2, C60375c.f150914a);
            Class<? super Object> superclass = cls2.getSuperclass();
            if (superclass != null) {
                String name = superclass.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "superClass.name");
                if (m75386c(name)) {
                    linkedList.add(superclass);
                }
            }
            m75385a(cls2, fVar);
        }
        return fVar;
    }

    /* renamed from: a */
    private final void m75385a(Class<?> cls, C20687f fVar) {
        C20687f fVar2 = f50579h.get(cls);
        if (fVar2 != null) {
            Intrinsics.checkExpressionValueIsNotNull(fVar2, "it");
            synchronized (fVar2) {
                for (C20685c cVar : fVar2.mo69847a()) {
                    if (!fVar.mo69849a(cVar.mo69838b())) {
                        fVar.mo69848a(cVar.mo69838b(), cVar);
                    }
                }
            }
            return;
        }
        C20687f fVar3 = new C20687f();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            int length = declaredAnnotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Annotation annotation = declaredAnnotations[i];
                if (annotation instanceof BridgeMethodSync) {
                    BridgeMethodSync bridgeMethodSync = (BridgeMethodSync) annotation;
                    String value = bridgeMethodSync.value();
                    if (!TextUtils.isEmpty(value) && !fVar.mo69849a(value)) {
                        method.setAccessible(true);
                        C20685c a = m75384a(method, value, bridgeMethodSync.privilege(), BridgeSyncTypeEnum.SYNC);
                        fVar.mo69848a(value, a);
                        fVar3.mo69848a(value, a);
                    }
                } else {
                    if (annotation instanceof BridgeMethodAsync) {
                        BridgeMethodAsync bridgeMethodAsync = (BridgeMethodAsync) annotation;
                        String value2 = bridgeMethodAsync.value();
                        if (!TextUtils.isEmpty(value2) && !fVar.mo69849a(value2)) {
                            method.setAccessible(true);
                            C20685c a2 = m75384a(method, value2, bridgeMethodAsync.privilege(), BridgeSyncTypeEnum.ASYNC);
                            fVar.mo69848a(value2, a2);
                            fVar3.mo69848a(value2, a2);
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        if (!fVar3.mo69847a().isEmpty()) {
            f50579h.put(cls, fVar3);
        }
    }

    /* renamed from: a */
    private final C20685c m75384a(Method method, String str, String str2, BridgeSyncTypeEnum bridgeSyncTypeEnum) {
        method.setAccessible(true);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        Class<?>[] parameterTypes = method.getParameterTypes();
        C20686e[] eVarArr = new C20686e[parameterAnnotations.length];
        Intrinsics.checkExpressionValueIsNotNull(parameterAnnotations, "allAnnotations");
        int length = parameterAnnotations.length;
        for (int i = 0; i < length; i++) {
            Annotation[] annotationArr = parameterAnnotations[i];
            Intrinsics.checkExpressionValueIsNotNull(annotationArr, "allAnnotations[i]");
            int length2 = annotationArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (parameterAnnotations[i][i2] instanceof BridgeParam) {
                    Annotation annotation = parameterAnnotations[i][i2];
                    if (annotation != null) {
                        BridgeParam bridgeParam = (BridgeParam) annotation;
                        Class<?> cls = parameterTypes[i];
                        String value = bridgeParam.value();
                        Object obj = null;
                        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
                            obj = Integer.valueOf(bridgeParam.defaultInt());
                        } else if (Intrinsics.areEqual(cls, Long.TYPE)) {
                            obj = Long.valueOf(bridgeParam.defaultLong());
                        } else if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
                            obj = Boolean.valueOf(bridgeParam.defaultBoolean());
                        } else if (Intrinsics.areEqual(cls, Double.TYPE)) {
                            obj = Double.valueOf(bridgeParam.defaultDouble());
                        } else if (Intrinsics.areEqual(cls, Float.TYPE)) {
                            obj = Float.valueOf(bridgeParam.defaultFloat());
                        } else if (Intrinsics.areEqual(cls, String.class)) {
                            obj = bridgeParam.defaultString();
                        }
                        eVarArr[i] = new C20686e(0, cls, value, obj, bridgeParam.required());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.sdk.bridge.annotation.BridgeParam");
                    }
                } else if (parameterAnnotations[i][i2] instanceof BridgeContext) {
                    eVarArr[i] = new C20686e(1);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return new C20685c(method, str, str2, bridgeSyncTypeEnum, eVarArr);
    }
}
