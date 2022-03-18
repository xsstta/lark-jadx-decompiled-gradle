package com.ss.android.lark.contact.entity;

import java.io.Serializable;

public class UserRelationResponse implements Serializable {
    private String mApplyReason;
    private boolean mBeCtrlAddContact;
    private String mContactApplicationId;
    private boolean mHasApply;
    private boolean mHasBeApply;
    private boolean mHasBeBlock;
    private boolean mHasBlock;
    private boolean mInCollaboration;
    private boolean mIsFriend;

    public String getApplyReason() {
        return this.mApplyReason;
    }

    public String getContactApplicationId() {
        return this.mContactApplicationId;
    }

    public boolean isBeCtrlAddContact() {
        return this.mBeCtrlAddContact;
    }

    public boolean isFriend() {
        return this.mIsFriend;
    }

    public boolean isHasApply() {
        return this.mHasApply;
    }

    public boolean isHasBeApply() {
        return this.mHasBeApply;
    }

    public boolean isHasBeBlocked() {
        return this.mHasBeBlock;
    }

    public boolean isHasBlock() {
        return this.mHasBlock;
    }

    public boolean isInCollaboration() {
        return this.mInCollaboration;
    }

    public UserRelationResponse() {
        this.mIsFriend = true;
    }

    /* renamed from: com.ss.android.lark.contact.entity.UserRelationResponse$a */
    public static class C35401a {

        /* renamed from: a */
        public boolean f91437a;

        /* renamed from: b */
        public boolean f91438b;

        /* renamed from: c */
        public boolean f91439c;

        /* renamed from: d */
        public boolean f91440d;

        /* renamed from: e */
        public boolean f91441e;

        /* renamed from: f */
        public String f91442f;

        /* renamed from: g */
        public String f91443g;

        /* renamed from: h */
        public boolean f91444h;

        /* renamed from: i */
        public boolean f91445i;

        /* renamed from: a */
        public UserRelationResponse mo130566a() {
            return new UserRelationResponse(this);
        }

        /* renamed from: a */
        public C35401a mo130564a(String str) {
            this.f91442f = str;
            return this;
        }

        /* renamed from: b */
        public C35401a mo130567b(String str) {
            this.f91443g = str;
            return this;
        }

        /* renamed from: c */
        public C35401a mo130569c(boolean z) {
            this.f91445i = z;
            return this;
        }

        /* renamed from: a */
        public C35401a mo130565a(boolean z) {
            this.f91439c = z;
            return this;
        }

        /* renamed from: b */
        public C35401a mo130568b(boolean z) {
            this.f91444h = z;
            return this;
        }

        public C35401a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f91437a = z;
            this.f91438b = z2;
            this.f91440d = z3;
            this.f91441e = z4;
        }
    }

    public void setApplyReason(String str) {
        this.mApplyReason = str;
    }

    public void setHasApply(boolean z) {
        this.mHasApply = z;
    }

    private UserRelationResponse(C35401a aVar) {
        this.mIsFriend = aVar.f91437a;
        this.mHasBlock = aVar.f91438b;
        this.mHasApply = aVar.f91440d;
        this.mHasBeApply = aVar.f91441e;
        this.mContactApplicationId = aVar.f91442f;
        this.mApplyReason = aVar.f91443g;
        this.mHasBeBlock = aVar.f91439c;
        this.mBeCtrlAddContact = aVar.f91444h;
        this.mInCollaboration = aVar.f91445i;
    }
}
