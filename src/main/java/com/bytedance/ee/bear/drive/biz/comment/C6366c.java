package com.bytedance.ee.bear.drive.biz.comment;

import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.c */
public class C6366c implements ICommentPermission {

    /* renamed from: a */
    private AbstractC6393j f17631a;

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
    /* renamed from: d */
    public boolean mo17186d() {
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
    /* renamed from: a */
    public boolean mo17183a() {
        AbstractC6393j jVar = this.f17631a;
        if (jVar == null || !jVar.mo25656a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
    /* renamed from: b */
    public boolean mo17184b() {
        AbstractC6393j jVar = this.f17631a;
        if (jVar == null || !jVar.mo25657b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentPermission
    /* renamed from: c */
    public boolean mo17185c() {
        AbstractC6393j jVar = this.f17631a;
        if (jVar == null || !jVar.mo25657b()) {
            return false;
        }
        return true;
    }

    public C6366c(AbstractC6393j jVar) {
        this.f17631a = jVar;
    }
}
