package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;

public class FeedReactionView extends LinearLayout {

    /* renamed from: a */
    public final int f97314a;

    /* renamed from: b */
    public final int f97315b;

    /* renamed from: c */
    private final int f97316c;

    /* renamed from: d */
    private final int f97317d;

    /* renamed from: e */
    private final int f97318e;

    /* renamed from: f */
    private final int f97319f;

    /* renamed from: g */
    private ImageView f97320g;

    /* renamed from: h */
    private TextView f97321h;

    public TextView getCountTV() {
        return this.f97321h;
    }

    public ImageView getIconIV() {
        return this.f97320g;
    }

    public FeedReactionView(Context context) {
        this(context, null);
    }

    public void setReactionCount(int i) {
        TextView textView = this.f97321h;
        if (textView == null) {
            return;
        }
        if (i > 1) {
            textView.setVisibility(0);
            this.f97321h.setText(String.valueOf(i));
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    private void m149240a(Context context) {
        ImageView imageView = new ImageView(context);
        this.f97320g = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f97320g.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f97316c);
        layoutParams.gravity = 16;
        addView(this.f97320g, layoutParams);
        TextView textView = new TextView(context);
        this.f97321h = textView;
        textView.setGravity(17);
        if (DesktopUtil.m144307b()) {
            this.f97321h.setTextSize(2, 12.0f);
        } else {
            C25649b.m91856a(this.f97321h, 10);
        }
        this.f97321h.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_caption));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.f97316c);
        layoutParams2.gravity = 16;
        layoutParams2.leftMargin = this.f97317d;
        addView(this.f97321h, layoutParams2);
        int i = this.f97318e;
        int i2 = this.f97319f;
        setPadding(i, i2, i, i2);
        if (DesktopUtil.m144301a(context)) {
            setBackgroundResource(R.drawable.feed_list_bg_reaction_pressed);
        } else {
            setBackgroundResource(R.drawable.feed_list_reaction_bg_selector);
        }
    }

    public FeedReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        if (DesktopUtil.m144307b()) {
            i2 = UIHelper.dp2px(16.0f);
        } else {
            i2 = LKUIDisplayManager.m91881c(context, 14);
        }
        this.f97316c = i2;
        this.f97317d = UIHelper.dp2px(2.0f);
        this.f97318e = UIHelper.dp2px(6.0f);
        this.f97314a = UIHelper.dp2px(28.0f);
        this.f97319f = UIHelper.dp2px(2.0f);
        this.f97315b = UIHelper.dp2px(18.0f);
        m149240a(context);
    }
}
