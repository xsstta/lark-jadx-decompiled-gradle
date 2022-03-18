package com.lark.falcon.engine.module;

import android.text.TextUtils;
import com.lark.falcon.engine.bridge.JavaMethodWrapper;
import com.lark.falcon.engine.bridge.JavaOnlyArray;
import com.lark.falcon.engine.holder.AndroidFalconShellHolder;
import com.lark.falcon.engine.module.anonotations.JavaScriptObject;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* renamed from: com.lark.falcon.engine.module.d */
public class C24016d {

    /* renamed from: a */
    HashMap<Class<? extends AbstractC24015c>, AbstractC24015c> f59389a = new HashMap<>();

    /* renamed from: b */
    HashMap<Class<? extends AbstractC24014b>, AbstractC24014b> f59390b = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.module.d$b */
    public static class C24018b implements InvocationHandler {

        /* renamed from: a */
        private AndroidFalconShellHolder f59393a;

        /* renamed from: b */
        private String f59394b;

        /* renamed from: c */
        private Class<? extends AbstractC24015c> f59395c;

        /* renamed from: a */
        private String m87788a() {
            if (TextUtils.isEmpty(this.f59394b)) {
                String name = ((JavaScriptObject) this.f59395c.getAnnotation(JavaScriptObject.class)).name();
                if ("".equals(name)) {
                    name = this.f59395c.getSimpleName();
                }
                this.f59394b = name;
            }
            return this.f59394b;
        }

        public C24018b(AndroidFalconShellHolder androidFalconShellHolder, Class<? extends AbstractC24015c> cls) {
            this.f59393a = androidFalconShellHolder;
            this.f59395c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return this.f59393a.mo86079a(m87788a(), method.getName(), JavaOnlyArray.of(objArr), JavaMethodWrapper.returnTypeToChar(method.getReturnType()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lark.falcon.engine.module.d$a */
    public static class C24017a implements InvocationHandler {

        /* renamed from: a */
        private AndroidFalconShellHolder f59391a;

        /* renamed from: b */
        private Class<? extends AbstractC24014b> f59392b;

        public C24017a(AndroidFalconShellHolder androidFalconShellHolder, Class<? extends AbstractC24014b> cls) {
            this.f59391a = androidFalconShellHolder;
            this.f59392b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return this.f59391a.mo86078a(method.getName(), JavaOnlyArray.of(objArr), JavaMethodWrapper.returnTypeToChar(method.getReturnType()));
        }
    }

    /* renamed from: a */
    public <T extends AbstractC24015c> T mo86198a(AndroidFalconShellHolder androidFalconShellHolder, Class<? extends AbstractC24015c> cls) {
        T t = (T) this.f59389a.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC24015c) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C24018b(androidFalconShellHolder, cls)));
        this.f59389a.put(cls, t2);
        return t2;
    }

    /* renamed from: b */
    public <T extends AbstractC24014b> T mo86199b(AndroidFalconShellHolder androidFalconShellHolder, Class<? extends AbstractC24014b> cls) {
        T t = (T) this.f59390b.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC24014b) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C24017a(androidFalconShellHolder, cls)));
        this.f59390b.put(cls, t2);
        return t2;
    }
}
