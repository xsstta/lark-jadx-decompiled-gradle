package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ae */
public class C0426ae extends C0479w {

    /* renamed from: a */
    private final WeakReference<Context> f1545a;

    @Override // androidx.appcompat.widget.C0479w, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1545a.get();
        if (!(drawable == null || context == null)) {
            C0472v.m2105a().mo2688a(context, i, drawable);
        }
        return drawable;
    }

    public C0426ae(Context context, Resources resources) {
        super(resources);
        this.f1545a = new WeakReference<>(context);
    }
}
