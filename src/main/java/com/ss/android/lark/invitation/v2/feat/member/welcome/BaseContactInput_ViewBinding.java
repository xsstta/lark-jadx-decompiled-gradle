package com.ss.android.lark.invitation.v2.feat.member.welcome;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public class BaseContactInput_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseContactInput f102840a;

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseContactInput baseContactInput = this.f102840a;
        if (baseContactInput != null) {
            this.f102840a = null;
            baseContactInput.mClearBT = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseContactInput_ViewBinding(BaseContactInput baseContactInput, View view) {
        this.f102840a = baseContactInput;
        baseContactInput.mClearBT = (ImageView) Utils.findRequiredViewAsType(view, R.id.input_clear, "field 'mClearBT'", ImageView.class);
    }
}
