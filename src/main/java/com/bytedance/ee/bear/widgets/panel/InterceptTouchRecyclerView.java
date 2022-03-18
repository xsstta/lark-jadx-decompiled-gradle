package com.bytedance.ee.bear.widgets.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/InterceptTouchRecyclerView;", "Lcom/bytedance/ee/bear/widgets/BaseRecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "downX", "", "downY", "lastX", "lastY", "touchInterceptor", "Lcom/bytedance/ee/bear/widgets/panel/InterceptTouchRecyclerView$ITouchInterceptor;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "setTouchInterceptor", "", "interceptor", "ITouchInterceptor", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public class InterceptTouchRecyclerView extends BaseRecyclerView {

    /* renamed from: a */
    private ITouchInterceptor f32006a;

    /* renamed from: b */
    private float f32007b;

    /* renamed from: c */
    private float f32008c;

    /* renamed from: d */
    private float f32009d;

    /* renamed from: e */
    private float f32010e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/InterceptTouchRecyclerView$ITouchInterceptor;", "", "onIntercept", "", "ev", "Landroid/view/MotionEvent;", "offsetX", "", "offsetY", "dx", "dy", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.InterceptTouchRecyclerView$a */
    public interface ITouchInterceptor {
        /* renamed from: a */
        boolean mo45460a(MotionEvent motionEvent, float f, float f2, float f3, float f4);
    }

    public final void setTouchInterceptor(ITouchInterceptor aVar) {
        this.f32006a = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptTouchRecyclerView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        ITouchInterceptor aVar = this.f32006a;
        if (aVar != null && motionEvent.getAction() == 0) {
            this.f32009d = motionEvent.getRawX();
            this.f32010e = motionEvent.getRawY();
            this.f32007b = motionEvent.getRawX();
            this.f32008c = motionEvent.getRawY();
            if (aVar.mo45460a(motionEvent, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        ITouchInterceptor aVar = this.f32006a;
        if (aVar != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int action = motionEvent.getAction();
            if (action == 1 || action == 2 || action == 3) {
                float f = this.f32009d - rawX;
                float f2 = this.f32010e - rawY;
                this.f32009d = rawX;
                this.f32010e = rawY;
                if (aVar.mo45460a(motionEvent, this.f32007b - rawX, this.f32008c - rawY, f, f2)) {
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptTouchRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptTouchRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
