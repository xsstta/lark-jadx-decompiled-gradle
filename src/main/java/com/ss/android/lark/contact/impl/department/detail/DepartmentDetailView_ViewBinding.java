package com.ss.android.lark.contact.impl.department.detail;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView;

public class DepartmentDetailView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DepartmentDetailView f92596a;

    @Override // butterknife.Unbinder
    public void unbind() {
        DepartmentDetailView departmentDetailView = this.f92596a;
        if (departmentDetailView != null) {
            this.f92596a = null;
            departmentDetailView.mContainerLayout = null;
            departmentDetailView.mDepartmentFrameView = null;
            departmentDetailView.mSchoolInfoCount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DepartmentDetailView_ViewBinding(DepartmentDetailView departmentDetailView, View view) {
        this.f92596a = departmentDetailView;
        departmentDetailView.mContainerLayout = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.department_content_wrapper, "field 'mContainerLayout'", ViewGroup.class);
        departmentDetailView.mDepartmentFrameView = (DepartmentFrameView) Utils.findRequiredViewAsType(view, R.id.department_container, "field 'mDepartmentFrameView'", DepartmentFrameView.class);
        departmentDetailView.mSchoolInfoCount = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_school_info_count, "field 'mSchoolInfoCount'", TextView.class);
    }
}
