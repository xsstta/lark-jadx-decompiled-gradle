package com.ss.lark.android.passport.biz.feature.auth_type.mvp;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class AuthTypeView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AuthTypeView f163105a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AuthTypeView authTypeView = this.f163105a;
        if (authTypeView != null) {
            this.f163105a = null;
            authTypeView.mVerifyTypeLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AuthTypeView_ViewBinding(AuthTypeView authTypeView, View view) {
        this.f163105a = authTypeView;
        authTypeView.mVerifyTypeLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_verify_type, "field 'mVerifyTypeLayout'", LinearLayout.class);
    }
}
