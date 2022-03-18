package com.ss.android.lark.favorite.common.text;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;
import com.ss.android.lark.widget.richtext.RichTextView;

public class TextMessageHolder extends AbstractC37119a {
    @BindView(8964)
    public RichTextView mTextView;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.save_item_text_layout, viewGroup, true));
    }
}
