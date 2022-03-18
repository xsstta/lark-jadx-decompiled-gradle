package com.bytedance.sdk.bridge.annotation;

import android.text.TextUtils;
import com.bytedance.sdk.bridge.C20666f;
import com.bytedance.sdk.bridge.C20667g;
import com.bytedance.sdk.bridge.C20678m;
import com.bytedance.sdk.bridge.Logger;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.bridge.annotation.a */
public class C20658a {

    /* renamed from: a */
    private static Map<Class<?>, C20678m> f50399a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Map<Class<?>, C20678m> m75124a() {
        return f50399a;
    }

    /* renamed from: a */
    public static C20678m m75123a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return m75128b(cls);
    }

    /* renamed from: a */
    private static boolean m75127a(String str) {
        if (str.startsWith("java.") || str.startsWith("javax.") || str.startsWith("android.")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m75126a(Map<Class<?>, C20678m> map) {
        if (map != null) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeAnnotationHelper", "setSubscriberInfoIndex " + map.size());
            f50399a.putAll(map);
        }
    }

    /* renamed from: b */
    private static C20678m m75128b(Class<?> cls) {
        if (cls != null) {
            Logger lVar = Logger.f50514b;
            lVar.mo69733a("BridgeAnnotationHelper", "getInfoByReflect - " + cls.getSimpleName());
        }
        C20678m mVar = new C20678m();
        LinkedList linkedList = new LinkedList();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove();
            Class<?>[] interfaces = cls2.getInterfaces();
            int i = 0;
            while (interfaces != null && i < interfaces.length) {
                if (AbstractC20659b.class.isAssignableFrom(interfaces[i]) && interfaces[i] != AbstractC20659b.class) {
                    linkedList.add(interfaces[i]);
                }
                i++;
            }
            Class superclass = cls2.getSuperclass();
            if (superclass != null && !m75127a(superclass.getName())) {
                linkedList.add(superclass);
            }
            m75125a(cls2, mVar);
        }
        return mVar;
    }

    /* renamed from: a */
    private static void m75125a(Class cls, C20678m mVar) {
        Method[] methodArr;
        Method[] methodArr2;
        Object obj;
        Object obj2;
        C20678m mVar2 = f50399a.get(cls);
        if (mVar2 != null) {
            synchronized (mVar2) {
                for (C20666f fVar : mVar2.mo69750a()) {
                    if (!mVar.mo69752a(fVar.mo69563b())) {
                        mVar.mo69751a(fVar.mo69563b(), fVar);
                    }
                }
            }
            return;
        }
        C20678m mVar3 = new C20678m();
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            BridgeMethod bridgeMethod = (BridgeMethod) method.getAnnotation(BridgeMethod.class);
            if (bridgeMethod != null) {
                String value = bridgeMethod.value();
                if (!TextUtils.isEmpty(value) && !mVar.mo69752a(value)) {
                    method.setAccessible(true);
                    String privilege = bridgeMethod.privilege();
                    String sync = bridgeMethod.sync();
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    C20667g[] gVarArr = new C20667g[parameterAnnotations.length];
                    int i2 = 0;
                    while (i2 < parameterAnnotations.length) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= parameterAnnotations[i2].length) {
                                methodArr2 = declaredMethods;
                                break;
                            } else if (parameterAnnotations[i2][i3] instanceof BridgeParam) {
                                BridgeParam bridgeParam = (BridgeParam) parameterAnnotations[i2][i3];
                                Class<?> cls2 = parameterTypes[i2];
                                String value2 = bridgeParam.value();
                                methodArr2 = declaredMethods;
                                if (cls2 == Integer.TYPE || cls2 == Integer.class) {
                                    obj2 = Integer.valueOf(bridgeParam.defaultInt());
                                } else if (cls2 == Long.TYPE) {
                                    obj2 = Long.valueOf(bridgeParam.defaultLong());
                                } else if (cls2 == Boolean.TYPE) {
                                    obj2 = Boolean.valueOf(bridgeParam.defaultBoolean());
                                } else if (cls2 == Double.TYPE) {
                                    obj2 = Double.valueOf(bridgeParam.defaultDouble());
                                } else if (cls2 == Float.TYPE) {
                                    obj2 = Float.valueOf(bridgeParam.defaultFloat());
                                } else if (cls2 == String.class) {
                                    obj2 = bridgeParam.defaultString();
                                } else {
                                    obj = null;
                                    gVarArr[i2] = new C20667g(0, cls2, value2, obj, bridgeParam.required());
                                }
                                obj = obj2;
                                gVarArr[i2] = new C20667g(0, cls2, value2, obj, bridgeParam.required());
                            } else {
                                methodArr2 = declaredMethods;
                                if (parameterAnnotations[i2][i3] instanceof BridgeContext) {
                                    gVarArr[i2] = new C20667g(1);
                                    break;
                                } else {
                                    i3++;
                                    declaredMethods = methodArr2;
                                }
                            }
                        }
                        if (gVarArr[i2] != null) {
                            i2++;
                            declaredMethods = methodArr2;
                        } else {
                            throw new IllegalArgumentException("Bridge param must be Annotated! Please check the bridge method [" + value + "]");
                        }
                    }
                    methodArr = declaredMethods;
                    C20666f fVar2 = new C20666f(method, value, privilege, sync, gVarArr);
                    mVar.mo69751a(value, fVar2);
                    mVar3.mo69751a(value, fVar2);
                    i++;
                    declaredMethods = methodArr;
                }
            }
            methodArr = declaredMethods;
            i++;
            declaredMethods = methodArr;
        }
        if (!mVar3.mo69750a().isEmpty()) {
            f50399a.put(cls, mVar3);
        }
    }
}
