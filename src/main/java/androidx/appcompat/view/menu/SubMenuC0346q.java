package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0322f;

/* renamed from: androidx.appcompat.view.menu.q */
public class SubMenuC0346q extends C0322f implements SubMenu {

    /* renamed from: d */
    private C0322f f1170d;

    /* renamed from: e */
    private C0326h f1171e;

    public MenuItem getItem() {
        return this.f1171e;
    }

    /* renamed from: t */
    public Menu mo1645t() {
        return this.f1170d;
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: b */
    public boolean mo1413b() {
        return this.f1170d.mo1413b();
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: c */
    public boolean mo1417c() {
        return this.f1170d.mo1417c();
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: d */
    public boolean mo1424d() {
        return this.f1170d.mo1424d();
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: q */
    public C0322f mo1445q() {
        return this.f1170d.mo1445q();
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: a */
    public String mo1387a() {
        int i;
        C0326h hVar = this.f1171e;
        if (hVar != null) {
            i = hVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo1387a() + ":" + i;
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: a */
    public void mo1390a(C0322f.AbstractC0323a aVar) {
        this.f1170d.mo1390a(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0322f
    public void setGroupDividerEnabled(boolean z) {
        this.f1170d.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1427e(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1422d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1384a(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1171e.setIcon(i);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0322f
    public void setQwertyMode(boolean z) {
        this.f1170d.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: c */
    public boolean mo1418c(C0326h hVar) {
        return this.f1170d.mo1418c(hVar);
    }

    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: d */
    public boolean mo1425d(C0326h hVar) {
        return this.f1170d.mo1425d(hVar);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1383a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1385a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1171e.setIcon(drawable);
        return this;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: a */
    public boolean mo1398a(C0322f fVar, MenuItem menuItem) {
        if (super.mo1398a(fVar, menuItem) || this.f1170d.mo1398a(fVar, menuItem)) {
            return true;
        }
        return false;
    }

    public SubMenuC0346q(Context context, C0322f fVar, C0326h hVar) {
        super(context);
        this.f1170d = fVar;
        this.f1171e = hVar;
    }
}
