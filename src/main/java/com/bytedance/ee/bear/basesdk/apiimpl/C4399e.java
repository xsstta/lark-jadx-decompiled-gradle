package com.bytedance.ee.bear.basesdk.apiimpl;

import com.bytedance.ee.bear.basesdk.api.AbstractC4379e;
import com.bytedance.ee.bear.basesdk.business.comment.CommentSdk;
import com.bytedance.ee.bear.basesdk.business.comment.ICommentDependency;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.e */
public class C4399e implements AbstractC4379e {
    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: b */
    public String mo17031b() {
        return CommentSdk.f13128a.mo17203b();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: a */
    public String mo17030a() {
        return CommentSdk.f13128a.mo17202a();
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4379e
    /* renamed from: a */
    public AbstractC4379e.AbstractC4380a mo17029a(ICommentDependency cVar) {
        return new CommentSdk(cVar);
    }
}
