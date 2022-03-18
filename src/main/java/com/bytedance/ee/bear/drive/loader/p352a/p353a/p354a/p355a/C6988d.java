package com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a;

import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p716r.C13721c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.a.a.a.a.d */
public class C6988d implements AbstractC6987c {

    /* renamed from: a */
    private IDownloader f18904a;

    /* renamed from: a */
    private boolean m27824a(String str) {
        if (C13721c.m55646a(str, "jpg") || C13721c.m55646a(str, "jpeg") || C13721c.m55646a(str, "jpe")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.loader.p352a.p353a.p354a.p355a.AbstractC6987c
    /* renamed from: a */
    public boolean mo27521a(AbstractC6949c cVar, AbstractC6949c cVar2) {
        this.f18904a.mo27579a(cVar2);
        List<Integer> n = cVar2.mo27398n();
        if (C13657b.m55421a(n)) {
            return true;
        }
        int intValue = n.get(0).intValue();
        String b = C7096d.m28347b(intValue, cVar.mo27380j());
        String j = cVar.mo27380j();
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "transformPriority=" + Arrays.toString(n.toArray(new Integer[0])));
        C13479a.m54764b("DRIVE_PREVIEW_FLOW", "priorityExt=" + b + " localPreviewExt=" + j);
        if (C7096d.m28355g().contains(Integer.valueOf(intValue))) {
            cVar2.mo27395d(j);
            cVar2.mo27397e(cVar.mo27381k());
            return false;
        } else if (m27824a(b) && m27824a(j)) {
            cVar2.mo27395d(j);
            cVar2.mo27397e(cVar.mo27381k());
            return false;
        } else if (C13721c.m55646a(b, j)) {
            cVar2.mo27395d(j);
            cVar2.mo27397e(cVar.mo27381k());
            return false;
        } else {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "preview ext is changed");
            return true;
        }
    }

    public C6988d(C10917c cVar, AbstractC6927d dVar, IDownloader iDownloader) {
        this.f18904a = iDownloader;
    }
}
