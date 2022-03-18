package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.GestureAnimHandler;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.IMotionAction;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0012J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0014J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\"\u0010,\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020.J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0007H\u0002J\u0018\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020)H\u0002J\u0010\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u00107\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J0\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u0007H\u0014J\u0018\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0014J(\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0007H\u0014J\u0012\u0010F\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0016\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0007J\u000e\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020\u0019J\u000e\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006S"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "coordinateApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "getCoordinateApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "mGestureHandler", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GestureAnimHandler;", "mInitOffsetSnap", "mLayoutManagers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "Lkotlin/collections/ArrayList;", "mMaxOffsetY", "mMinOffsetY", "mOffsetX", "mOffsetY", "mScrollListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollViewListener;", "mSnapWith", "scrollAnimApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "getScrollAnimApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "addChildView", "", "child", "Landroid/view/View;", "addLayoutManager", "layoutManager", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "drawChildView", "drawingTime", "", "handleLayoutX", "offsetX", "handleMoveX", "dx", "handleMoveY", "dy", "isInterceptScrollY", "onGenericMotionEvent", "onInterceptTouchEvent", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "onTouchEvent", "setMinMaxOffsetY", "minOffsetY", "maxOffsetY", "setMotionHandler", "motion", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler;", "setScrollListener", "scrollListener", "setSnapWith", "snapWith", "Companion", "LayoutManager", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SnapScrollView extends FrameLayout {

    /* renamed from: f */
    public static final Companion f78954f = new Companion(null);

    /* renamed from: a */
    public int f78955a;

    /* renamed from: b */
    public int f78956b;

    /* renamed from: c */
    public int f78957c;

    /* renamed from: d */
    public int f78958d;

    /* renamed from: e */
    public GestureAnimHandler f78959e;

    /* renamed from: g */
    private int f78960g;

    /* renamed from: h */
    private int f78961h;

    /* renamed from: i */
    private final ArrayList<LayoutManager> f78962i;

    /* renamed from: j */
    private IScrollViewListener f78963j;

    /* renamed from: k */
    private final ICoordinateApi f78964k;

    /* renamed from: l */
    private final IScrollAnimApi f78965l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0016H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "", "()V", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "dispatchCancelTouchEvent", "", "cancelEvent", "Landroid/view/MotionEvent;", "dispatchEvent", "ev", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "isInterceptScrollY", "", "layoutChild", "offsetX", "", "offsetY", "reLayoutChild", "requestDisallowedIntercept", "scrollDx", "dx", "scrollDy", "dy", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$b */
    public static abstract class LayoutManager {
        /* renamed from: a */
        public abstract void mo111053a(int i, int i2);

        /* renamed from: a */
        public abstract void mo111054a(Canvas canvas, long j);

        /* renamed from: a */
        public void mo111055a(MotionEvent motionEvent) {
        }

        /* renamed from: b */
        public abstract void mo111063b(int i);

        /* renamed from: b */
        public abstract void mo111064b(int i, int i2);

        /* renamed from: b */
        public void mo111084b(MotionEvent motionEvent) {
        }

        /* renamed from: b */
        public boolean mo111065b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo111067c(int i);

        /* renamed from: c */
        public boolean mo111093c(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            return false;
        }
    }

    public SnapScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SnapScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$Companion;", "", "()V", "LONG_SCROLL_THRESHOLD", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ICoordinateApi getCoordinateApi() {
        return this.f78964k;
    }

    public final IScrollAnimApi getScrollAnimApi() {
        return this.f78965l;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$coordinateApi$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "getOffsetX", "", "getOffsetY", "getSnapWidth", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$c */
    public static final class C31220c implements ICoordinateApi {

        /* renamed from: a */
        final /* synthetic */ SnapScrollView f78967a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi
        /* renamed from: a */
        public int mo113242a() {
            return this.f78967a.f78955a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi
        /* renamed from: b */
        public int mo113243b() {
            return this.f78967a.f78956b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi
        /* renamed from: c */
        public int mo113244c() {
            return this.f78967a.f78958d;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31220c(SnapScrollView snapScrollView) {
            this.f78967a = snapScrollView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$scrollAnimApi$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "getGestureSource", "", "moveDeltaY", "", "dy", "moveOffsetSnap", "offsetSnap", "setForbidGesture", "isForbidGesture", "", "smoothDeltaSnap", "deltaSnap", "smoothToNearbySnap", "smoothToOffsetY", "toOffsetY", "smoothToOriginX", "movedListener", "Lkotlin/Function0;", "smoothToSnap", "targetSnap", "gestureSource", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$d */
    public static final class C31221d implements IScrollAnimApi {

        /* renamed from: a */
        final /* synthetic */ SnapScrollView f78968a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$d$b */
        static final class C31223b extends Lambda implements Function0<Unit> {
            final /* synthetic */ boolean $isLongMove;
            final /* synthetic */ Function0 $movedListener;
            final /* synthetic */ C31221d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31223b(C31221d dVar, Function0 function0, boolean z) {
                super(0);
                this.this$0 = dVar;
                this.$movedListener = function0;
                this.$isLongMove = z;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.$movedListener.invoke();
                if (this.$isLongMove) {
                    this.this$0.mo113253d(0);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: a */
        public void mo113245a() {
            SnapScrollView.m116663a(this.f78968a).mo113268a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: b */
        public int mo113250b() {
            return SnapScrollView.m116663a(this.f78968a).mo113280b();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$d$a */
        static final class C31222a extends Lambda implements Function0<Unit> {
            final /* synthetic */ Integer $finalOffsetSnap;
            final /* synthetic */ C31221d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31222a(C31221d dVar, Integer num) {
                super(0);
                this.this$0 = dVar;
                this.$finalOffsetSnap = num;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                Integer num = this.$finalOffsetSnap;
                if (num != null) {
                    num.intValue();
                    this.this$0.mo113253d(this.$finalOffsetSnap.intValue());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView$d$c */
        static final class C31224c extends Lambda implements Function0<Unit> {
            final /* synthetic */ Integer $finalOffsetSnap;
            final /* synthetic */ C31221d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31224c(C31221d dVar, Integer num) {
                super(0);
                this.this$0 = dVar;
                this.$finalOffsetSnap = num;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                Integer num = this.$finalOffsetSnap;
                if (num != null) {
                    num.intValue();
                    this.this$0.mo113253d(this.$finalOffsetSnap.intValue());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31221d(SnapScrollView snapScrollView) {
            this.f78968a = snapScrollView;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: c */
        public void mo113252c(int i) {
            this.f78968a.mo113222a(i, false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: a */
        public void mo113249a(boolean z) {
            SnapScrollView.m116663a(this.f78968a).mo113278a(z);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: b */
        public void mo113251b(int i) {
            SnapScrollView.m116663a(this.f78968a).mo113269a(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: d */
        public void mo113253d(int i) {
            if (this.f78968a.f78958d == 0) {
                this.f78968a.f78957c = i;
                return;
            }
            this.f78968a.mo113220a((-this.f78968a.f78958d) * i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: a */
        public void mo113246a(int i) {
            Integer num;
            if (Math.abs(i) <= 10 || this.f78968a.f78958d <= 0) {
                num = null;
            } else {
                num = Integer.valueOf((this.f78968a.f78955a / this.f78968a.f78958d) + i);
            }
            SnapScrollView.m116663a(this.f78968a).mo113273a(i, new C31222a(this, num));
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: a */
        public void mo113248a(Function0<Unit> function0) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(function0, "movedListener");
            if (this.f78968a.f78958d <= 0 || Math.abs(this.f78968a.f78955a / this.f78968a.f78958d) <= 10) {
                z = false;
            } else {
                z = true;
            }
            SnapScrollView.m116663a(this.f78968a).mo113279a(z, new C31223b(this, function0, z));
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi
        /* renamed from: a */
        public void mo113247a(int i, int i2) {
            Integer num;
            if (Math.abs(i) <= 10 || this.f78968a.f78958d <= 0) {
                num = null;
            } else {
                num = Integer.valueOf(i);
            }
            SnapScrollView.m116663a(this.f78968a).mo113270a(i, i2, new C31224c(this, num));
        }
    }

    /* renamed from: a */
    public final void mo113223a(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public final void setScrollListener(IScrollViewListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "scrollListener");
        this.f78963j = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ GestureAnimHandler m116663a(SnapScrollView snapScrollView) {
        GestureAnimHandler cVar = snapScrollView.f78959e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        return cVar;
    }

    public final void setSnapWith(int i) {
        this.f78958d = i;
        int i2 = this.f78957c;
        if (i2 != 0) {
            mo113220a((-i) * i2);
        }
        this.f78957c = 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<T> it = this.f78962i.iterator();
        while (it.hasNext()) {
            it.next().mo111055a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        GestureAnimHandler cVar = this.f78959e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        cVar.mo113274a(motionEvent);
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void setMotionHandler(BaseMotionHandler aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "motion");
        GestureAnimHandler cVar = this.f78959e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        cVar.mo113276a(aVar);
    }

    /* renamed from: a */
    public final void mo113220a(int i) {
        if (this.f78958d > 0) {
            this.f78955a = i;
            Iterator<T> it = this.f78962i.iterator();
            while (it.hasNext()) {
                it.next().mo111053a(this.f78955a, this.f78956b);
            }
            float f = ((float) this.f78955a) / ((float) this.f78958d);
            IScrollViewListener cVar = this.f78963j;
            if (cVar != null) {
                cVar.mo111111a(f);
            }
            invalidate();
        }
    }

    /* renamed from: b */
    public final void mo113226b(int i) {
        if (this.f78958d > 0 && i != 0) {
            int i2 = -i;
            this.f78955a += i2;
            Iterator<T> it = this.f78962i.iterator();
            while (it.hasNext()) {
                it.next().mo111063b(i2);
            }
            float f = ((float) this.f78955a) / ((float) this.f78958d);
            IScrollViewListener cVar = this.f78963j;
            if (cVar != null) {
                cVar.mo111111a(f);
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        long drawingTime = getDrawingTime();
        Iterator<T> it = this.f78962i.iterator();
        while (it.hasNext()) {
            it.next().mo111054a(canvas, drawingTime);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList<LayoutManager> arrayList = this.f78962i;
        boolean z = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo111065b()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        GestureAnimHandler cVar = this.f78959e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        cVar.mo113275a(motionEvent, z);
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo113224a(LayoutManager bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "layoutManager");
        this.f78962i.add(bVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent == null) {
            return false;
        }
        Iterator<T> it = this.f78962i.iterator();
        while (it.hasNext()) {
            if (it.next().mo111093c(motionEvent)) {
                return false;
            }
        }
        ArrayList<LayoutManager> arrayList = this.f78962i;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().mo111065b()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        GestureAnimHandler cVar = this.f78959e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        cVar.mo113275a(motionEvent, z);
        if (motionEvent.getAction() == 0) {
            GestureAnimHandler cVar2 = this.f78959e;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
            }
            if (cVar2.mo113282d()) {
                return true;
            }
        }
        GestureAnimHandler cVar3 = this.f78959e;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        if (cVar3.mo113281c()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            Iterator<T> it3 = this.f78962i.iterator();
            while (it3.hasNext()) {
                it3.next().mo111084b(obtain);
            }
        }
        GestureAnimHandler cVar4 = this.f78959e;
        if (cVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        if (cVar4.mo113281c() || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo113221a(int i, int i2) {
        if (this.f78960g != i2 || this.f78961h != i) {
            this.f78961h = i;
            this.f78960g = i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        IScrollViewListener cVar;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.f78958d = size;
        if (size != 0 && size2 != 0 && (cVar = this.f78963j) != null) {
            cVar.mo111112a(size, size2);
        }
    }

    /* renamed from: a */
    public final void mo113222a(int i, boolean z) {
        if (this.f78958d > 0) {
            if (z) {
                ArrayList<LayoutManager> arrayList = new ArrayList();
                for (T t : this.f78962i) {
                    if (t.mo111065b()) {
                        arrayList.add(t);
                    }
                }
                for (LayoutManager bVar : arrayList) {
                    bVar.mo111067c(i);
                }
                return;
            }
            if (this.f78960g < 0) {
                this.f78960g = 0;
            }
            int i2 = this.f78956b;
            int i3 = i2 - i;
            int i4 = this.f78960g;
            if (i3 > i4 || i3 < (i4 = this.f78961h)) {
                i3 = i4;
            }
            int i5 = i3 - i2;
            if (i5 != 0) {
                this.f78956b = i3;
                Iterator<T> it = this.f78962i.iterator();
                while (it.hasNext()) {
                    it.next().mo111067c(i5);
                }
                invalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78960g = Integer.MAX_VALUE;
        this.f78961h = Integer.MIN_VALUE;
        this.f78962i = new ArrayList<>();
        C31220c cVar = new C31220c(this);
        this.f78964k = cVar;
        this.f78965l = new C31221d(this);
        setWillNotDraw(false);
        GestureAnimHandler cVar2 = new GestureAnimHandler(context, cVar);
        this.f78959e = cVar2;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGestureHandler");
        }
        cVar2.mo113277a(new IMotionAction(this) {
            /* class com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.C312191 */

            /* renamed from: a */
            final /* synthetic */ SnapScrollView f78966a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f78966a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.IMotionAction
            /* renamed from: a */
            public void mo113240a(int i) {
                this.f78966a.mo113226b(i);
            }

            @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.IMotionAction
            /* renamed from: a */
            public void mo113241a(int i, boolean z) {
                this.f78966a.mo113222a(i, z);
            }
        });
    }

    /* renamed from: a */
    public final boolean mo113225a(Canvas canvas, View view, long j) {
        if (view == null || canvas == null) {
            return false;
        }
        return drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        IScrollViewListener cVar = this.f78963j;
        if (cVar != null) {
            cVar.mo111113a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator<T> it = this.f78962i.iterator();
        while (it.hasNext()) {
            it.next().mo111064b(this.f78955a, this.f78956b);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
