package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.g */
public class C0787g extends C0785e {

    /* renamed from: a */
    protected final Class<?> f3189a;

    /* renamed from: b */
    protected final Constructor<?> f3190b;

    /* renamed from: c */
    protected final Method f3191c;

    /* renamed from: d */
    protected final Method f3192d;

    /* renamed from: e */
    protected final Method f3193e;

    /* renamed from: f */
    protected final Method f3194f;

    /* renamed from: g */
    protected final Method f3195g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Class<?> mo4369a() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: c */
    private Object m3824c() {
        try {
            return this.f3190b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m3822b() {
        if (this.f3191c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f3191c != null) {
            return true;
        }
        return false;
    }

    public C0787g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> a = mo4369a();
            constructor = mo4370a(a);
            method4 = mo4371b(a);
            method3 = mo4372c(a);
            method2 = mo4373d(a);
            method = mo4374e(a);
            method5 = mo4375f(a);
            cls = a;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3189a = cls;
        this.f3190b = constructor;
        this.f3191c = method4;
        this.f3192d = method3;
        this.f3193e = method2;
        this.f3194f = method;
        this.f3195g = method5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Constructor<?> mo4370a(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo4373d(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Method mo4374e(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: c */
    private void m3825c(Object obj) {
        try {
            this.f3194f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: b */
    private boolean m3823b(Object obj) {
        try {
            return ((Boolean) this.f3193e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Method mo4372c(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Method mo4375f(Class<?> cls) throws NoSuchMethodException {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo4371b(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo4368a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3189a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3195g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C0785e, androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4365a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        Typeface a;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m3822b()) {
            FontsContractCompat.C0811b a2 = mo4377a(bVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.mo4412a(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.mo4414c()).setItalic(a2.mo4415d()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a3 = FontsContractCompat.m3904a(context, bVarArr, cancellationSignal);
            Object c = m3824c();
            if (c == null) {
                return null;
            }
            boolean z = false;
            for (FontsContractCompat.C0811b bVar : bVarArr) {
                ByteBuffer byteBuffer = a3.get(bVar.mo4412a());
                if (byteBuffer != null) {
                    if (!m3821a(c, byteBuffer, bVar.mo4413b(), bVar.mo4414c(), bVar.mo4415d() ? 1 : 0)) {
                        m3825c(c);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m3825c(c);
                return null;
            } else if (m3823b(c) && (a = mo4368a(c)) != null) {
                return Typeface.create(a, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // androidx.core.graphics.C0785e, androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4366a(Context context, FontResourcesParserCompat.C0752b bVar, Resources resources, int i) {
        if (!m3822b()) {
            return super.mo4366a(context, bVar, resources, i);
        }
        Object c = m3824c();
        if (c == null) {
            return null;
        }
        FontResourcesParserCompat.C0753c[] a = bVar.mo4269a();
        for (FontResourcesParserCompat.C0753c cVar : a) {
            if (!m3820a(context, c, cVar.mo4270a(), cVar.mo4274e(), cVar.mo4271b(), cVar.mo4272c() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo4273d()))) {
                m3825c(c);
                return null;
            }
        }
        if (!m3823b(c)) {
            return null;
        }
        return mo4368a(c);
    }

    /* renamed from: a */
    private boolean m3821a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3192d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4367a(Context context, Resources resources, int i, String str, int i2) {
        if (!m3822b()) {
            return super.mo4367a(context, resources, i, str, i2);
        }
        Object c = m3824c();
        if (c == null) {
            return null;
        }
        if (!m3820a(context, c, str, 0, -1, -1, null)) {
            m3825c(c);
            return null;
        } else if (!m3823b(c)) {
            return null;
        } else {
            return mo4368a(c);
        }
    }

    /* renamed from: a */
    private boolean m3820a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3191c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
