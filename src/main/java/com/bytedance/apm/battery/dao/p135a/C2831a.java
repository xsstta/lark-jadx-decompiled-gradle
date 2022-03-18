package com.bytedance.apm.battery.dao.p135a;

import android.content.ContentValues;
import com.bytedance.apm.battery.dao.AbstractC2827a;
import com.bytedance.apm.p137c.C2878a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;

/* renamed from: com.bytedance.apm.battery.dao.a.a */
public class C2831a extends AbstractC2827a<C2878a> implements AbstractC2827a.AbstractC2829a<C2878a> {

    /* renamed from: a */
    private static volatile C2831a f9044a = null;

    /* renamed from: b */
    private static String f9045b = "_id <= ? ";

    /* renamed from: c */
    private static final String[] f9046c = {"_id", "front", ShareHitPoint.f121869d, "timestamp", "accumulation", "version_id", ShareHitPoint.f121868c, UpdateKey.STATUS, "scene", "process", "main_process", "sid"};

    /* renamed from: d */
    private static String f9047d = "main_process = 1 AND delete_flag = 0";

    /* renamed from: e */
    private static String f9048e = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    @Override // com.bytedance.apm.battery.dao.AbstractC2827a
    /* renamed from: b */
    public String mo12200b() {
        return "t_battery";
    }

    private C2831a() {
    }

    @Override // com.bytedance.apm.battery.dao.AbstractC2827a
    /* renamed from: c */
    public String[] mo12201c() {
        return f9046c;
    }

    /* renamed from: e */
    public static C2831a m11977e() {
        if (f9044a == null) {
            synchronized (C2831a.class) {
                if (f9044a == null) {
                    f9044a = new C2831a();
                }
            }
        }
        return f9044a;
    }

    /* renamed from: a */
    public synchronized void mo12209a(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        mo12196a(contentValues, f9045b, new String[]{String.valueOf(j)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo12207a(com.bytedance.apm.p137c.C2878a r10) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.battery.dao.p135a.C2831a.mo12207a(com.bytedance.apm.c.a):long");
    }

    /* renamed from: b */
    public C2878a mo12203a(AbstractC2827a.C2830b bVar) {
        boolean z;
        boolean z2;
        long a = bVar.mo12204a("_id");
        long a2 = bVar.mo12204a("front");
        String c = bVar.mo12206c(ShareHitPoint.f121869d);
        long a3 = bVar.mo12204a("timestamp");
        long a4 = bVar.mo12204a("accumulation");
        long a5 = bVar.mo12204a("version_id");
        String c2 = bVar.mo12206c(ShareHitPoint.f121868c);
        long a6 = bVar.mo12204a(UpdateKey.STATUS);
        String c3 = bVar.mo12206c("scene");
        int b = bVar.mo12205b("main_process");
        String c4 = bVar.mo12206c("process");
        if (a2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C2878a aVar = new C2878a(z, a3, c, z2, c3, a4, c2);
        aVar.mo12340b(c4);
        aVar.mo12339b(a);
        aVar.mo12335a(a5);
        boolean z3 = true;
        if (b != 1) {
            z3 = false;
        }
        aVar.mo12337a(z3);
        aVar.mo12343c(bVar.mo12206c("sid"));
        return aVar;
    }

    /* renamed from: a */
    public synchronized List<C2878a> mo12208a(boolean z, long j) {
        List<C2878a> list;
        if (z) {
            list = mo12199a(f9047d, null, "_id", this);
        } else {
            list = mo12199a(f9048e, new String[]{String.valueOf(j)}, "_id", this);
        }
        return list;
    }
}
