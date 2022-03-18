package com.ss.android.lark.mine.impl.index.v2.list.feishu_event;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;

public final class FeishuEventSubComponent_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FeishuEventSubComponent f115406a;

    @Override // butterknife.Unbinder
    public void unbind() {
        FeishuEventSubComponent feishuEventSubComponent = this.f115406a;
        if (feishuEventSubComponent != null) {
            this.f115406a = null;
            feishuEventSubComponent.mRewardBadge = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FeishuEventSubComponent_ViewBinding(FeishuEventSubComponent feishuEventSubComponent, View view) {
        this.f115406a = feishuEventSubComponent;
        feishuEventSubComponent.mRewardBadge = (ImageView) Utils.findRequiredViewAsType(view, R.id.reward_badge, "field 'mRewardBadge'", ImageView.class);
    }
}
