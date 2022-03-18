package com.lynx.jsbridge;

import androidx.collection.ArrayMap;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.base.C26614b;
import java.lang.reflect.Method;

/* renamed from: com.lynx.jsbridge.c */
public class C26508c {

    /* renamed from: a */
    private static ArrayMap<Class, Character> f65547a;

    /* renamed from: b */
    private final Method f65548b;

    /* renamed from: c */
    private final Class[] f65549c;

    /* renamed from: d */
    private boolean f65550d;

    /* renamed from: e */
    private String f65551e;

    /* renamed from: a */
    public String mo93989a() {
        if (!this.f65550d) {
            m96079b();
        }
        return (String) C26614b.m96455a(this.f65551e);
    }

    /* renamed from: b */
    private void m96079b() {
        if (!this.f65550d) {
            this.f65550d = true;
            this.f65551e = m96077a(this.f65548b, this.f65549c);
        }
    }

    C26508c(Method method) {
        this.f65548b = method;
        method.setAccessible(true);
        this.f65549c = method.getParameterTypes();
    }

    /* renamed from: b */
    private static char m96078b(Class cls) {
        char c = m96080c(cls);
        if (c != 0) {
            return c;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        if (cls == byte[].class) {
            return 'a';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    /* renamed from: a */
    private static char m96076a(Class cls) {
        char c = m96080c(cls);
        if (c != 0) {
            return c;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == AbstractC26517a.class) {
            return 'Y';
        }
        if (cls == byte[].class) {
            return 'a';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    /* renamed from: c */
    private static char m96080c(Class cls) {
        if (f65547a == null) {
            ArrayMap<Class, Character> arrayMap = new ArrayMap<>();
            f65547a = arrayMap;
            arrayMap.put(Byte.TYPE, 'b');
            f65547a.put(Byte.class, 'B');
            f65547a.put(Short.TYPE, 's');
            f65547a.put(Short.class, 'S');
            f65547a.put(Long.TYPE, 'l');
            f65547a.put(Long.class, 'L');
            f65547a.put(Character.TYPE, 'c');
            f65547a.put(Character.class, 'C');
            f65547a.put(Boolean.TYPE, 'z');
            f65547a.put(Boolean.class, 'Z');
            f65547a.put(Integer.TYPE, 'i');
            f65547a.put(Integer.class, 'I');
            f65547a.put(Double.TYPE, 'd');
            f65547a.put(Double.class, 'D');
            f65547a.put(Float.TYPE, 'f');
            f65547a.put(Float.class, 'F');
            f65547a.put(String.class, 'T');
        }
        if (f65547a.containsKey(cls)) {
            return f65547a.get(cls).charValue();
        }
        return 0;
    }

    /* renamed from: a */
    private String m96077a(Method method, Class[] clsArr) {
        StringBuilder sb = new StringBuilder(clsArr.length + 2);
        sb.append(m96078b(method.getReturnType()));
        sb.append('.');
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z = true;
                if (i != clsArr.length - 1) {
                    z = false;
                }
                C26614b.m96458a(z, "Promise must be used as last parameter only");
            }
            sb.append(m96076a(cls));
        }
        return sb.toString();
    }
}
