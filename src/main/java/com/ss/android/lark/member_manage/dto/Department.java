package com.ss.android.lark.member_manage.dto;

import android.text.TextUtils;
import com.larksuite.framework.utils.aj;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class Department implements AbstractC26248b<Department>, Serializable, Comparable<Department> {
    private String chatId;
    private boolean hasSubDepartments;
    private String id;
    private String leaderId;
    private String mRefParentId;
    private int memberCount;
    private String name;
    private String namePinyin;
    private String parentId;
    private int status;

    public String getChatId() {
        return this.chatId;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean hasSubDepartments() {
        return this.hasSubDepartments;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setHasSubDepartments(boolean z) {
        this.hasSubDepartments = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLeaderId(String str) {
        this.leaderId = str;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamePinyin(String str) {
        this.namePinyin = str;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setRefParentId(String str) {
        this.mRefParentId = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Department)) {
            return false;
        }
        return TextUtils.equals(this.id, ((Department) obj).id);
    }

    public boolean isContentSame(Department department) {
        String str = this.name;
        if ((str != null || department.name != null) && !TextUtils.equals(str, department.name)) {
            return false;
        }
        return true;
    }

    public boolean isItemSame(Department department) {
        String str = this.id;
        if ((str != null || department.id != null) && !TextUtils.equals(str, department.id)) {
            return false;
        }
        return true;
    }

    public int compareTo(Department department) {
        if (getNamePinyin() == null || department.getNamePinyin() == null) {
            return 1;
        }
        boolean d = aj.m95024d(getName());
        boolean d2 = aj.m95024d(department.getName());
        if (d && !d2) {
            return -1;
        }
        if (d || !d2) {
            return getNamePinyin().compareTo(department.getNamePinyin());
        }
        return 1;
    }
}
