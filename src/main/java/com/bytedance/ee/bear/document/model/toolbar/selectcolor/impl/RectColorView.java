package com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0774a;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemButtonType;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.widgets.shape.C11852a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RectColorView extends FrameLayout {

    /* renamed from: a */
    private final Context f16454a;

    /* renamed from: b */
    private FrameLayout f16455b;

    /* renamed from: c */
    private ImageView f16456c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RectColorType {
    }

    public RectColorView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m23632a(Highlight.ColorRgba colorRgba) {
        int color = getResources().getColor(R.color.space_kit_trans);
        if (colorRgba == null) {
            return color;
        }
        try {
            return Color.rgb(colorRgba.getR(), colorRgba.getG(), colorRgba.getB());
        } catch (Throwable th) {
            C13479a.m54761a("RectColorView", th);
            return color;
        }
    }

    /* renamed from: a */
    private void m23633a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.rect_color_view, this);
        this.f16455b = (FrameLayout) findViewById(R.id.rect_layout);
        this.f16456c = (ImageView) findViewById(R.id.text);
    }

    public RectColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo23730a(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2) {
        if (colorItem == null) {
            this.f16455b.setBackground(null);
        } else {
            Drawable mutate = getResources().getDrawable(R.drawable.doc_rect_color_background).mutate();
            Highlight.ColorRgba value = colorItem.getValue();
            if (value != null) {
                C0774a.m3766a(mutate, m23632a(value));
                mutate.setAlpha((int) (value.getA() * 255.0f));
                this.f16455b.setBackground(mutate);
            }
        }
        if (colorItem2 == null) {
            this.f16456c.setColorFilter(getResources().getColor(R.color.space_kit_trans));
            this.f16456c.getDrawable().setAlpha(255);
            return;
        }
        Highlight.ColorRgba value2 = colorItem2.getValue();
        if (value2 != null) {
            this.f16456c.setColorFilter(m23632a(value2));
            this.f16456c.getDrawable().setAlpha((int) (value2.getA() * 255.0f));
        }
    }

    public RectColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16454a = context;
        m23633a(context);
    }

    /* renamed from: a */
    public void mo23731a(String str, Highlight.ColorItem colorItem, float[] fArr) {
        int i;
        Highlight.ColorRgba value = colorItem.getValue();
        boolean isShowFontIcon = colorItem.isShowFontIcon();
        ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(R.color.space_kit_trans));
        if ("clear".equals(str)) {
            this.f16455b.setBackground(colorDrawable);
        } else if ("text".equals(str)) {
            this.f16456c.setColorFilter(m23632a(value));
            this.f16456c.getDrawable().setAlpha((int) (value.getA() * 255.0f));
            this.f16455b.setBackground(C11852a.m49214a(UDColorUtils.getColor(this.f16454a, R.color.bg_body_overlay), fArr, (ColorStateList) null));
        } else if ("background".equals(str)) {
            Drawable mutate = C11852a.m49214a(m23632a(value), fArr, (ColorStateList) null).mutate();
            mutate.setAlpha((int) (value.getA() * 255.0f));
            if (EMenuItemButtonType.COLOR_CLEAR_BACKGROUND.name().equals(colorItem.getKey())) {
                this.f16455b.setBackgroundResource(R.drawable.doc_rect_color_clear);
            } else {
                this.f16455b.setBackground(mutate);
            }
            ImageView imageView = this.f16456c;
            if (isShowFontIcon) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            this.f16456c.setColorFilter(getResources().getColor(R.color.icon_n1));
        }
    }
}
