package com.bytedance.android.monitor.lynx_helper;

import com.bytedance.android.monitor.lynx.ILynxViewLifeCycleDelegate;
import com.bytedance.android.monitor.lynx.LynxViewLifeCycleDelegate;
import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.lynx.data.entity.LynxPerfData;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.C26906i;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/bytedance/android/monitor/lynx_helper/MonitorPerfClient;", "Lcom/lynx/tasm/LynxViewClient;", "lynxView", "Lcom/lynx/tasm/LynxView;", "(Lcom/lynx/tasm/LynxView;)V", "lifeCycleDelegate", "Lcom/bytedance/android/monitor/lynx/ILynxViewLifeCycleDelegate;", "getLynxView", "()Lcom/lynx/tasm/LynxView;", "onDestroy", "", "onFirstLoadPerfReady", "metric", "Lcom/lynx/tasm/LynxPerfMetric;", "onFirstScreen", "onLoadSuccess", "onPageStart", "url", "", "onPageUpdate", "onReceivedError", "error", "Lcom/lynx/tasm/LynxError;", "onRuntimeReady", "lynx-helper_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.g.b */
public class MonitorPerfClient extends AbstractC26911n {

    /* renamed from: a */
    private final ILynxViewLifeCycleDelegate f8426a = new LynxViewLifeCycleDelegate();

    /* renamed from: b */
    private final LynxView f8427b;

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11457a() {
        super.mo11457a();
        this.f8426a.mo11475b(this.f8427b);
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: b */
    public void mo11461b() {
        super.mo11461b();
        this.f8426a.mo11476c(this.f8427b);
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: c */
    public void mo11462c() {
        super.mo11462c();
        this.f8426a.mo11473a(this.f8427b);
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: d */
    public void mo11463d() {
        super.mo11463d();
        this.f8426a.mo11477d(this.f8427b);
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: e */
    public void mo11464e() {
        this.f8426a.mo11478e(this.f8427b);
        super.mo11464e();
    }

    public MonitorPerfClient(LynxView lynxView) {
        Intrinsics.checkParameterIsNotNull(lynxView, "lynxView");
        this.f8427b = lynxView;
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11458a(LynxPerfMetric lynxPerfMetric) {
        LynxPerfData eVar;
        super.mo11458a(lynxPerfMetric);
        if (lynxPerfMetric != null) {
            eVar = LynxMonitorHelper.m11135a(lynxPerfMetric);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            this.f8426a.mo11472a(eVar, this.f8427b);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11459a(C26906i iVar) {
        LynxNativeErrorData dVar;
        super.mo11459a(iVar);
        if (iVar != null) {
            dVar = LynxMonitorHelper.m11134a(iVar);
        } else {
            dVar = null;
        }
        if (dVar != null) {
            this.f8426a.mo11471a(dVar, this.f8427b);
        }
    }

    @Override // com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo11460a(String str) {
        super.mo11460a(str);
        this.f8426a.mo11474a(str, this.f8427b);
    }
}
