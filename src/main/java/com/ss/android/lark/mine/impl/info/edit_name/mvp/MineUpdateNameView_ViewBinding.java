package com.ss.android.lark.mine.impl.info.edit_name.mvp;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class MineUpdateNameView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MineUpdateNameView f115533a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MineUpdateNameView mineUpdateNameView = this.f115533a;
        if (mineUpdateNameView != null) {
            this.f115533a = null;
            mineUpdateNameView.mTitleBar = null;
            mineUpdateNameView.mMineNameEditET = null;
            mineUpdateNameView.mMineNameClearBtnIV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MineUpdateNameView_ViewBinding(MineUpdateNameView mineUpdateNameView, View view) {
        this.f115533a = mineUpdateNameView;
        mineUpdateNameView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        mineUpdateNameView.mMineNameEditET = (EditText) Utils.findRequiredViewAsType(view, R.id.mine_name_edit_text, "field 'mMineNameEditET'", EditText.class);
        mineUpdateNameView.mMineNameClearBtnIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.mine_name_clear_btn, "field 'mMineNameClearBtnIV'", ImageView.class);
    }
}
