package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.C0517d;
import androidx.core.content.res.C0760e;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;

/* renamed from: androidx.core.graphics.d */
public class C0773d {

    /* renamed from: a */
    private static final C0790j f3139a;

    /* renamed from: b */
    private static final C0517d<String, Typeface> f3140b = new C0517d<>(16);

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3139a = new C0789i();
        } else if (Build.VERSION.SDK_INT >= 28) {
            f3139a = new C0788h();
        } else if (Build.VERSION.SDK_INT >= 26) {
            f3139a = new C0787g();
        } else if (Build.VERSION.SDK_INT >= 24 && C0786f.m3815a()) {
            f3139a = new C0786f();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f3139a = new C0785e();
        } else {
            f3139a = new C0790j();
        }
    }

    /* renamed from: a */
    public static Typeface m3740a(Resources resources, int i, int i2) {
        return f3140b.mo2974a(m3742b(resources, i, i2));
    }

    /* renamed from: b */
    private static Typeface m3741b(Context context, Typeface typeface, int i) {
        C0790j jVar = f3139a;
        FontResourcesParserCompat.C0752b a = jVar.mo4378a(typeface);
        if (a == null) {
            return null;
        }
        return jVar.mo4366a(context, a, context.getResources(), i);
    }

    /* renamed from: a */
    public static Typeface m3737a(Context context, Typeface typeface, int i) {
        Typeface b;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (b = m3741b(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return b;
        }
    }

    /* renamed from: b */
    private static String m3742b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: a */
    public static Typeface m3738a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        return f3139a.mo4365a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m3736a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f3139a.mo4367a(context, resources, i, str, i2);
        if (a != null) {
            f3140b.mo2975a(m3742b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m3739a(Context context, FontResourcesParserCompat.AbstractC0751a aVar, Resources resources, int i, int i2, C0760e.AbstractC0761a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        int i3;
        if (aVar instanceof FontResourcesParserCompat.C0754d) {
            FontResourcesParserCompat.C0754d dVar = (FontResourcesParserCompat.C0754d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo4277b() == 0) {
                z2 = true;
            }
            if (z) {
                i3 = dVar.mo4278c();
            } else {
                i3 = -1;
            }
            typeface = FontsContractCompat.m3899a(context, dVar.mo4276a(), aVar2, handler, z2, i3, i2);
        } else {
            typeface = f3139a.mo4366a(context, (FontResourcesParserCompat.C0752b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo4287a(typeface, handler);
                } else {
                    aVar2.mo4286a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f3140b.mo2975a(m3742b(resources, i, i2), typeface);
        }
        return typeface;
    }
}
