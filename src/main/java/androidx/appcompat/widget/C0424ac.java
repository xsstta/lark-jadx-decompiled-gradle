package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.ac */
public class C0424ac extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1537a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0424ac>> f1538b;

    /* renamed from: c */
    private final Resources f1539c;

    /* renamed from: d */
    private final Resources.Theme f1540d;

    public Resources getResources() {
        return this.f1539c;
    }

    public AssetManager getAssets() {
        return this.f1539c.getAssets();
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1540d;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1540d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    private C0424ac(Context context) {
        super(context);
        if (ak.m1860a()) {
            ak akVar = new ak(this, context.getResources());
            this.f1539c = akVar;
            Resources.Theme newTheme = akVar.newTheme();
            this.f1540d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1539c = new C0426ae(this, context.getResources());
        this.f1540d = null;
    }

    /* renamed from: b */
    private static boolean m1774b(Context context) {
        if ((context instanceof C0424ac) || (context.getResources() instanceof C0426ae) || (context.getResources() instanceof ak)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || ak.m1860a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Context m1773a(Context context) {
        C0424ac acVar;
        if (!m1774b(context)) {
            return context;
        }
        synchronized (f1537a) {
            ArrayList<WeakReference<C0424ac>> arrayList = f1538b;
            if (arrayList == null) {
                f1538b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0424ac> weakReference = f1538b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1538b.remove(size);
                    }
                }
                for (int size2 = f1538b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0424ac> weakReference2 = f1538b.get(size2);
                    if (weakReference2 != null) {
                        acVar = weakReference2.get();
                    } else {
                        acVar = null;
                    }
                    if (acVar != null && acVar.getBaseContext() == context) {
                        return acVar;
                    }
                }
            }
            C0424ac acVar2 = new C0424ac(context);
            f1538b.add(new WeakReference<>(acVar2));
            return acVar2;
        }
    }
}
