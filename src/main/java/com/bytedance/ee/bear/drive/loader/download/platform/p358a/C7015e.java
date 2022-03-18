package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.biz.plugin.C6535d;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.fg.C6923a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.mimetype.AbstractC7095c;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.e */
public class C7015e implements AbstractC7013c {

    /* renamed from: a */
    private AbstractC7095c f18965a;

    /* renamed from: b */
    private C6923a f18966b;

    public C7015e(AbstractC7095c cVar, C6923a aVar) {
        this.f18965a = cVar;
        this.f18966b = aVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        boolean d = C6535d.m26239d(this.f18966b);
        boolean e = C6535d.m26240e(this.f18966b);
        boolean f = C6535d.m26241f(this.f18966b);
        C13479a.m54764b("DrivePlatform_OfficeSupportAdjuster", "enableTTWord: " + d + ", enableTTExcel: " + e + ", enableTTPPT: " + f);
        if (C6892d.m27247e(cVar.mo27373c()) || C6892d.m27248f(cVar.mo27373c())) {
            if (list.contains(-2) && !e) {
                list.remove((Object) -2);
            }
        } else if (C6892d.m27246d(cVar.mo27373c())) {
            if (list.contains(-2)) {
                list.remove((Object) -2);
                if (d) {
                    list.add(0, -2);
                }
            }
        } else if (C6892d.m27249g(cVar.mo27373c()) && list.contains(-2)) {
            list.remove((Object) -2);
            if (f) {
                list.add(0, -2);
            }
        }
        return list;
    }
}
