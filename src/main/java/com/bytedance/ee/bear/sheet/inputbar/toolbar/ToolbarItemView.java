package com.bytedance.ee.bear.sheet.inputbar.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;

public class ToolbarItemView extends FrameLayout {

    /* renamed from: a */
    private static final int f30254a = 2131101878;

    /* renamed from: b */
    private static final int f30255b = 2131101964;

    /* renamed from: c */
    private AppCompatImageView f30256c;

    /* renamed from: d */
    private UDBadgeView f30257d;

    /* renamed from: e */
    private Drawable f30258e;

    public int getBadgeVisibility() {
        return this.f30257d.getVisibility();
    }

    public boolean isSelected() {
        return this.f30256c.isSelected();
    }

    /* renamed from: a */
    private void m46774a() {
        this.f30256c = (AppCompatImageView) findViewById(R.id.item_icon);
        this.f30257d = (UDBadgeView) findViewById(R.id.item_badge);
        setIconDrawable(this.f30258e);
        setIconTint(f30255b);
        C13747j.m55728a((ImageView) this.f30256c, (int) R.color.icon_n1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, getResources().getDrawable(R.drawable.doc_toolbar_v2_subitem_all_pressed));
        this.f30256c.setBackgroundDrawable(stateListDrawable);
    }

    public ToolbarItemView(Context context) {
        this(context, null);
    }

    public void setBadgeVisibility(int i) {
        this.f30257d.setVisibility(i);
    }

    public void setIconDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f30256c.setImageDrawable(drawable);
        }
        C13747j.m55728a((ImageView) this.f30256c, (int) R.color.icon_n1);
    }

    public void setIconTint(int i) {
        this.f30256c.setImageTintList(getResources().getColorStateList(i));
    }

    public void setSelected(boolean z) {
        int i;
        this.f30256c.setSelected(z);
        if (z) {
            i = f30254a;
        } else {
            i = f30255b;
        }
        setIconTint(i);
    }

    public ToolbarItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.itemIcon});
        this.f30258e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.sheet_toolbar_item_layout, (ViewGroup) this, true);
        m46774a();
    }
}
