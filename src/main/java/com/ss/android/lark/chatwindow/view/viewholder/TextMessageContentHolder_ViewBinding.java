package com.ss.android.lark.chatwindow.view.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.EllipsizeFrameLayout;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextMessageContentHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TextMessageContentHolder f91312a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TextMessageContentHolder textMessageContentHolder = this.f91312a;
        if (textMessageContentHolder != null) {
            this.f91312a = null;
            textMessageContentHolder.mRootView = null;
            textMessageContentHolder.mMessageTV = null;
            textMessageContentHolder.mMessageContaner = null;
            textMessageContentHolder.mShowMoreMask = null;
            textMessageContentHolder.mShowMoreTV = null;
            textMessageContentHolder.mTranslateMessageTV = null;
            textMessageContentHolder.mTranslateShowMoreMask = null;
            textMessageContentHolder.mTranslateShowMoreTV = null;
            textMessageContentHolder.mTranslateDivider = null;
            textMessageContentHolder.mTranslateGroup = null;
            textMessageContentHolder.mTranslateLabel = null;
            textMessageContentHolder.mMessageGroup = null;
            textMessageContentHolder.mDividerGroup = null;
            textMessageContentHolder.mPreviewLayout = null;
            textMessageContentHolder.mUrlPreviewStub = null;
            textMessageContentHolder.docCardContainer = null;
            textMessageContentHolder.mUrlNetPreviewCardContainer = null;
            textMessageContentHolder.mUrlNetPreviewMarginContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TextMessageContentHolder_ViewBinding(TextMessageContentHolder textMessageContentHolder, View view) {
        this.f91312a = textMessageContentHolder;
        textMessageContentHolder.mRootView = (ConstraintLayout) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", ConstraintLayout.class);
        textMessageContentHolder.mMessageTV = (RichTextView) Utils.findRequiredViewAsType(view, R.id.message, "field 'mMessageTV'", RichTextView.class);
        textMessageContentHolder.mMessageContaner = (EllipsizeFrameLayout) Utils.findRequiredViewAsType(view, R.id.message_content_container, "field 'mMessageContaner'", EllipsizeFrameLayout.class);
        textMessageContentHolder.mShowMoreMask = Utils.findRequiredView(view, R.id.mask_show_more, "field 'mShowMoreMask'");
        textMessageContentHolder.mShowMoreTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_show_more, "field 'mShowMoreTV'", TextView.class);
        textMessageContentHolder.mTranslateMessageTV = (RichTextView) Utils.findRequiredViewAsType(view, R.id.translate_message, "field 'mTranslateMessageTV'", RichTextView.class);
        textMessageContentHolder.mTranslateShowMoreMask = Utils.findRequiredView(view, R.id.translate_mask_show_more, "field 'mTranslateShowMoreMask'");
        textMessageContentHolder.mTranslateShowMoreTV = (TextView) Utils.findRequiredViewAsType(view, R.id.translate_tv_show_more, "field 'mTranslateShowMoreTV'", TextView.class);
        textMessageContentHolder.mTranslateDivider = Utils.findRequiredView(view, R.id.translate_divider, "field 'mTranslateDivider'");
        textMessageContentHolder.mTranslateGroup = (Group) Utils.findRequiredViewAsType(view, R.id.translate_layout, "field 'mTranslateGroup'", Group.class);
        textMessageContentHolder.mTranslateLabel = (TextView) Utils.findRequiredViewAsType(view, R.id.translate_label, "field 'mTranslateLabel'", TextView.class);
        textMessageContentHolder.mMessageGroup = (Group) Utils.findRequiredViewAsType(view, R.id.message_layout, "field 'mMessageGroup'", Group.class);
        textMessageContentHolder.mDividerGroup = (Group) Utils.findRequiredViewAsType(view, R.id.divider_layout, "field 'mDividerGroup'", Group.class);
        textMessageContentHolder.mPreviewLayout = Utils.findRequiredView(view, R.id.stub_container, "field 'mPreviewLayout'");
        textMessageContentHolder.mUrlPreviewStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.url_preview_stub, "field 'mUrlPreviewStub'", ViewStub.class);
        textMessageContentHolder.docCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.doc_card_container, "field 'docCardContainer'", ViewGroup.class);
        textMessageContentHolder.mUrlNetPreviewCardContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_container, "field 'mUrlNetPreviewCardContainer'", ViewGroup.class);
        textMessageContentHolder.mUrlNetPreviewMarginContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.url_net_preview_margin_container, "field 'mUrlNetPreviewMarginContainer'", ViewGroup.class);
    }
}
