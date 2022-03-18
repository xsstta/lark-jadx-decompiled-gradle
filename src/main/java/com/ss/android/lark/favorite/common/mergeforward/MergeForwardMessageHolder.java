package com.ss.android.lark.favorite.common.mergeforward;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;
import com.ss.android.lark.widget.light.LKUILightTextView;

public class MergeForwardMessageHolder extends AbstractC37119a {
    @BindView(8182)
    public LKUILightTextView mContentTV;
    @BindView(8187)
    public TextView mTitleTV;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.merge_forward_content_item, viewGroup, true));
    }
}
