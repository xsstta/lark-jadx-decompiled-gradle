package com.ss.android.lark.contact.impl.department.detail.frame.list;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.ChatInfo;
import com.ss.android.lark.contact.entity.ChatterTagInfo;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.InactiveParent;
import java.io.Serializable;

public class DepartmentRecyclerViewItem implements Serializable {
    private String chatAvatarKey;
    private String chatId;
    private String chatName;
    private boolean checkSelectPermission;
    private Department department;
    private String departmentName;
    private boolean isCollaboration;
    private boolean isCrossTenant;
    private boolean isMember;
    private boolean isSuperAdmin;
    private Type mType;
    private Person person;
    private ChatInfo.UserPermission userPermission;

    public static class Person implements Serializable {
        private Chatter chatter;
        private ChatterTagInfo chatterTagInfo;
        private int deniedReason;
        private String duty;
        private String enterpriseEmail;
        public InactiveParent inactiveParent;
        private boolean isAdministrator;
        private boolean isLeader;
        private boolean isParent;
        private boolean isSelected;
        private boolean isStudent;
        private boolean isSuperAdministrator;
        private boolean isTeacher;
        private String section;

        public Chatter getChatter() {
            return this.chatter;
        }

        public ChatterTagInfo getChatterTagInfo() {
            return this.chatterTagInfo;
        }

        public int getDeniedReason() {
            return this.deniedReason;
        }

        public String getDuty() {
            return this.duty;
        }

        public String getEnterpriseEmail() {
            return this.enterpriseEmail;
        }

        public InactiveParent getInactiveParent() {
            return this.inactiveParent;
        }

        public String getSection() {
            return this.section;
        }

        public boolean isAdministrator() {
            return this.isAdministrator;
        }

        public boolean isLeader() {
            return this.isLeader;
        }

