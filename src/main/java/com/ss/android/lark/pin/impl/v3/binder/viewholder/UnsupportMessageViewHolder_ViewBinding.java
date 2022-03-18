package com.ss.android.lark.pin.impl.v3.binder.viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.RichTextView;

public final class UnsupportMessageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UnsupportMessageViewHolder f128423a;

    @Override // butterknife.Unbinder
    public void unbind() {
        UnsupportMessageViewHolder unsupportMessageViewHolder = this.f128423a;
        if (unsupportMessageViewHolder != null) {
            this.f128423a = null;
            unsupportMessageViewHolder.name = null;
            unsupportMessageViewHolder.postDate = null;
            unsupportMessageViewHolder.content = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UnsupportMessageViewHolder_ViewBinding(UnsupportMessageViewHolder unsupportMessageViewHolder, View view) {
        this.f128423a = unsupportMessageViewHolder;
        unsupportMessageViewHolder.name = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_name, "field 'name'", TextView.class);
        unsupportMessageViewHolder.postDate = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_time, "field 'postDate'", TextView.class);
        unsupportMessageViewHolder.content = (RichTextView) Utils.findRequiredViewAsType(view, R.id.tv_content, "field 'content'", RichTextView.class);
    }
}
