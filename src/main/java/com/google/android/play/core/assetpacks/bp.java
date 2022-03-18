package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.cg;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* access modifiers changed from: package-private */
public final class bp {

    /* renamed from: a */
    private static final C22630b f55792a = new C22630b("ExtractorSessionStoreView");

    /* renamed from: b */
    private final C22614x f55793b;

    /* renamed from: c */
    private final AbstractC22633by<dl> f55794c;

    /* renamed from: d */
    private final bb f55795d;

    /* renamed from: e */
    private final AbstractC22633by<Executor> f55796e;

    /* renamed from: f */
    private final Map<Integer, C22588bm> f55797f = new HashMap();

    /* renamed from: g */
    private final ReentrantLock f55798g = new ReentrantLock();

    bp(C22614x xVar, AbstractC22633by<dl> byVar, bb bbVar, AbstractC22633by<Executor> byVar2) {
        this.f55793b = xVar;
        this.f55794c = byVar;
        this.f55795d = bbVar;
        this.f55796e = byVar2;
    }

    /* renamed from: a */
    private final <T> T m82019a(bo<T> boVar) {
        try {
            mo78762a();
            return boVar.mo78760a();
        } finally {
            mo78766b();
        }
    }

    /* renamed from: b */
    private final Map<String, C22588bm> m82020b(List<String> list) {
        return (Map) m82019a(new bh(this, list));
    }

    /* renamed from: c */
    private static <T> List<T> m82021c(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private final C22588bm m82022e(int i) {
        Map<Integer, C22588bm> map = this.f55797f;
        Integer valueOf = Integer.valueOf(i);
        C22588bm bmVar = map.get(valueOf);
        if (bmVar != null) {
            return bmVar;
        }
        throw new ay(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    /* renamed from: e */
    private static String m82023e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new ay("Session without pack received.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Map mo78761a(List list) {
        HashMap hashMap = new HashMap();
        for (C22588bm bmVar : this.f55797f.values()) {
            String str = bmVar.f55785c.f55778a;
            if (list.contains(str)) {
                C22588bm bmVar2 = (C22588bm) hashMap.get(str);
                if ((bmVar2 != null ? bmVar2.f55783a : -1) < bmVar.f55783a) {
                    hashMap.put(str, bmVar);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78762a() {
        this.f55798g.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78763a(int i) {
        m82019a(new bj(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78764a(String str, int i, long j) {
        m82019a(new C22587bg(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo78765a(Bundle bundle) {
        return ((Boolean) m82019a(new be(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78766b() {
        this.f55798g.unlock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo78767b(int i) {
        m82022e(i).f55785c.f55780c = 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo78768b(String str, int i, long j) {
        C22588bm bmVar = m82020b(Arrays.asList(str)).get(str);
        if (bmVar == null || bz.m82063b(bmVar.f55785c.f55780c)) {
            f55792a.mo78873b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f55793b.mo78845f(str, i, j);
        bmVar.f55785c.f55780c = 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo78769b(Bundle bundle) {
        return ((Boolean) m82019a(new bf(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Boolean mo78770c(Bundle bundle) {
        boolean z;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return true;
        }
        Map<Integer, C22588bm> map = this.f55797f;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return true;
        }
        C22588bm bmVar = this.f55797f.get(valueOf);
        if (bmVar.f55785c.f55780c == 6) {
            z = false;
        } else {
            z = !bz.m82061a(bmVar.f55785c.f55780c, bundle.getInt(cg.m82391a(UpdateKey.STATUS, m82023e(bundle))));
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<Integer, C22588bm> mo78771c() {
        return this.f55797f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo78772c(int i) {
        C22588bm e = m82022e(i);
        if (bz.m82063b(e.f55785c.f55780c)) {
            C22614x xVar = this.f55793b;
            bl blVar = e.f55785c;
            xVar.mo78845f(blVar.f55778a, e.f55784b, blVar.f55779b);
            bl blVar2 = e.f55785c;
            int i2 = blVar2.f55780c;
            if (i2 == 5 || i2 == 6) {
                this.f55793b.mo78836c(blVar2.f55778a);
                return;
            }
            return;
        }
        throw new ay(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Boolean mo78773d(Bundle bundle) {
        int i = bundle.getInt("session_id");
        boolean z = false;
        if (i == 0) {
            return false;
        }
        Map<Integer, C22588bm> map = this.f55797f;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C22588bm e = m82022e(i);
            int i2 = bundle.getInt(cg.m82391a(UpdateKey.STATUS, e.f55785c.f55778a));
            if (bz.m82061a(e.f55785c.f55780c, i2)) {
                f55792a.mo78871a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(e.f55785c.f55780c));
                bl blVar = e.f55785c;
                String str = blVar.f55778a;
                int i3 = blVar.f55780c;
                if (i3 == 4) {
                    this.f55794c.mo78909a().mo78782a(i, str);
                } else if (i3 == 5) {
                    this.f55794c.mo78909a().mo78781a(i);
                } else if (i3 == 6) {
                    this.f55794c.mo78909a().mo78785a(Arrays.asList(str));
                }
            } else {
                e.f55785c.f55780c = i2;
                if (bz.m82063b(i2)) {
                    mo78763a(i);
                    this.f55795d.mo78758a(e.f55785c.f55778a);
                } else {
                    List<bn> list = e.f55785c.f55782e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bn bnVar = list.get(i4);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(cg.m82392a("chunk_intents", e.f55785c.f55778a, bnVar.f55786a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    bnVar.f55789d.get(i5).f55777a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String e2 = m82023e(bundle);
            long j = bundle.getLong(cg.m82391a("pack_version", e2));
            int i6 = bundle.getInt(cg.m82391a(UpdateKey.STATUS, e2));
            long j2 = bundle.getLong(cg.m82391a("total_bytes_to_download", e2));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(cg.m82391a("slice_ids", e2));
            ArrayList arrayList = new ArrayList();
            Iterator it = m82021c(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(cg.m82392a("chunk_intents", e2, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m82021c(parcelableArrayList2)) {
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new bk(z));
                    it = it;
                    z = false;
                }
                String string = bundle.getString(cg.m82392a("uncompressed_hash_sha256", e2, str2));
                long j3 = bundle.getLong(cg.m82392a("uncompressed_size", e2, str2));
                int i7 = bundle.getInt(cg.m82392a("patch_format", e2, str2), 0);
                arrayList.add(i7 == 0 ? new bn(str2, string, j3, arrayList2, bundle.getInt(cg.m82392a("compression_format", e2, str2), 0), 0) : new bn(str2, string, j3, arrayList2, 0, i7));
                it = it;
                z = false;
            }
            this.f55797f.put(Integer.valueOf(i), new C22588bm(i, bundle.getInt("app_version_code"), new bl(e2, j, i6, j2, arrayList)));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo78774d(int i) {
        m82019a(new bi(this, i));
    }
}
