package com.ss.android.lark.search.impl.func.chatinside.detail.image.mvp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class ChatInsideSearchImageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatInsideSearchImageView f132175a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatInsideSearchImageView chatInsideSearchImageView = this.f132175a;
        if (chatInsideSearchImageView != null) {
            this.f132175a = null;
            chatInsideSearchImageView.mContentRV = null;
            chatInsideSearchImageView.mEmptyMarkIV = null;
            chatInsideSearchImageView.mEmptyMarkTV = null;
            chatInsideSearchImageView.mLoadingView = null;
            chatInsideSearchImageView.mContentWrapper = null;
            chatInsideSearchImageView.mPtrFrame = null;
            chatInsideSearchImageView.mEmptyHolder = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatInsideSearchImageView_ViewBinding(ChatInsideSearchImageView chatInsideSearchImageView, View view) {
        this.f132175a = chatInsideSearchImageView;
        chatInsideSearchImageView.mContentRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.content, "field 'mContentRV'", RecyclerView.class);
        chatInsideSearchImageView.mEmptyMarkIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_empty_iv, "field 'mEmptyMarkIV'", ImageView.class);
        chatInsideSearchImageView.mEmptyMarkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_empty_hint, "field 'mEmptyMarkTV'", TextView.class);
        chatInsideSearchImageView.mLoadingView = Utils.findRequiredView(view, R.id.search_result_loading, "field 'mLoadingView'");
        chatInsideSearchImageView.mContentWrapper = Utils.findRequiredView(view, R.id.layout_content_wrapper, "field 'mContentWrapper'");
        chatInsideSearchImageView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        chatInsideSearchImageView.mEmptyHolder = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.search_result_empty, "field 'mEmptyHolder'", ViewGroup.class);
    }
}
