package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CommonPickInput_ViewBinding extends BaseContactInput_ViewBinding {

    /* renamed from: a */
    private CommonPickInput f164344a;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput_ViewBinding, butterknife.Unbinder
    public void unbind() {
        CommonPickInput commonPickInput = this.f164344a;
        if (commonPickInput != null) {
            this.f164344a = null;
            commonPickInput.mContentInput = null;
            commonPickInput.mDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommonPickInput_ViewBinding(CommonPickInput commonPickInput, View view) {
        super(commonPickInput, view);
        this.f164344a = commonPickInput;
        commonPickInput.mContentInput = (TextView) Utils.findRequiredViewAsType(view, R.id.common_input, "field 'mContentInput'", TextView.class);
        commonPickInput.mDivider = Utils.findRequiredView(view, R.id.rootView, "field 'mDivider'");
    }
}
