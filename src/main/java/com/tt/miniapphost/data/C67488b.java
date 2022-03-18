package com.tt.miniapphost.data;

import android.util.SparseArray;
import com.bytedance.ee.lark.infra.network.p630d.p631a.p632a.C12832a;
import com.tt.miniapp.C65966d;
import com.tt.miniapp.debug.PerformanceService;
import com.tt.miniapp.manager.C66440j;
import com.tt.miniapp.manager.C66464n;
import com.tt.miniapp.p3323q.C66683f;
import com.tt.miniapp.p3323q.C66689h;
import com.tt.miniapp.p3323q.C66692i;
import com.tt.miniapp.p3352w.p3354b.AbstractC67293a;
import com.tt.refer.common.pkg.IStreamLoader;
import com.tt.refer.impl.business.p3434e.AbstractC67906a;
import java.lang.ref.SoftReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import org.json.JSONArray;

/* renamed from: com.tt.miniapphost.data.b */
public final class C67488b {

    /* renamed from: a */
    public volatile IStreamLoader f170174a;

    /* renamed from: b */
    public ConcurrentHashMap<String, IStreamLoader> f170175b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public volatile IStreamLoader f170176c;

    /* renamed from: d */
    public int f170177d;

    /* renamed from: e */
    public C66692i.C66693a f170178e = new C66692i.C66693a();

    /* renamed from: f */
    public C65966d.C65977a f170179f = new C65966d.C65977a();

    /* renamed from: g */
    public C66440j.C66444a f170180g = new C66440j.C66444a();

    /* renamed from: h */
    public PerformanceService.C65982a f170181h = new PerformanceService.C65982a();

    /* renamed from: i */
    public C66689h.C66690a f170182i = new C66689h.C66690a();

    /* renamed from: j */
    public C66683f.C66686b f170183j = new C66683f.C66686b();

    /* renamed from: k */
    public C66464n.C66465a f170184k = new C66464n.C66465a();

    /* renamed from: l */
    public AbstractC67906a.C67915a f170185l = new AbstractC67906a.C67915a();

    /* renamed from: m */
    public int f170186m = 6;

    /* renamed from: n */
    public List<String> f170187n;

    /* renamed from: o */
    public List<String> f170188o;

    /* renamed from: p */
    public JSONArray f170189p;

    /* renamed from: q */
    public List<String> f170190q;

    /* renamed from: r */
    public JSONArray f170191r;

    /* renamed from: s */
    public ConcurrentHashMap<String, AbstractC67293a> f170192s = new ConcurrentHashMap<>();

    /* renamed from: t */
    private String f170193t;

    /* renamed from: u */
    private SparseArray<C12832a> f170194u = new SparseArray<>();

    /* renamed from: v */
    private SparseArray<SoftReference<Call>> f170195v = new SparseArray<>();

    /* renamed from: a */
    public String mo234306a() {
        return this.f170193t;
    }

    /* renamed from: b */
    public int mo234308b() {
        return this.f170186m;
    }

    /* renamed from: c */
    public SparseArray<C12832a> mo234309c() {
        return this.f170194u;
    }

    /* renamed from: d */
    public SparseArray<SoftReference<Call>> mo234310d() {
        return this.f170195v;
    }

    C67488b() {
    }

    /* renamed from: a */
    public void mo234307a(int i) {
        this.f170186m = i;
    }
}
