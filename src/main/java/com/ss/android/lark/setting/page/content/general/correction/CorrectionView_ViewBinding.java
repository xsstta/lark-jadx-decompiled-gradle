package com.ss.android.lark.setting.page.content.general.correction;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;

public final class CorrectionView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CorrectionView f134637a;

    @Override // butterknife.Unbinder
    public void unbind() {
        CorrectionView correctionView = this.f134637a;
        if (correctionView != null) {
            this.f134637a = null;
            correctionView.mSwitchHeaderAll = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CorrectionView_ViewBinding(CorrectionView correctionView, View view) {
        this.f134637a = correctionView;
        correctionView.mSwitchHeaderAll = (LKUISwitchButton) Utils.findRequiredViewAsType(view, R.id.right_switch, "field 'mSwitchHeaderAll'", LKUISwitchButton.class);
    }
}
