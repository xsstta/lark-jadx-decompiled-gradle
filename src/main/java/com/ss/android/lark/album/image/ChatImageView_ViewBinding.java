package com.ss.android.lark.album.image;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.album.image.decoration.StickyHeadContainer;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class ChatImageView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatImageView f72138a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatImageView chatImageView = this.f72138a;
        if (chatImageView != null) {
            this.f72138a = null;
            chatImageView.mContentRV = null;
            chatImageView.mEmptyMarkIV = null;
            chatImageView.mEmptyMarkTV = null;
            chatImageView.mLoadingView = null;
            chatImageView.mContentWrapper = null;
            chatImageView.mPtrFrame = null;
            chatImageView.mEmptyHolder = null;
            chatImageView.stickyHeadContainer = null;
            chatImageView.tvStickyContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatImageView_ViewBinding(ChatImageView chatImageView, View view) {
        this.f72138a = chatImageView;
        chatImageView.mContentRV = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.content, "field 'mContentRV'", RecyclerView.class);
        chatImageView.mEmptyMarkIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.search_empty_iv, "field 'mEmptyMarkIV'", ImageView.class);
        chatImageView.mEmptyMarkTV = (TextView) Utils.findRequiredViewAsType(view, R.id.search_empty_hint, "field 'mEmptyMarkTV'", TextView.class);
        chatImageView.mLoadingView = Utils.findRequiredView(view, R.id.search_result_loading, "field 'mLoadingView'");
        chatImageView.mContentWrapper = Utils.findRequiredView(view, R.id.layout_content_wrapper, "field 'mContentWrapper'");
        chatImageView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.inbox_ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        chatImageView.mEmptyHolder = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.search_result_empty, "field 'mEmptyHolder'", ViewGroup.class);
        chatImageView.stickyHeadContainer = (StickyHeadContainer) Utils.findRequiredViewAsType(view, R.id.sticky_header_container, "field 'stickyHeadContainer'", StickyHeadContainer.class);
        chatImageView.tvStickyContent = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_sticky_content, "field 'tvStickyContent'", TextView.class);
    }
}
