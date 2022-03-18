package com.ss.android.lark.favorite.common.text;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TextMessageHolder f95526a;

    @Override // butterknife.Unbinder
    public void unbind() {
        TextMessageHolder textMessageHolder = this.f95526a;
        if (textMessageHolder != null) {
            this.f95526a = null;
            textMessageHolder.mTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TextMessageHolder_ViewBinding(TextMessageHolder textMessageHolder, View view) {
        this.f95526a = textMessageHolder;
        textMessageHolder.mTextView = (RichTextView) Utils.findRequiredViewAsType(view, R.id.text_tv, "field 'mTextView'", RichTextView.class);
    }
}
