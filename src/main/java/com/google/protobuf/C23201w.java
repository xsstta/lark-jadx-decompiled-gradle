package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.w */
final class C23201w {

    /* renamed from: a */
    private static final Unsafe f57228a = m84011d();

    /* renamed from: b */
    private static final boolean f57229b = m84013f();

    /* renamed from: c */
    private static final boolean f57230c = m84012e();

    /* renamed from: d */
    private static final long f57231d = ((long) m84014g());

    /* renamed from: e */
    private static final long f57232e = m84004a(m84005a(Buffer.class, "address"));

    /* renamed from: a */
    static boolean m84007a() {
        return f57230c;
    }

    /* renamed from: b */
    static boolean m84009b() {
        return f57229b;
    }

    /* renamed from: c */
    static long m84010c() {
        return f57231d;
    }

    /* renamed from: d */
    private static Unsafe m84011d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                /* class com.google.protobuf.C23201w.C232021 */

                /* renamed from: a */
                public Unsafe run() throws Exception {
                    Field[] declaredFields = Unsafe.class.getDeclaredFields();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static int m84014g() {
        if (f57230c) {
            return f57228a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    /* renamed from: e */
    private static boolean m84012e() {
        Unsafe unsafe = f57228a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("getByte", Object.class, Long.TYPE);
                cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m84013f() {
        Unsafe unsafe = f57228a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getByte", Long.TYPE);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
                cls.getMethod("getLong", Long.TYPE);
                cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static long m84004a(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f57228a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }

    /* renamed from: a */
    static byte m84003a(byte[] bArr, long j) {
        return f57228a.getByte(bArr, j);
    }

    /* renamed from: b */
    static long m84008b(byte[] bArr, long j) {
        return f57228a.getLong(bArr, j);
    }

    /* renamed from: a */
    private static Field m84005a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m84006a(byte[] bArr, long j, byte b) {
        f57228a.putByte(bArr, j, b);
    }
}
