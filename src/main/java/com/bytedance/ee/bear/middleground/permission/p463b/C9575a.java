package com.bytedance.ee.bear.middleground.permission.p463b;

import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10155a;

/* renamed from: com.bytedance.ee.bear.middleground.permission.b.a */
class C9575a implements AbstractC10155a {

    /* renamed from: com.bytedance.ee.bear.middleground.permission.b.a$a */
    private static class C9577a {

        /* renamed from: a */
        public static final C9575a f25726a = new C9575a();
    }

    private C9575a() {
    }

    /* renamed from: a */
    public static AbstractC10155a m39535a() {
        return C9577a.f25726a;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10155a
    /* renamed from: b */
    public boolean mo36636b() {
        return !PermFGUtils.m39532a();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10155a
    /* renamed from: c */
    public boolean mo36637c() {
        return PermFGUtils.m39534c();
    }
}
