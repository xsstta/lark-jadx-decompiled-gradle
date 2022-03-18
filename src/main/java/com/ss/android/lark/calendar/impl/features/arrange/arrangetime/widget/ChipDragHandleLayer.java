package com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.ui.dragger.AbstractC26202c;
import com.larksuite.framework.ui.dragger.AbstractC26221l;
import com.larksuite.framework.ui.dragger.C26201b;
import com.larksuite.framework.ui.dragger.C26203d;
import com.larksuite.framework.ui.dragger.C26204e;
import com.larksuite.framework.ui.dragger.C26205f;
import com.larksuite.framework.ui.dragger.C26206g;
import com.larksuite.framework.ui.dragger.C26213k;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30124b;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30149n;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30125c;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30130h;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.C30132j;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.DragTargetOptionBuilder;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30167c;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.utils.ao;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\u0018\u0000 h2\u00020\u0001:\u0002hiB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u00102\u001a\u000203J\u0018\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0002J\u0014\u00107\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u00108\u001a\u000209H\u0002J\u0006\u0010:\u001a\u000203J\u0006\u0010;\u001a\u00020\tJ\n\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0006\u0010>\u001a\u00020\tJ \u0010?\u001a\u0002032\u0006\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020CH\u0002J \u0010?\u001a\u0002032\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u0010D\u001a\u00020\tH\u0002J\u0010\u0010E\u001a\u0002032\u0006\u00108\u001a\u00020$H\u0002J\u0010\u0010F\u001a\u0002032\u0006\u00108\u001a\u00020&H\u0002J\u0010\u0010G\u001a\u0002032\u0006\u00108\u001a\u00020(H\u0002J\u0010\u0010H\u001a\u0002032\u0006\u00108\u001a\u00020*H\u0002J\u0010\u0010I\u001a\u0002032\u0006\u00108\u001a\u00020,H\u0002J \u0010J\u001a\u0002032\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u0010K\u001a\u00020\tH\u0002J\u0018\u0010L\u001a\u0002032\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\tH\u0002J\u0006\u0010M\u001a\u000203J\b\u0010N\u001a\u000203H\u0002J\"\u0010O\u001a\u00020\u00132\b\u0010P\u001a\u0004\u0018\u00010\u000f2\u0006\u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020 H\u0002J\u0010\u0010S\u001a\u00020\u00132\u0006\u0010B\u001a\u00020CH\u0016J\u0006\u0010T\u001a\u000203J\u0010\u0010U\u001a\u0002032\u0006\u0010D\u001a\u00020\tH\u0002J\u000e\u0010V\u001a\u0002032\u0006\u0010W\u001a\u00020\u0011J\u000e\u0010X\u001a\u0002032\u0006\u0010Y\u001a\u00020\u0013J\u0006\u0010Z\u001a\u000203J\u000e\u0010[\u001a\u0002032\u0006\u0010\\\u001a\u00020\u0013J\u000e\u0010]\u001a\u0002032\u0006\u0010^\u001a\u00020\tJ\u000e\u0010_\u001a\u0002032\u0006\u0010^\u001a\u00020\tJ\u0016\u0010`\u001a\u0002032\u0006\u0010a\u001a\u00020\t2\u0006\u0010b\u001a\u00020\tJ\u000e\u0010c\u001a\u0002032\u0006\u0010d\u001a\u00020\u001bJ\u000e\u0010e\u001a\u0002032\u0006\u0010f\u001a\u00020\u001eJ\u0006\u0010g\u001a\u000203R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006j"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dragHandler", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/dragdrop/IDragEventHandler;", "Landroid/view/View;", "mActionListener", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$OnActionListener;", "mAnimOnClickAppendChip", "", "mCanClick", "mChipAwaysShow", "mChipDragHandle", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/dragdrop/EventChipDragHandle;", "mDragGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/dragdrop/IEventChipGridLine;", "mDragger", "Lcom/larksuite/framework/ui/dragger/Dragger;", "mEndDayMinutes", "mGridLine", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipsGridLine;", "mMotionEventX", "", "mMotionEventY", "mOnDragEndEventListener", "Lcom/larksuite/framework/ui/dragger/OnDragEventListener;", "Lcom/larksuite/framework/ui/dragger/DragEndEvent;", "mOnDragInEventListener", "Lcom/larksuite/framework/ui/dragger/DragInEvent;", "mOnDragMoveEventListener", "Lcom/larksuite/framework/ui/dragger/DragMoveEvent;", "mOnDragOutEventListener", "Lcom/larksuite/framework/ui/dragger/DragOutEvent;", "mOnDragStartEventListener", "Lcom/larksuite/framework/ui/dragger/DragStartEvent;", "mStartDayMinutes", "mTimeChipMinHeight", "mTimeChipWidth", "prevTimeChipBottom", "prevTimeChipTop", "bringTimeChipToFront", "", "checkLessMinHeight", "startPos", "endPos", "createDragHandler", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragEvent;", "enableClick", "getEndPos", "getNewlayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "getStartPos", "handleClick", "upX", "upY", "ev", "Landroid/view/MotionEvent;", "clickPos", "handleDragEnd", "handleDragIn", "handleDragMove", "handleDragOut", "handleDragStart", "handleTimeUnit", "checkUnit", "handleTimeUnitChecked", "hideDragChipIfNotAwaysShow", "initDraggerForChip", "isLocationInView", "view", "rawX", "rawY", "onInterceptTouchEvent", "refreshTimeView", "refreshTimeViewAnim", "setActionListener", "listener", "setAnimOnClickAppendChip", "isAnim", "setAppendChip", "setChipAwaysShow", "chipAwaysShow", "setChipWidth", "chipWidth", "setChipWidthAndrefresh", "setDayMinutes", "startDayMinutes", "endDayMinutes", "setDragger", "dragger", "setGridLine", "gridLine", "setTimeChip", "Companion", "OnActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChipDragHandleLayer extends FrameLayout {

    /* renamed from: f */
    public static final Companion f75479f = new Companion(null);

    /* renamed from: a */
    public OnActionListener f75480a;

    /* renamed from: b */
    public int f75481b;

    /* renamed from: c */
    public int f75482c;

    /* renamed from: d */
    public C26213k f75483d;

    /* renamed from: e */
    public C30167c f75484e;

    /* renamed from: g */
    private C30132j f75485g;

    /* renamed from: h */
    private int f75486h;

    /* renamed from: i */
    private int f75487i;

    /* renamed from: j */
    private float f75488j;

    /* renamed from: k */
    private float f75489k;

    /* renamed from: l */
    private boolean f75490l;

    /* renamed from: m */
    private AbstractC30150o f75491m;

    /* renamed from: n */
    private AbstractC30149n<View> f75492n;

    /* renamed from: o */
    private int f75493o;

    /* renamed from: p */
    private int f75494p;

    /* renamed from: q */
    private boolean f75495q;

    /* renamed from: r */
    private boolean f75496r;

    /* renamed from: s */
    private final AbstractC26221l<C26206g> f75497s;

    /* renamed from: t */
    private final AbstractC26221l<C26204e> f75498t;

    /* renamed from: u */
    private final AbstractC26221l<C26201b> f75499u;

    /* renamed from: v */
    private final AbstractC26221l<C26203d> f75500v;

    /* renamed from: w */
    private final AbstractC26221l<C26205f> f75501w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J(\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$OnActionListener;", "", "onAppendClick", "", "onChipHandleGone", "onChipHandleVisible", "onClick", "startPos", "", "endPos", "startDayMinutes", "endDayMinutes", "onClickPos", "clickScrollY", "onDragging", "onEndDrag", "onStartDrag", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$b */
    public interface OnActionListener {
        /* renamed from: a */
        void mo108960a();

        /* renamed from: a */
        void mo108961a(int i);

        /* renamed from: a */
        void mo108962a(int i, int i2, int i3, int i4);

        /* renamed from: b */
        void mo108963b();

        /* renamed from: b */
        void mo108964b(int i, int i2, int i3, int i4);

        /* renamed from: c */
        void mo108965c();

        /* renamed from: d */
        void mo108966d();

        /* renamed from: e */
        void mo108967e();
    }

    /* renamed from: e */
    public final void mo109038e() {
        this.f75490l = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$Companion;", "", "()V", "DEFAULT_CHECK_UNIT", "", "MIN_HEIGHT_MINUTE", "NO_CHECK_UNIT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo109029a(C26203d dVar) {
        C26213k kVar = this.f75483d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar.mo93240c(this);
        dVar.mo93195a(this.f75485g);
    }

    /* renamed from: a */
    public final void mo109031a(C26205f fVar) {
        C26213k kVar = this.f75483d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar.mo93240c(this);
    }

    /* renamed from: a */
    public final void mo109032a(C26206g gVar) {
        OnActionListener bVar = this.f75480a;
        if (bVar != null) {
            bVar.mo108960a();
        }
        gVar.mo93195a(this.f75485g);
        C26213k kVar = this.f75483d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar.mo93240c(this);
        m112139a((AbstractC26202c) gVar);
        AbstractC30149n<View> nVar = this.f75492n;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        nVar.mo108610a(gVar, gVar.mo93202i());
    }

    /* renamed from: a */
    public final void mo109030a(C26204e eVar) {
        if (Intrinsics.areEqual(eVar.mo93207b(), this)) {
            eVar.mo93195a(this.f75485g);
            AbstractC30149n<View> nVar = this.f75492n;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
            }
            nVar.mo108608a(eVar, eVar.mo93202i());
        }
    }

    /* renamed from: c */
    public final void mo109035c() {
        C30132j jVar = this.f75485g;
        if (jVar != null) {
            jVar.bringToFront();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$setGridLine$1", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/dragdrop/IEventChipGridLine;", "getIndexByPosition", "", "position", "getMaxBottom", "getMinEventChipHeight", "getMinTop", "getRectByPositionWithCheck", "Landroid/graphics/Rect;", "x", "", "y", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$k */
    public static final class C30221k implements AbstractC30150o {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75514a;

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public int mo108690a() {
            return ChipDragHandleLayer.m112140a(this.f75514a).mo108768a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: b */
        public int mo108693b() {
            return ChipDragHandleLayer.m112140a(this.f75514a).mo108775b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: c */
        public int mo108694c() {
            return ChipDragHandleLayer.m112140a(this.f75514a).mo108778c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30221k(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75514a = chipDragHandleLayer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public int mo108691a(int i) {
            return ChipDragHandleLayer.m112140a(this.f75514a).mo108769a((float) i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.AbstractC30150o
        /* renamed from: a */
        public Rect mo108692a(float f, float f2) {
            Rect a = ChipDragHandleLayer.m112140a(this.f75514a).mo108771a(f, f2);
            Intrinsics.checkExpressionValueIsNotNull(a, "mGridLine.getRectByPositionWithCheck(x, y)");
            return a;
        }
    }

    /* renamed from: d */
    public final void mo109037d() {
        C30132j jVar;
        FrameLayout.LayoutParams newlayoutParams = getNewlayoutParams();
        if (newlayoutParams != null && (jVar = this.f75485g) != null) {
            jVar.setLayoutParams(newlayoutParams);
        }
    }

    /* renamed from: f */
    public final void mo109039f() {
        C30132j jVar;
        if (!this.f75495q && (jVar = this.f75485g) != null) {
            jVar.setVisibility(8);
        }
    }

    public final int getStartPos() {
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        return cVar.mo108776b(this.f75481b);
    }

    public final int getEndPos() {
        int i = this.f75482c - this.f75481b;
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        return cVar.mo108776b(i + this.f75481b);
    }

    private final FrameLayout.LayoutParams getNewlayoutParams() {
        int startPos = getStartPos();
        int endPos = getEndPos();
        this.f75493o = startPos;
        this.f75494p = endPos;
        int round = (int) Math.round((double) (endPos - startPos));
        int dp2px = this.f75486h - UIUtils.dp2px(getContext(), 1.0f);
        if (round <= 0) {
            round = this.f75487i;
        }
        C30132j jVar = this.f75485g;
        if (jVar != null) {
            return jVar.mo108644a(dp2px, round, 0, startPos);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo109033b() {
        C30132j jVar = this.f75485g;
        if (jVar != null) {
            removeView(jVar);
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        TimeChipDragHandle dVar = new TimeChipDragHandle(context);
        this.f75485g = dVar;
        addView(dVar);
        C30132j jVar2 = this.f75485g;
        if (jVar2 != null) {
            jVar2.setVisibility(8);
        }
        m112147g();
    }

    /* renamed from: g */
    private final void m112147g() {
        AbstractC30124b bVar;
        C26213k kVar = this.f75483d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        C30132j jVar = this.f75485g;
        AbstractC30124b bVar2 = null;
        if (jVar != null) {
            bVar = jVar.getTopDragHandle();
        } else {
            bVar = null;
        }
        kVar.mo93231a(bVar, DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
        C26213k kVar2 = this.f75483d;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        C30132j jVar2 = this.f75485g;
        if (jVar2 != null) {
            bVar2 = jVar2.getBottomDragHandle();
        }
        kVar2.mo93231a(bVar2, DragTargetOptionBuilder.m111527a(DragTargetOptionBuilder.Style.TOUCH_DOWN_NO_DRAG_VIEW));
        C26213k kVar3 = this.f75483d;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar3.mo93232a(C26206g.class, this.f75497s);
        C26213k kVar4 = this.f75483d;
        if (kVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar4.mo93232a(C26204e.class, this.f75498t);
        C26213k kVar5 = this.f75483d;
        if (kVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar5.mo93232a(C26201b.class, this.f75499u);
        C26213k kVar6 = this.f75483d;
        if (kVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar6.mo93232a(C26203d.class, this.f75500v);
        C26213k kVar7 = this.f75483d;
        if (kVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar7.mo93232a(C26205f.class, this.f75501w);
        C26213k kVar8 = this.f75483d;
        if (kVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        kVar8.mo93230a(this);
    }

    /* renamed from: a */
    public final void mo109026a() {
        C30132j jVar = this.f75485g;
        if (jVar != null) {
            removeView(jVar);
        }
        C30125c cVar = new C30125c(getContext(), null, 0);
        this.f75485g = cVar;
        addView(cVar);
        C30132j jVar2 = this.f75485g;
        if (jVar2 != null) {
            jVar2.setOnClickListener(new View$OnClickListenerC30220j(this));
        }
        C30132j jVar3 = this.f75485g;
        if (jVar3 != null) {
            jVar3.setVisibility(8);
        }
        m112147g();
    }

    public final void setAnimOnClickAppendChip(boolean z) {
        this.f75496r = z;
    }

    public final void setChipAwaysShow(boolean z) {
        this.f75495q = z;
    }

    public final void setChipWidth(int i) {
        this.f75486h = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$createDragHandler$onTimeDrag$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$OnEventSelected;", "onEventCancel", "", "onEventSelect", "index", "", "startPos", "endPos", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$c */
    public static final class C30213c implements CalendarDaysContract.AbstractC30656b {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75502a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108688a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30213c(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75502a = chipDragHandleLayer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract.AbstractC30656b
        /* renamed from: a */
        public void mo108689a(int i, int i2, int i3) {
            if (!this.f75502a.mo109036c(i2, i3)) {
                this.f75502a.mo109034b(i2, i3);
            }
            this.f75502a.mo109037d();
            OnActionListener bVar = this.f75502a.f75480a;
            if (bVar != null) {
                bVar.mo108964b(i2, i3, this.f75502a.f75481b, this.f75502a.f75482c);
            }
        }
    }

    public final void setActionListener(OnActionListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f75480a = bVar;
    }

    public final void setDragger(C26213k kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "dragger");
        this.f75483d = kVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragEndEvent;", "kotlin.jvm.PlatformType", "onDragEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$d */
    static final class C30214d<T extends AbstractC26202c> implements AbstractC26221l<C26201b> {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75503a;

        C30214d(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75503a = chipDragHandleLayer;
        }

        /* renamed from: a */
        public final void mo93270a(C26201b bVar) {
            ChipDragHandleLayer chipDragHandleLayer = this.f75503a;
            Intrinsics.checkExpressionValueIsNotNull(bVar, "dragEvent");
            chipDragHandleLayer.mo109028a(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragInEvent;", "kotlin.jvm.PlatformType", "onDragEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$e */
    static final class C30215e<T extends AbstractC26202c> implements AbstractC26221l<C26203d> {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75504a;

        C30215e(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75504a = chipDragHandleLayer;
        }

        /* renamed from: a */
        public final void mo93270a(C26203d dVar) {
            ChipDragHandleLayer chipDragHandleLayer = this.f75504a;
            Intrinsics.checkExpressionValueIsNotNull(dVar, "dragEvent");
            chipDragHandleLayer.mo109029a(dVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragMoveEvent;", "kotlin.jvm.PlatformType", "onDragEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$f */
    static final class C30216f<T extends AbstractC26202c> implements AbstractC26221l<C26204e> {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75505a;

        C30216f(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75505a = chipDragHandleLayer;
        }

        /* renamed from: a */
        public final void mo93270a(C26204e eVar) {
            ChipDragHandleLayer chipDragHandleLayer = this.f75505a;
            Intrinsics.checkExpressionValueIsNotNull(eVar, "dragEvent");
            chipDragHandleLayer.mo109030a(eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragOutEvent;", "kotlin.jvm.PlatformType", "onDragEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$g */
    static final class C30217g<T extends AbstractC26202c> implements AbstractC26221l<C26205f> {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75506a;

        C30217g(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75506a = chipDragHandleLayer;
        }

        /* renamed from: a */
        public final void mo93270a(C26205f fVar) {
            ChipDragHandleLayer chipDragHandleLayer = this.f75506a;
            Intrinsics.checkExpressionValueIsNotNull(fVar, "dragEvent");
            chipDragHandleLayer.mo109031a(fVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "dragEvent", "Lcom/larksuite/framework/ui/dragger/DragStartEvent;", "kotlin.jvm.PlatformType", "onDragEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$h */
    static final class C30218h<T extends AbstractC26202c> implements AbstractC26221l<C26206g> {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75507a;

        C30218h(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75507a = chipDragHandleLayer;
        }

        /* renamed from: a */
        public final void mo93270a(C26206g gVar) {
            ChipDragHandleLayer chipDragHandleLayer = this.f75507a;
            Intrinsics.checkExpressionValueIsNotNull(gVar, "dragEvent");
            chipDragHandleLayer.mo109032a(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$j */
    static final class View$OnClickListenerC30220j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChipDragHandleLayer f75513a;

        View$OnClickListenerC30220j(ChipDragHandleLayer chipDragHandleLayer) {
            this.f75513a = chipDragHandleLayer;
        }

        public final void onClick(View view) {
            OnActionListener bVar = this.f75513a.f75480a;
            if (bVar != null) {
                bVar.mo108965c();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipDragHandleLayer(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ C30167c m112140a(ChipDragHandleLayer chipDragHandleLayer) {
        C30167c cVar = chipDragHandleLayer.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C26213k m112145b(ChipDragHandleLayer chipDragHandleLayer) {
        C26213k kVar = chipDragHandleLayer.f75483d;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragger");
        }
        return kVar;
    }

    public final void setChipWidthAndrefresh(int i) {
        this.f75486h = i;
        C30132j jVar = this.f75485g;
        if (jVar != null) {
            ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
            layoutParams.width = this.f75486h;
            jVar.setLayoutParams(layoutParams);
        }
    }

    public final void setGridLine(C30167c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "gridLine");
        this.f75484e = cVar;
        this.f75491m = new C30221k(this);
    }

    /* renamed from: a */
    private final AbstractC30149n<?> m112139a(AbstractC26202c cVar) {
        C30213c cVar2 = new C30213c(this);
        AbstractC30149n<View> a = C30130h.m111575a(cVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "DragEventHandlerHelper.c…agEventHandler(dragEvent)");
        this.f75492n = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        AbstractC30150o oVar = this.f75491m;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragGridLine");
        }
        a.mo108611a(AbstractC30150o.class, oVar);
        AbstractC30149n<View> nVar = this.f75492n;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        nVar.mo108611a(CalendarDaysContract.AbstractC30656b.class, cVar2);
        AbstractC30149n<View> nVar2 = this.f75492n;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        return nVar2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$refreshTimeViewAnim$1$1$1", "com/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/ChipDragHandleLayer$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.ChipDragHandleLayer$i */
    public static final class C30219i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C30132j f75508a;

        /* renamed from: b */
        final /* synthetic */ int f75509b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout.LayoutParams f75510c;

        /* renamed from: d */
        final /* synthetic */ ChipDragHandleLayer f75511d;

        /* renamed from: e */
        final /* synthetic */ int f75512e;

        C30219i(C30132j jVar, int i, FrameLayout.LayoutParams layoutParams, ChipDragHandleLayer chipDragHandleLayer, int i2) {
            this.f75508a = jVar;
            this.f75509b = i;
            this.f75510c = layoutParams;
            this.f75511d = chipDragHandleLayer;
            this.f75512e = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                int i = (int) floatValue;
                this.f75508a.setTop(i);
                this.f75508a.setBottom(i + this.f75510c.height);
                ChipDragHandleLayer.m112145b(this.f75511d).mo93239c();
                if (floatValue == ((float) this.f75509b)) {
                    ChipDragHandleLayer.m112145b(this.f75511d).mo93238b();
                    this.f75508a.setLayoutParams(this.f75510c);
                    OnActionListener bVar = this.f75511d.f75480a;
                    if (bVar != null) {
                        bVar.mo108961a(this.f75512e);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f75488j = motionEvent.getX();
            this.f75489k = motionEvent.getY();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (ao.m125229a(this.f75488j, this.f75489k, x, y)) {
                return false;
            }
            C26213k kVar = this.f75483d;
            if (kVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDragger");
            }
            if (kVar.mo93242d() || !this.f75490l) {
                return false;
            }
            m112141a(x, y, motionEvent);
            return false;
        }
    }

    /* renamed from: a */
    private final void m112142a(int i) {
        C30132j jVar;
        FrameLayout.LayoutParams newlayoutParams = getNewlayoutParams();
        if (newlayoutParams != null && (jVar = this.f75485g) != null) {
            int top = jVar.getTop();
            int i2 = newlayoutParams.topMargin;
            if (this.f75495q) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat((float) top, (float) i2);
                Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new C30219i(jVar, i2, newlayoutParams, this, i));
                ofFloat.start();
                return;
            }
            jVar.setLayoutParams(newlayoutParams);
            OnActionListener bVar = this.f75480a;
            if (bVar != null) {
                bVar.mo108961a(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo109028a(C26201b bVar) {
        OnActionListener bVar2 = this.f75480a;
        if (bVar2 != null) {
            bVar2.mo108963b();
        }
        bVar.mo93195a(this.f75485g);
        AbstractC30149n<View> nVar = this.f75492n;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        nVar.mo108605a(bVar, bVar.mo93202i());
        AbstractC30149n<View> nVar2 = this.f75492n;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragHandler");
        }
        nVar2.mo108604a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipDragHandleLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo109027a(int i, int i2) {
        C30132j jVar;
        this.f75481b = i;
        this.f75482c = i2;
        if (this.f75495q && (jVar = this.f75485g) != null) {
            jVar.setVisibility(0);
        }
        mo109037d();
    }

    /* renamed from: c */
    public final boolean mo109036c(int i, int i2) {
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        int a = cVar.mo108770a(i) / 60;
        C30167c cVar2 = this.f75484e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        if ((cVar2.mo108770a(i2) / 60) - a < 15) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo109034b(int i, int i2) {
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        int i3 = cVar.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i).top;
        C30167c cVar2 = this.f75484e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        m112143a(i3, cVar2.mo108771a(BitmapDescriptorFactory.HUE_RED, (float) i2).top, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipDragHandleLayer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m112141a(float f, float f2, MotionEvent motionEvent) {
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        Rect b = cVar.mo108777b(f, f2);
        if (b == null) {
            b = new Rect();
        }
        if (!this.f75495q) {
            C30132j jVar = this.f75485g;
            if (jVar == null || jVar.getVisibility() != 8) {
                C30132j jVar2 = this.f75485g;
                if (jVar2 != null) {
                    jVar2.setVisibility(8);
                }
                OnActionListener bVar = this.f75480a;
                if (bVar != null) {
                    bVar.mo108966d();
                    return;
                }
                return;
            }
            C30132j jVar3 = this.f75485g;
            if (jVar3 != null) {
                jVar3.setVisibility(0);
            }
            m112146b(b.top, b.bottom, (int) f2);
            OnActionListener bVar2 = this.f75480a;
            if (bVar2 != null) {
                bVar2.mo108967e();
            }
        } else if (!m112144a(this.f75485g, motionEvent.getRawX(), motionEvent.getRawY()) || this.f75496r) {
            m112146b(b.top, b.bottom, (int) f2);
        }
    }

    /* renamed from: b */
    private final void m112146b(int i, int i2, int i3) {
        int round = Math.round(((float) (i2 - i)) * (((float) (this.f75482c - this.f75481b)) / 60.0f)) + i;
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        if (i < cVar.mo108768a()) {
            int i4 = round - i;
            C30167c cVar2 = this.f75484e;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
            }
            round = i4 + cVar2.mo108768a();
            C30167c cVar3 = this.f75484e;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
            }
            i = cVar3.mo108768a();
        } else {
            C30167c cVar4 = this.f75484e;
            if (cVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
            }
            if (round > cVar4.mo108775b()) {
                C30167c cVar5 = this.f75484e;
                if (cVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
                }
                i = cVar5.mo108775b() - (round - i);
                C30167c cVar6 = this.f75484e;
                if (cVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
                }
                round = cVar6.mo108775b();
            }
        }
        m112143a(i, round, 5);
        m112142a(i3);
        OnActionListener bVar = this.f75480a;
        if (bVar != null) {
            bVar.mo108962a(i, round, this.f75481b, this.f75482c);
        }
    }

    /* renamed from: a */
    private final void m112143a(int i, int i2, int i3) {
        C30167c cVar = this.f75484e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        this.f75481b = Math.max(0, cVar.mo108770a(i) / 60);
        C30167c cVar2 = this.f75484e;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLine");
        }
        int a = cVar2.mo108770a(i2) / 60;
        this.f75482c = a;
        int i4 = this.f75481b;
        int i5 = ((i4 / 3600) * 3600) + (((i4 % 3600) / i3) * i3);
        this.f75481b = i5;
        this.f75481b = i5;
        int i6 = ((a / 3600) * 3600) + (((a % 3600) / i3) * i3);
        this.f75482c = i6;
        this.f75482c = i6;
    }

    /* renamed from: a */
    private final boolean m112144a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(f, f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipDragHandleLayer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f75486h = UIUtils.dp2px(getContext(), 10.0f);
        this.f75487i = UIUtils.dp2px(getContext(), 4.0f);
        this.f75496r = true;
        this.f75497s = new C30218h(this);
        this.f75498t = new C30216f(this);
        this.f75499u = new C30214d(this);
        this.f75500v = new C30215e(this);
        this.f75501w = new C30217g(this);
    }
}
