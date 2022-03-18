package com.ss.android.lark.favorite.common.mergeforward;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.light.LKUILightTextView;

public class MergeForwardMessageHolder_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MergeForwardMessageHolder f95462a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MergeForwardMessageHolder mergeForwardMessageHolder = this.f95462a;
        if (mergeForwardMessageHolder != null) {
            this.f95462a = null;
            mergeForwardMessageHolder.mTitleTV = null;
            mergeForwardMessageHolder.mContentTV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MergeForwardMessageHolder_ViewBinding(MergeForwardMessageHolder mergeForwardMessageHolder, View view) {
        this.f95462a = mergeForwardMessageHolder;
        mergeForwardMessageHolder.mTitleTV = (TextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_title, "field 'mTitleTV'", TextView.class);
        mergeForwardMessageHolder.mContentTV = (LKUILightTextView) Utils.findRequiredViewAsType(view, R.id.merge_forward_content, "field 'mContentTV'", LKUILightTextView.class);
    }
}
