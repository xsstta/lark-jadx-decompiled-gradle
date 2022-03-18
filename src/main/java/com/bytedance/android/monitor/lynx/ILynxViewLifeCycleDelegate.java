package com.bytedance.android.monitor.lynx;

import com.bytedance.android.monitor.lynx.data.entity.LynxNativeErrorData;
import com.bytedance.android.monitor.lynx.data.entity.LynxPerfData;
import com.lynx.tasm.LynxView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/bytedance/android/monitor/lynx/ILynxViewLifeCycleDelegate;", "", "onDestroy", "", "view", "Lcom/lynx/tasm/LynxView;", "onFirstLoadPerfReady", "lynxPerfData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxPerfData;", "onFirstScreen", "onLoadSuccess", "onPageStart", "url", "", "onPageUpdate", "onReceivedError", "lynxNativeErrorData", "Lcom/bytedance/android/monitor/lynx/data/entity/LynxNativeErrorData;", "onRuntimeReady", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.a */
public interface ILynxViewLifeCycleDelegate {
    /* renamed from: a */
    void mo11471a(LynxNativeErrorData dVar, LynxView lynxView);

    /* renamed from: a */
    void mo11472a(LynxPerfData eVar, LynxView lynxView);

    /* renamed from: a */
    void mo11473a(LynxView lynxView);

    /* renamed from: a */
    void mo11474a(String str, LynxView lynxView);

    /* renamed from: b */
    void mo11475b(LynxView lynxView);

    /* renamed from: c */
    void mo11476c(LynxView lynxView);

    /* renamed from: d */
    void mo11477d(LynxView lynxView);

    /* renamed from: e */
    void mo11478e(LynxView lynxView);
}
