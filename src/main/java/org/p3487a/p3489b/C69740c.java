package org.p3487a.p3489b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.p3487a.p3488a.C69732c;
import org.p3487a.p3489b.p3490a.AbstractC69738b;
import org.p3487a.p3489b.p3490a.C69737a;

/* renamed from: org.a.b.c */
public class C69740c {

    /* renamed from: a */
    public C69741d f174193a;

    /* renamed from: b */
    private C69739b f174194b;

    /* renamed from: a */
    public Collection<C69736a> mo244658a(CharSequence charSequence) {
        C69737a aVar = new C69737a();
        mo244659a(charSequence, aVar);
        List<C69736a> a = aVar.mo244653a();
        if (this.f174193a.mo244662c()) {
            m267677a(charSequence, a);
        }
        if (this.f174193a.mo244663d()) {
            m267680b(charSequence, a);
        }
        if (!this.f174193a.mo244661b()) {
            new C69732c(a).mo244646a(a);
        }
        return a;
    }

    /* renamed from: a */
    private C69739b m267676a(C69739b bVar, Character ch) {
        C69739b a = bVar.mo244656a(ch);
        while (a == null) {
            bVar = bVar.mo244657b();
            a = bVar.mo244656a(ch);
        }
        return a;
    }

    /* renamed from: a */
    private void m267677a(CharSequence charSequence, List<C69736a> list) {
        ArrayList<C69736a> arrayList = new ArrayList();
        for (C69736a aVar : list) {
            if (m267679a(charSequence, aVar)) {
                arrayList.add(aVar);
            }
        }
        for (C69736a aVar2 : arrayList) {
            list.remove(aVar2);
        }
    }

    /* renamed from: b */
    private void m267680b(CharSequence charSequence, List<C69736a> list) {
        long length = (long) charSequence.length();
        ArrayList<C69736a> arrayList = new ArrayList();
        for (C69736a aVar : list) {
            if ((aVar.mo244632a() != 0 && !Character.isWhitespace(charSequence.charAt(aVar.mo244632a() - 1))) || (((long) (aVar.mo244633b() + 1)) != length && !Character.isWhitespace(charSequence.charAt(aVar.mo244633b() + 1)))) {
                arrayList.add(aVar);
            }
        }
        for (C69736a aVar2 : arrayList) {
            list.remove(aVar2);
        }
    }

    /* renamed from: a */
    private boolean m267679a(CharSequence charSequence, C69736a aVar) {
        if (aVar.mo244632a() != 0 && Character.isAlphabetic(charSequence.charAt(aVar.mo244632a() - 1))) {
            return true;
        }
        if (aVar.mo244633b() + 1 == charSequence.length() || !Character.isAlphabetic(charSequence.charAt(aVar.mo244633b() + 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo244659a(CharSequence charSequence, AbstractC69738b bVar) {
        C69739b bVar2 = this.f174194b;
        for (int i = 0; i < charSequence.length(); i++) {
            Character valueOf = Character.valueOf(charSequence.charAt(i));
            if (this.f174193a.mo244664e()) {
                valueOf = Character.valueOf(Character.toLowerCase(valueOf.charValue()));
            }
            bVar2 = m267676a(bVar2, valueOf);
            if (m267678a(i, bVar2, bVar) && this.f174193a.mo244660a()) {
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m267678a(int i, C69739b bVar, AbstractC69738b bVar2) {
        Collection<String> a = bVar.mo244655a();
        boolean z = false;
        if (a != null && !a.isEmpty()) {
            for (String str : a) {
                bVar2.mo244654a(new C69736a((i - str.length()) + 1, i, str));
                z = true;
            }
        }
        return z;
    }
}
