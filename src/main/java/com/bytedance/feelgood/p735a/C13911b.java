package com.bytedance.feelgood.p735a;

import android.content.Context;
import com.bytedance.feelgood.p737c.AbstractC13924d;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.feelgood.a.b */
public class C13911b {

    /* renamed from: a */
    private Context f36380a;

    /* renamed from: b */
    private boolean f36381b;

    /* renamed from: c */
    private double f36382c;

    /* renamed from: d */
    private int f36383d;

    /* renamed from: e */
    private Map<String, String> f36384e;

    /* renamed from: f */
    private String f36385f;

    /* renamed from: g */
    private JSONObject f36386g;

    /* renamed from: h */
    private AbstractC13924d f36387h;

    /* renamed from: a */
    public Context mo51244a() {
        return this.f36380a;
    }

    /* renamed from: b */
    public boolean mo51251b() {
        return this.f36381b;
    }

    /* renamed from: c */
    public double mo51252c() {
        return this.f36382c;
    }

    /* renamed from: d */
    public int mo51253d() {
        return this.f36383d;
    }

    /* renamed from: e */
    public Map<String, String> mo51254e() {
        return this.f36384e;
    }

    /* renamed from: f */
    public String mo51255f() {
        return this.f36385f;
    }

    /* renamed from: g */
    public JSONObject mo51256g() {
        return this.f36386g;
    }

    /* renamed from: h */
    public AbstractC13924d mo51257h() {
        return this.f36387h;
    }

    /* renamed from: a */
    public void mo51245a(double d) {
        this.f36382c = d;
    }

    /* renamed from: a */
    public void mo51246a(int i) {
        this.f36383d = i;
    }

    /* renamed from: a */
    public void mo51247a(AbstractC13924d dVar) {
        this.f36387h = dVar;
    }

    /* renamed from: a */
    public void mo51248a(String str) {
        this.f36385f = str;
    }

    /* renamed from: a */
    public void mo51249a(Map<String, String> map) {
        this.f36384e = map;
    }

    /* renamed from: a */
    public void mo51250a(JSONObject jSONObject) {
        this.f36386g = jSONObject;
    }

    public C13911b(Context context, boolean z) {
        this(context, z, -1.0d);
    }

    public C13911b(Context context, boolean z, double d) {
        this.f36380a = context;
        this.f36381b = z;
        this.f36382c = d;
        this.f36383d = context.getResources().getColor(17170445);
    }
}
