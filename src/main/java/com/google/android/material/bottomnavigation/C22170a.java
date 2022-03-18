package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;

/* renamed from: com.google.android.material.bottomnavigation.a */
public final class C22170a extends C0322f {
    public C22170a(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0322f, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.C0322f
    /* renamed from: a */
    public MenuItem mo1381a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo1432h();
            MenuItem a = super.mo1381a(i, i2, i3, charSequence);
            if (a instanceof C0326h) {
                ((C0326h) a).mo1466a(true);
            }
            mo1434i();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
