package androidx.p022c.p023a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.c.a.c */
public abstract class AbstractC0500c extends AbstractC0495a {

    /* renamed from: j */
    private int f1811j;

    /* renamed from: k */
    private int f1812k;

    /* renamed from: l */
    private LayoutInflater f1813l;

    @Override // androidx.p022c.p023a.AbstractC0495a
    /* renamed from: a */
    public View mo2773a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1813l.inflate(this.f1811j, viewGroup, false);
    }

    @Override // androidx.p022c.p023a.AbstractC0495a
    /* renamed from: b */
    public View mo2796b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1813l.inflate(this.f1812k, viewGroup, false);
    }

    public AbstractC0500c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1812k = i;
        this.f1811j = i;
        this.f1813l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
