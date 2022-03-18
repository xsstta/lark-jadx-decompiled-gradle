package org.p3487a.p3488a;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* renamed from: org.a.a.c */
public class C69732c {

    /* renamed from: a */
    private C69729b f174185a;

    /* renamed from: a */
    public List<AbstractC69733d> mo244647a(AbstractC69733d dVar) {
        return this.f174185a.mo244641a(dVar);
    }

    public C69732c(List<AbstractC69733d> list) {
        this.f174185a = new C69729b(list);
    }

    /* renamed from: a */
    public List<AbstractC69733d> mo244646a(List<AbstractC69733d> list) {
        Collections.sort(list, new C69735f());
        TreeSet<AbstractC69733d> treeSet = new TreeSet();
        for (AbstractC69733d dVar : list) {
            if (!treeSet.contains(dVar)) {
                treeSet.addAll(mo244647a(dVar));
            }
        }
        for (AbstractC69733d dVar2 : treeSet) {
            list.remove(dVar2);
        }
        Collections.sort(list, new C69734e());
        return list;
    }
}
