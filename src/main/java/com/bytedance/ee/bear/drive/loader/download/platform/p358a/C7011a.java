package com.bytedance.ee.bear.drive.loader.download.platform.p358a;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.biz.plugin.C6527a;
import com.bytedance.ee.bear.drive.common.C6892d;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a.a */
public class C7011a implements AbstractC7013c {
    @Override // com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c
    /* renamed from: a */
    public List<Integer> mo27565a(AbstractC6949c cVar, List<Integer> list) {
        if (C6892d.m27253k(cVar.mo27373c()) && list.contains(-2)) {
            boolean a = C4211a.m17514a().mo16536a("ccm.drive.local_archive_preview_enable", false);
            boolean c = C6527a.m26177a().mo26097c(C6920b.m27342f().mo27168c());
            if (!a || !c) {
                C13479a.m54764b("ArchiveSupportPriorityAdjuster", "adjust fgEnable=" + a + " archivePluginActive=" + c);
                list.remove((Object) -2);
            }
        }
        return list;
    }
}
