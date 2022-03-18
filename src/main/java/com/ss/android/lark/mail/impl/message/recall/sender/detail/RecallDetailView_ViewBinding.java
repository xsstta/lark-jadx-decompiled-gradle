package com.ss.android.lark.mail.impl.message.recall.sender.detail;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import com.ss.android.lark.ui.CommonTitleBar;

public class RecallDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecallDetailView f109481a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RecallDetailView recallDetailView = this.f109481a;
        if (recallDetailView != null) {
            this.f109481a = null;
            recallDetailView.mTitleBar = null;
            recallDetailView.mRecyclerView = null;
            recallDetailView.mLoadingView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecallDetailView_ViewBinding(RecallDetailView recallDetailView, View view) {
        this.f109481a = recallDetailView;
        recallDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        recallDetailView.mRecyclerView = (HeaderFooterRecyclerView) Utils.findRequiredViewAsType(view, R.id.mail_recall_detail_list, "field 'mRecyclerView'", HeaderFooterRecyclerView.class);
        recallDetailView.mLoadingView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.mail_recall_loading, "field 'mLoadingView'", ViewGroup.class);
    }
}
