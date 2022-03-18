package com.bytedance.ee.bear.doc.follow;

import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.impl.NativeFollowImpl;
import com.bytedance.ee.bear.doc.follow.p296b.AbstractC5424c;

/* renamed from: com.bytedance.ee.bear.doc.follow.f */
public abstract class AbstractC5431f {
    /* renamed from: a */
    public abstract void mo21710a(AbstractC5424c cVar);

    /* renamed from: a */
    public abstract void mo21711a(AbstractC5427d dVar);

    /* renamed from: b */
    public abstract void mo21712b(AbstractC5424c cVar);

    /* renamed from: b */
    public abstract void mo21713b(AbstractC5427d dVar);

    /* renamed from: a */
    public static AbstractC5431f m22018a(Fragment fragment, String str) {
        return NativeFollowImpl.bindFollowableContent(fragment, str);
    }
}
