package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.applog.p197a.C3373e;
import com.bytedance.applog.util.C3460i;
import com.bytedance.applog.util.C3467p;
import com.bytedance.applog.util.C3469r;
import com.bytedance.applog.util.C3470s;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.location.LocationRequest;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.d */
public class C3408d {

    /* renamed from: a */
    static final HashMap<String, AbstractC3402b> f10793a = new HashMap<>();

    /* renamed from: b */
    static final C3410b[] f10794b = {new C3410b(), new C3410b(), new C3410b()};

    /* renamed from: e */
    private static final AbstractC3402b[] f10795e;

    /* renamed from: c */
    private final C3373e f10796c;

    /* renamed from: d */
    private final C3409a f10797d;

    /* renamed from: f */
    private String f10798f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.applog.e.d$b */
    public static class C3410b {

        /* renamed from: a */
        String f10799a;

        /* renamed from: b */
        int f10800b;

        /* renamed from: c */
        int f10801c;

        C3410b() {
        }

        /* renamed from: a */
        public static void m14280a() {
            C3410b[] bVarArr = C3408d.f10794b;
            for (C3410b bVar : bVarArr) {
                bVar.f10799a = "";
                bVar.f10800b = 0;
                bVar.f10801c = 0;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(this.f10801c);
            sb.append("-");
            sb.append(this.f10799a);
            sb.append("-");
            sb.append(this.f10800b);
            return sb.toString();
        }

        /* renamed from: a */
        public void mo13708a(AbstractC3402b bVar) {
            String i = bVar.mo13673i();
            if (i != null && i.length() > this.f10800b) {
                this.f10799a = bVar.mo13672h();
                this.f10800b = i.length();
            }
        }
    }

