package com.ss.lark.android.passport.biz.feature.bio_auth.mvp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;

public class BioAuthView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BioAuthView f163164a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BioAuthView bioAuthView = this.f163164a;
        if (bioAuthView != null) {
            this.f163164a = null;
            bioAuthView.titleBar = null;
            bioAuthView.tvTitle = null;
            bioAuthView.tvSubTitle = null;
            bioAuthView.btnFaceVerify = null;
            bioAuthView.tvBottomTitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BioAuthView_ViewBinding(BioAuthView bioAuthView, View view) {
        this.f163164a = bioAuthView;
        bioAuthView.titleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.signin_sdk_widget_title_bar, "field 'titleBar'", CommonTitleBar.class);
        bioAuthView.tvTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_title, "field 'tvTitle'", TextView.class);
        bioAuthView.tvSubTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_subtitle, "field 'tvSubTitle'", TextView.class);
        bioAuthView.btnFaceVerify = (Button) Utils.findRequiredViewAsType(view, R.id.btn_face_verify, "field 'btnFaceVerify'", Button.class);
        bioAuthView.tvBottomTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_bottom_title, "field 'tvBottomTitle'", TextView.class);
    }
}
