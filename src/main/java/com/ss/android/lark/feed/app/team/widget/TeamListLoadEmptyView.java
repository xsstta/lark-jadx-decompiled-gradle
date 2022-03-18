package com.ss.android.lark.feed.app.team.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;

public class TeamListLoadEmptyView extends LinearLayout {

    /* renamed from: a */
    private LKUILottieAnimationView f97188a;

    /* renamed from: b */
    private TextView f97189b;

    /* renamed from: c */
    private UDButton f97190c;

    /* renamed from: b */
    public void mo138818b() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
        this.f97189b.setVisibility(8);
        this.f97190c.setVisibility(8);
        this.f97188a.cancelAnimation();
        this.f97188a.setVisibility(8);
    }

    /* renamed from: a */
    public void mo138817a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f97189b.setVisibility(0);
        this.f97190c.setVisibility(0);
        this.f97188a.cancelAnimation();
        this.f97188a.setVisibility(8);
    }

    /* renamed from: c */
    public void mo138819c() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.f97189b.setVisibility(8);
        this.f97190c.setVisibility(8);
        this.f97188a.setVisibility(0);
        this.f97188a.playAnimation();
    }

    public TeamListLoadEmptyView(Context context) {
        super(context);
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        this.f97190c.setOnClickListener(onClickListener);
    }

    public TeamListLoadEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        inflate(context, R.layout.team_list_empty_load_view_layout, this);
        LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) findViewById(R.id.loading_view);
        this.f97188a = lKUILottieAnimationView;
        lKUILottieAnimationView.setAnimation(R.raw.loading_anim);
        this.f97188a.setRepeatCount(-1);
        this.f97189b = (TextView) findViewById(R.id.load_status_tv);
        this.f97190c = (UDButton) findViewById(R.id.create_team_button);
    }
}
