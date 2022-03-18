package com.ss.lark.android.passport.biz.widget;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BaseContactInput_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseContactInput f164324a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseContactInput baseContactInput = this.f164324a;
        if (baseContactInput != null) {
            this.f164324a = null;
            baseContactInput.mClearBT = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseContactInput_ViewBinding(BaseContactInput baseContactInput, View view) {
        this.f164324a = baseContactInput;
        baseContactInput.mClearBT = (ImageView) Utils.findRequiredViewAsType(view, R.id.input_clear, "field 'mClearBT'", ImageView.class);
    }
}
