package com.lynx.tasm.behavior.utils;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LynxUIMethodsExecutor {

    /* renamed from: a */
    private static final Map<Class<?>, AbstractC26843a<?>> f66668a = new HashMap();

    /* access modifiers changed from: private */
    public static class FallbackLynxUIMethodInvoker<T extends LynxBaseUI> implements AbstractC26843a<T> {

        /* renamed from: a */
        private Map<String, Method> f66669a;

        public FallbackLynxUIMethodInvoker(Class<? extends LynxBaseUI> cls) {
            this.f66669a = C26844b.m97611a(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.AbstractC26843a
        public void invoke(T t, String str, ReadableMap readableMap, Callback callback) {
            Method method = this.f66669a.get(str);
            if (method == null) {
                callback.invoke(3);
                return;
            }
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 0) {
                    method.invoke(t, new Object[0]);
                } else if (parameterTypes.length == 1) {
                    if (parameterTypes[0] == ReadableMap.class) {
                        method.invoke(t, readableMap);
                    } else if (parameterTypes[0] == Callback.class) {
                        method.invoke(t, callback);
                    }
                } else if (parameterTypes[0] == ReadableMap.class && parameterTypes[1] == Callback.class) {
                    method.invoke(t, readableMap, callback);
                } else {
                    callback.invoke(4);
                    LLog.m96423b("FallbackMethodInvoker", "invoke target method: params invalid");
                }
            } catch (Exception e) {
                callback.invoke(1);
                LLog.m96423b("FallbackMethodInvoker", "invoke target method exception," + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private static <T> T m97601b(Class<?> cls) {
        String str = cls.getName() + "$$MethodInvoker";
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods invoker for " + str, e);
        }
    }

    /* renamed from: a */
    static <T extends LynxBaseUI> AbstractC26843a<T> m97599a(Class<? extends LynxBaseUI> cls) {
        Map<Class<?>, AbstractC26843a<?>> map = f66668a;
        AbstractC26843a<?> aVar = map.get(cls);
        if (aVar == null) {
            aVar = (AbstractC26843a) m97601b(cls);
            if (aVar == null) {
                String str = "MethodInvoker not generated for class: " + cls.getName() + ". You should add module lynxProcessor";
                LLog.m96429e("MethodsExecutor", str);
                if (!LynxEnv.m96123e().mo94116u() || !LynxEnv.m96123e().mo94104k()) {
                    aVar = new FallbackLynxUIMethodInvoker<>(cls);
                } else {
                    throw new IllegalStateException(str);
                }
            }
            map.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m97600a(LynxBaseUI lynxBaseUI, String str, ReadableMap readableMap, Callback callback) {
        m97599a(lynxBaseUI.getClass()).invoke(lynxBaseUI, str, readableMap, callback);
    }
}
