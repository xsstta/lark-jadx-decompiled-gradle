package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.a */
public class C7010a {

    /* renamed from: a */
    private AbstractC7077d f18962a;

    /* renamed from: b */
    private C7074b f18963b;

    /* renamed from: a */
    private void m27926a(C7094b bVar) {
    }

    /* renamed from: a */
    public void mo27562a(AbstractC7013c cVar) {
        C7074b bVar = this.f18963b;
        if (bVar != null) {
            bVar.mo27667a(cVar);
        }
    }

    C7010a(AbstractC7077d dVar) {
        this.f18962a = dVar;
        this.f18963b = new C7074b(dVar);
    }

    /* renamed from: a */
    public void mo27561a(AbstractC6949c cVar) {
        m27925a(cVar, this.f18963b.mo27669c(cVar));
    }

    /* renamed from: b */
    public void mo27563b(AbstractC6949c cVar) {
        m27925a(cVar, this.f18963b.mo27666a(cVar));
    }

    /* renamed from: c */
    public void mo27564c(AbstractC6949c cVar) {
        m27925a(cVar, this.f18963b.mo27668b(cVar));
    }

    /* renamed from: a */
    private void m27925a(AbstractC6949c cVar, List<AbstractC7013c> list) {
        C7094b a = this.f18962a.mo27674c().mo27711a(cVar.mo27373c(), cVar.mo27374d());
        m27926a(a);
        List<Integer> arrayList = new ArrayList<>(a.mo27731f());
        for (AbstractC7013c cVar2 : list) {
            C13479a.m54764b("DrivePlatform_AdjustExecutor", cVar2.getClass().getSimpleName() + " start adjust priority, now the priority: " + Arrays.toString(arrayList.toArray(new Integer[0])));
            arrayList = cVar2.mo27565a(cVar, arrayList);
            C13479a.m54764b("DrivePlatform_AdjustExecutor", cVar2.getClass().getSimpleName() + " finish adjust priority, now the priority: " + Arrays.toString(arrayList.toArray(new Integer[0])));
        }
        C13479a.m54764b("DrivePlatform_AdjustExecutor", "===> all adjuster execute completed,  final priority: " + Arrays.toString(arrayList.toArray(new Integer[0])));
        cVar.mo27388a(arrayList);
    }
}
