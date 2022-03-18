package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p026a.p027a.AbstractSubMenuC0709c;

/* renamed from: androidx.appcompat.view.menu.r */
class SubMenuC0347r extends MenuC0341n implements SubMenu {

    /* renamed from: b */
    private final AbstractSubMenuC0709c f1172b;

    public void clearHeader() {
        this.f1172b.clearHeader();
    }

    public MenuItem getItem() {
        return mo1354a(this.f1172b.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f1172b.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f1172b.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1172b.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1172b.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1172b.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1172b.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1172b.setIcon(drawable);
        return this;
    }

    SubMenuC0347r(Context context, AbstractSubMenuC0709c cVar) {
        super(context, cVar);
        this.f1172b = cVar;
    }
}
