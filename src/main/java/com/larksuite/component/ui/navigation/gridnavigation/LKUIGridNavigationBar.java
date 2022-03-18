package com.larksuite.component.ui.navigation.gridnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIGridNavigationBar extends GridView {

    /* renamed from: a */
    private float f62856a;

    /* renamed from: b */
    private int f62857b;

    /* renamed from: c */
    private int f62858c;

    /* renamed from: d */
    private int f62859d;

    /* renamed from: a */
    private void m92138a() {
        this.f62857b = ContextCompat.getColor(getContext(), R.color.lkui_N900);
        this.f62856a = (float) C25653b.m91897c(getContext(), 14.0f);
        this.f62858c = 140;
        this.f62859d = 140;
    }

    public void setAdapter(AbstractC25689a aVar) {
        super.setAdapter((ListAdapter) aVar);
    }

    public LKUIGridNavigationBar(Context context) {
        this(context, null);
    }

    public void setGridItemImageHeight(int i) {
        this.f62859d = i;
        if (AbstractC25689a.f62860a != null) {
            AbstractC25689a.f62860a.f62864d = i;
            if (getAdapter() != null && (getAdapter() instanceof BaseAdapter)) {
                ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            }
        }
    }

    public void setGridItemImageWidth(int i) {
        this.f62858c = i;
        if (AbstractC25689a.f62860a != null) {
            AbstractC25689a.f62860a.f62863c = i;
            if (getAdapter() != null && (getAdapter() instanceof BaseAdapter)) {
                ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            }
        }
    }

    public void setGridItemTextColor(int i) {
        this.f62857b = i;
        if (AbstractC25689a.f62860a != null) {
            AbstractC25689a.f62860a.f62862b = i;
            if (getAdapter() != null && (getAdapter() instanceof BaseAdapter)) {
                ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            }
        }
    }

    public void setGridItemTextSize(float f) {
        this.f62856a = (float) C25653b.m91897c(getContext(), f);
        if (AbstractC25689a.f62860a != null) {
            AbstractC25689a.f62860a.f62861a = this.f62856a;
            if (getAdapter() != null && (getAdapter() instanceof BaseAdapter)) {
                ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private void m92139a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.grid_navigation_image_height, R.attr.grid_navigation_image_width, R.attr.grid_navigation_textColor, R.attr.grid_navigation_textSize});
            this.f62857b = obtainStyledAttributes.getColor(2, ContextCompat.getColor(getContext(), R.color.lkui_N900));
            this.f62856a = obtainStyledAttributes.getDimension(3, (float) C25653b.m91897c(getContext(), 14.0f));
            this.f62859d = obtainStyledAttributes.getDimensionPixelSize(0, 140);
            this.f62858c = obtainStyledAttributes.getDimensionPixelSize(1, 140);
            obtainStyledAttributes.recycle();
        } else {
            m92138a();
        }
        C25690b bVar = new C25690b();
        bVar.f62864d = this.f62859d;
        bVar.f62863c = this.f62858c;
        bVar.f62862b = this.f62857b;
        bVar.f62861a = this.f62856a;
        AbstractC25689a.f62860a = bVar;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setSelector(R.color.lkui_transparent);
    }

    public LKUIGridNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUIGridNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92139a(attributeSet);
    }
}
