package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.lark.android.passport.biz.widget.CenterTextView;

public class SuiteConfirmView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SuiteConfirmView f163871a;

    @Override // butterknife.Unbinder
    public void unbind() {
        SuiteConfirmView suiteConfirmView = this.f163871a;
        if (suiteConfirmView != null) {
            this.f163871a = null;
            suiteConfirmView.mLoginTV = null;
            suiteConfirmView.mTitleBar = null;
            suiteConfirmView.mNotifyChecker = null;
            suiteConfirmView.mLoginAppNameTV = null;
            suiteConfirmView.mNotifyLayout = null;
            suiteConfirmView.mHitTextView = null;
            suiteConfirmView.mMultiLoginGroup = null;
            suiteConfirmView.mLoginSingle = null;
            suiteConfirmView.mLoginAll = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SuiteConfirmView_ViewBinding(SuiteConfirmView suiteConfirmView, View view) {
        this.f163871a = suiteConfirmView;
        suiteConfirmView.mLoginTV = (TextView) Utils.findRequiredViewAsType(view, R.id.login_button, "field 'mLoginTV'", TextView.class);
        suiteConfirmView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        suiteConfirmView.mNotifyChecker = (CheckBox) Utils.findRequiredViewAsType(view, R.id.cb_select_notify, "field 'mNotifyChecker'", CheckBox.class);
        suiteConfirmView.mLoginAppNameTV = (CenterTextView) Utils.findRequiredViewAsType(view, R.id.login_app_name, "field 'mLoginAppNameTV'", CenterTextView.class);
        suiteConfirmView.mNotifyLayout = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.cb_select_notify_layout, "field 'mNotifyLayout'", ConstraintLayout.class);
        suiteConfirmView.mHitTextView = (TextView) Utils.findRequiredViewAsType(view, R.id.hint_text, "field 'mHitTextView'", TextView.class);
        suiteConfirmView.mMultiLoginGroup = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.group_multi_auth, "field 'mMultiLoginGroup'", ViewGroup.class);
        suiteConfirmView.mLoginSingle = (TextView) Utils.findRequiredViewAsType(view, R.id.login_button_one, "field 'mLoginSingle'", TextView.class);
        suiteConfirmView.mLoginAll = (TextView) Utils.findRequiredViewAsType(view, R.id.login_button_all, "field 'mLoginAll'", TextView.class);
    }
}
