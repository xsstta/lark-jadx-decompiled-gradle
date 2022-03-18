package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.p026a.p027a.AbstractMenuItemC0708b;
import androidx.core.p026a.p027a.AbstractSubMenuC0709c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.c */
public abstract class AbstractC0318c {

    /* renamed from: a */
    final Context f1037a;

    /* renamed from: b */
    private SimpleArrayMap<AbstractMenuItemC0708b, MenuItem> f1038b;

    /* renamed from: c */
    private SimpleArrayMap<AbstractSubMenuC0709c, SubMenu> f1039c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1356a() {
        SimpleArrayMap<AbstractMenuItemC0708b, MenuItem> simpleArrayMap = this.f1038b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<AbstractSubMenuC0709c, SubMenu> simpleArrayMap2 = this.f1039c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    AbstractC0318c(Context context) {
        this.f1037a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo1354a(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC0708b)) {
            return menuItem;
        }
        AbstractMenuItemC0708b bVar = (AbstractMenuItemC0708b) menuItem;
        if (this.f1038b == null) {
            this.f1038b = new SimpleArrayMap<>();
        }
        MenuItem menuItem2 = this.f1038b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0328i iVar = new MenuItemC0328i(this.f1037a, bVar);
        this.f1038b.put(bVar, iVar);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1358b(int i) {
        if (this.f1038b != null) {
            for (int i2 = 0; i2 < this.f1038b.size(); i2++) {
                if (this.f1038b.keyAt(i2).getItemId() == i) {
                    this.f1038b.removeAt(i2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo1355a(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC0709c)) {
            return subMenu;
        }
        AbstractSubMenuC0709c cVar = (AbstractSubMenuC0709c) subMenu;
        if (this.f1039c == null) {
            this.f1039c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.f1039c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0347r rVar = new SubMenuC0347r(this.f1037a, cVar);
        this.f1039c.put(cVar, rVar);
        return rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1357a(int i) {
        if (this.f1038b != null) {
            int i2 = 0;
            while (i2 < this.f1038b.size()) {
                if (this.f1038b.keyAt(i2).getGroupId() == i) {
                    this.f1038b.removeAt(i2);
                    i2--;
                }
                i2++;
            }
        }
    }
}
