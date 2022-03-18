package com.ss.android.lark.profile.entity;

import java.io.Serializable;
import java.util.List;

public class DepartmentList implements Serializable {
    private static final long serialVersionUID = 4730343431625724394L;
    private List<DepartmentMeta> mDepartmentMetaList;

    public List<DepartmentMeta> getDepartmentMetaList() {
        return this.mDepartmentMetaList;
    }

    public void setDepartmentMetaList(List<DepartmentMeta> list) {
        this.mDepartmentMetaList = list;
    }
}
