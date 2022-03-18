package com.ss.android.appcenter.business.tab.business.blockit.part;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0899e;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.ss.android.appcenter.common.util.C28209p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f*\u0001\u0010\u0018\u00002\u00020\u0001:\u0002$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014J\u0010\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0013\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentTapListener", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IContentTapListener;", "gestureDetector", "Landroidx/core/view/GestureDetectorCompat;", "gestureListener", "com/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$gestureListener$1", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$gestureListener$1;", "maxBlockHeight", "sizeChangedListener", "Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IBlockitSlotSizeChangedListener;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setContentTapListener", "listener", "IBlockitSlotSizeChangedListener", "IContentTapListener", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockitSlot extends FrameLayout {

    /* renamed from: a */
    public IContentTapListener f69578a;

    /* renamed from: b */
    private int f69579b = C28209p.m103291a(3000.0f);

    /* renamed from: c */
    private IBlockitSlotSizeChangedListener f69580c;

    /* renamed from: d */
    private final C27837c f69581d;

    /* renamed from: e */
    private final C0899e f69582e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IBlockitSlotSizeChangedListener;", "", "onContainerResize", "", "w", "", C14002h.f36692e, "oldW", "oldH", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot$a */
    public interface IBlockitSlotSizeChangedListener {
        /* renamed from: a */
        void mo99217a(int i, int i2, int i3, int i4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$IContentTapListener;", "", "onContentTap", "", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot$b */
    public interface IContentTapListener {
        /* renamed from: g */
        void mo99238g();
    }

    /* renamed from: a */
    public final void mo99317a(IBlockitSlotSizeChangedListener aVar) {
        this.f69580c = aVar;
    }

    public final void setContentTapListener(IContentTapListener bVar) {
        this.f69578a = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/appcenter/business/tab/business/blockit/part/BlockitSlot$gestureListener$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onSingleTapConfirmed", "", "e", "Landroid/view/MotionEvent;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.BlockitSlot$c */
    public static final class C27837c extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ BlockitSlot f69583a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C27837c(BlockitSlot blockitSlot) {
            this.f69583a = blockitSlot;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            IContentTapListener bVar = this.f69583a.f69578a;
            if (bVar != null) {
                bVar.mo99238g();
            }
            return super.onSingleTapConfirmed(motionEvent);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f69582e.mo4687a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitSlot(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C27837c cVar = new C27837c(this);
        this.f69581d = cVar;
        this.f69582e = new C0899e(getContext(), cVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f69579b, Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitSlot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        C27837c cVar = new C27837c(this);
        this.f69581d = cVar;
        this.f69582e = new C0899e(getContext(), cVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockitSlot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        C27837c cVar = new C27837c(this);
        this.f69581d = cVar;
        this.f69582e = new C0899e(getContext(), cVar);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        IBlockitSlotSizeChangedListener aVar = this.f69580c;
        if (aVar != null) {
            aVar.mo99217a(i, i2, i3, i4);
        }
    }
}
