package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import java.io.Serializable;
import java.text.ParseException;

public class Permissions implements Serializable, Comparable<Permissions> {
    private static final long serialVersionUID = -3995246732859872806L;
    private GroupPermission mGroup;
    private OthersPermission mOthers;
    private UserPermission mUser;

    public GroupPermission getGroup() {
        return this.mGroup;
    }

    public OthersPermission getOthers() {
        return this.mOthers;
    }

    public UserPermission getUser() {
        return this.mUser;
    }

    public static Permissions createDefaultFilePermissions() {
        return new Permissions(new UserPermission(true, true, false, false), new GroupPermission(true, true, false, false), new OthersPermission(false, false, false, false));
    }

    public static Permissions createDefaultFolderPermissions() {
        return new Permissions(new UserPermission(true, true, true, false), new GroupPermission(true, false, true, false), new OthersPermission(false, false, false, false));
    }

    public int hashCode() {
        int i;
        int i2;
        GroupPermission groupPermission = this.mGroup;
        int i3 = 0;
        if (groupPermission == null) {
            i = 0;
        } else {
            i = groupPermission.hashCode();
        }
        int i4 = (i + 31) * 31;
        OthersPermission othersPermission = this.mOthers;
        if (othersPermission == null) {
            i2 = 0;
        } else {
            i2 = othersPermission.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        UserPermission userPermission = this.mUser;
        if (userPermission != null) {
            i3 = userPermission.hashCode();
        }
        return i5 + i3;
    }

    public String toRawString() {
        return this.mUser.toRawString() + this.mGroup.toRawString() + this.mOthers.toRawString();
    }

    public String toString() {
        return "Permissions [user=" + this.mUser + ", group=" + this.mGroup + ", others=" + this.mOthers + "]";
    }

    public String toOctalString() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.mUser.isSetUID()) {
            i = 4;
        } else {
            i = 0;
        }
        if (this.mGroup.isSetGID()) {
            i |= 2;
        }
        if (this.mOthers.isStickybit()) {
            i |= 1;
        }
        if (this.mUser.isRead()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (this.mUser.isWrite()) {
            i2 |= 2;
        }
        if (this.mUser.isExecute()) {
            i2 |= 1;
        }
        if (this.mGroup.isRead()) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        if (this.mGroup.isWrite()) {
            i3 |= 2;
        }
        if (this.mGroup.isExecute()) {
            i3 |= 1;
        }
        if (this.mOthers.isRead()) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        if (this.mOthers.isWrite()) {
            i4 |= 2;
        }
        if (this.mOthers.isExecute()) {
            i4 |= 1;
        }
        return String.format("%d%d%d%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public void setGroup(GroupPermission groupPermission) {
        this.mGroup = groupPermission;
    }

    public void setOthers(OthersPermission othersPermission) {
        this.mOthers = othersPermission;
    }

    public void setUser(UserPermission userPermission) {
        this.mUser = userPermission;
    }

    public int compareTo(Permissions permissions) {
        return toRawString().compareTo(permissions.toRawString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Permissions permissions = (Permissions) obj;
        GroupPermission groupPermission = this.mGroup;
        if (groupPermission == null) {
            if (permissions.mGroup != null) {
                return false;
            }
        } else if (!groupPermission.equals(permissions.mGroup)) {
            return false;
        }
        OthersPermission othersPermission = this.mOthers;
        if (othersPermission == null) {
            if (permissions.mOthers != null) {
                return false;
            }
        } else if (!othersPermission.equals(permissions.mOthers)) {
            return false;
        }
        UserPermission userPermission = this.mUser;
        if (userPermission == null) {
            if (permissions.mUser != null) {
                return false;
            }
        } else if (!userPermission.equals(permissions.mUser)) {
            return false;
        }
        return true;
    }

    public static Permissions fromOctalString(String str) throws ParseException {
        int i;
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int length = str.length();
        boolean z12 = false;
        if (length == 3 || length == 4) {
            if (length == 4) {
                c = str.charAt(0);
                i = 1;
            } else {
                c = 0;
                i = 0;
            }
            char charAt = str.charAt(i);
            int i2 = i + 1;
            char charAt2 = str.charAt(i2);
            char charAt3 = str.charAt(i2 + 1);
            if ((charAt & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((charAt & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((charAt & 1) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((c & 1) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            UserPermission userPermission = new UserPermission(z, z2, z3, z4);
            if ((charAt2 & 4) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((charAt2 & 2) == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((charAt2 & 1) == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((c & 2) == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            GroupPermission groupPermission = new GroupPermission(z5, z6, z7, z8);
            if ((charAt3 & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((charAt3 & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((charAt3 & 1) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((c & 4) == 4) {
                z12 = true;
            }
            return new Permissions(userPermission, groupPermission, new OthersPermission(z9, z10, z11, z12));
        }
        throw new ParseException("Invalid permissions string length: !=3 or != 4", 0);
    }

    public Permissions(UserPermission userPermission, GroupPermission groupPermission, OthersPermission othersPermission) {
        this.mUser = userPermission;
        this.mGroup = groupPermission;
        this.mOthers = othersPermission;
    }
}
