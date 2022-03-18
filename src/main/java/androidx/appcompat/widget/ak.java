package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class ak extends Resources {

    /* renamed from: a */
    private static boolean f1591a;

    /* renamed from: b */
    private final WeakReference<Context> f1592b;

    /* renamed from: b */
    public static boolean m1861b() {
        return f1591a;
    }

    /* renamed from: a */
    public static boolean m1860a() {
        if (!m1861b() || Build.VERSION.SDK_INT > 20) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m1859a(boolean z) {
        f1591a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo2543a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.f1592b.get();
        if (context != null) {
            return C0472v.m2105a().mo2685a(context, this, i);
        }
        return super.getDrawable(i);
    }

    public ak(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1592b = new WeakReference<>(context);
    }
}
