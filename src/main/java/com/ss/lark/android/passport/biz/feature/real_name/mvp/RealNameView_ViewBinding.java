package com.ss.lark.android.passport.biz.feature.real_name.mvp;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;

public class RealNameView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RealNameView f163642a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RealNameView realNameView = this.f163642a;
        if (realNameView != null) {
            this.f163642a = null;
            realNameView.mEtUserName = null;
            realNameView.mEtIdCode = null;
            realNameView.mTvPolicy = null;
            realNameView.mCheckBoxPolicy = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RealNameView_ViewBinding(RealNameView realNameView, View view) {
        this.f163642a = realNameView;
        realNameView.mEtUserName = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_username, "field 'mEtUserName'", CommonEditInput.class);
        realNameView.mEtIdCode = (CommonEditInput) Utils.findRequiredViewAsType(view, R.id.et_id_code, "field 'mEtIdCode'", CommonEditInput.class);
        realNameView.mTvPolicy = (TextView) Utils.findRequiredViewAsType(view, R.id.tvPolicy, "field 'mTvPolicy'", TextView.class);
        realNameView.mCheckBoxPolicy = (AppCompatCheckBox) Utils.findRequiredViewAsType(view, R.id.checkBoxPolicy, "field 'mCheckBoxPolicy'", AppCompatCheckBox.class);
    }
}
