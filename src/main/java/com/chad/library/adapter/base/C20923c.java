package com.chad.library.adapter.base;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: com.chad.library.adapter.base.c */
public class C20923c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final SparseArray<View> f51247a = new SparseArray<>();

    /* renamed from: b */
    private final HashSet<Integer> f51248b = new HashSet<>();

    /* renamed from: c */
    private final LinkedHashSet<Integer> f51249c = new LinkedHashSet<>();

    /* renamed from: d */
    private final LinkedHashSet<Integer> f51250d = new LinkedHashSet<>();

    /* renamed from: m */
    public BaseQuickAdapter f51251m;

    /* renamed from: n */
    public View f51252n;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C20923c mo70739a(BaseQuickAdapter baseQuickAdapter) {
        this.f51251m = baseQuickAdapter;
        return this;
    }

    /* renamed from: b */
    public <T extends View> T mo70740b(int i) {
        T t = (T) this.f51247a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.f51247a.put(i, t2);
        return t2;
    }

    public C20923c(View view) {
        super(view);
        this.f51252n = view;
    }

    /* renamed from: a */
    public C20923c mo70735a(int i, View.OnClickListener onClickListener) {
        mo70740b(i).setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: b */
    public C20923c mo70741b(int i, int i2) {
        mo70740b(i).setBackgroundResource(i2);
        return this;
    }

    /* renamed from: d */
    public C20923c mo70745d(int i, boolean z) {
        mo70740b(i).setEnabled(z);
        return this;
    }

    /* renamed from: a */
    public C20923c mo70733a(int i, int i2) {
        ((ImageView) mo70740b(i)).setImageResource(i2);
        return this;
    }

    /* renamed from: b */
    public C20923c mo70742b(int i, boolean z) {
        int i2;
        View b = mo70740b(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        b.setVisibility(i2);
        return this;
    }

    /* renamed from: c */
    public C20923c mo70743c(int i, int i2) {
        ((TextView) mo70740b(i)).setTextColor(i2);
        return this;
    }

    /* renamed from: a */
    public C20923c mo70734a(int i, Drawable drawable) {
        ((ImageView) mo70740b(i)).setImageDrawable(drawable);
        return this;
    }

    /* renamed from: c */
    public C20923c mo70744c(int i, boolean z) {
        View b = mo70740b(i);
        if (b instanceof Checkable) {
            ((Checkable) b).setChecked(z);
        }
        return this;
    }

    /* renamed from: a */
    public C20923c mo70732a(int i, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            mo70740b(i).setAlpha(f);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
            alphaAnimation.setDuration(0);
            alphaAnimation.setFillAfter(true);
            mo70740b(i).startAnimation(alphaAnimation);
        }
        return this;
    }

    /* renamed from: a */
    public C20923c mo70736a(int i, View.OnTouchListener onTouchListener) {
        mo70740b(i).setOnTouchListener(onTouchListener);
        return this;
    }

    /* renamed from: a */
    public C20923c mo70737a(int i, CharSequence charSequence) {
        ((TextView) mo70740b(i)).setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public C20923c mo70738a(int i, boolean z) {
        int i2;
        View b = mo70740b(i);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        b.setVisibility(i2);
        return this;
    }
}
