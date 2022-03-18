package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class GroupPermission extends Permission {
    private static final long serialVersionUID = 5261938461035756626L;
    private boolean mSetGid;

    public boolean isSetGID() {
        return this.mSetGid;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.mSetGid) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public String toString() {
        return "GroupPermission [setgid=" + this.mSetGid + ", permission=" + super.toString() + "]";
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
        if (isSetGID()) {
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

    public void setSetGID(boolean z) {
        this.mSetGid = z;
        invalidateRawString();
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass() && this.mSetGid == ((GroupPermission) obj).mSetGid) {
            return true;
        }
        return false;
    }

    public GroupPermission(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    public GroupPermission(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3);
        this.mSetGid = z4;
    }
}
