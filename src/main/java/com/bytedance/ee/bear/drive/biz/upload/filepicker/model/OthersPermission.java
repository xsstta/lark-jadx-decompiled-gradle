package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class OthersPermission extends Permission {
    private static final long serialVersionUID = -8993601349099495256L;
    private boolean mStickybit;

    public boolean isStickybit() {
        return this.mStickybit;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.mStickybit) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public String toString() {
        return "OthersPermission [stickybit=" + this.mStickybit + ", permission=" + super.toString() + "]";
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
        if (isStickybit()) {
            if (isExecute()) {
                c3 = 't';
            } else {
                c3 = 'T';
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

    public void setStickybit(boolean z) {
        this.mStickybit = z;
        invalidateRawString();
    }

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.Permission
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass() && this.mStickybit == ((OthersPermission) obj).mStickybit) {
            return true;
        }
        return false;
    }

    public OthersPermission(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    public OthersPermission(boolean z, boolean z2, boolean z3, boolean z4) {
        super(z, z2, z3);
        this.mStickybit = z4;
    }
}
