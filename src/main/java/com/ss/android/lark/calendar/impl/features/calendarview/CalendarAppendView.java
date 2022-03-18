package com.ss.android.lark.calendar.impl.features.calendarview;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32670u;

public class CalendarAppendView extends RelativeLayout {
    @BindView(8684)
    ImageView mAppendEvent;
    @BindView(10957)
    UDShadowLayout mShadowContainer;

    public ImageView getAppendView() {
        return this.mAppendEvent;
    }

    /* renamed from: a */
    public void mo110615a() {
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.calendar_append_button_move);
        animatorSet.setTarget(this.mAppendEvent);
        animatorSet.start();
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.calendar_append_shadow_move);
        animatorSet2.setTarget(this.mShadowContainer);
        animatorSet2.start();
    }

    public void setClickListener(View.OnClickListener onClickListener) {
        this.mAppendEvent.setOnClickListener(onClickListener);
    }

    public CalendarAppendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ButterKnife.bind(C32670u.m125363a(context, R.layout.fragment_calendar_append_event, this), this);
        this.mAppendEvent.setClickable(true);
        ((LayerDrawable) this.mAppendEvent.getDrawable()).findDrawableByLayerId(R.id.add_bold).setTint(UDColorUtils.getColor(context, R.color.static_white));
    }
}
