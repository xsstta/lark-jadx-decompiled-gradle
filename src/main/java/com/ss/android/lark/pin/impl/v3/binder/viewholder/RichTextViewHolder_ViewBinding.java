package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;

public class RichTextViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RichTextViewHolder f128419a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RichTextViewHolder richTextViewHolder = this.f128419a;
        if (richTextViewHolder != null) {
            this.f128419a = null;
            richTextViewHolder.mUrlPreviewLayout = null;
            richTextViewHolder.mUrlIconIV = null;
            richTextViewHolder.mUrlTitleTV = null;
            richTextViewHolder.mUrlDescTV = null;
            richTextViewHolder.mDocsLayout = null;
            richTextViewHolder.mDocIconIV = null;
            richTextViewHolder.mDocTitleTV = null;
            richTextViewHolder.mDocOwnerTV = null;
            richTextViewHolder.mDivider = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RichTextViewHolder_ViewBinding(RichTextViewHolder richTextViewHolder, View view) {
        this.f128419a = richTextViewHolder;
        richTextViewHolder.mUrlPreviewLayout = Utils.findRequiredView(view, R.id.url_preview_layout, "field 'mUrlPreviewLayout'");
        richTextViewHolder.mUrlIconIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.url_icon, "field 'mUrlIconIV'", LKUIRoundedImageView.class);
        richTextViewHolder.mUrlTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.url_title, "field 'mUrlTitleTV'", TextView.class);
        richTextViewHolder.mUrlDescTV = (TextView) Utils.findRequiredViewAsType(view, R.id.url_description, "field 'mUrlDescTV'", TextView.class);
        richTextViewHolder.mDocsLayout = Utils.findRequiredView(view, R.id.doc_preview_layout, "field 'mDocsLayout'");
        richTextViewHolder.mDocIconIV = (LKUIRoundedImageView) Utils.findRequiredViewAsType(view, R.id.doc_icon, "field 'mDocIconIV'", LKUIRoundedImageView.class);
        richTextViewHolder.mDocTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_title, "field 'mDocTitleTV'", TextView.class);
        richTextViewHolder.mDocOwnerTV = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_owner, "field 'mDocOwnerTV'", TextView.class);
        richTextViewHolder.mDivider = Utils.findRequiredView(view, R.id.pin_item_divider, "field 'mDivider'");
    }
}
