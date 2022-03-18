package com.ss.android.lark.guide.landing.general.mvp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.landing.general.view.ColorAnimationView;
import com.ss.android.lark.guide.landing.general.view.GuidePageIndicatorView;
import com.ss.android.lark.guide.landing.general.view.GuideViewPager;

public class GuidePageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GuidePageView f99316a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GuidePageView guidePageView = this.f99316a;
        if (guidePageView != null) {
            this.f99316a = null;
            guidePageView.mColorAnimationView = null;
            guidePageView.viewPager = null;
            guidePageView.mIndicatorView = null;
            guidePageView.createTeamBtn = null;
            guidePageView.startLoginBtn = null;
            guidePageView.joinMeeting = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GuidePageView_ViewBinding(GuidePageView guidePageView, View view) {
        this.f99316a = guidePageView;
        guidePageView.mColorAnimationView = (ColorAnimationView) Utils.findRequiredViewAsType(view, R.id.color_animation_view, "field 'mColorAnimationView'", ColorAnimationView.class);
        guidePageView.viewPager = (GuideViewPager) Utils.findRequiredViewAsType(view, R.id.view_pager, "field 'viewPager'", GuideViewPager.class);
        guidePageView.mIndicatorView = (GuidePageIndicatorView) Utils.findRequiredViewAsType(view, R.id.guide_indicator, "field 'mIndicatorView'", GuidePageIndicatorView.class);
        guidePageView.createTeamBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.createTeamBtn, "field 'createTeamBtn'", TextView.class);
        guidePageView.startLoginBtn = (Button) Utils.findRequiredViewAsType(view, R.id.startLoginBtn, "field 'startLoginBtn'", Button.class);
        guidePageView.joinMeeting = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_joinMeeting, "field 'joinMeeting'", TextView.class);
    }
}
