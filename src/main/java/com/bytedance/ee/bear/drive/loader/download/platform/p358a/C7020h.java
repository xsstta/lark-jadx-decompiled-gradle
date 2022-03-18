package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.h */
public class C7020h implements AbstractC7013c {

    /* renamed from: a */
    private AbstractC7095c f18970a;

    /* renamed from: b */
    private C6923a f18971b;

    public C7020h(AbstractC7095c cVar, C6923a aVar) {
        this.f18970a = cVar;
        this.f18971b = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        if (this.f18970a.mo27717f(cVar.mo27373c(), null) && list.contains(0)) {
            list.remove((Object) 0);
        }
        return list;
    }
}
