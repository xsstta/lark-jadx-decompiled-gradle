package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.f */
class C0786f extends C0790j {

    /* renamed from: a */
    private static final Class<?> f3185a;

    /* renamed from: b */
    private static final Constructor<?> f3186b;

    /* renamed from: c */
    private static final Method f3187c;

    /* renamed from: d */
    private static final Method f3188d;

    C0786f() {
    }

    /* renamed from: b */
    private static Object m3817b() {
        try {
            return f3186b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3815a() {
        Method method = f3187c;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f3186b = constructor;
        f3185a = cls;
        f3187c = method;
        f3188d = method2;
    }

    /* renamed from: a */
    private static Typeface m3814a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3185a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3188d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4365a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        Object b = m3817b();
        if (b == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (FontsContractCompat.C0811b bVar : bVarArr) {
            Uri a = bVar.mo4412a();
            ByteBuffer byteBuffer = (ByteBuffer) simpleArrayMap.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0794k.m3867a(context, cancellationSignal, a);
                simpleArrayMap.put(a, byteBuffer);
            }
            if (byteBuffer == null || !m3816a(b, byteBuffer, bVar.mo4413b(), bVar.mo4414c(), bVar.mo4415d())) {
                return null;
            }
        }
        Typeface a2 = m3814a(b);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4366a(Context context, FontResourcesParserCompat.C0752b bVar, Resources resources, int i) {
        Object b = m3817b();
        if (b == null) {
            return null;
        }
        FontResourcesParserCompat.C0753c[] a = bVar.mo4269a();
        for (FontResourcesParserCompat.C0753c cVar : a) {
            ByteBuffer a2 = C0794k.m3866a(context, resources, cVar.mo4275f());
            if (a2 == null || !m3816a(b, a2, cVar.mo4274e(), cVar.mo4271b(), cVar.mo4272c())) {
                return null;
            }
        }
        return m3814a(b);
    }

    /* renamed from: a */
    private static boolean m3816a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3187c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
