package com.ss.android.lark.favorite.common.post;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.favorite.common.base.AbstractC37119a;

public class PostMessageHolder extends AbstractC37119a {
    @BindView(8646)
    public PostView mSaveBoxPostContent;

    @Override // com.ss.android.lark.favorite.common.base.AbstractC37119a
    /* renamed from: a */
    public void mo136728a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ButterKnife.bind(this, layoutInflater.inflate(R.layout.save_item_post_holder_layout, viewGroup, true));
    }
}
