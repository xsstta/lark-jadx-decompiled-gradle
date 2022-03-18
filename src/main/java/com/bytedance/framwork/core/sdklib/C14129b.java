package com.bytedance.framwork.core.sdklib;

import android.content.Context;
import com.bytedance.framwork.core.sdklib.p750a.C14128c;
import com.bytedance.framwork.core.sdklib.p751b.C14130a;
import com.bytedance.framwork.core.sdklib.p752c.AbstractC14136b;
import com.bytedance.framwork.core.sdklib.p752c.C14132a;
import com.bytedance.framwork.core.sdklib.p752c.C14138d;
import com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b;
import com.bytedance.framwork.core.sdklib.p753d.C14145c;
import com.bytedance.framwork.core.sdklib.util.C14155b;
import com.bytedance.framwork.core.sdklib.util.C14156c;
import com.google.firebase.messaging.Constants;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdklib.b */
public class C14129b implements AbstractC14144b {

    /* renamed from: a */
    private long f37120a;

    /* renamed from: b */
    private int f37121b = SmEvents.EVENT_NW;

    /* renamed from: c */
    private int f37122c = 100;

    /* renamed from: d */
    private C14131c f37123d;

    /* renamed from: e */
    private String f37124e;

    /* renamed from: f */
    private Context f37125f;

    /* renamed from: g */
    private JSONObject f37126g;

    /* renamed from: h */
    private volatile boolean f37127h = true;

    /* renamed from: i */
    private volatile boolean f37128i;

    /* renamed from: j */
    private long f37129j;

    /* renamed from: k */
    private long f37130k;

    /* renamed from: f */
    public void mo51914f() {
        this.f37128i = true;
    }

    /* renamed from: e */
    public void mo51913e() {
        this.f37127h = true;
        this.f37130k = 0;
    }

    /* renamed from: g */
    private long m57164g() {
        return (long) this.f37123d.mo51917a(this.f37124e);
    }

    /* renamed from: a */
    public void mo51907a() {
        C14145c.m57222a().mo51944a(this);
        String str = this.f37124e;
        C14138d.m57208a(str, new C14132a(this.f37125f, str));
    }

    /* renamed from: b */
    public int mo51910b() {
        return m57161b(2147483647L);
    }

    /* renamed from: d */
    public void mo51912d() {
        m57162b(C14128c.m57150a(this.f37124e));
        m57163c(C14128c.m57153b(this.f37124e));
        m57159a(C14128c.m57154c(this.f37124e));
        AbstractC14136b b = C14138d.m57211b(this.f37124e);
        if (b instanceof C14132a) {
            ((C14132a) b).mo51928c(null);
        }
    }

    /* renamed from: c */
    public boolean mo51911c() {
        List<C14130a> a = m57158a(this.f37122c);
        if (C14156c.m57242a(a)) {
            return true;
        }
        long j = -1;
        boolean z = false;
        try {
            JSONArray jSONArray = new JSONArray();
            LinkedList linkedList = new LinkedList();
            for (C14130a aVar : a) {
                long j2 = aVar.f37131a;
                if (j2 > j) {
                    j = j2;
                }
                String str = aVar.f37135e;
                linkedList.add(aVar);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("log_id", j2);
                    jSONObject.put("d_s_t", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
            z = m57160a(jSONArray, false);
            if (z) {
                m57161b(j);
            }
        } catch (Throwable unused2) {
        }
        return z;
    }

    /* renamed from: a */
    private void m57159a(JSONObject jSONObject) {
        this.f37126g = jSONObject;
    }

    /* renamed from: b */
    private void m57162b(int i) {
        if (i > 0) {
            this.f37121b = i;
        }
    }

    /* renamed from: c */
    private void m57163c(int i) {
        if (i > 0) {
            this.f37122c = i;
        }
    }

    /* renamed from: a */
    private List<C14130a> m57158a(int i) {
        return this.f37123d.mo51919a(Integer.parseInt(this.f37124e), i);
    }

    /* renamed from: b */
    private int m57161b(long j) {
        return this.f37123d.mo51918a(this.f37124e, j);
    }

    @Override // com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b
    public void onTimeEvent(long j) {
        long j2 = this.f37130k;
        if (j2 > 0 && j - this.f37129j > j2) {
            mo51913e();
        }
        mo51909a(false);
    }

    /* renamed from: a */
    public void mo51908a(long j) {
        this.f37127h = false;
        this.f37129j = System.currentTimeMillis();
        this.f37130k = j;
    }

    /* renamed from: a */
    public boolean mo51909a(boolean z) {
        if (!this.f37127h || this.f37128i) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long g = m57164g();
        if (g <= 0) {
            return true;
        }
        if (!z && g <= ((long) this.f37122c) && (currentTimeMillis - this.f37120a) / 1000 <= ((long) this.f37121b)) {
            return false;
        }
        this.f37120a = currentTimeMillis;
        return mo51911c();
    }

    public C14129b(Context context, String str) {
        this.f37125f = context;
        this.f37123d = C14131c.m57174a(context);
        this.f37124e = str;
    }

    /* renamed from: a */
    private boolean m57160a(JSONArray jSONArray, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (C14155b.m57240a(jSONArray)) {
                return false;
            }
            jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
            JSONObject jSONObject2 = this.f37126g;
            if (jSONObject2 == null) {
                return true;
            }
            jSONObject.put("header", jSONObject2);
            return C14138d.m57210a(this.f37124e, jSONObject.toString());
        } catch (Throwable unused) {
            return false;
        }
    }
}
