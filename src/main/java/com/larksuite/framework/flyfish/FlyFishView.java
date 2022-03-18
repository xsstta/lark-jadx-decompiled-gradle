package com.larksuite.framework.flyfish;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.flyfish.FFLog;
import com.larksuite.framework.flyfish.core.IComponentTree;
import com.larksuite.framework.flyfish.core.IViewOperateSupport;
import com.larksuite.framework.flyfish.util.ViewUtil;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0014J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0014J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000bJ\u000e\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\rR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/larksuite/framework/flyfish/FlyFishView;", "Landroid/view/ViewGroup;", "Lcom/larksuite/framework/flyfish/core/IViewOperateSupport;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mComponentTree", "Lcom/larksuite/framework/flyfish/core/IComponentTree;", "mOnMeasureListener", "Lcom/larksuite/framework/flyfish/FlyFishView$IOnMeasureListener;", "addViewNoLayoutRequest", "", "child", "Landroid/view/View;", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setComponentTree", "componentTree", "setIOnMeasureListener", "listener", "IOnMeasureListener", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
public class FlyFishView extends ViewGroup implements IViewOperateSupport {

    /* renamed from: a */
    private volatile IComponentTree f64296a;

    /* renamed from: b */
    private IOnMeasureListener f64297b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/larksuite/framework/flyfish/FlyFishView$IOnMeasureListener;", "", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "flyfish_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.FlyFishView$a */
    public interface IOnMeasureListener {
        /* renamed from: a */
        void mo92360a(int i, int i2);
    }

    public FlyFishView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FlyFishView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.larksuite.framework.flyfish.FlyFishView$b */
    static final class RunnableC25978b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FlyFishView f64298a;

        RunnableC25978b(FlyFishView flyFishView) {
            this.f64298a = flyFishView;
        }

        public final void run() {
            this.f64298a.requestLayout();
        }
    }

    public final void setIOnMeasureListener(IOnMeasureListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f64297b = aVar;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        IComponentTree cVar = this.f64296a;
        if (cVar != null) {
            cVar.mo92398a(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void setComponentTree(IComponentTree cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "componentTree");
        this.f64296a = cVar;
        removeAllViewsInLayout();
        cVar.mo92399a(this);
        cVar.mo92401b();
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            post(new RunnableC25978b(this));
        } else {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        IOnMeasureListener aVar = this.f64297b;
        if (aVar != null) {
            aVar.mo92360a(i, i2);
        }
        IComponentTree cVar = this.f64296a;
        if (cVar == null) {
            super.onMeasure(i, i2);
            FFLog.f64300b.mo92364b("FF_NBView", " mComponentTree is NULL when onMeasure");
            return;
        }
        FFLog.Companion aVar2 = FFLog.f64300b;
        aVar2.mo92363a("FF_NBView", "onMeasure : " + "  ws = " + View.MeasureSpec.getSize(i) + ' ' + ", wm = " + ViewUtil.f64301a.mo92372a(i) + ", hs =  " + View.MeasureSpec.getSize(i2) + ' ' + ", hm =  " + ViewUtil.f64301a.mo92372a(i2) + ' ');
        int[] a = cVar.mo92400a(i, i2);
        setMeasuredDimension(a[0], a[1]);
    }

    @Override // com.larksuite.framework.flyfish.core.IViewOperateSupport
    /* renamed from: a */
    public void mo92354a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlyFishView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlyFishView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IComponentTree cVar = this.f64296a;
        if (cVar == null) {
            FFLog.f64300b.mo92364b("FF_NBView", " mComponentTree is NULL when onLayout");
            return;
        }
        FFLog.Companion aVar = FFLog.f64300b;
        aVar.mo92363a("FF_NBView", "onLayout, l = " + i + ", t = " + i2 + ", r = " + i3 + ", b = " + i4);
        cVar.mo92402b(getMeasuredWidth(), getMeasuredHeight());
        cVar.mo92397a(i, i2, i3, i4);
    }
}
