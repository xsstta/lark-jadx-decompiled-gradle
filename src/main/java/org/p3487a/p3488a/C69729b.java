package org.p3487a.p3488a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: org.a.a.b */
public class C69729b {

    /* renamed from: a */
    private C69729b f174179a;

    /* renamed from: b */
    private C69729b f174180b;

    /* renamed from: c */
    private int f174181c;

    /* renamed from: d */
    private List<AbstractC69733d> f174182d = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: org.a.a.b$a */
    public enum EnumC69731a {
        LEFT,
        RIGHT
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.a.a.b$1 */
    public static /* synthetic */ class C697301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f174183a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.a.a.b$a[] r0 = org.p3487a.p3488a.C69729b.EnumC69731a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.p3487a.p3488a.C69729b.C697301.f174183a = r0
                org.a.a.b$a r1 = org.p3487a.p3488a.C69729b.EnumC69731a.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.p3487a.p3488a.C69729b.C697301.f174183a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.a.a.b$a r1 = org.p3487a.p3488a.C69729b.EnumC69731a.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.p3487a.p3488a.C69729b.C697301.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<AbstractC69733d> mo244644b(AbstractC69733d dVar) {
        return mo244642a(dVar, EnumC69731a.LEFT);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<AbstractC69733d> mo244645c(AbstractC69733d dVar) {
        return mo244642a(dVar, EnumC69731a.RIGHT);
    }

    /* renamed from: a */
    public int mo244639a(List<AbstractC69733d> list) {
        int i = -1;
        int i2 = -1;
        for (AbstractC69733d dVar : list) {
            int a = dVar.mo244632a();
            int b = dVar.mo244633b();
            if (i == -1 || a < i) {
                i = a;
            }
            if (i2 == -1 || b > i2) {
                i2 = b;
            }
        }
        return (i + i2) / 2;
    }

    public C69729b(List<AbstractC69733d> list) {
        this.f174181c = mo244639a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC69733d dVar : list) {
            if (dVar.mo244633b() < this.f174181c) {
                arrayList.add(dVar);
            } else if (dVar.mo244632a() > this.f174181c) {
                arrayList2.add(dVar);
            } else {
                this.f174182d.add(dVar);
            }
        }
        if (arrayList.size() > 0) {
            this.f174179a = new C69729b(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.f174180b = new C69729b(arrayList2);
        }
    }

    /* renamed from: a */
    public List<AbstractC69733d> mo244641a(AbstractC69733d dVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f174181c < dVar.mo244632a()) {
            mo244643a(dVar, arrayList, mo244640a(this.f174180b, dVar));
            mo244643a(dVar, arrayList, mo244645c(dVar));
        } else if (this.f174181c > dVar.mo244633b()) {
            mo244643a(dVar, arrayList, mo244640a(this.f174179a, dVar));
            mo244643a(dVar, arrayList, mo244644b(dVar));
        } else {
            mo244643a(dVar, arrayList, this.f174182d);
            mo244643a(dVar, arrayList, mo244640a(this.f174179a, dVar));
            mo244643a(dVar, arrayList, mo244640a(this.f174180b, dVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<AbstractC69733d> mo244640a(C69729b bVar, AbstractC69733d dVar) {
        if (bVar != null) {
            return bVar.mo244641a(dVar);
        }
        return Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<AbstractC69733d> mo244642a(AbstractC69733d dVar, EnumC69731a aVar) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC69733d dVar2 : this.f174182d) {
            int i = C697301.f174183a[aVar.ordinal()];
            if (i != 1) {
                if (i == 2 && dVar2.mo244633b() >= dVar.mo244632a()) {
                    arrayList.add(dVar2);
                }
            } else if (dVar2.mo244632a() <= dVar.mo244633b()) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo244643a(AbstractC69733d dVar, List<AbstractC69733d> list, List<AbstractC69733d> list2) {
        for (AbstractC69733d dVar2 : list2) {
            if (!dVar2.equals(dVar)) {
                list.add(dVar2);
            }
        }
    }
}
