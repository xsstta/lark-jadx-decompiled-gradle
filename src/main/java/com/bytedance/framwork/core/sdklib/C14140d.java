package com.bytedance.framwork.core.sdklib;

import android.content.Context;
import com.bytedance.framwork.core.sdklib.p751b.C14130a;
import com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b;
import com.bytedance.framwork.core.sdklib.p753d.C14141a;
import com.bytedance.framwork.core.sdklib.util.C14156c;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.bytedance.framwork.core.sdklib.d */
public class C14140d implements AbstractC14144b {

    /* renamed from: a */
    private C14131c f37170a;

    /* renamed from: b */
    private final LinkedList<C14130a> f37171b = new LinkedList<>();

    /* renamed from: c */
    private final int f37172c = 5;

    /* renamed from: d */
    private long f37173d = 0;

    /* renamed from: e */
    private final int f37174e = 120000;

    /* renamed from: f */
    private String f37175f;

    /* renamed from: g */
    private boolean f37176g = false;

    /* renamed from: a */
    public void mo51934a() {
        C14141a.m57218a().mo51940a(this);
    }

    /* renamed from: b */
    public void mo51939b() {
        synchronized (this.f37171b) {
            this.f37171b.clear();
        }
    }

    /* renamed from: a */
    public void mo51937a(boolean z) {
        this.f37176g = z;
    }

    @Override // com.bytedance.framwork.core.sdklib.p753d.AbstractC14144b
    public void onTimeEvent(long j) {
        if (!this.f37176g) {
            mo51938a(j, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51935a(C14130a aVar) {
        if (this.f37171b.size() >= 200) {
            mo51938a(System.currentTimeMillis(), true);
        }
        this.f37171b.add(aVar);
    }

    public C14140d(Context context, String str) {
        this.f37170a = C14131c.m57174a(context);
        this.f37175f = str;
    }

    /* renamed from: a */
    public boolean mo51938a(long j, boolean z) {
        LinkedList linkedList;
        int size = this.f37171b.size();
        if (size <= 0) {
            return false;
        }
        if (!z && size < 5 && j - this.f37173d <= 120000) {
            return false;
        }
        this.f37173d = j;
        synchronized (this.f37171b) {
            linkedList = new LinkedList(this.f37171b);
            this.f37171b.clear();
        }
        if (C14156c.m57242a(linkedList)) {
            return true;
        }
        try {
            this.f37170a.mo51921a(this.f37175f, linkedList);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public void mo51936a(String str, String str2, JSONObject jSONObject) {
        if (!this.f37176g && jSONObject != null) {
            mo51935a(new C14130a(this.f37175f, str, str2, jSONObject.toString(), System.currentTimeMillis()));
        }
    }
}
