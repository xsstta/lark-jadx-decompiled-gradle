package com.bytedance.ee.bear.search;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.bytedance.ee.bear.search.g */
public class C10824g extends C1144ai.C1148d {

    /* renamed from: a */
    private C10841k f29005a;

    private C10824g(C10841k kVar) {
        this.f29005a = kVar;
    }

    /* renamed from: a */
    public static C1144ai.AbstractC1146b m44896a(C10841k kVar) {
        return new C10824g(kVar);
    }

    @Override // androidx.lifecycle.C1144ai.C1148d, androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        try {
            return cls.getConstructor(this.f29005a.getClass()).newInstance(this.f29005a);
        } catch (InstantiationException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
