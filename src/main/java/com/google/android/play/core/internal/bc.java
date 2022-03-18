package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

public final class bc<T> {

    /* renamed from: a */
    private final Object f56029a;

    /* renamed from: b */
    private final Field f56030b;

    /* renamed from: c */
    private final Class<T> f56031c;

    bc(Object obj, Field field, Class<T> cls) {
        this.f56029a = obj;
        this.f56030b = field;
        this.f56031c = cls;
    }

    bc(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: c */
    private Class m82307c() {
        return mo78879b().getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo78876a() {
        try {
            return this.f56031c.cast(this.f56030b.get(this.f56029a));
        } catch (Exception e) {
            throw new C22632bm(String.format("Failed to get value of field %s of type %s on object of type %s", this.f56030b.getName(), this.f56029a.getClass().getName(), this.f56031c.getName()), e);
        }
    }

    /* renamed from: a */
    public final void mo78877a(T t) {
        try {
            this.f56030b.set(this.f56029a, t);
        } catch (Exception e) {
            throw new C22632bm(String.format("Failed to set value of field %s of type %s on object of type %s", this.f56030b.getName(), this.f56029a.getClass().getName(), this.f56031c.getName()), e);
        }
    }

    /* renamed from: a */
    public void mo78878a(Collection collection) {
        Object[] objArr = (Object[]) mo78876a();
        int length = objArr != null ? objArr.length : 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m82307c(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        mo78877a(objArr2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Field mo78879b() {
        return this.f56030b;
    }

    /* renamed from: b */
    public void mo78880b(Collection collection) {
        Object[] objArr = (Object[]) mo78876a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m82307c(), (objArr != null ? objArr.length : 0) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo78877a(objArr2);
    }
}
