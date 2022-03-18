package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
public abstract class AbstractC0894b {

    /* renamed from: a */
    private final Context f3424a;

    /* renamed from: b */
    private AbstractC0895a f3425b;

    /* renamed from: c */
    private AbstractC0896b f3426c;

    /* renamed from: androidx.core.view.b$a */
    public interface AbstractC0895a {
        /* renamed from: d */
        void mo1765d(boolean z);
    }

    /* renamed from: androidx.core.view.b$b */
    public interface AbstractC0896b {
        /* renamed from: a */
        void mo1521a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo1577a();

    /* renamed from: a */
    public void mo1578a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo1579b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1580c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1583d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo1584e() {
        return true;
    }

    /* renamed from: f */
    public void mo4683f() {
        this.f3426c = null;
        this.f3425b = null;
    }

    public AbstractC0894b(Context context) {
        this.f3424a = context;
    }

    /* renamed from: a */
    public View mo1581a(MenuItem menuItem) {
        return mo1577a();
    }

    /* renamed from: a */
    public void mo4681a(AbstractC0895a aVar) {
        this.f3425b = aVar;
    }

    /* renamed from: a */
    public void mo1582a(AbstractC0896b bVar) {
        if (!(this.f3426c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3426c = bVar;
    }

    /* renamed from: a */
    public void mo4682a(boolean z) {
        AbstractC0895a aVar = this.f3425b;
        if (aVar != null) {
            aVar.mo1765d(z);
        }
    }
}
