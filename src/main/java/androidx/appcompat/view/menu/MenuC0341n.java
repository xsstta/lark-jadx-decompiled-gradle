package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p026a.p027a.AbstractMenuC0707a;

/* renamed from: androidx.appcompat.view.menu.n */
public class MenuC0341n extends AbstractC0318c implements Menu {

    /* renamed from: b */
    private final AbstractMenuC0707a f1146b;

    public void close() {
        this.f1146b.close();
    }

    public boolean hasVisibleItems() {
        return this.f1146b.hasVisibleItems();
    }

    public int size() {
        return this.f1146b.size();
    }

    public void clear() {
        mo1356a();
        this.f1146b.clear();
    }

    public void setQwertyMode(boolean z) {
        this.f1146b.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo1354a(this.f1146b.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return mo1355a(this.f1146b.addSubMenu(i));
    }

    public MenuItem findItem(int i) {
        return mo1354a(this.f1146b.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo1354a(this.f1146b.getItem(i));
    }

    public void removeGroup(int i) {
        mo1357a(i);
        this.f1146b.removeGroup(i);
    }

    public void removeItem(int i) {
        mo1358b(i);
        this.f1146b.removeItem(i);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo1354a(this.f1146b.add(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo1355a(this.f1146b.addSubMenu(charSequence));
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1146b.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1146b.performIdentifierAction(i, i2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1146b.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1146b.setGroupVisible(i, z);
    }

    public MenuC0341n(Context context, AbstractMenuC0707a aVar) {
        super(context);
        if (aVar != null) {
            this.f1146b = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1146b.performShortcut(i, keyEvent, i2);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1146b.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1354a(this.f1146b.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1355a(this.f1146b.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1354a(this.f1146b.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1355a(this.f1146b.addSubMenu(i, i2, i3, charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f1146b.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo1354a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }
}
