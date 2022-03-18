package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.AbstractC0297b;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.d */
public class C0300d extends AbstractC0297b implements C0322f.AbstractC0323a {

    /* renamed from: a */
    private Context f874a;

    /* renamed from: b */
    private ActionBarContextView f875b;

    /* renamed from: c */
    private AbstractC0297b.AbstractC0298a f876c;

    /* renamed from: d */
    private WeakReference<View> f877d;

    /* renamed from: e */
    private boolean f878e;

    /* renamed from: f */
    private boolean f879f;

    /* renamed from: g */
    private C0322f f880g;

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: b */
    public Menu mo993b() {
        return this.f880g;
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: d */
    public void mo997d() {
        this.f876c.mo887b(this, this.f880g);
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: f */
    public CharSequence mo999f() {
        return this.f875b.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: g */
    public CharSequence mo1000g() {
        return this.f875b.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: h */
    public boolean mo1001h() {
        return this.f875b.mo1678d();
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: a */
    public MenuInflater mo988a() {
        return new C0303f(this.f875b.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: i */
    public View mo1002i() {
        WeakReference<View> weakReference = this.f877d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: c */
    public void mo996c() {
        if (!this.f878e) {
            this.f878e = true;
            this.f875b.sendAccessibilityEvent(32);
            this.f876c.mo884a(this);
        }
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: a */
    public void mo991a(CharSequence charSequence) {
        this.f875b.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: b */
    public void mo995b(CharSequence charSequence) {
        this.f875b.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: b */
    public void mo994b(int i) {
        mo991a((CharSequence) this.f874a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: a */
    public void mo989a(int i) {
        mo995b(this.f874a.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: a */
    public void mo990a(View view) {
        WeakReference<View> weakReference;
        this.f875b.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f877d = weakReference;
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
    /* renamed from: a */
    public void mo836a(C0322f fVar) {
        mo997d();
        this.f875b.mo1675a();
    }

    @Override // androidx.appcompat.view.AbstractC0297b
    /* renamed from: a */
    public void mo992a(boolean z) {
        super.mo992a(z);
        this.f875b.setTitleOptional(z);
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
    /* renamed from: a */
    public boolean mo839a(C0322f fVar, MenuItem menuItem) {
        return this.f876c.mo886a(this, menuItem);
    }

    public C0300d(Context context, ActionBarContextView actionBarContextView, AbstractC0297b.AbstractC0298a aVar, boolean z) {
        this.f874a = context;
        this.f875b = actionBarContextView;
        this.f876c = aVar;
        C0322f a = new C0322f(actionBarContextView.getContext()).mo1382a(1);
        this.f880g = a;
        a.mo1390a(this);
        this.f879f = z;
    }
}
