package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.h */
public class C0788h extends C0787g {
    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0787g
    /* renamed from: a */
    public Typeface mo4368a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3189a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3195g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0787g
    /* renamed from: f */
    public Method mo4375f(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
