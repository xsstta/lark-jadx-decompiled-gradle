package com.larksuite.component.ui.layout.plus;

import android.graphics.Canvas;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.OnMeasureData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/PerMonitorRenderLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseInnerPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "isMeasured", "", "isRendered", "mCallback", "Lcom/larksuite/component/ui/layout/plus/PerMonitorRenderLKUIPlus$MonitorCallback;", "getPlusType", "Lcom/larksuite/component/ui/layout/plus/InnerPlusType;", "onDelegateDispatchDrawEnd", "", "canvas", "Landroid/graphics/Canvas;", "onDelegateMeasureStart", "onMeasureData", "Lcom/larksuite/component/ui/layout/OnMeasureData;", "setMonitorCallback", "callback", "MonitorCallback", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PerMonitorRenderLKUIPlus extends BaseInnerPlus {
    private boolean isMeasured;
    private boolean isRendered;
    private MonitorCallback mCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/ui/layout/plus/PerMonitorRenderLKUIPlus$MonitorCallback;", "", "onBeginRender", "", "onEndRender", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.layout.plus.PerMonitorRenderLKUIPlus$a */
    public interface MonitorCallback {
        /* renamed from: a */
        void mo89750a();

        /* renamed from: b */
        void mo89751b();
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseInnerPlus
    public InnerPlusType getPlusType() {
        return InnerPlusType.PER_MONITOR_RENDER;
    }

    public final void setMonitorCallback(MonitorCallback aVar) {
        this.mCallback = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PerMonitorRenderLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateDispatchDrawEnd(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDelegateDispatchDrawEnd(canvas);
        if (!this.isRendered) {
            MonitorCallback aVar = this.mCallback;
            if (aVar != null) {
                aVar.mo89751b();
            }
            this.isRendered = true;
        }
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateMeasureStart(OnMeasureData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onMeasureData");
        if (!this.isMeasured) {
            MonitorCallback aVar = this.mCallback;
            if (aVar != null) {
                aVar.mo89750a();
            }
            this.isMeasured = true;
        }
        super.onDelegateMeasureStart(cVar);
    }
}
