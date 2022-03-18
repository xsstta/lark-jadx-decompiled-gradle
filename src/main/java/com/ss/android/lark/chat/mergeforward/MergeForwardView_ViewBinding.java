package com.ss.android.lark.chat.mergeforward;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;

public class MergeForwardView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MergeForwardView f88034a;

    @Override // butterknife.Unbinder
    public void unbind() {
        MergeForwardView mergeForwardView = this.f88034a;
        if (mergeForwardView != null) {
            this.f88034a = null;
            mergeForwardView.mRootView = null;
            mergeForwardView.mTitleBar = null;
            mergeForwardView.mMessageRV = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MergeForwardView_ViewBinding(MergeForwardView mergeForwardView, View view) {
        this.f88034a = mergeForwardView;
        mergeForwardView.mRootView = Utils.findRequiredView(view, R.id.root_view, "field 'mRootView'");
        mergeForwardView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        mergeForwardView.mMessageRV = (PointRecoderRecyclerView) Utils.findRequiredViewAsType(view, R.id.message_view, "field 'mMessageRV'", PointRecoderRecyclerView.class);
    }
}
