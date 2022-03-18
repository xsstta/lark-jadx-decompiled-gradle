package com.bytedance.applog.p201e;

import android.content.ContentValues;
import android.database.Cursor;
import com.bytedance.applog.C3368a;
import com.bytedance.applog.p200d.C3396a;
import com.bytedance.applog.util.C3458g;
import com.bytedance.applog.util.C3469r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.e.i */
public class C3415i extends AbstractC3402b {

    /* renamed from: j */
    public byte[] f10817j;

    /* renamed from: k */
    int f10818k;

    /* renamed from: l */
    public int f10819l;

    /* renamed from: m */
    JSONArray f10820m;

    /* renamed from: n */
    long f10821n;

    /* renamed from: o */
    JSONArray f10822o;

    /* renamed from: p */
    long f10823p;

    /* renamed from: q */
    C3414h f10824q;

    /* renamed from: r */
    JSONArray f10825r;

    /* renamed from: s */
    long f10826s;

    /* renamed from: t */
    private JSONArray f10827t;

    /* renamed from: u */
    private C3418l f10828u;

    /* renamed from: v */
    private JSONObject f10829v;

    /* renamed from: w */
    private JSONArray f10830w;

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: d */
    public String mo13668d() {
        return "pack";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: h */
    public String mo13672h() {
        return String.valueOf(this.f10779a);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public List<String> mo13659a() {
        return Arrays.asList("_id", "integer primary key autoincrement", "local_time_ms", "integer", "_data", "blob", "_fail", "integer");
    }

    /* renamed from: j */
    public byte[] mo13713j() {
        this.f10817j = null;
        try {
            byte[] a = C3458g.m14603a(mo13670f().toString());
            this.f10817j = a;
            return a;
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < C3408d.f10794b.length; i++) {
                if (C3408d.f10794b[i] != null) {
                    sb.append(C3408d.f10794b[i].toString());
                    sb.append(";");
                }
            }
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public JSONObject mo13665b() throws JSONException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("magic_tag", "ss_app_log");
        jSONObject.put("header", this.f10829v);
        jSONObject.put("time_sync", C3396a.f10761a);
        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
        if (this.f10824q != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f10824q.mo13670f());
            jSONObject.put("launch", jSONArray);
        }
        C3418l lVar = this.f10828u;
        int i6 = 0;
        if (lVar != null) {
            JSONObject f = lVar.mo13670f();
            JSONArray jSONArray2 = this.f10827t;
            if (jSONArray2 != null) {
                i5 = jSONArray2.length();
            } else {
                i5 = 0;
            }
            JSONArray jSONArray3 = new JSONArray();
            for (int i7 = 0; i7 < i5; i7++) {
                JSONArray jSONArray4 = new JSONArray();
                JSONObject jSONObject2 = new JSONObject(new JSONObject(this.f10827t.optString(i7)).optString("params"));
                jSONArray4.put(0, jSONObject2.optString("page_key", ""));
                jSONArray4.put(1, (jSONObject2.optInt("duration", 0) + 999) / 1000);
                jSONArray3.put(jSONArray4);
            }
            if (i5 > 0) {
                f.put("activites", jSONArray3);
            }
            if (C3368a.f10664a > 0) {
                f.put("launch_from", C3368a.f10664a);
                C3368a.f10664a = 0;
            }
            JSONArray jSONArray5 = new JSONArray();
            jSONArray5.put(f);
            jSONObject.put("terminate", jSONArray5);
        }
        JSONArray jSONArray6 = this.f10820m;
        if (jSONArray6 != null) {
            i = jSONArray6.length();
        } else {
            i = 0;
        }
        if (i > 0) {
            jSONObject.put("event", this.f10820m);
        }
        JSONArray jSONArray7 = this.f10827t;
        if (jSONArray7 != null) {
            i2 = jSONArray7.length();
        } else {
            i2 = 0;
        }
        JSONArray jSONArray8 = this.f10822o;
        if (jSONArray8 != null) {
            i3 = jSONArray8.length();
        } else {
            i3 = 0;
        }
        if (i3 > 0) {
            jSONObject.put("event_v3", this.f10822o);
        }
        JSONArray jSONArray9 = this.f10825r;
        if (jSONArray9 != null) {
            i4 = jSONArray9.length();
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            jSONObject.put("log_data", this.f10825r);
        }
        JSONArray jSONArray10 = this.f10830w;
        if (jSONArray10 != null) {
            i6 = jSONArray10.length();
        }
        if (i6 > 0) {
            jSONObject.put("item_impression", this.f10830w);
        }
        StringBuilder sb = new StringBuilder("pack {");
        sb.append("ts:");
        sb.append(this.f10780b);
        sb.append(", la:");
        Object obj = this.f10824q;
        Object obj2 = "0";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(", te:");
        C3418l lVar2 = this.f10828u;
        if (lVar2 != null) {
            obj2 = lVar2;
        }
        sb.append(obj2);
        sb.append(", p:");
        sb.append(i2);
        sb.append(", v1:");
        sb.append(i);
        sb.append(", v3:");
        sb.append(i3);
        sb.append(", m:");
        sb.append(i4);
        sb.append(", imp:");
        sb.append(i6);
        sb.append("}");
        C3469r.m14665a(sb.toString());
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13662a(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: b */
    public AbstractC3402b mo13664b(JSONObject jSONObject) {
        C3469r.m14667a((Throwable) null);
        return null;
    }

    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public int mo13658a(Cursor cursor) {
        this.f10779a = cursor.getLong(0);
        this.f10780b = cursor.getLong(1);
        this.f10817j = cursor.getBlob(2);
        this.f10818k = cursor.getInt(3);
        this.f10782d = "";
        this.f10829v = null;
        this.f10824q = null;
        this.f10828u = null;
        this.f10827t = null;
        this.f10820m = null;
        this.f10822o = null;
        this.f10825r = null;
        this.f10830w = null;
        return 4;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p201e.AbstractC3402b
    /* renamed from: a */
    public void mo13661a(ContentValues contentValues) {
        contentValues.put("local_time_ms", Long.valueOf(this.f10780b));
        contentValues.put("_data", mo13713j());
    }

    /* renamed from: a */
    public static byte[] m14319a(ArrayList<AbstractC3402b> arrayList, JSONObject jSONObject) {
        try {
            C3415i iVar = new C3415i();
            JSONArray[] jSONArrayArr = {new JSONArray(), new JSONArray(), null};
            long[] jArr = new long[3];
            Iterator<AbstractC3402b> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3402b next = it.next();
                if ("event".equals(next.mo13668d())) {
                    jSONArrayArr[0].put(next.mo13665b());
                } else if ("eventv3".equals(next.mo13668d())) {
                    jSONArrayArr[1].put(next.mo13665b());
                }
            }
            iVar.mo13712a(jSONObject, null, null, null, jSONArrayArr, jArr, null);
            return iVar.mo13670f().toString().getBytes();
        } catch (JSONException e) {
            C3469r.m14667a(e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13712a(JSONObject jSONObject, C3414h hVar, C3418l lVar, JSONArray jSONArray, JSONArray[] jSONArrayArr, long[] jArr, JSONArray jSONArray2) {
        mo13660a(0);
        this.f10829v = jSONObject;
        this.f10824q = hVar;
        this.f10828u = lVar;
        this.f10827t = jSONArray;
        this.f10820m = jSONArrayArr[0];
        this.f10821n = jArr[0];
        this.f10822o = jSONArrayArr[1];
        this.f10823p = jArr[1];
        this.f10825r = jSONArrayArr[2];
        this.f10826s = jArr[2];
        this.f10830w = jSONArray2;
    }
}
