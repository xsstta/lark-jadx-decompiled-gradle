package com.ss.android.lark.contact.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.aj;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class Department implements AbstractC26248b<Department>, Serializable, Comparable<Department> {
    private String chatId;
    private String duty;
    private boolean hasLeaderPermission;
    private boolean hasSubDepartments;
    private String id;
    private Boolean isEdu;
    private boolean isSelected;
    private String leaderId;
    private String mRefParentId;
    private int memberCount;
    private String name;
    private String namePinyin;
    private String parentId;
    private String section;
    private boolean showMemberCount;
    private int status;

    public String getChatId() {
        return this.chatId;
    }

    public String getDuty() {
        return this.duty;
    }

    public Boolean getEdu() {
        return this.isEdu;
    }

    public String getId() {
        return this.id;
    }

    public String getLeaderId() {
        return this.leaderId;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public String getName() {
        return this.name;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getRefParentId() {
        return this.mRefParentId;
    }

    public String getSection() {
        return this.section;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean hasSubDepartments() {
        return this.hasSubDepartments;
    }

    public boolean isHasLeaderPermission() {
        return this.hasLeaderPermission;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public boolean isShowMemberCount() {
        return this.showMemberCount;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setDuty(String str) {
        this.duty = str;
    }

    public void setEdu(Boolean bool) {
        this.isEdu = bool;
    }

    public void setHasLeaderPermission(boolean z) {
        this.hasLeaderPermission = z;
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

    public void setSection(String str) {
        this.section = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public void setShowMemberCount(boolean z) {
        this.showMemberCount = z;
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
