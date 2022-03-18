package com.bytedance.android.monitor.lynx.data.entity;

import com.bytedance.android.monitor.p104a.AbstractC2630b;
import com.bytedance.android.monitor.p112i.C2657e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020+H\u0002J\u0010\u0010?\u001a\u00020=2\u0006\u0010>\u001a\u00020+H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\b¨\u0006@"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/entity/LynxPerfData;", "Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "()V", "diffRootCreate", "", "getDiffRootCreate", "()D", "setDiffRootCreate", "(D)V", "diffSameRoot", "getDiffSameRoot", "setDiffSameRoot", "fmp", "getFmp", "setFmp", "fp", "getFp", "setFp", "layout", "getLayout", "setLayout", "lifecycleData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "getLifecycleData", "()Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "setLifecycleData", "(Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;)V", "lynxState", "", "getLynxState", "()I", "setLynxState", "(I)V", "perfReportTime", "", "getPerfReportTime", "()J", "setPerfReportTime", "(J)V", "renderPage", "getRenderPage", "setRenderPage", "sourceJsonObj", "Lorg/json/JSONObject;", "getSourceJsonObj", "()Lorg/json/JSONObject;", "setSourceJsonObj", "(Lorg/json/JSONObject;)V", "tasmBinaryDecode", "getTasmBinaryDecode", "setTasmBinaryDecode", "tasmFinishLoadTemplate", "getTasmFinishLoadTemplate", "setTasmFinishLoadTemplate", "tasmRndDecodeFinishLoadTemplate", "getTasmRndDecodeFinishLoadTemplate", "setTasmRndDecodeFinishLoadTemplate", "tti", "getTti", "setTti", "appendNativeInfoParams", "", "jsonObj", "fillInJsonObject", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.a.e */
public final class LynxPerfData extends AbstractC2630b {

    /* renamed from: b */
    private double f8483b;

    /* renamed from: c */
    private double f8484c;

    /* renamed from: d */
    private double f8485d;

    /* renamed from: e */
    private double f8486e;

    /* renamed from: f */
    private double f8487f;

    /* renamed from: g */
    private double f8488g;

    /* renamed from: h */
    private double f8489h;

    /* renamed from: i */
    private double f8490i;

    /* renamed from: j */
    private double f8491j;

    /* renamed from: k */
    private double f8492k;

    /* renamed from: l */
    private LynxLifecycleData f8493l;

    /* renamed from: m */
    private JSONObject f8494m;

    /* renamed from: n */
    private int f8495n;

    /* renamed from: o */
    private long f8496o = System.currentTimeMillis();

    /* renamed from: b */
    public final double mo11523b() {
        return this.f8485d;
    }

    public LynxPerfData() {
        super("performance");
    }

    /* renamed from: a */
    public final void mo11520a(double d) {
        this.f8483b = d;
    }

    /* renamed from: c */
    public final void mo11526c(double d) {
        this.f8485d = d;
    }

    /* renamed from: d */
    public final void mo11527d(double d) {
        this.f8486e = d;
    }

    /* renamed from: e */
    public final void mo11528e(double d) {
        this.f8487f = d;
    }

    /* renamed from: f */
    public final void mo11529f(double d) {
        this.f8488g = d;
    }

    /* renamed from: g */
    public final void mo11530g(double d) {
        this.f8489h = d;
    }

    /* renamed from: h */
    public final void mo11531h(double d) {
        this.f8490i = d;
    }

    /* renamed from: i */
    public final void mo11532i(double d) {
        this.f8491j = d;
    }

    /* renamed from: j */
    public final void mo11533j(double d) {
        this.f8492k = d;
    }

    /* renamed from: a */
    public final void mo11521a(int i) {
        this.f8495n = i;
    }

    /* renamed from: b */
    public final void mo11524b(double d) {
        this.f8484c = d;
    }

    /* renamed from: a */
    public final void mo11522a(LynxLifecycleData bVar) {
        this.f8493l = bVar;
    }

    /* renamed from: b */
    public final void mo11525b(JSONObject jSONObject) {
        this.f8494m = jSONObject;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObj");
        m11258c(jSONObject);
        LynxLifecycleData bVar = this.f8493l;
        if (bVar != null) {
            bVar.mo11404a(jSONObject);
        }
    }

    /* renamed from: c */
    private final void m11258c(JSONObject jSONObject) {
        C2657e.m11175a(jSONObject, this.f8494m);
        C2657e.m11173a(jSONObject, "fp", Double.valueOf(this.f8483b));
        C2657e.m11173a(jSONObject, "fmp", Double.valueOf(this.f8484c));
        C2657e.m11173a(jSONObject, "tti", Double.valueOf(this.f8485d));
        C2657e.m11173a(jSONObject, "Layout", Double.valueOf(this.f8486e));
        C2657e.m11173a(jSONObject, "render_page", Double.valueOf(this.f8492k));
        C2657e.m11173a(jSONObject, "Diff_root_create", Double.valueOf(this.f8487f));
        C2657e.m11173a(jSONObject, "Diff_same_root", Double.valueOf(this.f8488g));
        C2657e.m11173a(jSONObject, "tasm_binary_decode", Double.valueOf(this.f8490i));
        C2657e.m11173a(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.f8489h));
        C2657e.m11173a(jSONObject, "tasm_finish_load_template", Double.valueOf(this.f8491j));
        C2657e.m11171a(jSONObject, "state", this.f8495n);
        C2657e.m11172a(jSONObject, "report_ts", this.f8496o);
    }
}
