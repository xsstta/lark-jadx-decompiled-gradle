package com.ss.android.lark.opmonitor.model;

import android.text.TextUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.api.OPBaseReportImpl;
import com.ss.android.lark.opmonitor.config.C48914f;
import com.ss.android.lark.opmonitor.config.ICommonParamsGetter;
import com.ss.android.lark.opmonitor.config.IEventNameGetter;
import com.ss.android.lark.optrace.dependency.ECOProbeSDKDepMgr;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.opmonitor.model.b */
public class C48919b {

    /* renamed from: e */
    private static C48914f f122891e = new C48914f();

    /* renamed from: a */
    private String f122892a = "op_monitor_event";

    /* renamed from: b */
    private int f122893b;

    /* renamed from: c */
    private AbstractC48907e f122894c;

    /* renamed from: d */
    private AbstractC48906d f122895d;

    /* renamed from: f */
    private C48914f f122896f;

    /* renamed from: g */
    private IEventNameGetter f122897g;

    /* renamed from: h */
    private ICommonParamsGetter f122898h;

    /* renamed from: i */
    private OPMonitorCode f122899i;

    /* renamed from: b */
    public int mo170808b() {
        return this.f122893b;
    }

    /* renamed from: d */
    public OPMonitorCode mo170810d() {
        return this.f122899i;
    }

    /* renamed from: c */
    public C48914f mo170809c() {
        C48914f fVar = this.f122896f;
        if (fVar == null) {
            return f122891e;
        }
        return fVar;
    }

    /* renamed from: a */
    public Map<String, Object> mo170802a() {
        ICommonParamsGetter aVar = this.f122898h;
        if (aVar != null) {
            return aVar.mo144740a();
        }
        return Collections.EMPTY_MAP;
    }

    /* renamed from: e */
    private int m192722e() {
        if (ECOProbeSDKDepMgr.f122918a.mo170892a().mo144738b("openplatform.upload.monitor.tea")) {
            return 4;
        }
        return 2;
    }

    /* renamed from: a */
    public void mo170803a(ICommonParamsGetter aVar) {
        this.f122898h = aVar;
    }

    /* renamed from: a */
    public static void m192721a(JSONObject jSONObject) {
        f122891e.mo170773a(jSONObject);
    }

    /* renamed from: a */
    public String mo170801a(String str) {
        if (this.f122897g == null || TextUtils.isEmpty(str)) {
            return this.f122892a;
        }
        String a = this.f122897g.mo144739a(str);
        if (TextUtils.isEmpty(a)) {
            return this.f122892a;
        }
        return a;
    }

    /* renamed from: a */
    public void mo170804a(IEventNameGetter bVar) {
        this.f122897g = bVar;
    }

    /* renamed from: a */
    public void mo170805a(OPMonitorCode oPMonitorCode) {
        this.f122899i = oPMonitorCode;
    }

    public C48919b(AbstractC48907e eVar, AbstractC48906d dVar) {
        this.f122894c = eVar;
        this.f122895d = dVar;
        this.f122893b = m192722e();
    }

    /* renamed from: a */
    public void mo170807a(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, int i) {
        C48914f c = mo170809c();
        HashMap<String, Object> hashMap3 = new HashMap<>();
        hashMap3.put("event_name", str);
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        if (c.mo170772a(hashMap3) != BitmapDescriptorFactory.HUE_RED) {
            AbstractC48907e eVar = this.f122894c;
            if (eVar instanceof OPBaseReportImpl) {
                ((OPBaseReportImpl) eVar).mo170752a(str, hashMap, hashMap2, i);
            } else {
                eVar.report(str, hashMap, hashMap2);
            }
        }
    }

    /* renamed from: a */
    public void mo170806a(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
        this.f122895d.log(oPMonitorLogLevel, str, str2, str3, i, str4);
    }
}
