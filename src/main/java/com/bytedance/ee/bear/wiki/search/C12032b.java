package com.bytedance.ee.bear.wiki.search;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.bytedance.ee.bear.wiki.search.b */
public class C12032b extends C1144ai.C1148d {

    /* renamed from: a */
    private WikiSearchPuller f32472a;

    private C12032b(WikiSearchPuller wikiSearchPuller) {
        this.f32472a = wikiSearchPuller;
    }

    /* renamed from: a */
    public static C1144ai.AbstractC1146b m49847a(WikiSearchPuller wikiSearchPuller) {
        return new C12032b(wikiSearchPuller);
    }

    @Override // androidx.lifecycle.C1144ai.C1148d, androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        try {
            return cls.getConstructor(this.f32472a.getClass()).newInstance(this.f32472a);
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
