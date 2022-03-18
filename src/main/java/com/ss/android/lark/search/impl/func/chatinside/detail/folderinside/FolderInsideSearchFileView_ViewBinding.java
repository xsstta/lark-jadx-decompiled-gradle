package com.ss.android.lark.search.impl.func.chatinside.detail.folderinside;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView_ViewBinding;

public final class FolderInsideSearchFileView_ViewBinding extends BaseChatInsideSearchView_ViewBinding {

    /* renamed from: a */
    private FolderInsideSearchFileView f132142a;

    @Override // butterknife.Unbinder, com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView_ViewBinding
    public void unbind() {
        FolderInsideSearchFileView folderInsideSearchFileView = this.f132142a;
        if (folderInsideSearchFileView != null) {
            this.f132142a = null;
            folderInsideSearchFileView.mCancelTv = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FolderInsideSearchFileView_ViewBinding(FolderInsideSearchFileView folderInsideSearchFileView, View view) {
        super(folderInsideSearchFileView, view);
        this.f132142a = folderInsideSearchFileView;
        folderInsideSearchFileView.mCancelTv = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_inside_cancel_search_tv, "field 'mCancelTv'", TextView.class);
    }
}
