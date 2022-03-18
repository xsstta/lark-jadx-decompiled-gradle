package com.ss.android.lark.mail.impl.compose;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;

public class ComposeMailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ComposeMailView f106392a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ComposeMailView composeMailView = this.f106392a;
        if (composeMailView != null) {
            this.f106392a = null;
            composeMailView.container = null;
            composeMailView.mFromLayout = null;
            composeMailView.mFromContactsTitle = null;
            composeMailView.mFromContacts = null;
            composeMailView.mToContacts = null;
            composeMailView.mCcContacts = null;
            composeMailView.mBccContacts = null;
            composeMailView.mSeparatelyBccContacts = null;
            composeMailView.mSubjectTopSplit = null;
            composeMailView.subject = null;
            composeMailView.mWebviewContainer = null;
            composeMailView.mComposeScrollView = null;
            composeMailView.mToPickerView = null;
            composeMailView.mCcPickerView = null;
            composeMailView.mBccPickerView = null;
            composeMailView.mSBccPickerView = null;
            composeMailView.mToolbarHeightView = null;
            composeMailView.mAttachmentContainer = null;
            composeMailView.titleBar = null;
            composeMailView.hintText = null;
            composeMailView.loadingContainer = null;
            composeMailView.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ComposeMailView_ViewBinding(ComposeMailView composeMailView, View view) {
        this.f106392a = composeMailView;
        composeMailView.container = Utils.findRequiredView(view, R.id.activity_container, "field 'container'");
        composeMailView.mFromLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.from_layout, "field 'mFromLayout'", LinearLayout.class);
        composeMailView.mFromContactsTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.from_contacts_title, "field 'mFromContactsTitle'", TextView.class);
        composeMailView.mFromContacts = (TextView) Utils.findRequiredViewAsType(view, R.id.from_contacts, "field 'mFromContacts'", TextView.class);
        composeMailView.mToContacts = (RecipientSelectView) Utils.findRequiredViewAsType(view, R.id.to_contacts, "field 'mToContacts'", RecipientSelectView.class);
        composeMailView.mCcContacts = (RecipientSelectView) Utils.findRequiredViewAsType(view, R.id.cc_contacts, "field 'mCcContacts'", RecipientSelectView.class);
        composeMailView.mBccContacts = (RecipientSelectView) Utils.findRequiredViewAsType(view, R.id.bcc_contacts, "field 'mBccContacts'", RecipientSelectView.class);
        composeMailView.mSeparatelyBccContacts = (RecipientSelectView) Utils.findRequiredViewAsType(view, R.id.separately_bcc_contacts, "field 'mSeparatelyBccContacts'", RecipientSelectView.class);
        composeMailView.mSubjectTopSplit = Utils.findRequiredView(view, R.id.subject_split_top_line, "field 'mSubjectTopSplit'");
        composeMailView.subject = (UDEditText) Utils.findRequiredViewAsType(view, R.id.compose_mail_subject, "field 'subject'", UDEditText.class);
        composeMailView.mWebviewContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.webview_mail_container, "field 'mWebviewContainer'", LinearLayout.class);
        composeMailView.mComposeScrollView = (ComposeScrollView) Utils.findRequiredViewAsType(view, R.id.page_scroller, "field 'mComposeScrollView'", ComposeScrollView.class);
        composeMailView.mToPickerView = Utils.findRequiredView(view, R.id.show_to_picker, "field 'mToPickerView'");
        composeMailView.mCcPickerView = Utils.findRequiredView(view, R.id.show_cc_picker, "field 'mCcPickerView'");
        composeMailView.mBccPickerView = Utils.findRequiredView(view, R.id.show_bcc_picker, "field 'mBccPickerView'");
        composeMailView.mSBccPickerView = Utils.findRequiredView(view, R.id.show_sbcc_picker, "field 'mSBccPickerView'");
        composeMailView.mToolbarHeightView = Utils.findRequiredView(view, R.id.mail_toolbar_height, "field 'mToolbarHeightView'");
        composeMailView.mAttachmentContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.compose_mail_attachment_container, "field 'mAttachmentContainer'", LinearLayout.class);
        composeMailView.titleBar = (OperationTitleBar) Utils.findRequiredViewAsType(view, R.id.compose_operation_title_bar, "field 'titleBar'", OperationTitleBar.class);
        composeMailView.hintText = (TextView) Utils.findRequiredViewAsType(view, R.id.compose_mail_hint_text, "field 'hintText'", TextView.class);
        composeMailView.loadingContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.compose_loading_container, "field 'loadingContainer'", FrameLayout.class);
        composeMailView.mFragmentContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.mail_feature_fragment_container, "field 'mFragmentContainer'", FrameLayout.class);
    }
}
