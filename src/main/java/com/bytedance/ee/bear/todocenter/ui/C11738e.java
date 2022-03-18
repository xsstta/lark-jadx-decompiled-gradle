package com.bytedance.ee.bear.todocenter.ui;

import com.bytedance.ee.bear.todocenter.model.C11696d;
import com.bytedance.ee.bear.todocenter.ui.entity.SectionUIEntity;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.e */
public class C11738e {

    /* renamed from: a */
    public int f31552a;

    /* renamed from: b */
    public List<AbstractC20930c> f31553b;

    /* renamed from: c */
    public boolean f31554c;

    /* renamed from: d */
    public boolean f31555d;

    /* renamed from: e */
    public int f31556e;

    /* renamed from: f */
    public SectionUIEntity f31557f;

    /* renamed from: g */
    public SectionUIEntity f31558g;

    /* renamed from: c */
    public boolean mo44938c() {
        return C13657b.m55421a(this.f31553b);
    }

    /* renamed from: a */
    public boolean mo44936a() {
        SectionUIEntity sectionUIEntity = this.f31557f;
        if (sectionUIEntity == null || !sectionUIEntity.isExpanded()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo44937b() {
        SectionUIEntity sectionUIEntity = this.f31558g;
        if (sectionUIEntity == null || !sectionUIEntity.isExpanded()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "TodoUIData{type=" + this.f31552a + ", hasMore=" + this.f31554c + '}';
    }

    /* renamed from: a */
    private static SectionUIEntity m48681a(List<AbstractC20930c> list, int i) {
        if (list == null) {
            return null;
        }
        for (AbstractC20930c cVar : list) {
            if (cVar instanceof SectionUIEntity) {
                SectionUIEntity sectionUIEntity = (SectionUIEntity) cVar;
                if (sectionUIEntity.id == i) {
                    return sectionUIEntity;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m48683b(List<AbstractC20930c> list, int i) {
        if (list == null) {
            return -1;
        }
        int i2 = 0;
        for (AbstractC20930c cVar : list) {
            if ((cVar instanceof SectionUIEntity) && ((SectionUIEntity) cVar).id == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00be  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.chad.library.adapter.base.entity.AbstractC20930c> m48682a(com.bytedance.ee.bear.todocenter.ui.C11738e r10, com.bytedance.ee.bear.todocenter.model.C11696d r11) {
        /*
        // Method dump skipped, instructions count: 382
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.todocenter.ui.C11738e.m48682a(com.bytedance.ee.bear.todocenter.ui.e, com.bytedance.ee.bear.todocenter.model.d):java.util.List");
    }

    public C11738e(int i, List<AbstractC20930c> list, boolean z) {
        this.f31552a = i;
        this.f31553b = list;
        this.f31554c = z;
        this.f31558g = m48681a(list, 1);
        this.f31557f = m48681a(list, 2);
    }

    /* renamed from: a */
    public static C11738e m48680a(int i, C11738e eVar, C11696d dVar) {
        C11738e eVar2 = new C11738e(i, m48682a(eVar, dVar), dVar.mo44809f());
        if (eVar != null) {
            eVar2.f31555d = eVar.f31555d;
        }
        eVar2.f31556e = dVar.f31481a.msgbox_ver;
        return eVar2;
    }
}
