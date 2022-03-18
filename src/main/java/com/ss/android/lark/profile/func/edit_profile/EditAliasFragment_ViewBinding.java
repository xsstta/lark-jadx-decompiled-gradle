package com.ss.android.lark.profile.func.edit_profile;

import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class EditAliasFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private EditAliasFragment f129656a;

    @Override // butterknife.Unbinder
    public void unbind() {
        EditAliasFragment editAliasFragment = this.f129656a;
        if (editAliasFragment != null) {
            this.f129656a = null;
            editAliasFragment.mCommonTitleBar = null;
            editAliasFragment.mEditText = null;
            editAliasFragment.mClearBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public EditAliasFragment_ViewBinding(EditAliasFragment editAliasFragment, View view) {
        this.f129656a = editAliasFragment;
        editAliasFragment.mCommonTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mCommonTitleBar'", CommonTitleBar.class);
        editAliasFragment.mEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.info_edit_text, "field 'mEditText'", EditText.class);
        editAliasFragment.mClearBtn = Utils.findRequiredView(view, R.id.clear_btn, "field 'mClearBtn'");
    }
}
