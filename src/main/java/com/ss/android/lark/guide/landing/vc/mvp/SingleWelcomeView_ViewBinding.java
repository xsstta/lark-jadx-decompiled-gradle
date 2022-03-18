package com.ss.android.lark.guide.landing.vc.mvp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class SingleWelcomeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SingleWelcomeView f99371a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SingleWelcomeView singleWelcomeView = this.f99371a;
        if (singleWelcomeView != null) {
            this.f99371a = null;
            singleWelcomeView.mWelcomeBgImage = null;
            singleWelcomeView.mTitleBar = null;
            singleWelcomeView.mIllustrationImageIV = null;
            singleWelcomeView.mWelcomeContentTV = null;
            singleWelcomeView.mWelcomeDescTV = null;
            singleWelcomeView.mWelcomeButtonBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SingleWelcomeView_ViewBinding(SingleWelcomeView singleWelcomeView, View view) {
        this.f99371a = singleWelcomeView;
        singleWelcomeView.mWelcomeBgImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.welcome_bg_img, "field 'mWelcomeBgImage'", ImageView.class);
        singleWelcomeView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        singleWelcomeView.mIllustrationImageIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.welcome_img, "field 'mIllustrationImageIV'", ImageView.class);
        singleWelcomeView.mWelcomeContentTV = (TextView) Utils.findRequiredViewAsType(view, R.id.welcome_content, "field 'mWelcomeContentTV'", TextView.class);
        singleWelcomeView.mWelcomeDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.welcome_desc, "field 'mWelcomeDescTV'", TextView.class);
        singleWelcomeView.mWelcomeButtonBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.welcome_confirm, "field 'mWelcomeButtonBtn'", TextView.class);
    }
}
