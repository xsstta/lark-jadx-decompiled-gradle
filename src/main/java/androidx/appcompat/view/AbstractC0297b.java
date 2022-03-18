package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.appcompat.view.b */
public abstract class AbstractC0297b {

    /* renamed from: a */
    private Object f872a;

    /* renamed from: b */
    private boolean f873b;

    /* renamed from: androidx.appcompat.view.b$a */
    public interface AbstractC0298a {
        /* renamed from: a */
        void mo884a(AbstractC0297b bVar);

        /* renamed from: a */
        boolean mo885a(AbstractC0297b bVar, Menu menu);

        /* renamed from: a */
        boolean mo886a(AbstractC0297b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo887b(AbstractC0297b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo988a();

    /* renamed from: a */
    public abstract void mo989a(int i);

    /* renamed from: a */
    public abstract void mo990a(View view);

    /* renamed from: a */
    public abstract void mo991a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo993b();

    /* renamed from: b */
    public abstract void mo994b(int i);

    /* renamed from: b */
    public abstract void mo995b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo996c();

    /* renamed from: d */
    public abstract void mo997d();

    /* renamed from: f */
    public abstract CharSequence mo999f();

    /* renamed from: g */
    public abstract CharSequence mo1000g();

    /* renamed from: h */
    public boolean mo1001h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo1002i();

    /* renamed from: j */
    public Object mo1159j() {
        return this.f872a;
    }

    /* renamed from: k */
    public boolean mo1160k() {
        return this.f873b;
    }

    /* renamed from: a */
    public void mo1158a(Object obj) {
        this.f872a = obj;
    }

    /* renamed from: a */
    public void mo992a(boolean z) {
        this.f873b = z;
    }
}
