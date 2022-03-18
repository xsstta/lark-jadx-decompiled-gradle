package com.bytedance.ee.bear.lark.selector;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;

public class DocsConfirmView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DocsConfirmView f21619a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DocsConfirmView docsConfirmView = this.f21619a;
        if (docsConfirmView != null) {
            this.f21619a = null;
            docsConfirmView.mTitleBar = null;
            docsConfirmView.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DocsConfirmView_ViewBinding(DocsConfirmView docsConfirmView, View view) {
        this.f21619a = docsConfirmView;
        docsConfirmView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        docsConfirmView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.content_rv, "field 'mRecyclerView'", RecyclerView.class);
    }
}
