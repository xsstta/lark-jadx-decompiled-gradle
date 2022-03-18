package com.ss.android.lark.contact.impl.interfaces;

import com.bytedance.lark.pb.contact.v1.GetCollaborationStructureResponse;
import com.bytedance.lark.pb.contact.v1.GetCollaborationTenantResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.dto.DepartmentStructureResponse;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.DepartmentStructure;
import java.io.Serializable;
import java.util.List;

public interface IDepartmentServiceInternal {
    /* renamed from: a */
    void mo132176a(int i, int i2, IGetDataCallback<GetCollaborationTenantResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132177a(IGetDataCallback<SubordinateDepartmentStructure> iGetDataCallback);

    /* renamed from: a */
    void mo132178a(DepartmentStructure departmentStructure, String str);

    /* renamed from: a */
    void mo132179a(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, IGetDataCallback<DepartmentStructureResponse> iGetDataCallback);

    /* renamed from: a */
    void mo132180a(String str, String str2, String str3, boolean z, boolean z2, int i, int i2, IGetDataCallback<GetCollaborationStructureResponse> iGetDataCallback);

    public static class SubordinateDepartmentStructure implements Serializable {
        private static final long serialVersionUID = 7203535591509671845L;
        List<Department> mDepartmentList;
        int mMemberCount = -1;

        public List<Department> getDepartmentList() {
            return this.mDepartmentList;
        }

        public int getMemberCount() {
            return this.mMemberCount;
        }

        public void setDepartmentList(List<Department> list) {
            this.mDepartmentList = list;
        }

        public void setMemberCount(int i) {
            this.mMemberCount = i;
        }

        public SubordinateDepartmentStructure(List<Department> list, int i) {
            this.mDepartmentList = list;
            this.mMemberCount = i;
        }
    }
}
