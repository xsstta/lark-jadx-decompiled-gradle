package com.ss.android.appcenter.common.adapter.p1288a;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.appcenter.common.adapter.a.d */
public class C28112d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final SparseArray<View> f70403a = new SparseArray<>();

    /* renamed from: a */
    public View mo100071a() {
        return this.itemView;
    }

    public C28112d(View view) {
        super(view);
    }

    /* renamed from: a */
    public <T extends View> T mo100072a(int i) {
        T t = (T) this.f70403a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f70403a.put(i, t2);
        return t2;
    }

    /* renamed from: a */
    public C28112d mo100073a(int i, Drawable drawable) {
        ((ImageView) mo100072a(i)).setImageDrawable(drawable);
        return this;
    }

    /* renamed from: a */
    public C28112d mo100074a(int i, CharSequence charSequence) {
        ((TextView) mo100072a(i)).setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public C28112d mo100075a(int i, boolean z) {
        int i2;
        View a = mo100072a(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a.setVisibility(i2);
        return this;
    }
}
