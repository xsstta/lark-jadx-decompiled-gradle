package com.ss.android.lark.tab.space.tab.add.modify;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class AddSpaceTabModifyView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddSpaceTabModifyView f136612a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AddSpaceTabModifyView addSpaceTabModifyView = this.f136612a;
        if (addSpaceTabModifyView != null) {
            this.f136612a = null;
            addSpaceTabModifyView.mSelectDocView = null;
            addSpaceTabModifyView.mNameModifyEt = null;
            addSpaceTabModifyView.mInputTip = null;
            addSpaceTabModifyView.mTitleBar = null;
            addSpaceTabModifyView.mModifyWarnTip = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddSpaceTabModifyView_ViewBinding(AddSpaceTabModifyView addSpaceTabModifyView, View view) {
        this.f136612a = addSpaceTabModifyView;
        addSpaceTabModifyView.mSelectDocView = Utils.findRequiredView(view, R.id.select_doc, "field 'mSelectDocView'");
        addSpaceTabModifyView.mNameModifyEt = (EditText) Utils.findRequiredViewAsType(view, R.id.name, "field 'mNameModifyEt'", EditText.class);
        addSpaceTabModifyView.mInputTip = (TextView) Utils.findRequiredViewAsType(view, R.id.input_tip, "field 'mInputTip'", TextView.class);
        addSpaceTabModifyView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        addSpaceTabModifyView.mModifyWarnTip = (TextView) Utils.findRequiredViewAsType(view, R.id.modify_long_tip, "field 'mModifyWarnTip'", TextView.class);
    }
}
