package com.ss.android.lark.threaddetail.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.tip.NewMessageTip;
import com.ss.android.lark.keyboard.widget.SysKeyBoardObserveFrameLayout;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class ThreadDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ThreadDetailView f137998a;

    @Override // butterknife.Unbinder
    public void unbind() {
        ThreadDetailView threadDetailView = this.f137998a;
        if (threadDetailView != null) {
            this.f137998a = null;
            threadDetailView.mPtrFrame = null;
            threadDetailView.mMultiSelectStub = null;
            threadDetailView.mRootLayout = null;
            threadDetailView.mDetailContent = null;
            threadDetailView.mTitleBar = null;
            threadDetailView.mDetailContentRv = null;
            threadDetailView.mKeyBoardContainer = null;
            threadDetailView.newMessageTopTip = null;
            threadDetailView.newMessageBottomTip = null;
            threadDetailView.mKeyboardShadow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ThreadDetailView_ViewBinding(ThreadDetailView threadDetailView, View view) {
        this.f137998a = threadDetailView;
        threadDetailView.mPtrFrame = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.ptr_layout, "field 'mPtrFrame'", LKUIPtrClassicFrameLayout.class);
        threadDetailView.mMultiSelectStub = (ViewStub) Utils.findRequiredViewAsType(view, R.id.multi_select_menu_stub, "field 'mMultiSelectStub'", ViewStub.class);
        threadDetailView.mRootLayout = (SysKeyBoardObserveFrameLayout) Utils.findRequiredViewAsType(view, R.id.thread_detail_root, "field 'mRootLayout'", SysKeyBoardObserveFrameLayout.class);
        threadDetailView.mDetailContent = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.thread_detail_content, "field 'mDetailContent'", ViewGroup.class);
        threadDetailView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.thread_detail_titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        threadDetailView.mDetailContentRv = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.thread_detail_rv, "field 'mDetailContentRv'", RecyclerView.class);
        threadDetailView.mKeyBoardContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.keyboard_container, "field 'mKeyBoardContainer'", FrameLayout.class);
        threadDetailView.newMessageTopTip = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_top_tip, "field 'newMessageTopTip'", NewMessageTip.class);
        threadDetailView.newMessageBottomTip = (NewMessageTip) Utils.findRequiredViewAsType(view, R.id.new_message_bottom_tip, "field 'newMessageBottomTip'", NewMessageTip.class);
        threadDetailView.mKeyboardShadow = Utils.findRequiredView(view, R.id.keyboard_shadow, "field 'mKeyboardShadow'");
    }
}
