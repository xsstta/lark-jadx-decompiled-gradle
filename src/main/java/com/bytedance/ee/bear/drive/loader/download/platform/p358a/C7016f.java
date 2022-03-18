package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.AbstractC7042d;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.f */
public class C7016f implements AbstractC7013c {

    /* renamed from: a */
    private AbstractC7042d f18967a;

    public C7016f(AbstractC7042d dVar) {
        this.f18967a = dVar;
    }

    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        boolean b = this.f18967a.mo27537b();
        C13479a.m54764b("DrivePlatform_PreviewFileStrategyAdjuster", "before PreviewFileStrategyAdjuster isEnableStreaming=" + b);
        if (!(list instanceof ArrayList)) {
            list = new ArrayList(list);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (!b && (intValue == 3 || intValue == 11 || intValue == 12)) {
                it.remove();
            }
        }
        return list;
    }
}
