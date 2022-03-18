package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.EditText;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class CommonEditInput_ViewBinding extends BaseContactInput_ViewBinding {

    /* renamed from: a */
    private CommonEditInput f164342a;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput_ViewBinding, butterknife.Unbinder
    public void unbind() {
        CommonEditInput commonEditInput = this.f164342a;
        if (commonEditInput != null) {
            this.f164342a = null;
            commonEditInput.mContentInput = null;
            commonEditInput.mDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CommonEditInput_ViewBinding(CommonEditInput commonEditInput, View view) {
        super(commonEditInput, view);
        this.f164342a = commonEditInput;
        commonEditInput.mContentInput = (EditText) Utils.findRequiredViewAsType(view, R.id.common_input, "field 'mContentInput'", EditText.class);
        commonEditInput.mDivider = Utils.findRequiredView(view, R.id.rootView, "field 'mDivider'");
    }
}
