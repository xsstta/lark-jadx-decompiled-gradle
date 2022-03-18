package com.ss.android.lark.member_manage.impl.add_member;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.widget.ChatterPicker;
import com.ss.android.lark.ui.CommonTitleBar;

public class AddGroupMemberView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddGroupMemberView f113763a;

    @Override // butterknife.Unbinder
    public void unbind() {
        AddGroupMemberView addGroupMemberView = this.f113763a;
        if (addGroupMemberView != null) {
            this.f113763a = null;
            addGroupMemberView.mChatterPicker = null;
            addGroupMemberView.mTitleBar = null;
            addGroupMemberView.mSelectCountTV = null;
            addGroupMemberView.mConfirmBT = null;
            addGroupMemberView.mBottomDetailRL = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AddGroupMemberView_ViewBinding(AddGroupMemberView addGroupMemberView, View view) {
        this.f113763a = addGroupMemberView;
        addGroupMemberView.mChatterPicker = (ChatterPicker) Utils.findRequiredViewAsType(view, R.id.add_group_member_chatter_picker, "field 'mChatterPicker'", ChatterPicker.class);
        addGroupMemberView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        addGroupMemberView.mSelectCountTV = (TextView) Utils.findRequiredViewAsType(view, R.id.select_count, "field 'mSelectCountTV'", TextView.class);
        addGroupMemberView.mConfirmBT = (TextView) Utils.findRequiredViewAsType(view, R.id.confirm, "field 'mConfirmBT'", TextView.class);
        addGroupMemberView.mBottomDetailRL = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.show_bottom, "field 'mBottomDetailRL'", RelativeLayout.class);
    }
}
