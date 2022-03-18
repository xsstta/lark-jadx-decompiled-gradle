package com.ss.lark.android.passport.biz.compat.reset_phone_num.mvp;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;

public class ResetPhoneNumView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ResetPhoneNumView f162730a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ResetPhoneNumView resetPhoneNumView = this.f162730a;
        if (resetPhoneNumView != null) {
            this.f162730a = null;
            resetPhoneNumView.mEtPhoneNum = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ResetPhoneNumView_ViewBinding(ResetPhoneNumView resetPhoneNumView, View view) {
        this.f162730a = resetPhoneNumView;
        resetPhoneNumView.mEtPhoneNum = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_phone_num, "field 'mEtPhoneNum'", CommonEditInput.class);
    }
}
