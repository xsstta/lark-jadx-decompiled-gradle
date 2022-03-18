package com.ss.android.lark.chatsetting.impl.group.info.edit;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class GroupInfoEditView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupInfoEditView f89407a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupInfoEditView groupInfoEditView = this.f89407a;
        if (groupInfoEditView != null) {
            this.f89407a = null;
            groupInfoEditView.mGroupInfoEdit = null;
            groupInfoEditView.mClearBtn = null;
            groupInfoEditView.mInfoEditText = null;
            groupInfoEditView.mInfoShowText = null;
            groupInfoEditView.mInputTextCount = null;
            groupInfoEditView.mInputTextWrapper = null;
            groupInfoEditView.mRootLayout = null;
            groupInfoEditView.mTitleBar = null;
            groupInfoEditView.mEditInfoLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupInfoEditView_ViewBinding(GroupInfoEditView groupInfoEditView, View view) {
        this.f89407a = groupInfoEditView;
        groupInfoEditView.mGroupInfoEdit = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_info_edit, "field 'mGroupInfoEdit'", RelativeLayout.class);
        groupInfoEditView.mClearBtn = (ImageView) Utils.findRequiredViewAsType(view, R.id.clear_btn, "field 'mClearBtn'", ImageView.class);
        groupInfoEditView.mInfoEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.info_edit_text, "field 'mInfoEditText'", EditText.class);
        groupInfoEditView.mInfoShowText = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.info_show_text, "field 'mInfoShowText'", LinkEmojiTextView.class);
        groupInfoEditView.mInputTextCount = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_input_text_count, "field 'mInputTextCount'", TextView.class);
        groupInfoEditView.mInputTextWrapper = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.input_text_count_wrapper, "field 'mInputTextWrapper'", ViewGroup.class);
        groupInfoEditView.mRootLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.root_layout, "field 'mRootLayout'", LinearLayout.class);
        groupInfoEditView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupInfoEditView.mEditInfoLayout = Utils.findRequiredView(view, R.id.info_edit_layout, "field 'mEditInfoLayout'");
    }
}
