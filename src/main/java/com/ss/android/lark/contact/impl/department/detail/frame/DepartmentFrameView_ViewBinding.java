package com.ss.android.lark.contact.impl.department.detail.frame;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView;
import com.ss.android.lark.widget.crumbs.DepartmentBreadcrumbsView;

public class DepartmentFrameView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DepartmentFrameView f92711a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DepartmentFrameView departmentFrameView = this.f92711a;
        if (departmentFrameView != null) {
            this.f92711a = null;
            departmentFrameView.mDepartmentBreadcrumbsView = null;
            departmentFrameView.mDepartmentListView = null;
            departmentFrameView.mDividerView = null;
            departmentFrameView.mllNodeEmpty = null;
            departmentFrameView.mTvNodeEmpty = null;
            departmentFrameView.mllInvite = null;
            departmentFrameView.mdividerDown = null;
            departmentFrameView.mdividerUp = null;
            departmentFrameView.mDepartmentListViewWrapper = null;
            departmentFrameView.mInviteTv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DepartmentFrameView_ViewBinding(DepartmentFrameView departmentFrameView, View view) {
        this.f92711a = departmentFrameView;
        departmentFrameView.mDepartmentBreadcrumbsView = (DepartmentBreadcrumbsView) Utils.findRequiredViewAsType(view, R.id.breadcrumbs_view, "field 'mDepartmentBreadcrumbsView'", DepartmentBreadcrumbsView.class);
        departmentFrameView.mDepartmentListView = (DepartmentListView) Utils.findRequiredViewAsType(view, R.id.department_recycler_view, "field 'mDepartmentListView'", DepartmentListView.class);
        departmentFrameView.mDividerView = Utils.findRequiredView(view, R.id.divider, "field 'mDividerView'");
        departmentFrameView.mllNodeEmpty = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_node_empty, "field 'mllNodeEmpty'", LinearLayout.class);
        departmentFrameView.mTvNodeEmpty = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_node_empty, "field 'mTvNodeEmpty'", TextView.class);
        departmentFrameView.mllInvite = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_invite, "field 'mllInvite'", LinearLayout.class);
        departmentFrameView.mdividerDown = Utils.findRequiredView(view, R.id.divider_down, "field 'mdividerDown'");
        departmentFrameView.mdividerUp = Utils.findRequiredView(view, R.id.divider_up, "field 'mdividerUp'");
        departmentFrameView.mDepartmentListViewWrapper = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.department_rv_wrapper, "field 'mDepartmentListViewWrapper'", ViewGroup.class);
        departmentFrameView.mInviteTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_invite, "field 'mInviteTv'", TextView.class);
    }
}
