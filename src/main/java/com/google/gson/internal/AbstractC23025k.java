package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.k */
public abstract class AbstractC23025k {
    /* renamed from: a */
    public abstract <T> T mo79971a(Class<T> cls) throws Exception;

    /* renamed from: a */
    public static AbstractC23025k m83506a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new AbstractC23025k() {
                /* class com.google.gson.internal.AbstractC23025k.C230261 */

                @Override // com.google.gson.internal.AbstractC23025k
                /* renamed from: a */
                public <T> T mo79971a(Class<T> cls) throws Exception {
                    m83507b(cls);
                    return (T) method.invoke(obj, cls);
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new AbstractC23025k() {
                    /* class com.google.gson.internal.AbstractC23025k.C230272 */

                    @Override // com.google.gson.internal.AbstractC23025k
                    /* renamed from: a */
                    public <T> T mo79971a(Class<T> cls) throws Exception {
                        m83507b(cls);
                        return (T) declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new AbstractC23025k() {
                        /* class com.google.gson.internal.AbstractC23025k.C230283 */

                        @Override // com.google.gson.internal.AbstractC23025k
                        /* renamed from: a */
                        public <T> T mo79971a(Class<T> cls) throws Exception {
                            m83507b(cls);
                            return (T) declaredMethod3.invoke(null, cls, Object.class);
                        }
                    };
                } catch (Exception unused3) {
                    return new AbstractC23025k() {
                        /* class com.google.gson.internal.AbstractC23025k.C230294 */

                        @Override // com.google.gson.internal.AbstractC23025k
                        /* renamed from: a */
                        public <T> T mo79971a(Class<T> cls) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls);
                        }
                    };
                }
            }
        }
    }

    /* renamed from: b */
    static void m83507b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }
}
