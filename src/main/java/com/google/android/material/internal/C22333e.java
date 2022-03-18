package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;

/* renamed from: com.google.android.material.internal.e */
public class C22333e extends C0322f {
    public C22333e(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C0322f, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0326h hVar = (C0326h) mo1381a(i, i2, i3, charSequence);
        C22347g gVar = new C22347g(mo1428f(), this, hVar);
        hVar.mo1465a(gVar);
        return gVar;
    }
}
