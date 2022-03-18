package com.bytedance.ee.bear.document.offline.p316c;

import android.text.TextUtils;
import androidx.core.util.C0844e;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5968f;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.offline.c.a */
public class C5914a implements AbstractC9496i {

    /* renamed from: a */
    private static final C5914a f16561a = new C5914a();

    private C5914a() {
    }

    /* renamed from: a */
    public static C5914a m23807a() {
        return f16561a;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i
    /* renamed from: a */
    public C0844e<Integer, String> mo23885a(String str, String str2) {
        boolean z;
        C5968f b = C5955d.m24025b().mo24086b(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("update feed message ");
        if (b != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C13479a.m54764b("OffLineDataImpl", sb.toString());
        if (b == null || TextUtils.isEmpty(b.mo24137d())) {
            return null;
        }
        return new C0844e<>(Integer.valueOf(b.mo24154n()), b.mo24137d());
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i
    /* renamed from: a */
    public int mo23884a(String str, String str2, String str3) {
        C5968f fVar = new C5968f(str, str2);
        fVar.mo24138d(str3);
        return C5955d.m24025b().mo24089c(fVar);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i
    /* renamed from: a */
    public int mo23883a(int i, String str, String str2, String str3) {
        C5968f fVar = new C5968f(str, str2);
        fVar.mo24131b(i);
        fVar.mo24138d(str3);
        return C5955d.m24025b().mo24089c(fVar);
    }
}
