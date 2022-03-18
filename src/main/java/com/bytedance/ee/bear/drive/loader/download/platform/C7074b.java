package com.bytedance.ee.bear.drive.loader.download.platform;

import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.AbstractC7013c;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7011a;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7012b;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7014d;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7015e;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7016f;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7017g;
import com.bytedance.ee.bear.drive.loader.download.platform.p358a.C7020h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.b */
public class C7074b {

    /* renamed from: a */
    private AbstractC7077d f19041a;

    /* renamed from: b */
    private List<AbstractC7013c> f19042b = new ArrayList();

    /* renamed from: a */
    public void mo27667a(AbstractC7013c cVar) {
        this.f19042b.add(cVar);
    }

    /* renamed from: c */
    public List<AbstractC7013c> mo27669c(AbstractC6949c cVar) {
        return mo27666a(cVar);
    }

    C7074b(AbstractC7077d dVar) {
        this.f19041a = dVar;
    }

    /* renamed from: b */
    public List<AbstractC7013c> mo27668b(AbstractC6949c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(mo27666a(cVar));
        arrayList.add(new C7014d());
        arrayList.addAll(this.f19042b);
        return arrayList;
    }

    /* renamed from: a */
    public List<AbstractC7013c> mo27666a(AbstractC6949c cVar) {
        ArrayList arrayList = new ArrayList(Arrays.asList(new C7017g(cVar.mo27376f()), new C7012b(this.f19041a.mo27673b()), new C7016f(this.f19041a.mo27672a()), new C7020h(this.f19041a.mo27674c(), this.f19041a.mo27673b()), new C7015e(this.f19041a.mo27674c(), this.f19041a.mo27673b()), new C7011a()));
        arrayList.addAll(this.f19042b);
        return arrayList;
    }
}
