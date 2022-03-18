package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import org.apache.commons.lang3.C69882g;

/* renamed from: org.apache.commons.lang3.builder.b */
public class C69867b extends C69868c {

    /* renamed from: a */
    protected String[] f174639a;

    /* renamed from: b */
    private boolean f174640b = false;

    /* renamed from: c */
    private boolean f174641c = false;

    /* renamed from: d */
    private boolean f174642d;

    /* renamed from: e */
    private Class<?> f174643e = null;

    /* renamed from: a */
    public Class<?> mo245183a() {
        return this.f174643e;
    }

    /* renamed from: c */
    public boolean mo245192c() {
        return this.f174641c;
    }

    /* renamed from: b */
    public boolean mo245191b() {
        return this.f174640b;
    }

    @Override // org.apache.commons.lang3.builder.C69868c
    public String toString() {
        if (mo245195e() == null) {
            return mo245197g().getNullText();
        }
        Class<?> cls = mo245195e().getClass();
        mo245185a(cls);
        while (cls.getSuperclass() != null && cls != mo245183a()) {
            cls = cls.getSuperclass();
            mo245185a(cls);
        }
        return super.toString();
    }

    /* renamed from: b */
    public void mo245190b(boolean z) {
        this.f174641c = z;
    }

    /* renamed from: b */
    private static Object m268135b(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        C69882g.m268179a(z, "The Object passed in should not be null.", new Object[0]);
        return obj;
    }

    /* renamed from: a */
    public C69867b mo245184a(Object obj) {
        mo245197g().reflectionAppendArrayDetail(mo245196f(), null, obj);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo245188b(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(mo245195e());
    }

    /* renamed from: a */
    public void mo245186a(boolean z) {
        this.f174640b = z;
    }

    /* renamed from: b */
    public void mo245189b(Class<?> cls) {
        Object e;
        if (cls == null || (e = mo245195e()) == null || cls.isInstance(e)) {
            this.f174643e = cls;
            return;
        }
        throw new IllegalArgumentException("Specified class is not a superclass of the object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo245185a(Class<?> cls) {
        if (cls.isArray()) {
            mo245184a(mo245195e());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (mo245187a(field)) {
                try {
                    Object b = mo245188b(field);
                    if (!this.f174642d || b != null) {
                        mo245194a(name, b);
                    }
                } catch (IllegalAccessException e) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e.getMessage());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo245187a(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !mo245192c()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !mo245191b()) {
            return false;
        }
        String[] strArr = this.f174639a;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return !field.isAnnotationPresent(ToStringExclude.class);
        }
        return false;
    }

    /* renamed from: a */
    public static String m268133a(Object obj, ToStringStyle toStringStyle) {
        return m268134a(obj, toStringStyle, false, false, null);
    }

    /* renamed from: a */
    public static <T> String m268134a(T t, ToStringStyle toStringStyle, boolean z, boolean z2, Class<? super T> cls) {
        return new C69867b(t, toStringStyle, null, cls, z, z2).toString();
    }

    public <T> C69867b(T t, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(m268135b((Object) t), toStringStyle, stringBuffer);
        mo245189b((Class<?>) cls);
        mo245190b(z);
        mo245186a(z2);
    }
}
