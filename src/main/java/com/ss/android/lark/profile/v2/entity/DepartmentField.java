package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000b\fB\u0005¢\u0006\u0002\u0010\u0003R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/DepartmentField;", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "()V", "departmentPathList", "", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField$DepartmentPath;", "getDepartmentPathList", "()Ljava/util/List;", "setDepartmentPathList", "(Ljava/util/List;)V", "DepartmentNode", "DepartmentPath", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DepartmentField extends BaseField implements Serializable {
    private List<DepartmentPath> departmentPathList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/DepartmentField$DepartmentNode;", "", "()V", "departmentId", "", "getDepartmentId", "()Ljava/lang/String;", "setDepartmentId", "(Ljava/lang/String;)V", "departmentName", "getDepartmentName", "setDepartmentName", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.DepartmentField$a */
    public static final class DepartmentNode {

        /* renamed from: a */
        private String f130752a;

        /* renamed from: b */
        private String f130753b;

        /* renamed from: a */
        public final String mo180650a() {
            return this.f130752a;
        }

        /* renamed from: b */
        public final String mo180652b() {
            return this.f130753b;
        }

        /* renamed from: a */
        public final void mo180651a(String str) {
            this.f130752a = str;
        }

        /* renamed from: b */
        public final void mo180653b(String str) {
            this.f130753b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/DepartmentField$DepartmentPath;", "", "()V", "departmentNodeList", "", "Lcom/ss/android/lark/profile/v2/entity/DepartmentField$DepartmentNode;", "getDepartmentNodeList", "()Ljava/util/List;", "setDepartmentNodeList", "(Ljava/util/List;)V", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.DepartmentField$b */
    public static final class DepartmentPath {

        /* renamed from: a */
        private List<DepartmentNode> f130754a;

        /* renamed from: a */
        public final List<DepartmentNode> mo180654a() {
            return this.f130754a;
        }

        /* renamed from: a */
        public final void mo180655a(List<DepartmentNode> list) {
            this.f130754a = list;
        }
    }

    public final List<DepartmentPath> getDepartmentPathList() {
        return this.departmentPathList;
    }

    public final void setDepartmentPathList(List<DepartmentPath> list) {
        this.departmentPathList = list;
    }
}
