package com.bytedance.ee.lark.infra.network.p628c.p629a;

import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.lark.infra.network.c.a.e */
public class C12827e implements AbstractC12823a {

    /* renamed from: a */
    private String f34256a;

    /* renamed from: b */
    private String f34257b;

    /* renamed from: c */
    private String f34258c;

    /* renamed from: d */
    private Map<String, String> f34259d;

    /* renamed from: e */
    private Map<String, Object> f34260e;

    /* renamed from: f */
    private Map<String, C12829b> f34261f;

    /* renamed from: g */
    private byte[] f34262g;

    /* renamed from: h */
    private long f34263h;

    /* renamed from: i */
    private long f34264i;

    /* renamed from: j */
    private long f34265j;

    /* renamed from: k */
    private JSONObject f34266k;

    /* renamed from: l */
    private boolean f34267l;

    /* renamed from: m */
    private boolean f34268m;

    /* renamed from: n */
    private TracingCoreSpan f34269n;

    /* renamed from: o */
    private AbstractC12828a f34270o;

    /* renamed from: com.bytedance.ee.lark.infra.network.c.a.e$a */
    public interface AbstractC12828a {
        /* renamed from: a */
        void mo48456a();
    }

    /* renamed from: com.bytedance.ee.lark.infra.network.c.a.e$b */
    public class C12829b {

        /* renamed from: b */
        private File f34272b;

        /* renamed from: c */
        private String f34273c;

        /* renamed from: a */
        public File mo48457a() {
            return this.f34272b;
        }

        /* renamed from: b */
        public String mo48458b() {
            return this.f34273c;
        }

        public C12829b(File file, String str) {
            this.f34272b = file;
            this.f34273c = str;
        }
    }

    /* renamed from: e */
    public TracingCoreSpan mo48442e() {
        return this.f34269n;
    }

    /* renamed from: h */
    public byte[] mo48445h() {
        return this.f34262g;
    }

    /* renamed from: k */
    public Map<String, C12829b> mo48448k() {
        return this.f34261f;
    }

    /* renamed from: l */
    public Map<String, String> mo48449l() {
        return this.f34259d;
    }

    /* renamed from: n */
    public long mo48451n() {
        return this.f34263h;
    }

    /* renamed from: o */
    public long mo48452o() {
        return this.f34264i;
    }

    /* renamed from: p */
    public long mo48453p() {
        return this.f34265j;
    }

    /* renamed from: q */
    public String mo48454q() {
        return this.f34256a;
    }

    /* renamed from: r */
    public JSONObject mo48455r() {
        return this.f34266k;
    }

    @Override // com.bytedance.ee.lark.infra.network.p628c.p629a.AbstractC12823a
    /* renamed from: b */
    public boolean mo48416b() {
        return this.f34267l;
    }

    /* renamed from: i */
    public String mo48446i() {
        String str = this.f34258c;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ee.lark.infra.network.p628c.p629a.AbstractC12823a
    /* renamed from: a */
    public void mo48415a() {
        AbstractC12828a aVar = this.f34270o;
        if (aVar != null) {
            aVar.mo48456a();
        }
        this.f34267l = true;
    }

    /* renamed from: f */
    public Map<String, Object> mo48443f() {
        if (this.f34268m && !this.f34260e.containsKey("device_id")) {
            this.f34260e.put("device_id", DependencyMgr.m52811b().mo48306a());
        }
        return this.f34260e;
    }

    /* renamed from: m */
    public String mo48450m() {
        if ("GET".equals(this.f34256a)) {
            return mo48419c();
        }
        return this.f34257b;
    }

    /* renamed from: g */
    public String mo48444g() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f34260e.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(5, "TmaRequest", e.getStackTrace());
        }
        return jSONObject.toString();
    }

    /* renamed from: j */
    public String mo48447j() {
        StringBuilder sb = new StringBuilder();
        int size = this.f34260e.entrySet().size() - 1;
        for (Map.Entry<String, Object> entry : this.f34260e.entrySet()) {
            sb.append(entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(URLEncoder.encode(String.valueOf(entry.getValue())));
            if (size > 0) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
            }
            size--;
        }
        return sb.toString();
    }

    /* renamed from: c */
    private String mo48419c() {
        StringBuilder sb = new StringBuilder(this.f34257b);
        boolean contains = this.f34257b.contains("?");
        for (Map.Entry<String, Object> entry : this.f34260e.entrySet()) {
            if (contains) {
                sb.append(ContainerUtils.FIELD_DELIMITER);
                sb.append(entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(entry.getValue());
            } else {
                sb.append("?");
                sb.append(entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(entry.getValue());
                contains = true;
            }
        }
        if (this.f34268m) {
            if (contains) {
                sb.append("&device_id=");
                sb.append(DependencyMgr.m52811b().mo48306a());
            } else {
                sb.append("?device_id=");
                sb.append(DependencyMgr.m52811b().mo48306a());
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo48429a(long j) {
        this.f34263h = j;
    }

    /* renamed from: b */
    public void mo48438b(long j) {
        this.f34264i = j;
    }

    /* renamed from: c */
    public void mo48439c(long j) {
        this.f34265j = j;
    }

    /* renamed from: d */
    public void mo48441d(String str) {
        this.f34256a = str;
    }

    /* renamed from: a */
    public void mo48430a(AbstractC12828a aVar) {
        this.f34270o = aVar;
    }

    /* renamed from: c */
    public void mo48440c(String str) {
        this.f34258c = str;
    }

    /* renamed from: a */
    public void mo48431a(TracingCoreSpan tracingCoreSpan) {
        this.f34269n = tracingCoreSpan;
    }

    /* renamed from: a */
    public void mo48435a(Map<String, Object> map) {
        this.f34260e.putAll(map);
    }

    /* renamed from: a */
    public void mo48436a(JSONObject jSONObject) {
        this.f34266k = jSONObject;
    }

    /* renamed from: a */
    public void mo48437a(byte[] bArr) {
        this.f34262g = bArr;
    }

    public C12827e(String str, String str2) {
        this(str, str2, true);
    }

    /* renamed from: a */
    public void mo48433a(String str, Object obj) {
        this.f34260e.put(str, obj);
    }

    /* renamed from: a */
    public void mo48434a(String str, String str2) {
        this.f34259d.put(str, str2);
    }

    public C12827e(String str, String str2, boolean z) {
        this.f34263h = 10000;
        this.f34264i = 10000;
        this.f34265j = 10000;
        this.f34257b = str;
        this.f34259d = new HashMap();
        this.f34260e = new HashMap();
        this.f34261f = new HashMap();
        this.f34256a = str2;
        this.f34268m = z;
    }

    /* renamed from: a */
    public void mo48432a(String str, File file, String str2) {
        this.f34261f.put(str, new C12829b(file, str2));
    }
}
