package com.ss.android.lark.chatsetting.impl.group.announcement;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class GroupAnnouncementView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GroupAnnouncementView f89211a;

    @Override // butterknife.Unbinder
    public void unbind() {
        GroupAnnouncementView groupAnnouncementView = this.f89211a;
        if (groupAnnouncementView != null) {
            this.f89211a = null;
            groupAnnouncementView.mTitleBar = null;
            groupAnnouncementView.mGroupAnnouncementWrapper = null;
            groupAnnouncementView.mGroupAnnouncementContentWrapper = null;
            groupAnnouncementView.mGroupEmptyAnnouncementWrapper = null;
            groupAnnouncementView.mGroupAnnouncementIssuerTV = null;
            groupAnnouncementView.mGroupAnnouncementET = null;
            groupAnnouncementView.mGroupAnnouncementTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public GroupAnnouncementView_ViewBinding(GroupAnnouncementView groupAnnouncementView, View view) {
        this.f89211a = groupAnnouncementView;
        groupAnnouncementView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        groupAnnouncementView.mGroupAnnouncementWrapper = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.group_announcement_wrapper, "field 'mGroupAnnouncementWrapper'", RelativeLayout.class);
        groupAnnouncementView.mGroupAnnouncementContentWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.group_announcement_content_wrapper, "field 'mGroupAnnouncementContentWrapper'", LinearLayout.class);
        groupAnnouncementView.mGroupEmptyAnnouncementWrapper = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.group_empty_announcement_wrapper, "field 'mGroupEmptyAnnouncementWrapper'", LinearLayout.class);
        groupAnnouncementView.mGroupAnnouncementIssuerTV = (TextView) Utils.findRequiredViewAsType(view, R.id.group_announcement_issuer_tv, "field 'mGroupAnnouncementIssuerTV'", TextView.class);
        groupAnnouncementView.mGroupAnnouncementET = (EditText) Utils.findRequiredViewAsType(view, R.id.group_announcement_message_edit, "field 'mGroupAnnouncementET'", EditText.class);
        groupAnnouncementView.mGroupAnnouncementTV = (LinkEmojiTextView) Utils.findRequiredViewAsType(view, R.id.group_announcement_message_tv, "field 'mGroupAnnouncementTV'", LinkEmojiTextView.class);
    }
}
