package com.ss.android.lark.contact.impl.department;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.ui.CommonTitleBar;

public class DepartmentStructureView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DepartmentStructureView f92570a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DepartmentStructureView departmentStructureView = this.f92570a;
        if (departmentStructureView != null) {
            this.f92570a = null;
            departmentStructureView.mTitleBar = null;
            departmentStructureView.mDesktopTitleBar = null;
            departmentStructureView.mSearchPlaceHolder = null;
            departmentStructureView.contactDepartmentInviteMemberFl = null;
            departmentStructureView.mInviteTv = null;
            departmentStructureView.mContainerLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DepartmentStructureView_ViewBinding(DepartmentStructureView departmentStructureView, View view) {
        this.f92570a = departmentStructureView;
        departmentStructureView.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, R.id.titlebar, "field 'mTitleBar'", CommonTitleBar.class);
        departmentStructureView.mDesktopTitleBar = (DesktopContactsTitle) Utils.findRequiredViewAsType(view, R.id.desktop_title_bar, "field 'mDesktopTitleBar'", DesktopContactsTitle.class);
        departmentStructureView.mSearchPlaceHolder = Utils.findRequiredView(view, R.id.search_placeholder, "field 'mSearchPlaceHolder'");
        departmentStructureView.contactDepartmentInviteMemberFl = Utils.findRequiredView(view, R.id.contactDepartmentInviteMemberFl, "field 'contactDepartmentInviteMemberFl'");
        departmentStructureView.mInviteTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_contact_department_invite, "field 'mInviteTv'", TextView.class);
        departmentStructureView.mContainerLayout = Utils.findRequiredView(view, R.id.container_layout, "field 'mContainerLayout'");
    }
}
