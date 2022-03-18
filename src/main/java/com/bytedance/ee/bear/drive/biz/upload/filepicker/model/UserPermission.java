package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class UserPermission extends Permission {
    private static final long serialVersionUID = -900037436267443837L;
    private boolean mSetuid;

    public boolean isSetUID() {
        return this.mSetuid;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.mSetuid) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public String toString() {
        return "UserPermission [setuid=" + this.mSetuid + ", permission=" + super.toString() + "]";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public String getRawString() {
        char c;
        char c2;
        char c3;
        StringBuilder sb = new StringBuilder();
        char c4 = '-';
        if (isRead()) {
            c = 'r';
        } else {
            c = '-';
        }
        sb.append(c);
        if (isWrite()) {
            c2 = 'w';
        } else {
            c2 = '-';
        }
        sb.append(c2);
        if (isSetUID()) {
            if (isExecute()) {
                c3 = 's';
            } else {
                c3 = 'S';
            }
            sb.append(c3);
        } else {
            if (isExecute()) {
                c4 = 'x';
            }
            sb.append(c4);
        }
        return sb.toString();
    }

    public void setSetUID(boolean z) {
        this.mSetuid = z;
        invalidateRawString();
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass() && this.mSetuid == ((UserPermission) obj).mSetuid) {
            return true;
        }
        return false;
    }

    public UserPermission(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    public UserPermission(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3);
        this.mSetuid = z4;
    }
}
