package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.C0427af;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C0322f.AbstractC0324b, AbstractC0339m {

    /* renamed from: a */
    private static final int[] f987a = {16842964, 16843049};

    /* renamed from: b */
    private C0322f f988b;

    /* renamed from: c */
    private int f989c;

    public int getWindowAnimations() {
        return this.f989c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m
    /* renamed from: a */
    public void mo1265a(C0322f fVar) {
        this.f988b = fVar;
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0324b
    /* renamed from: a */
    public boolean mo1266a(C0326h hVar) {
        return this.f988b.mo1396a(hVar, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0427af a = C0427af.m1778a(context, attributeSet, f987a, i, 0);
        if (a.mo2492g(0)) {
            setBackgroundDrawable(a.mo2477a(0));
        }
        if (a.mo2492g(1)) {
            setDivider(a.mo2477a(1));
        }
        a.mo2482b();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1266a((C0326h) getAdapter().getItem(i));
    }
}
