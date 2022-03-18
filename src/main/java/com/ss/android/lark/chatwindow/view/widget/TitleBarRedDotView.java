package com.ss.android.lark.chatwindow.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

public class TitleBarRedDotView extends ConstraintLayout {

    /* renamed from: a */
    private LKUIBadgeView f91317a;

    /* renamed from: b */
    private ImageView f91318b;

    /* renamed from: c */
    private int f91319c;

    public View getIconView() {
        return this.f91318b;
    }

    public TitleBarRedDotView(Context context) {
        super(context);
        m138038a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo130004a(boolean z) {
        mo130005a(z, 0);
    }

    public void setIconDrawable(Drawable drawable) {
        this.f91318b.setImageDrawable(drawable);
    }

    public void setBadgeDrawable(int i) {
        this.f91317a.mo89322b(i).mo89320a();
    }

    public void setBadgeSize(int i) {
        this.f91319c = i;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f91317a.getLayoutParams();
        int i2 = this.f91319c;
        if (i2 > 0) {
            layoutParams.width = i2;
            layoutParams.height = this.f91319c;
        }
        this.f91317a.setLayoutParams(layoutParams);
    }

    public TitleBarRedDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m138038a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo130005a(boolean z, int i) {
        int i2;
        if (i > 0) {
            this.f91317a.mo89319a(String.valueOf(i)).mo89316a(10.0f).mo89317a(UIUtils.getColor(getContext(), R.color.ud_N00)).mo89320a();
        }
        LKUIBadgeView lKUIBadgeView = this.f91317a;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        lKUIBadgeView.setVisibility(i2);
    }

    /* renamed from: a */
    private void m138038a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.badgeRightOffset, R.attr.badgeSize, R.attr.badgeTopOffset});
            this.f91319c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        inflate(getContext(), R.layout.chat_red_dot_view, this);
        this.f91317a = (LKUIBadgeView) findViewById(R.id.iv_badge);
        this.f91318b = (ImageView) findViewById(R.id.iv_icon);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f91317a.getLayoutParams();
        int i = this.f91319c;
        if (i > 0) {
            layoutParams.width = i;
            layoutParams.height = this.f91319c;
        }
    }

    public TitleBarRedDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m138038a(context, attributeSet);
    }
}
