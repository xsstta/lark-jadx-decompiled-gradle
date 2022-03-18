package com.google.gson.internal.p1001b;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.b.c */
final class C23004c extends AbstractC23003b {

    /* renamed from: a */
    private static Class f56840a;

    /* renamed from: b */
    private final Object f56841b = m83449b();

    /* renamed from: c */
    private final Field f56842c = m83450c();

    C23004c() {
    }

    /* renamed from: c */
    private static Field m83450c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Object m83449b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f56840a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.p1001b.AbstractC23003b
    /* renamed from: a */
    public void mo79949a(AccessibleObject accessibleObject) {
        if (!mo79950b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo79950b(AccessibleObject accessibleObject) {
        if (!(this.f56841b == null || this.f56842c == null)) {
            try {
                long longValue = ((Long) f56840a.getMethod("objectFieldOffset", Field.class).invoke(this.f56841b, this.f56842c)).longValue();
                f56840a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f56841b, accessibleObject, Long.valueOf(longValue), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