        public boolean isParent() {
            return this.isParent;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public boolean isStudent() {
            return this.isStudent;
        }

        public boolean isSuperAdministrator() {
            return this.isSuperAdministrator;
        }

        public boolean isTeacher() {
            return this.isTeacher;
        }

        public boolean isBeBlocked() {
            if (this.deniedReason == 1) {
                return true;
            }
            return false;
        }

        public boolean isBlock() {
            if (this.deniedReason == 5) {
                return true;
            }
            return false;
        }

        public boolean isNotContact() {
            if (this.deniedReason == 6) {
                return true;
            }
            return false;
        }

        public boolean isBlockOrBeBlocked() {
            if (isBlock() || isBeBlocked()) {
                return true;
            }
            return false;
        }

        public void setAdministrator(boolean z) {
            this.isAdministrator = z;
        }

        public void setChatter(Chatter chatter2) {
            this.chatter = chatter2;
        }

        public void setChatterTagInfo(ChatterTagInfo aVar) {
            this.chatterTagInfo = aVar;
        }

        public void setDeniedReason(int i) {
            this.deniedReason = i;
        }

        public void setDuty(String str) {
            this.duty = str;
        }

        public void setEnterpriseEmail(String str) {
            this.enterpriseEmail = str;
        }

        public void setInactiveParent(InactiveParent inactiveParent2) {
            this.inactiveParent = inactiveParent2;
        }

        public void setLeader(boolean z) {
            this.isLeader = z;
        }

        public void setParent(boolean z) {
            this.isParent = z;
        }

        public void setSection(String str) {
            this.section = str;
        }

        public void setSelected(boolean z) {
            this.isSelected = z;
        }

        public void setStudent(boolean z) {
            this.isStudent = z;
        }

        public void setSuperAdministrator(boolean z) {
            this.isSuperAdministrator = z;
        }

        public void setTeacher(boolean z) {
            this.isTeacher = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Person)) {
                return false;
            }
            Person person = (Person) obj;
            InactiveParent inactiveParent2 = this.inactiveParent;
            if (inactiveParent2 == null) {
                return this.chatter.equals(person.chatter);
            }
            return inactiveParent2.equals(person.inactiveParent);
        }
    }

    public enum Type {
        UNKNOWN(0),
        PERSON(1),
        DEPARTMENT(2),
        GROUP_CHAT(3),
        EDUER(4),
        EDUER_GROUP(5),
        COLLABORATION_TENANT(6);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 1:
                    return PERSON;
                case 2:
                    return DEPARTMENT;
                case 3:
                    return GROUP_CHAT;
                case 4:
                    return EDUER;
                case 5:
                    return EDUER_GROUP;
                case 6:
                    return COLLABORATION_TENANT;
                default:
                    return UNKNOWN;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public String getChatAvatarKey() {
        return this.chatAvatarKey;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getChatName() {
        return this.chatName;
    }

    public Department getDepartment() {
        return this.department;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Person getPerson() {
        return this.person;
    }

    public Type getType() {
        return this.mType;
    }

    public ChatInfo.UserPermission getUserPermission() {
        return this.userPermission;
    }

    public boolean isCheckSelectPermission() {
        return this.checkSelectPermission;
    }

    public boolean isCollaboration() {
        return this.isCollaboration;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isSuperAdmin() {
        return this.isSuperAdmin;
    }

    public boolean isEduer() {
        if (this.mType == Type.EDUER) {
            return true;
        }
        return false;
    }

    public boolean isPerson() {
        if (this.mType == Type.PERSON) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$1 */
    static /* synthetic */ class C358551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f92725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a = r0
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.PERSON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.DEPARTMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.COLLABORATION_TENANT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.f92725a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.GROUP_CHAT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.C358551.<clinit>():void");
        }
    }

    public long getItemId() {
        int hashCode;
        int i = C358551.f92725a[this.mType.ordinal()];
        if (i == 1) {
            hashCode = this.person.getChatter().getId().hashCode();
        } else if (i == 2 || i == 3) {
            hashCode = this.department.getId().hashCode();
        } else {
            if (i != 4) {
                if (i != 5) {
                    hashCode = this.mType.getNumber();
                }
            } else if (this.person.getChatter() != null) {
                hashCode = this.person.getChatter().getId().hashCode();
            } else if (this.person.inactiveParent != null) {
                hashCode = this.person.getInactiveParent().getName().hashCode();
            }
            hashCode = this.department.getId().hashCode();
        }
        return (long) hashCode;
    }

    public void setChatAvatarKey(String str) {
        this.chatAvatarKey = str;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setChatName(String str) {
        this.chatName = str;
    }

    public void setCheckSelectPermission(boolean z) {
        this.checkSelectPermission = z;
    }

    public void setCollaboration(boolean z) {
        this.isCollaboration = z;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setDepartment(Department department2) {
        this.department = department2;
    }

    public void setDepartmentName(String str) {
        this.departmentName = str;
    }

    public void setMember(boolean z) {
        this.isMember = z;
    }

    public void setPerson(Person person2) {
        this.person = person2;
    }

    public void setSuperAdmin(boolean z) {
        this.isSuperAdmin = z;
    }

    public void setUserPermission(ChatInfo.UserPermission userPermission2) {
        this.userPermission = userPermission2;
    }

    public DepartmentRecyclerViewItem(Type type) {
        this.mType = type;
    }

    private boolean isSameDepartmentGroup(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        if (!TextUtils.equals(this.chatId, departmentRecyclerViewItem.chatId) || !TextUtils.equals(this.chatAvatarKey, departmentRecyclerViewItem.chatAvatarKey) || !TextUtils.equals(this.chatName, departmentRecyclerViewItem.chatName) || this.userPermission != departmentRecyclerViewItem.userPermission) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DepartmentRecyclerViewItem)) {
            return false;
        }
        DepartmentRecyclerViewItem departmentRecyclerViewItem = (DepartmentRecyclerViewItem) obj;
        if (!TextUtils.equals(this.departmentName, departmentRecyclerViewItem.departmentName) || !isEquals(this.department, departmentRecyclerViewItem.department) || !isEquals(this.person, departmentRecyclerViewItem.person) || !isSameDepartmentGroup(departmentRecyclerViewItem)) {
            return false;
        }
        return true;
    }

    private boolean isEquals(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }
}
