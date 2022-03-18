package com.bytedance.ee.bear.list.p422a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.cache.FolderSortStrategy;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.recent.RecentSort;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.list.a.b */
public class C8143b {

    /* renamed from: a */
    private static volatile C8143b f21732a;

    /* renamed from: b */
    private final C10917c f21733b = new C10917c(new C10929e());

    /* renamed from: c */
    private final Map<String, Long> f21734c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<String, Boolean> f21735d = new ConcurrentHashMap();

    /* renamed from: e */
    private final Map<String, Long> f21736e = new ConcurrentHashMap();

    /* renamed from: f */
    private volatile FolderSortStrategy f21737f;

    /* renamed from: g */
    private volatile boolean f21738g;

    /* renamed from: h */
    private boolean f21739h;

    /* renamed from: a */
    public static C8143b m32605a() {
        if (f21732a == null) {
            synchronized (C8143b.class) {
                if (f21732a == null) {
                    f21732a = new C8143b();
                }
            }
        }
        return f21732a;
    }

    /* renamed from: b */
    public void mo31467b() {
        C13479a.m54772d("SpaceReport", "clearRecord()...");
        this.f21734c.clear();
        this.f21736e.clear();
        this.f21735d.clear();
    }

    /* renamed from: c */
    private String m32608c() {
        if (this.f21737f != null) {
            C8275a b = C8275a.m34052b(this.f21737f.mo31554d());
            if (b.mo32555b() == 12 && "photo".equalsIgnoreCase(this.f21737f.mo31560f())) {
                return "image";
            }
            if (b.mo32555b() != C8275a.f22369b.mo32555b()) {
                return b.mo32553a();
            }
        }
        return "all";
    }

    /* renamed from: d */
    private String m32609d() {
        if (this.f21737f != null) {
            RecentSort sort = RecentSort.getSort(this.f21737f.mo31549b());
            if (sort == RecentSort.MODIFIED) {
                return "Latest_modified_time";
            }
            if (sort == RecentSort.CREATED) {
                return "Latest_created";
            }
            if (sort == RecentSort.OPENED) {
                return "Latest_open_time";
            }
        }
        return "All_time";
    }

    /* renamed from: a */
    public void mo31461a(FolderSortStrategy folderSortStrategy) {
        this.f21737f = folderSortStrategy;
    }

    /* renamed from: b */
    public void mo31469b(boolean z) {
        this.f21739h = z;
    }

    /* renamed from: a */
    public void mo31465a(boolean z) {
        this.f21738g = z;
    }

    /* renamed from: b */
    public void mo31468b(String str) {
        mo31463a(str, 0, 0);
    }

    /* renamed from: a */
    public void mo31466a(String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                this.f21734c.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            }
        }
    }

    /* renamed from: c */
    public void mo31470c(String str) {
        Map<String, Long> map = this.f21734c;
        map.put(str + "_" + "recent", Long.valueOf(SystemClock.uptimeMillis()));
    }

    /* renamed from: a */
    public void mo31462a(String str) {
        Long l;
        Boolean bool = this.f21735d.get(str);
        if ((bool == null || !bool.booleanValue()) && (l = this.f21734c.get("init")) != null && l.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            if (uptimeMillis > 0) {
                m32607a(str, "recent", uptimeMillis, 0, 0);
                this.f21735d.put(str, true);
                this.f21736e.put(str, Long.valueOf(uptimeMillis));
            }
        }
    }

    /* renamed from: a */
    public void mo31460a(int i, String str) {
        Long l;
        Boolean bool = this.f21735d.get("key_open_finish_recent");
        if ((bool == null || !bool.booleanValue()) && (l = this.f21734c.get("key_open_finish_recent")) != null && l.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            if (uptimeMillis > 0) {
                m32606a(i, str, uptimeMillis, m32608c(), m32609d(), this.f21738g ? 1 : 0);
                this.f21735d.put("key_open_finish_recent", true);
            }
        }
    }

    /* renamed from: a */
    public void mo31464a(Throwable th, String str) {
        if ((th instanceof SocketTimeoutException) || ((th instanceof CloudReqFun.OkHttpReqException) && (((CloudReqFun.OkHttpReqException) th).exceptionObj instanceof SocketTimeoutException))) {
            if ("recent".equals(str)) {
                m32605a().mo31460a(1, "SEC3");
            }
        } else if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            if ("recent".equals(str)) {
                m32605a().mo31460a(1, "SEC4");
            }
        } else if ("recent".equals(str)) {
            m32605a().mo31460a(1, "SEC5");
        }
    }

    /* renamed from: a */
    public void mo31463a(String str, int i, int i2) {
        String str2 = str + "_" + "recent";
        Long l = this.f21734c.get(str2);
        if (l != null && l.longValue() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - l.longValue();
            if (uptimeMillis > 0) {
                m32607a(str, "recent", uptimeMillis, i, i2);
                this.f21734c.put(str2, 0L);
            }
        }
    }

    /* renamed from: a */
    private void m32607a(String str, String str2, long j, int i, int i2) {
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", str);
            jSONObject.put("list_type", str2);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
            jSONObject.put("result_code", i);
            if (this.f21738g) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("view_mode", i3);
            jSONObject.put("data_size", i2);
            jSONObject.put("user_operation_source", 0);
            C5234y.m21391b().mo21080a("dev_performance_space_open_stages", jSONObject);
            C13479a.m54772d("SpaceReport", "reportStage()...param = " + jSONObject.toString());
        } catch (Exception e) {
            C13479a.m54761a("SpaceReport", e);
        }
    }

    /* renamed from: a */
    private void m32606a(int i, String str, long j, String str2, String str3, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result_code", String.valueOf(i));
            jSONObject.put("fail_code", str);
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, j);
            jSONObject.put("list_type", "recent");
            jSONObject.put("filter_type1", str2);
            jSONObject.put("sort_type", str3);
            jSONObject.put("view_mode", i2);
            int i3 = 0;
            jSONObject.put("user_operation_source", 0);
            if (this.f21739h) {
                i3 = 1;
            }
            jSONObject.put("has_cache", i3);
            for (Map.Entry<String, Long> entry : this.f21736e.entrySet()) {
                String key = entry.getKey();
                Long value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    jSONObject.put(key, value);
                }
            }
            C5234y.m21391b().mo21080a("dev_performance_space_open_finish", jSONObject);
            C13479a.m54772d("SpaceReport", "reportOpenFinish()...param = " + jSONObject.toString());
        } catch (Exception e) {
            C13479a.m54761a("SpaceReport", e);
        }
    }
}
