package com.bytedence.ee.bear.fabview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FabView extends FrameLayout {

    /* renamed from: a */
    private int f51180a;

    /* renamed from: b */
    private int f51181b;

    /* renamed from: c */
    private int f51182c;

    /* renamed from: d */
    private int f51183d;

    /* renamed from: e */
    private String f51184e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FabType {
    }

    /* renamed from: a */
    public void mo70654a() {
        m76135a(getContext());
    }

    /* renamed from: b */
    private void m76137b() {
        int a = C13749l.m55738a(6);
        setPadding(a, a, a, a);
        setClipToPadding(false);
    }

    /* renamed from: c */
    private void m76138c() {
        ImageView imageView = (ImageView) findViewById(R.id.fab_image);
        if (imageView != null) {
            imageView.setImageResource(this.f51181b);
            if (this.f51182c > 0) {
                imageView.setColorFilter(getContext().getResources().getColor(this.f51182c));
            }
        }
        TextView textView = (TextView) findViewById(R.id.fab_text);
        if (textView != null) {
            textView.setText(this.f51184e);
        }
    }

    public void setColorRes(int i) {
        this.f51183d = i;
    }

    public void setImageRes(int i) {
        this.f51181b = i;
    }

    public void setImageTintRes(int i) {
        this.f51182c = i;
    }

    public void setTextRes(String str) {
        this.f51184e = str;
    }

    public void setType(int i) {
        this.f51180a = i;
    }

    public FabView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m76135a(Context context) {
        m76136a(LayoutInflater.from(context));
        setColor(getChildAt(0));
        m76138c();
    }

    /* renamed from: a */
    private void m76136a(LayoutInflater layoutInflater) {
        int i = this.f51180a;
        if (i == 0) {
            removeAllViews();
            layoutInflater.inflate(R.layout.sheet_fab_view_image, this);
        } else if (i == 1) {
            removeAllViews();
            layoutInflater.inflate(R.layout.sheet_fab_view_text, this);
        } else if (i == 2) {
            removeAllViews();
            layoutInflater.inflate(R.layout.sheet_fab_view_multiple, this);
        }
    }

    private void setColor(View view) {
        if (view != null && this.f51183d > 0) {
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                int color = getContext().getResources().getColor(this.f51183d);
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                background.mutate();
                gradientDrawable.setColor(color);
                gradientDrawable.setStroke(C13749l.m55738a(1), color);
            }
        }
    }

    public FabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fabColor, R.attr.fabImage, R.attr.fabImageTint, R.attr.fabText, R.attr.fabType});
            this.f51180a = obtainStyledAttributes.getInteger(4, 0);
            this.f51181b = obtainStyledAttributes.getResourceId(1, 0);
            this.f51182c = obtainStyledAttributes.getResourceId(2, 0);
            this.f51184e = obtainStyledAttributes.getString(3);
            this.f51183d = obtainStyledAttributes.getResourceId(0, R.color.bg_float);
            obtainStyledAttributes.recycle();
        }
        m76137b();
        m76135a(context);
    }
}
