package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C22630b;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final class bs {

    /* renamed from: a */
    private static final C22630b f55805a = new C22630b("ExtractorTaskFinder");

    /* renamed from: b */
    private final bp f55806b;

    /* renamed from: c */
    private final C22614x f55807c;

    /* renamed from: d */
    private final C22582ag f55808d;

    bs(bp bpVar, C22614x xVar, C22582ag agVar) {
        this.f55806b = bpVar;
        this.f55807c = xVar;
        this.f55808d = agVar;
    }

    /* renamed from: a */
    private final boolean m82039a(C22588bm bmVar, bn bnVar) {
        C22614x xVar = this.f55807c;
        bl blVar = bmVar.f55785c;
        return xVar.mo78843e(blVar.f55778a, bmVar.f55784b, blVar.f55779b, bnVar.f55786a).exists();
    }

    /* renamed from: a */
    private static boolean m82040a(bn bnVar) {
        int i = bnVar.f55791f;
        return i == 1 || i == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final br mo78775a() {
        char c;
        br brVar;
        char c2;
        av avVar;
        cj cjVar;
        int i;
        try {
            this.f55806b.mo78762a();
            ArrayList arrayList = new ArrayList();
            for (C22588bm bmVar : this.f55806b.mo78771c().values()) {
                if (bz.m82064c(bmVar.f55785c.f55780c)) {
                    arrayList.add(bmVar);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    c = 0;
                    if (!it.hasNext()) {
                        brVar = null;
                        break;
                    }
                    C22588bm bmVar2 = (C22588bm) it.next();
                    try {
                        C22614x xVar = this.f55807c;
                        bl blVar = bmVar2.f55785c;
                        if (xVar.mo78838d(blVar.f55778a, bmVar2.f55784b, blVar.f55779b) == bmVar2.f55785c.f55782e.size()) {
                            f55805a.mo78871a("Found final move task for session %s with pack %s.", Integer.valueOf(bmVar2.f55783a), bmVar2.f55785c.f55778a);
                            int i2 = bmVar2.f55783a;
                            bl blVar2 = bmVar2.f55785c;
                            brVar = new cd(i2, blVar2.f55778a, bmVar2.f55784b, blVar2.f55779b);
                            break;
                        }
                    } catch (IOException e) {
                        throw new ay(String.format("Failed to check number of completed merges for session %s, pack %s", Integer.valueOf(bmVar2.f55783a), bmVar2.f55785c.f55778a), e, bmVar2.f55783a);
                    }
                }
                if (brVar == null) {
                    Iterator it2 = arrayList.iterator();
                    loop2:
                    while (true) {
                        c2 = 3;
                        if (!it2.hasNext()) {
                            brVar = null;
                            break;
                        }
                        C22588bm bmVar3 = (C22588bm) it2.next();
                        if (bz.m82064c(bmVar3.f55785c.f55780c)) {
                            for (bn bnVar : bmVar3.f55785c.f55782e) {
                                C22614x xVar2 = this.f55807c;
                                bl blVar3 = bmVar3.f55785c;
                                if (xVar2.mo78830b(blVar3.f55778a, bmVar3.f55784b, blVar3.f55779b, bnVar.f55786a).exists()) {
                                    f55805a.mo78871a("Found merge task for session %s with pack %s and slice %s.", Integer.valueOf(bmVar3.f55783a), bmVar3.f55785c.f55778a, bnVar.f55786a);
                                    int i3 = bmVar3.f55783a;
                                    bl blVar4 = bmVar3.f55785c;
                                    brVar = new ca(i3, blVar4.f55778a, bmVar3.f55784b, blVar4.f55779b, bnVar.f55786a);
                                    break loop2;
                                }
                            }
                            continue;
                        }
                    }
                    if (brVar == null) {
                        Iterator it3 = arrayList.iterator();
                        loop4:
                        while (true) {
                            if (!it3.hasNext()) {
                                brVar = null;
                                break;
                            }
                            C22588bm bmVar4 = (C22588bm) it3.next();
                            if (bz.m82064c(bmVar4.f55785c.f55780c)) {
                                for (bn bnVar2 : bmVar4.f55785c.f55782e) {
                                    C22614x xVar3 = this.f55807c;
                                    bl blVar5 = bmVar4.f55785c;
                                    if (new cn(xVar3, blVar5.f55778a, bmVar4.f55784b, blVar5.f55779b, bnVar2.f55786a).mo78803d()) {
                                        C22614x xVar4 = this.f55807c;
                                        bl blVar6 = bmVar4.f55785c;
                                        if (xVar4.mo78825a(blVar6.f55778a, bmVar4.f55784b, blVar6.f55779b, bnVar2.f55786a).exists()) {
                                            f55805a.mo78871a("Found verify task for session %s with pack %s and slice %s.", Integer.valueOf(bmVar4.f55783a), bmVar4.f55785c.f55778a, bnVar2.f55786a);
                                            int i4 = bmVar4.f55783a;
                                            bl blVar7 = bmVar4.f55785c;
                                            String str = blVar7.f55778a;
                                            int i5 = bmVar4.f55784b;
                                            long j = blVar7.f55779b;
                                            String str2 = bnVar2.f55786a;
                                            String str3 = bnVar2.f55787b;
                                            long j2 = bnVar2.f55788c;
                                            brVar = new cq(i4, str, i5, j, str2, str3);
                                            break loop4;
                                        }
                                    }
                                }
                                continue;
                            }
                        }
                        if (brVar == null) {
                            Iterator it4 = arrayList.iterator();
                            loop6:
                            while (true) {
                                if (!it4.hasNext()) {
                                    avVar = null;
                                    break;
                                }
                                C22588bm bmVar5 = (C22588bm) it4.next();
                                if (bz.m82064c(bmVar5.f55785c.f55780c)) {
                                    for (bn bnVar3 : bmVar5.f55785c.f55782e) {
                                        if (!m82040a(bnVar3)) {
                                            C22614x xVar5 = this.f55807c;
                                            bl blVar8 = bmVar5.f55785c;
                                            try {
                                                i = new cn(xVar5, blVar8.f55778a, bmVar5.f55784b, blVar8.f55779b, bnVar3.f55786a).mo78802c();
                                            } catch (IOException e2) {
                                                C22630b bVar = f55805a;
                                                Object[] objArr = new Object[1];
                                                objArr[c] = e2;
                                                bVar.mo78873b("Slice checkpoint corrupt, restarting extraction. %s", objArr);
                                                i = 0;
                                            }
                                            if (i != -1 && bnVar3.f55789d.get(i).f55777a) {
                                                C22630b bVar2 = f55805a;
                                                Object[] objArr2 = new Object[5];
                                                objArr2[c] = Integer.valueOf(bnVar3.f55790e);
                                                objArr2[1] = Integer.valueOf(bmVar5.f55783a);
                                                objArr2[2] = bmVar5.f55785c.f55778a;
                                                objArr2[c2] = bnVar3.f55786a;
                                                objArr2[4] = Integer.valueOf(i);
                                                bVar2.mo78871a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", objArr2);
                                                InputStream a = this.f55808d.mo78727a(bmVar5.f55783a, bmVar5.f55785c.f55778a, bnVar3.f55786a, i);
                                                int i6 = bmVar5.f55783a;
                                                bl blVar9 = bmVar5.f55785c;
                                                String str4 = blVar9.f55778a;
                                                int i7 = bmVar5.f55784b;
                                                long j3 = blVar9.f55779b;
                                                String str5 = bnVar3.f55786a;
                                                int i8 = bnVar3.f55790e;
                                                int size = bnVar3.f55789d.size();
                                                bl blVar10 = bmVar5.f55785c;
                                                avVar = new av(i6, str4, i7, j3, str5, i8, i, size, blVar10.f55781d, blVar10.f55780c, a);
                                                break loop6;
                                            }
                                            it4 = it4;
                                        } else if (m82039a(bmVar5, bnVar3)) {
                                            f55805a.mo78871a("Found extraction task for patch for session %s, pack %s, slice %s.", Integer.valueOf(bmVar5.f55783a), bmVar5.f55785c.f55778a, bnVar3.f55786a);
                                            try {
                                                C22614x xVar6 = this.f55807c;
                                                bl blVar11 = bmVar5.f55785c;
                                                FileInputStream fileInputStream = new FileInputStream(xVar6.mo78843e(blVar11.f55778a, bmVar5.f55784b, blVar11.f55779b, bnVar3.f55786a));
                                                int i9 = bmVar5.f55783a;
                                                bl blVar12 = bmVar5.f55785c;
                                                avVar = new av(i9, blVar12.f55778a, bmVar5.f55784b, blVar12.f55779b, bnVar3.f55786a, 0, 0, 1, blVar12.f55781d, blVar12.f55780c, fileInputStream);
                                                break loop6;
                                            } catch (FileNotFoundException e3) {
                                                throw new ay(String.format("Error finding patch, session %s packName %s sliceId %s", Integer.valueOf(bmVar5.f55783a), bmVar5.f55785c.f55778a, bnVar3.f55786a), e3, bmVar5.f55783a);
                                            }
                                        } else {
                                            it4 = it4;
                                            c = 0;
                                            c2 = 3;
                                        }
                                    }
                                    continue;
                                }
                            }
                            if (avVar == null) {
                                Iterator it5 = arrayList.iterator();
                                loop8:
                                while (true) {
                                    if (!it5.hasNext()) {
                                        cjVar = null;
                                        break;
                                    }
                                    C22588bm bmVar6 = (C22588bm) it5.next();
                                    if (bz.m82064c(bmVar6.f55785c.f55780c)) {
                                        for (bn bnVar4 : bmVar6.f55785c.f55782e) {
                                            if (m82040a(bnVar4) && bnVar4.f55789d.get(0).f55777a && !m82039a(bmVar6, bnVar4)) {
                                                f55805a.mo78871a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", Integer.valueOf(bnVar4.f55791f), Integer.valueOf(bmVar6.f55783a), bmVar6.f55785c.f55778a, bnVar4.f55786a);
                                                InputStream a2 = this.f55808d.mo78727a(bmVar6.f55783a, bmVar6.f55785c.f55778a, bnVar4.f55786a, 0);
                                                int i10 = bmVar6.f55783a;
                                                String str6 = bmVar6.f55785c.f55778a;
                                                cjVar = new cj(i10, str6, this.f55807c.mo78837d(str6), this.f55807c.mo78841e(bmVar6.f55785c.f55778a), bmVar6.f55784b, bmVar6.f55785c.f55779b, bnVar4.f55791f, bnVar4.f55786a, bnVar4.f55788c, a2);
                                                break loop8;
                                            }
                                        }
                                        continue;
                                    }
                                }
                                if (cjVar == null) {
                                    return null;
                                }
                                return cjVar;
                            }
                            this.f55806b.mo78766b();
                            return avVar;
                        }
                    }
                }
                this.f55806b.mo78766b();
                return brVar;
            }
            this.f55806b.mo78766b();
            return null;
        } finally {
            this.f55806b.mo78766b();
        }
    }
}
