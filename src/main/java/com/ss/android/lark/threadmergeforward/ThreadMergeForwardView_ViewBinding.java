package com.ss.android.lark.threadmergeforward;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public final class ThreadMergeForwardView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadMergeForwardView f138280a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadMergeForwardView threadMergeForwardView = this.f138280a;
        if (threadMergeForwardView != null) {
            this.f138280a = null;
            threadMergeForwardView.mRootView = null;
            threadMergeForwardView.mTitleBar = null;
            threadMergeForwardView.mDetailContentRv = null;
            threadMergeForwardView.mMultiSelectStub = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadMergeForwardView_ViewBinding(ThreadMergeForwardView threadMergeForwardView, View view) {
        this.f138280a = threadMergeForwardView;
        threadMergeForwardView.mRootView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.root_view, "field 'mRootView'", ViewGroup.class);
        threadMergeForwardView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        threadMergeForwardView.mDetailContentRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.message_view, "field 'mDetailContentRv'", RecyclerView.class);
        threadMergeForwardView.mMultiSelectStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.multi_select_menu_stub, "field 'mMultiSelectStub'", ViewStub.class);
    }
}
