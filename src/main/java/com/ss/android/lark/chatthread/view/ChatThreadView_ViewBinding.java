package com.ss.android.lark.chatthread.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;

public final class ChatThreadView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChatThreadView f90892a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ChatThreadView chatThreadView = this.f90892a;
        if (chatThreadView != null) {
            this.f90892a = null;
            chatThreadView.mContentContainer = null;
            chatThreadView.mTitleBar = null;
            chatThreadView.mKeyBoardContainer = null;
            chatThreadView.mSmartReplyContainer = null;
            chatThreadView.mRecyclerView = null;
            chatThreadView.mP2pChatterDeactiviedTipTV = null;
            chatThreadView.mKeyBoardDetectorView = null;
            chatThreadView.mRootView = null;
            chatThreadView.mThreadEmptyView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChatThreadView_ViewBinding(ChatThreadView chatThreadView, View view) {
        this.f90892a = chatThreadView;
        chatThreadView.mContentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.rv_thread_layout, "field 'mContentContainer'", ViewGroup.class);
        chatThreadView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        chatThreadView.mKeyBoardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.keyboard_container, "field 'mKeyBoardContainer'", FrameLayout.class);
        chatThreadView.mSmartReplyContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.fl_chat_smart_reply_container, "field 'mSmartReplyContainer'", FrameLayout.class);
        chatThreadView.mRecyclerView = (PointRecoderRecyclerView) Utils.findRequiredViewAsType(view, R.id.rv_thread, "field 'mRecyclerView'", PointRecoderRecyclerView.class);
        chatThreadView.mP2pChatterDeactiviedTipTV = (TextView) Utils.findRequiredViewAsType(view, R.id.chat_thread_p2p_chatter_is_deactivied_tip, "field 'mP2pChatterDeactiviedTipTV'", TextView.class);
        chatThreadView.mKeyBoardDetectorView = (SysKeyBoardObserveFrameLayout) Utils.findRequiredViewAsType(view, R.id.keyboard_detector_view, "field 'mKeyBoardDetectorView'", SysKeyBoardObserveFrameLayout.class);
        chatThreadView.mRootView = Utils.findRequiredView(view, R.id.rootview, "field 'mRootView'");
        chatThreadView.mThreadEmptyView = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.rv_thread_empty_view, "field 'mThreadEmptyView'", ViewGroup.class);
    }
}
