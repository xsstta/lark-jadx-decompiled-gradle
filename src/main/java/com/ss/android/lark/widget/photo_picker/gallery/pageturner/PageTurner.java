package com.ss.android.lark.widget.photo_picker.gallery.pageturner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class PageTurner extends FrameLayout {

    /* renamed from: a */
    private int f145375a;
    @BindView(5955)
    ImageView mArrow;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TurnerType {
    }

    /* renamed from: a */
    private void m228088a() {
        if (this.f145375a == 1) {
            this.mArrow.setImageResource(R.drawable.icon_arrow_next);
            setBackground(UIUtils.getDrawable(getContext(), R.drawable.turner_left_rect_bg));
            return;
        }
        this.mArrow.setImageResource(R.drawable.icon_arrow_back);
        setBackground(UIUtils.getDrawable(getContext(), R.drawable.turner_right_rect_bg));
    }

    public PageTurner(Context context) {
        this(context, null);
    }

    public void setTurnerType(int i) {
        this.f145375a = i;
        m228088a();
    }

    public void setViewHovered(boolean z) {
        int i;
        int i2;
        if (this.f145375a == 1) {
            ImageView imageView = this.mArrow;
            if (z) {
                i2 = R.drawable.icon_arrow_next_hovered;
            } else {
                i2 = R.drawable.icon_arrow_next;
            }
            imageView.setImageResource(i2);
            return;
        }
        ImageView imageView2 = this.mArrow;
        if (z) {
            i = R.drawable.icon_arrow_back_hovered;
        } else {
            i = R.drawable.icon_arrow_back;
        }
        imageView2.setImageResource(i);
    }

    public PageTurner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageTurner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.direction});
        this.f145375a = obtainStyledAttributes.getInteger(0, 0);
        obtainStyledAttributes.recycle();
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.gallary_turner, this));
        m228088a();
    }
}
