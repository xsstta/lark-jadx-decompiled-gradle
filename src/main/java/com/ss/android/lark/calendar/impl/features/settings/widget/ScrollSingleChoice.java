package com.ss.android.lark.calendar.impl.features.settings.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.webianks.library.scroll_choice.ScrollChoice;

public class ScrollSingleChoice extends LinearLayout {

    /* renamed from: a */
    private Animation f83255a;

    /* renamed from: b */
    private Animation f83256b;

    /* renamed from: c */
    private boolean f83257c;
    @BindView(10032)
    ViewGroup mBlankView;
    @BindView(10812)
    ScrollChoice mScrollChoice;
    @BindView(10813)
    ViewGroup mScrollChoiceContainer;
    @BindView(11450)
    TextView mTvCancel;
    @BindView(11565)
    TextView mTvSure;

    /* renamed from: b */
    private void m123974b() {
        this.mBlankView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.ScrollSingleChoice.View$OnClickListenerC324731 */

            public void onClick(View view) {
                ScrollSingleChoice.this.mo118612a();
            }
        });
        this.mTvCancel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.ScrollSingleChoice.View$OnClickListenerC324742 */

            public void onClick(View view) {
                ScrollSingleChoice.this.mo118612a();
            }
        });
        this.mTvSure.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.ScrollSingleChoice.View$OnClickListenerC324753 */

            public void onClick(View view) {
                ScrollSingleChoice.this.mo118612a();
            }
        });
    }

    /* renamed from: a */
    public void mo118612a() {
        this.f83257c = false;
        this.mScrollChoiceContainer.startAnimation(this.f83256b);
        postDelayed(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.settings.widget.ScrollSingleChoice.RunnableC324764 */

            public void run() {
                ScrollSingleChoice.this.setVisibility(8);
            }
        }, 300);
    }

    public ScrollSingleChoice(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m123973a(Context context) {
        ButterKnife.bind(this, LayoutInflater.from(context).inflate(R.layout.widget_scroll_single_choice, this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setBackgroundColor(context.getResources().getColor(R.color.ksw_md_ripple_normal));
        setOrientation(1);
    }

    /* renamed from: b */
    private void m123975b(Context context) {
        this.f83255a = AnimationUtils.loadAnimation(context, R.anim.cal_slide_in_bottom);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.cal_slide_out_bottom);
        this.f83256b = loadAnimation;
        loadAnimation.setFillAfter(true);
    }

    public ScrollSingleChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m123973a(context);
        m123975b(context);
        m123974b();
    }
}
