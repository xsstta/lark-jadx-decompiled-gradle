package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.e */
class C0785e extends C0790j {

    /* renamed from: a */
    private static Class<?> f3180a;

    /* renamed from: b */
    private static Constructor<?> f3181b;

    /* renamed from: c */
    private static Method f3182c;

    /* renamed from: d */
    private static Method f3183d;

    /* renamed from: e */
    private static boolean f3184e;

    C0785e() {
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4366a(Context context, FontResourcesParserCompat.C0752b bVar, Resources resources, int i) {
        Object b = m3811b();
        FontResourcesParserCompat.C0753c[] a = bVar.mo4269a();
        for (FontResourcesParserCompat.C0753c cVar : a) {
            File a2 = C0794k.m3865a(context);
            if (a2 == null) {
                return null;
            }
            try {
                if (!C0794k.m3870a(a2, resources, cVar.mo4275f())) {
                    a2.delete();
                    return null;
                } else if (!m3810a(b, a2.getPath(), cVar.mo4271b(), cVar.mo4272c())) {
                    return null;
                } else {
                    a2.delete();
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                a2.delete();
            }
        }
        return mo4368a(b);
    }

    /* renamed from: b */
    private static Object m3811b() {
        mo4369a();
        try {
            return f3181b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void mo4369a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f3184e) {
            f3184e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f3181b = constructor;
            f3180a = cls;
            f3182c = method;
            f3183d = method2;
        }
    }

    /* renamed from: a */
    public static Typeface m3806a(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (TypeFaceLancet.cache.contains(path)) {
                return (Typeface) TypeFaceLancet.cache.get(path);
            }
            Typeface createFromFile = Typeface.createFromFile(file);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(path, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(file);
    }

    /* renamed from: a */
    private static Typeface mo4368a(Object obj) {
        mo4369a();
        try {
            Object newInstance = Array.newInstance(f3180a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3183d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private File m3808a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m3810a(Object obj, String str, int i, boolean z) {
        mo4369a();
        try {
            return ((Boolean) f3182c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4365a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        if (bVarArr.length < 1) {
            return null;
        }
        FontsContractCompat.C0811b a = mo4377a(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a.mo4412a(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File a2 = m3808a(openFileDescriptor);
                if (a2 != null) {
                    if (a2.canRead()) {
                        Typeface a3 = m3806a(a2);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return a3;
                    }
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface a4 = super.mo4376a(context, fileInputStream);
                    fileInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return a4;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } catch (IOException unused) {
            return null;
        }
        throw th;
        throw th;
    }
}
