package com.ss.android.appcenter.engine.vlayout;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.ss.android.appcenter.engine.vlayout.i */
public class C28289i extends AbstractC28281d {

    /* renamed from: a */
    private List<C28291a> f71040a = new LinkedList();

    /* renamed from: b */
    private List<AbstractC28280c> f71041b = new LinkedList();

    /* renamed from: c */
    private List<AbstractC28280c> f71042c = new LinkedList();

    /* renamed from: d */
    private C28291a[] f71043d = null;

    /* renamed from: e */
    private Comparator<C28291a> f71044e = new Comparator<C28291a>() {
        /* class com.ss.android.appcenter.engine.vlayout.C28289i.C282901 */

        /* renamed from: a */
        public int compare(C28291a aVar, C28291a aVar2) {
            return aVar.mo100818a() - aVar2.mo100818a();
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28281d
    /* renamed from: a */
    public List<AbstractC28280c> mo100779a() {
        return this.f71041b;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28281d
    /* renamed from: b */
    public List<AbstractC28280c> mo100781b() {
        return this.f71042c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.appcenter.engine.vlayout.i$a */
    public static class C28291a {

        /* renamed from: a */
        AbstractC28280c f71046a;

        /* renamed from: a */
        public int mo100818a() {
            return this.f71046a.mo100772a().mo100809a().intValue();
        }

        /* renamed from: b */
        public int mo100819b() {
            return this.f71046a.mo100772a().mo100812b().intValue();
        }

        C28291a(AbstractC28280c cVar) {
            this.f71046a = cVar;
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28281d
    /* renamed from: a */
    public AbstractC28280c mo100778a(int i) {
        C28291a aVar;
        C28291a[] aVarArr = this.f71043d;
        if (aVarArr == null || aVarArr.length == 0) {
            return null;
        }
        int i2 = 0;
        int length = aVarArr.length - 1;
        while (true) {
            if (i2 > length) {
                aVar = null;
                break;
            }
            int i3 = (i2 + length) / 2;
            aVar = this.f71043d[i3];
            if (aVar.mo100818a() <= i) {
                if (aVar.mo100819b() >= i) {
                    if (aVar.mo100818a() <= i && aVar.mo100819b() >= i) {
                        break;
                    }
                } else {
                    i2 = i3 + 1;
                }
            } else {
                length = i3 - 1;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f71046a;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28281d
    /* renamed from: a */
    public void mo100780a(List<AbstractC28280c> list) {
        this.f71041b.clear();
        this.f71042c.clear();
        this.f71040a.clear();
        if (list != null) {
            ListIterator<AbstractC28280c> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                AbstractC28280c next = listIterator.next();
                this.f71041b.add(next);
                this.f71040a.add(new C28291a(next));
            }
            while (listIterator.hasPrevious()) {
                this.f71042c.add(listIterator.previous());
            }
            List<C28291a> list2 = this.f71040a;
            C28291a[] aVarArr = (C28291a[]) list2.toArray(new C28291a[list2.size()]);
            this.f71043d = aVarArr;
            Arrays.sort(aVarArr, this.f71044e);
        }
    }
}
