package com.ss.android.lark.contact.impl.contacts_robot;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;

public class RobotView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RobotView f92363a;

    @Override // butterknife.Unbinder
    public void unbind() {
        RobotView robotView = this.f92363a;
        if (robotView != null) {
            this.f92363a = null;
            robotView.mTitleBar = null;
            robotView.mDesktopTitleBar = null;
            robotView.mRobotPtrLayout = null;
            robotView.mRecyclerView = null;
            robotView.mLoadFailView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RobotView_ViewBinding(RobotView robotView, View view) {
        this.f92363a = robotView;
        robotView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.title_bar, "field 'mTitleBar'", CommonTitleBar.class);
        robotView.mDesktopTitleBar = (DesktopContactsTitle) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitleBar'", DesktopContactsTitle.class);
        robotView.mRobotPtrLayout = (LKUIPtrClassicFrameLayout) Utils.findRequiredViewAsType(view, R.id.robot_ptr_layout, "field 'mRobotPtrLayout'", LKUIPtrClassicFrameLayout.class);
        robotView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.group_chat_recylerview, "field 'mRecyclerView'", RecyclerView.class);
        robotView.mLoadFailView = Utils.findRequiredView(view, R.id.load_fail, "field 'mLoadFailView'");
    }
}
