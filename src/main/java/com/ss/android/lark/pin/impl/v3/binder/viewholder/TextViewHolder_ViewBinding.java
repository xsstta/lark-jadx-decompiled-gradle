package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TextViewHolder f128421a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TextViewHolder textViewHolder = this.f128421a;
        if (textViewHolder != null) {
            this.f128421a = null;
            textViewHolder.mContentTV = null;
            textViewHolder.mUrlPreviewLayout = null;
            textViewHolder.mUrlIconIV = null;
            textViewHolder.mUrlTitleTV = null;
            textViewHolder.mUrlDescTV = null;
            textViewHolder.mDocsLayout = null;
            textViewHolder.mDocIconIV = null;
            textViewHolder.mDocTitleTV = null;
            textViewHolder.mDocOwnerTV = null;
            textViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TextViewHolder_ViewBinding(TextViewHolder textViewHolder, View view) {
        this.f128421a = textViewHolder;
        textViewHolder.mContentTV = (RichTextView) Utils.findRequiredViewAsType(view, R.id.tv_content, "field 'mContentTV'", RichTextView.class);
        textViewHolder.mUrlPreviewLayout = Utils.findRequiredView(view, R.id.url_preview_layout, "field 'mUrlPreviewLayout'");
        textViewHolder.mUrlIconIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.url_icon, "field 'mUrlIconIV'", LKUIRoundedImageView.class);
        textViewHolder.mUrlTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.url_title, "field 'mUrlTitleTV'", TextView.class);
        textViewHolder.mUrlDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.url_description, "field 'mUrlDescTV'", TextView.class);
        textViewHolder.mDocsLayout = Utils.findRequiredView(view, R.id.doc_preview_layout, "field 'mDocsLayout'");
        textViewHolder.mDocIconIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.doc_icon, "field 'mDocIconIV'", LKUIRoundedImageView.class);
        textViewHolder.mDocTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_title, "field 'mDocTitleTV'", TextView.class);
        textViewHolder.mDocOwnerTV = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_owner, "field 'mDocOwnerTV'", TextView.class);
        textViewHolder.mDivider = Utils.findRequiredView(view, R.id.pin_item_divider, "field 'mDivider'");
    }
}