    /* renamed from: a */
    private boolean m14272a(String str) {
        C3469r.m14665a("needLaunch, " + this.f10798f + ", " + str);
        if (TextUtils.equals(str, this.f10798f)) {
            return false;
        }
        this.f10798f = str;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0181, code lost:
        com.bytedance.applog.util.C3469r.m14667a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        r28 = r8;
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0133, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0134, code lost:
        r28 = r8;
        r14 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015e, code lost:
        com.bytedance.applog.util.C3469r.m14667a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r14.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0169, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0175, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0176, code lost:
        com.bytedance.applog.util.C3469r.m14667a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r14.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0180, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0159 A[SYNTHETIC, Splitter:B:78:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164 A[SYNTHETIC, Splitter:B:83:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0171 A[SYNTHETIC, Splitter:B:92:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017c A[SYNTHETIC, Splitter:B:97:0x017c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.ArrayList<com.bytedance.applog.p201e.C3415i> mo13701a(org.json.JSONObject r31) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.mo13701a(org.json.JSONObject):java.util.ArrayList");
    }

    /* renamed from: a */
    private JSONObject m14267a(C3414h hVar, JSONObject jSONObject) {
        if (TextUtils.equals(hVar.f10814k, this.f10796c.mo13610d().mo13861d()) && hVar.f10813j == this.f10796c.mo13610d().mo13859c()) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            C3470s.m14681b(jSONObject2, jSONObject);
            jSONObject2.put("app_version", hVar.f10814k);
            jSONObject2.put("version_code", hVar.f10813j);
            return jSONObject2;
        } catch (JSONException e) {
            C3469r.m14667a(e);
            return jSONObject;
        }
    }

    /* renamed from: a */
    private void m14270a(JSONObject jSONObject, C3414h hVar, C3415i iVar, C3416j jVar, C3418l lVar, SQLiteDatabase sQLiteDatabase, JSONArray[] jSONArrayArr, long[] jArr) {
        boolean z;
        SQLiteDatabase sQLiteDatabase2;
        C3415i iVar2;
        SQLiteDatabase sQLiteDatabase3;
        C3469r.m14665a("packHistoryData, " + hVar.f10782d);
        JSONArray a = m14266a(hVar, true, lVar, jVar, sQLiteDatabase);
        hVar.f10815l = a.length() == 0;
        int a2 = m14259a(0, sQLiteDatabase, hVar.f10782d, true, jSONArrayArr, jArr);
        JSONArray a3 = m14265a(hVar);
        if (hVar.f10815l) {
            z = true;
            sQLiteDatabase2 = sQLiteDatabase;
            iVar2 = iVar;
            iVar.mo13712a(jSONObject, m14272a(hVar.f10782d) ? hVar : null, null, null, jSONArrayArr, jArr, a3);
        } else {
            sQLiteDatabase2 = sQLiteDatabase;
            iVar2 = iVar;
            z = true;
            iVar.mo13712a(jSONObject, null, lVar, a, jSONArrayArr, jArr, a3);
        }
        mo13702a(iVar2, z, sQLiteDatabase2, z);
        int i = a2;
        while (i < f10795e.length) {
            i = m14259a(i, sQLiteDatabase, hVar.f10782d, true, jSONArrayArr, jArr);
            if (m14273a(jArr)) {
                sQLiteDatabase3 = sQLiteDatabase2;
                iVar2 = iVar2;
                iVar.mo13712a(jSONObject, null, null, null, jSONArrayArr, jArr, null);
                mo13702a(iVar2, true, sQLiteDatabase3, true);
            } else {
                sQLiteDatabase3 = sQLiteDatabase2;
                iVar2 = iVar2;
            }
            sQLiteDatabase2 = sQLiteDatabase3;
        }
    }

    /* renamed from: a */
    private void m14271a(JSONObject jSONObject, C3414h hVar, C3418l lVar, C3416j jVar, C3415i iVar, SQLiteDatabase sQLiteDatabase, String str, JSONArray[] jSONArrayArr, long[] jArr) {
        long[] jArr2;
        SQLiteDatabase sQLiteDatabase2;
        C3415i iVar2;
        C3415i iVar3;
        SQLiteDatabase sQLiteDatabase3;
        C3469r.m14665a("packLostData, " + str);
        hVar.f10782d = str;
        iVar.f10782d = str;
        JSONArray a = m14266a(hVar, false, lVar, jVar, sQLiteDatabase);
        int a2 = m14259a(0, sQLiteDatabase, str, false, jSONArrayArr, jArr);
        hVar.f10815l = a.length() == 0;
        if (m14273a(jArr) || !hVar.f10815l) {
            JSONArray jSONArray = null;
            C3418l lVar2 = !hVar.f10815l ? lVar : null;
            if (!hVar.f10815l) {
                jSONArray = a;
            }
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            iVar2 = iVar;
            iVar.mo13712a(jSONObject, null, lVar2, jSONArray, jSONArrayArr, jArr, null);
            mo13702a(iVar2, false, sQLiteDatabase2, true);
        } else {
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase;
            iVar2 = iVar;
        }
        int i = a2;
        while (i < f10795e.length) {
            i = m14259a(i, sQLiteDatabase, str, false, jSONArrayArr, jArr);
            if (m14273a(jArr2)) {
                sQLiteDatabase3 = sQLiteDatabase2;
                iVar3 = iVar2;
                iVar.mo13712a(jSONObject, null, null, null, jSONArrayArr, jArr, null);
                mo13702a(iVar3, false, sQLiteDatabase3, true);
            } else {
                sQLiteDatabase3 = sQLiteDatabase2;
                iVar3 = iVar2;
            }
            jArr2 = jArr;
            sQLiteDatabase2 = sQLiteDatabase3;
            iVar2 = iVar3;
        }
    }

    /* renamed from: a */
    private JSONArray m14265a(C3414h hVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            C3467p.m14657a().mo13720a(hVar.f10779a, hVar.f10782d, jSONObject);
        } catch (Throwable th) {
            C3469r.m14667a(th);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("item_impression");
        if (optJSONArray != null && optJSONArray.length() == 0) {
            optJSONArray = null;
        }
        if (C3460i.m14618a()) {
            C3460i.m14616a("item_impression", optJSONArray);
        }
        return optJSONArray;
    }

    /* renamed from: a */
    public void mo13702a(C3415i iVar, boolean z, SQLiteDatabase sQLiteDatabase, boolean z2) {
        boolean z3;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = this.f10797d.getWritableDatabase();
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            try {
                sQLiteDatabase.beginTransaction();
            } catch (Throwable th) {
                if (z3) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e) {
                        C3469r.m14667a(e);
                    }
                }
                throw th;
            }
        }
        if (z2) {
            sQLiteDatabase.insert("pack", null, iVar.mo13663b((ContentValues) null));
        }
        if (iVar.f10821n > 0) {
            sQLiteDatabase.execSQL(m14262a("event", iVar.f10782d, z, iVar.f10821n));
        }
        if (iVar.f10823p > 0) {
            sQLiteDatabase.execSQL(m14262a("eventv3", iVar.f10782d, z, iVar.f10823p));
        }
        if (iVar.f10826s > 0) {
            sQLiteDatabase.execSQL(m14262a("event_misc", iVar.f10782d, z, iVar.f10826s));
        }
        if (z3) {
            sQLiteDatabase.setTransactionSuccessful();
        }
        if (z3) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                C3469r.m14667a(e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[DONT_GENERATE] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14268a(android.database.sqlite.SQLiteDatabase r8, java.lang.String r9, int r10, int r11, boolean r12, org.json.JSONArray[] r13, long[] r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.m14268a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, int, boolean, org.json.JSONArray[], long[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r12 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r12 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e7, code lost:
        if (r6.length() <= 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        if (r16 <= 1000) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        r24.f10838j = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        if (r23 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f3, code lost:
        r24.f10782d = r22.f10782d;
        r24.mo13660a(r22.f10780b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r24.f10782d = java.util.UUID.randomUUID().toString();
        r24.mo13660a(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010c, code lost:
        r24.f10783e = r22.f10783e;
        r24.f10784f = r22.f10784f;
        r24.f10785g = r22.f10785g;
        r24.f10839k = r24.f10780b + r9;
        r24.f10781c = com.bytedance.applog.p197a.C3378i.m14125e();
        r24.f10840l = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012b, code lost:
        if (android.text.TextUtils.isEmpty(r22.f10816m) != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        r24.f10840l = r22.f10816m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0136, code lost:
        if (android.text.TextUtils.isEmpty(r18) != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0138, code lost:
        r24.f10840l = r18;
        r24.f10784f = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013c, code lost:
        return r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray m14266a(com.bytedance.applog.p201e.C3414h r22, boolean r23, com.bytedance.applog.p201e.C3418l r24, com.bytedance.applog.p201e.C3416j r25, android.database.sqlite.SQLiteDatabase r26) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.m14266a(com.bytedance.applog.e.h, boolean, com.bytedance.applog.e.l, com.bytedance.applog.e.j, android.database.sqlite.SQLiteDatabase):org.json.JSONArray");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        com.bytedance.applog.util.C3469r.m14666a("queryPack, " + r0, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (r3 != null) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.bytedance.applog.p201e.C3415i> mo13700a() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, com.bytedance.applog.e.b> r1 = com.bytedance.applog.p201e.C3408d.f10793a
            java.lang.String r2 = "pack"
            java.lang.Object r1 = r1.get(r2)
            com.bytedance.applog.e.i r1 = (com.bytedance.applog.p201e.C3415i) r1
            r2 = 0
            com.bytedance.applog.e.d$a r3 = r5.f10797d     // Catch:{ all -> 0x0034 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "SELECT * FROM pack ORDER BY _id DESC LIMIT 8"
            android.database.Cursor r3 = r3.rawQuery(r4, r2)     // Catch:{ all -> 0x0034 }
        L_0x001c:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0032 }
            if (r4 == 0) goto L_0x002f
            com.bytedance.applog.e.b r1 = r1.clone()     // Catch:{ all -> 0x0032 }
            com.bytedance.applog.e.i r1 = (com.bytedance.applog.p201e.C3415i) r1     // Catch:{ all -> 0x0032 }
            r1.mo13658a(r3)     // Catch:{ all -> 0x0032 }
            r0.add(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x001c
        L_0x002f:
            if (r3 == 0) goto L_0x003e
            goto L_0x003b
        L_0x0032:
            r1 = move-exception
            goto L_0x0036
        L_0x0034:
            r1 = move-exception
            r3 = r2
        L_0x0036:
            com.bytedance.applog.util.C3469r.m14667a(r1)     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x003e
        L_0x003b:
            r3.close()
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "queryPack, "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.bytedance.applog.util.C3469r.m14666a(r1, r2)
            return r0
        L_0x0053:
            r0 = move-exception
            if (r3 == 0) goto L_0x0059
            r3.close()
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.mo13700a():java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13704a(java.util.ArrayList<com.bytedance.applog.p201e.C3415i> r10, java.util.ArrayList<com.bytedance.applog.p201e.C3415i> r11) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.mo13704a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a A[Catch:{ all -> 0x00e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1 A[Catch:{ all -> 0x0103 }, LOOP:2: B:47:0x00eb->B:49:0x00f1, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13703a(java.util.ArrayList<com.bytedance.applog.p201e.AbstractC3402b> r15) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.mo13703a(java.util.ArrayList):void");
    }

    static {
        m14269a(new C3416j());
        m14269a((AbstractC3402b) new C3414h());
        m14269a(new C3418l());
        m14269a(new C3415i());
        AbstractC3402b[] bVarArr = {new C3411e(), new C3413g(null, false, null), new C3412f("", new JSONObject())};
        f10795e = bVarArr;
        for (AbstractC3402b bVar : bVarArr) {
            m14269a(bVar);
        }
    }

    /* renamed from: a */
    private static void m14269a(AbstractC3402b bVar) {
        f10793a.put(bVar.mo13668d(), bVar);
    }

    /* renamed from: a */
    private boolean m14273a(long[] jArr) {
        if (jArr[0] > 0 || jArr[1] > 0 || jArr[2] > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.applog.e.d$a */
    public static class C3409a extends SQLiteOpenHelper {
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.beginTransaction();
                for (AbstractC3402b bVar : C3408d.f10793a.values()) {
                    String c = bVar.mo13666c();
                    if (c != null) {
                        sQLiteDatabase.execSQL(c);
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    C3469r.m14667a(e);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e2) {
                    C3469r.m14667a(e2);
                }
                throw th;
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            onUpgrade(sQLiteDatabase, i, i2);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            C3469r.m14670d("onUpgrade, " + i + ", " + i2, null);
            try {
                sQLiteDatabase.beginTransaction();
                Iterator<AbstractC3402b> it = C3408d.f10793a.values().iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next().mo13668d());
                }
                sQLiteDatabase.setTransactionSuccessful();
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e) {
                    C3469r.m14667a(e);
                }
            } catch (Throwable th) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e2) {
                    C3469r.m14667a(e2);
                }
                throw th;
            }
            onCreate(sQLiteDatabase);
        }

        C3409a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }
    }

    public C3408d(C3373e eVar, String str) {
        this.f10797d = new C3409a(eVar.mo13607b(), str, null, 36);
        this.f10796c = eVar;
    }

    /* renamed from: a */
    private String m14260a(long j, int i) {
        return "UPDATE pack SET _fail=" + i + " WHERE " + "_id" + ContainerUtils.KEY_VALUE_DELIMITER + j;
    }

    /* renamed from: b */
    private String m14274b(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM page WHERE session_id");
        if (z) {
            str2 = "='";
        } else {
            str2 = "!='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("'");
        return sb.toString();
    }

    /* renamed from: a */
    private String m14263a(String str, boolean z) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM page WHERE session_id");
        if (z) {
            str2 = "='";
        } else {
            str2 = "!='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' ORDER BY ");
        if (z) {
            str3 = "session_id,";
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append("duration");
        sb.append(" DESC LIMIT 500");
        return sb.toString();
    }

    /* renamed from: a */
    private String m14261a(AbstractC3402b bVar, String str, boolean z, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append(bVar.mo13668d());
        sb.append(" WHERE ");
        sb.append("session_id");
        if (z) {
            str2 = "='";
        } else {
            str2 = "!='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' ORDER BY ");
        sb.append("_id");
        sb.append(" LIMIT ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    private String m14262a(String str, String str2, boolean z, long j) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        sb.append(" WHERE ");
        sb.append("session_id");
        if (z) {
            str3 = "='";
        } else {
            str3 = "!='";
        }
        sb.append(str3);
        sb.append(str2);
        sb.append("' AND ");
        sb.append("_id");
        sb.append("<=");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    private int m14259a(int i, SQLiteDatabase sQLiteDatabase, String str, boolean z, JSONArray[] jSONArrayArr, long[] jArr) {
        C3410b.m14280a();
        int i2 = 0;
        while (i2 < i) {
            jSONArrayArr[i2] = null;
            jArr[i2] = 0;
            i2++;
        }
        int i3 = i2;
        int i4 = LocationRequest.PRIORITY_HD_ACCURACY;
        while (i4 > 0 && i3 < f10795e.length) {
            m14268a(sQLiteDatabase, str, i4, i3, z, jSONArrayArr, jArr);
            int length = jSONArrayArr[i3].length();
            i4 -= length;
            f10794b[i3].f10801c = length;
            if (i4 > 0) {
                i3++;
            }
        }
        for (int i5 = i3 + 1; i5 < jSONArrayArr.length; i5++) {
            jSONArrayArr[i5] = null;
            jArr[i5] = 0;
        }
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList<com.bytedance.applog.p201e.C3415i> m14264a(org.json.JSONObject r20, com.bytedance.applog.p201e.C3414h r21, com.bytedance.applog.p201e.C3415i r22, android.database.sqlite.SQLiteDatabase r23, org.json.JSONArray[] r24, long[] r25) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.applog.p201e.C3408d.m14264a(org.json.JSONObject, com.bytedance.applog.e.h, com.bytedance.applog.e.i, android.database.sqlite.SQLiteDatabase, org.json.JSONArray[], long[]):java.util.ArrayList");
    }
}
