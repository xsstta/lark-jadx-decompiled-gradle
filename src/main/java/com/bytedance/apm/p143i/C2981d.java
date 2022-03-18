package com.bytedance.apm.p143i;

import com.bytedance.apm.util.C3121h;
import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.services.slardar.config.AbstractC20704a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.i.d */
public class C2981d implements AbstractC20704a {

    /* renamed from: a */
    private final Map<String, Boolean> f9581a;

    /* renamed from: b */
    private final Map<String, Boolean> f9582b;

    /* renamed from: c */
    private List<String> f9583c;

    /* renamed from: d */
    private List<String> f9584d;

    /* renamed from: e */
    private List<String> f9585e;

    /* renamed from: f */
    private Map<String, String> f9586f;

    /* renamed from: g */
    private volatile JSONObject f9587g;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.apm.i.d$a */
    public static class C2983a {

        /* renamed from: a */
        public static final C2981d f9588a = new C2981d();
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onReady() {
    }

    /* renamed from: a */
    public static C2981d m12529a() {
        return C2983a.f9588a;
    }

    private C2981d() {
        this.f9581a = new ConcurrentHashMap();
        this.f9582b = new ConcurrentHashMap();
        this.f9586f = new HashMap();
        LinkedList linkedList = new LinkedList();
        this.f9583c = linkedList;
        linkedList.addAll(Arrays.asList("battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.f9584d = arrayList;
        arrayList.add("enable_upload");
        this.f9584d.add("drop_enable_upload");
        this.f9584d.add("serious_block_enable_upload");
        this.f9584d.add("block_enable_upload");
        this.f9584d.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.f9585e = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        this.f9586f.put("enable_upload", "fps");
        this.f9586f.put("drop_enable_upload", "fps_drop");
        this.f9586f.put("block_enable_upload", "block_monitor");
        this.f9586f.put("slow_method_enable_upload", "drop_frame_stack");
        this.f9586f.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) C20216d.m73783a(IConfigManager.class)).registerConfigListener(this);
    }

    /* renamed from: d */
    private void m12533d(JSONObject jSONObject) {
        if (jSONObject != null) {
            Map<String, Boolean> map = this.f9582b;
            boolean z = false;
            if (jSONObject.optInt("memory_object_monitor", 0) == 1) {
                z = true;
            }
            map.put("memory_object_monitor", Boolean.valueOf(z));
        }
    }

    /* renamed from: f */
    private void m12535f(JSONObject jSONObject) {
        if (jSONObject != null) {
            Map<String, Boolean> map = this.f9582b;
            boolean z = false;
            if (jSONObject.optInt(ApiHandler.API_CALLBACK_EXCEPTION, 0) == 1) {
                z = true;
            }
            map.put("cpu_trace", Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public boolean mo12723a(String str) {
        Boolean bool = this.f9581a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo12725b(String str) {
        Boolean bool = this.f9582b.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    private void m12531b(JSONObject jSONObject) {
        if (jSONObject != null) {
            for (String str : this.f9585e) {
                try {
                    Map<String, Boolean> map = this.f9582b;
                    boolean z = false;
                    if (jSONObject.optInt(str, 0) == 1) {
                        z = true;
                    }
                    map.put(str, Boolean.valueOf(z));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: c */
    private void m12532c(JSONObject jSONObject) {
        if (jSONObject != null) {
            for (String str : this.f9584d) {
                try {
                    Map<String, Boolean> map = this.f9582b;
                    String str2 = this.f9586f.get(str);
                    boolean z = false;
                    if (jSONObject.optInt(str, 0) == 1) {
                        z = true;
                    }
                    map.put(str2, Boolean.valueOf(z));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: e */
    private void m12534e(JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null) {
            Map<String, Boolean> map = this.f9582b;
            boolean z2 = false;
            if (jSONObject.optInt("temperature_enable_upload", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            map.put("temperature", Boolean.valueOf(z));
            Map<String, Boolean> map2 = this.f9582b;
            if (jSONObject.optInt("exception_enable_upload", 0) == 1) {
                z2 = true;
            }
            map2.put("battery_trace", Boolean.valueOf(z2));
        }
    }

    /* renamed from: a */
    private void m12530a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject != null) {
            for (String str : this.f9583c) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                if ("smooth".equals(str)) {
                    m12532c(optJSONObject2);
                } else {
                    if ("memory".equals(str)) {
                        m12533d(optJSONObject2);
                    }
                    if ("battery".equals(str)) {
                        m12534e(optJSONObject2);
                    }
                    if ("cpu".equals(str)) {
                        m12535f(optJSONObject2);
                    }
                    if ("start_trace".equals(str)) {
                        m12531b(optJSONObject2);
                    }
                    if (optJSONObject2 == null || optJSONObject2.optInt("enable_upload", 0) != 1) {
                        this.f9581a.put(str, false);
                    } else {
                        this.f9581a.put(str, true);
                    }
                }
            }
            this.f9587g = C3121h.m12998a(optJSONObject, "smooth", "scene_enable_upload");
        }
    }

    @Override // com.bytedance.services.slardar.config.AbstractC20704a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            m12530a(jSONObject);
        }
    }

    /* renamed from: a */
    public boolean mo12724a(String str, String str2) {
        boolean z;
        Boolean bool = this.f9582b.get(str);
        if (this.f9587g == null || this.f9587g.optInt(str2) != 1) {
            z = false;
        } else {
            z = true;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            return false;
        }
        return true;
    }
}
