package com.ss.android.lark.calendar.impl.features.calendarview.days.layers;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.gridline.C30166b;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DragDrawChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.drag.PiecesDragger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsBitmapPool;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsDataHandler;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsLayerApi;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.DelayClickerTarget;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.DelayStyleClicker;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.OnClickStyleChangedListener;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.OnPieceClickedListener;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.PiecesClickTarget;
import com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.PiecesClickTrigger;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.ChipsBitmapUtil;
import com.ss.android.lark.calendar.impl.features.calendarview.days.widget.RedTimeLine;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchMemoryMonitor;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 X2\u00020\u0001:\u0002WXB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ:\u00100\u001a\u0002012\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`52\b\u00106\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020#H\u0002J2\u00109\u001a\u00020#2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`52\b\u00106\u001a\u0004\u0018\u0001042\u0006\u00108\u001a\u00020#H\u0002J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u000201J\u0006\u0010>\u001a\u000201J\u0006\u0010?\u001a\u00020\u0015J\u0006\u0010@\u001a\u00020\u0007J\u0006\u0010A\u001a\u00020#J\u0010\u0010B\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010C\u001a\u000201H\u0014J\u0010\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020FH\u0014J\u0012\u0010G\u001a\u00020#2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u000201H\u0002J\u000e\u0010K\u001a\u0002012\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010L\u001a\u0002012\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020\fJ\u0010\u0010O\u001a\u0002012\b\u0010 \u001a\u0004\u0018\u00010!J\u000e\u0010P\u001a\u0002012\u0006\u0010Q\u001a\u00020\u0007J\u0016\u0010R\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010S\u001a\u0002012\b\u0010T\u001a\u0004\u0018\u00010UJ\b\u0010V\u001a\u000201H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmapPool", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsBitmapPool;", "chipClickedListener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$ChipClickedListener;", "chipPaint", "Landroid/graphics/Paint;", "chipPool", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/gridline/EventChipViewPool;", "chipTopMargin", "chipsBitmap", "Landroid/graphics/Bitmap;", "chipsDataHandler", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsDataHandler;", "value", "currentDay", "getCurrentDay", "()I", "setCurrentDay", "(I)V", "dayHeight", "dayWidth", "delayStyleClicker", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayStyleClicker;", "dragger", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/PiecesDragger;", "isAddedChipView", "", "isInScreen", "()Z", "setInScreen", "(Z)V", "isLaunchPerf", "layerDay", "oneMinuteHeight", "", "piecesClickTrigger", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/PiecesClickTrigger;", "redTimeLine", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/widget/RedTimeLine;", "bindBitmapInUIThread", "", "drawChipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "Lkotlin/collections/ArrayList;", "currentDragData", "chipBitmap", "isDiskData", "bindChipViewData", "bindData", "dayData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "clearLayerDay", "clearView", "getChipsDataHandler", "getLayerDay", "isNotLayerDay", "isSameDay", "onDetachedFromWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "refreshLayerBitmap", "setBitmapPool", "setChipPool", "setClickListener", "clickListener", "setDragger", "setLayerDay", "day", "setLayoutParams", "setRedLineTimeZone", "timezoneId", "", "toggleRedLineDraw", "ChipClickedListener", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DayChipsLayer extends FrameLayout {

    /* renamed from: g */
    public static final boolean f77309g = C30022a.f74883b.mo112691E();

    /* renamed from: h */
    public static final Companion f77310h = new Companion(null);

    /* renamed from: a */
    public ChipsBitmapPool f77311a;

    /* renamed from: b */
    public PiecesDragger f77312b;

    /* renamed from: c */
    public Bitmap f77313c;

    /* renamed from: d */
    public boolean f77314d;

    /* renamed from: e */
    public final ChipsDataHandler f77315e;

    /* renamed from: f */
    public ChipClickedListener f77316f;

    /* renamed from: i */
    private final float f77317i;

    /* renamed from: j */
    private final int f77318j;

    /* renamed from: k */
    private final Paint f77319k;

    /* renamed from: l */
    private C30166b f77320l;

    /* renamed from: m */
    private int f77321m;

    /* renamed from: n */
    private int f77322n;

    /* renamed from: o */
    private RedTimeLine f77323o;

    /* renamed from: p */
    private int f77324p;

    /* renamed from: q */
    private int f77325q;

    /* renamed from: r */
    private volatile boolean f77326r;

    /* renamed from: s */
    private boolean f77327s;

    /* renamed from: t */
    private final DelayStyleClicker f77328t;

    /* renamed from: u */
    private final PiecesClickTrigger f77329u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$ChipClickedListener;", "", "onEventChipClick", "", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DragDrawChipViewData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$a */
    public interface ChipClickedListener {
        /* renamed from: a */
        void mo111109a(DragDrawChipViewData eVar);
    }

    public DayChipsLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public DayChipsLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$Companion;", "", "()V", "TAG", "", "drawCanvas", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo111307a() {
        return this.f77326r;
    }

    public final ChipsDataHandler getChipsDataHandler() {
        return this.f77315e;
    }

    public final int getCurrentDay() {
        return this.f77325q;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$chipsDataHandler$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/ChipsLayerApi;", "refreshBitmap", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$e */
    public static final class C30782e implements ChipsLayerApi {

        /* renamed from: a */
        final /* synthetic */ DayChipsLayer f77339a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.ChipsLayerApi
        /* renamed from: a */
        public void mo111329a() {
            this.f77339a.mo111312e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30782e(DayChipsLayer dayChipsLayer) {
            this.f77339a = dayChipsLayer;
        }
    }

    public final synchronized int getLayerDay() {
        return this.f77324p;
    }

    /* renamed from: b */
    public final synchronized void mo111309b() {
        this.f77324p = -1;
    }

    /* renamed from: c */
    public final synchronized boolean mo111310c() {
        boolean z;
        if (this.f77324p == -1) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f77323o.mo111380a();
    }

    /* renamed from: f */
    private final void m114780f() {
        boolean z;
        int i = this.f77325q;
        if (i == -1 || this.f77324p != i) {
            z = false;
        } else {
            z = true;
        }
        this.f77323o.mo111384a(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$d */
    public static final class RunnableC30781d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DayChipsLayer f77334a;

        /* renamed from: b */
        final /* synthetic */ DayChipData f77335b;

        /* renamed from: c */
        final /* synthetic */ Bitmap f77336c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f77337d;

        /* renamed from: e */
        final /* synthetic */ DragDrawChipViewData f77338e;

        RunnableC30781d(DayChipsLayer dayChipsLayer, DayChipData cVar, Bitmap bitmap, ArrayList arrayList, DragDrawChipViewData eVar) {
            this.f77334a = dayChipsLayer;
            this.f77335b = cVar;
            this.f77336c = bitmap;
            this.f77337d = arrayList;
            this.f77338e = eVar;
        }

        public final void run() {
            if (!this.f77334a.mo111308a(this.f77335b.mo110947a())) {
                ChipsBitmapPool bVar = this.f77334a.f77311a;
                if (bVar != null) {
                    bVar.mo111342a(this.f77336c);
                    return;
                }
                return;
            }
            this.f77334a.mo111306a(this.f77337d, this.f77338e, this.f77336c, this.f77335b.mo110948b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$c */
    public static final class RunnableC30780c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DayChipsLayer f77330a;

        /* renamed from: b */
        final /* synthetic */ boolean f77331b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f77332c;

        /* renamed from: d */
        final /* synthetic */ DragDrawChipViewData f77333d;

        RunnableC30780c(DayChipsLayer dayChipsLayer, boolean z, ArrayList arrayList, DragDrawChipViewData eVar) {
            this.f77330a = dayChipsLayer;
            this.f77331b = z;
            this.f77332c = arrayList;
            this.f77333d = eVar;
        }

        public final void run() {
            DragDrawChipViewData eVar;
            PiecesDragger bVar;
            if (!this.f77331b || !this.f77330a.f77314d) {
                this.f77330a.mo111311d();
                this.f77330a.f77315e.mo111349a(this.f77332c);
                DragDrawChipViewData eVar2 = this.f77333d;
                if (eVar2 != null) {
                    PiecesDragger bVar2 = this.f77330a.f77312b;
                    if (bVar2 != null) {
                        eVar = bVar2.mo111193a();
                    } else {
                        eVar = null;
                    }
                    if (Intrinsics.areEqual(eVar2, eVar) && (bVar = this.f77330a.f77312b) != null) {
                        bVar.mo111196a(eVar2);
                    }
                }
                PiecesDragger bVar3 = this.f77330a.f77312b;
                if (bVar3 != null) {
                    bVar3.mo111195a(this.f77330a, this.f77332c);
                }
                this.f77330a.f77314d = true;
                this.f77330a.invalidate();
            }
        }
    }

    /* renamed from: d */
    public final void mo111311d() {
        C30166b bVar;
        Iterator<T> it = this.f77315e.mo111346a().iterator();
        while (true) {
            DragDrawChipViewData eVar = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            PiecesDragger bVar2 = this.f77312b;
            if (bVar2 != null) {
                eVar = bVar2.mo111193a();
            }
            if ((!Intrinsics.areEqual(eVar, next)) && (bVar = this.f77320l) != null) {
                bVar.mo108793a(0, next.mo110972f());
            }
        }
        this.f77315e.mo111350b();
        ChipsBitmapPool bVar3 = this.f77311a;
        if (bVar3 != null) {
            bVar3.mo111342a(this.f77313c);
        }
        this.f77313c = null;
    }

    /* renamed from: e */
    public final void mo111312e() {
        Integer num;
        Integer num2;
        Bitmap bitmap;
        if (f77309g) {
            postInvalidate();
        } else if (this.f77321m <= 0 || this.f77322n <= 0) {
            Log.m165383e("DaysChipsLayer", C32673y.m125378d("refreshLayerBitmap dayHeight = " + this.f77322n + ", dayWidth = " + this.f77321m));
        } else {
            Bitmap bitmap2 = null;
            if (this.f77315e.mo111346a().isEmpty()) {
                bitmap2 = this.f77313c;
            } else {
                Bitmap bitmap3 = this.f77313c;
                if (bitmap3 == null) {
                    Log.m165383e("DaysChipsLayer", C32673y.m125378d("refreshLayerBitmap chipsBitmap = null"));
                    ChipsBitmapPool bVar = this.f77311a;
                    if (bVar != null) {
                        bitmap2 = bVar.mo111339a(this.f77321m, this.f77322n);
                    }
                } else if (bitmap3 == null || bitmap3.getWidth() != getWidth() || (bitmap = this.f77313c) == null || bitmap.getHeight() != getHeight()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("refreshLayerBitmap [");
                    Bitmap bitmap4 = this.f77313c;
                    if (bitmap4 != null) {
                        num = Integer.valueOf(bitmap4.getWidth());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(", ");
                    Bitmap bitmap5 = this.f77313c;
                    if (bitmap5 != null) {
                        num2 = Integer.valueOf(bitmap5.getHeight());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append("] ->  [");
                    sb.append(getWidth());
                    sb.append(", ");
                    sb.append(getHeight());
                    sb.append("] ");
                    Log.m165383e("DaysChipsLayer", C32673y.m125378d(sb.toString()));
                    Bitmap bitmap6 = this.f77313c;
                    if (bitmap6 != null) {
                        bitmap6.recycle();
                    }
                    ChipsBitmapPool bVar2 = this.f77311a;
                    if (bVar2 != null) {
                        bitmap2 = bVar2.mo111339a(this.f77321m, this.f77322n);
                    }
                } else {
                    bitmap2 = this.f77313c;
                }
            }
            this.f77313c = bitmap2;
            if (bitmap2 != null) {
                ChipsBitmapUtil.f77181a.mo111134a(bitmap2, this.f77315e.mo111346a());
            }
            invalidate();
        }
    }

    public final void setDragger(PiecesDragger bVar) {
        this.f77312b = bVar;
    }

    public final void setInScreen(boolean z) {
        this.f77326r = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$delayStyleClicker$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnClickStyleChangedListener;", "originCrop", "Landroid/graphics/Bitmap;", "onClickDown", "", "clickTarget", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/DelayClickerTarget;", "onClickUp", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$f */
    public static final class C30783f implements OnClickStyleChangedListener {

        /* renamed from: a */
        final /* synthetic */ DayChipsLayer f77340a;

        /* renamed from: b */
        private Bitmap f77341b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30783f(DayChipsLayer dayChipsLayer) {
            this.f77340a = dayChipsLayer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.OnClickStyleChangedListener
        /* renamed from: a */
        public void mo111330a(DelayClickerTarget eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "clickTarget");
            if (!(eVar instanceof DragDrawChipViewData)) {
                eVar = null;
            }
            DragDrawChipViewData eVar2 = (DragDrawChipViewData) eVar;
            if (eVar2 == null) {
                return;
            }
            if (DayChipsLayer.f77309g) {
                EventChipView f = eVar2.mo110972f();
                if (f != null) {
                    f.setPressed(true);
                }
                this.f77340a.invalidate();
                return;
            }
            this.f77341b = ChipsBitmapUtil.f77181a.mo111135b(this.f77340a.f77313c, eVar2);
            this.f77340a.f77313c = ChipsBitmapUtil.f77181a.mo111132a(this.f77340a.f77313c, eVar2);
            this.f77340a.invalidate();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.OnClickStyleChangedListener
        /* renamed from: b */
        public void mo111331b(DelayClickerTarget eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "clickTarget");
            if (!(eVar instanceof DragDrawChipViewData)) {
                eVar = null;
            }
            DragDrawChipViewData eVar2 = (DragDrawChipViewData) eVar;
            if (eVar2 == null) {
                return;
            }
            if (DayChipsLayer.f77309g) {
                EventChipView f = eVar2.mo110972f();
                if (f != null) {
                    f.setPressed(false);
                }
                this.f77340a.invalidate();
            } else if (!eVar2.mo110969d()) {
                if (eVar2.mo110965b()) {
                    this.f77340a.mo111312e();
                    return;
                }
                Bitmap bitmap = this.f77341b;
                if (bitmap != null) {
                    this.f77340a.f77313c = ChipsBitmapUtil.f77181a.mo111133a(this.f77340a.f77313c, eVar2, bitmap);
                    this.f77340a.invalidate();
                    this.f77341b = null;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/days/layers/DayChipsLayer$piecesClickTrigger$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/OnPieceClickedListener;", "onPieceClicked", "", "clickTarget", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/layers/helper/PiecesClickTarget;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.layers.DayChipsLayer$g */
    public static final class C30784g implements OnPieceClickedListener {

        /* renamed from: a */
        final /* synthetic */ DayChipsLayer f77342a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30784g(DayChipsLayer dayChipsLayer) {
            this.f77342a = dayChipsLayer;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.days.layers.helper.OnPieceClickedListener
        /* renamed from: a */
        public void mo111332a(PiecesClickTarget iVar) {
            ChipClickedListener aVar;
            Intrinsics.checkParameterIsNotNull(iVar, "clickTarget");
            StringBuilder sb = new StringBuilder();
            sb.append("threeDetail ");
            boolean z = iVar instanceof DragDrawChipViewData;
            sb.append(z);
            Log.m165389i("DaysChipsLayer", C32673y.m125369a(sb.toString()));
            if (!z) {
                iVar = null;
            }
            DragDrawChipViewData eVar = (DragDrawChipViewData) iVar;
            if (eVar != null && (aVar = this.f77342a.f77316f) != null) {
                aVar.mo111109a(eVar);
            }
        }
    }

    public final void setBitmapPool(ChipsBitmapPool bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "bitmapPool");
        this.f77311a = bVar;
    }

    public final void setChipPool(C30166b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "chipPool");
        this.f77320l = bVar;
    }

    public final void setClickListener(ChipClickedListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickListener");
        this.f77316f = aVar;
    }

    public final void setCurrentDay(int i) {
        this.f77325q = i;
        m114780f();
    }

    public final void setRedLineTimeZone(String str) {
        this.f77323o.mo111383a(str);
    }

    public final synchronized void setLayerDay(int i) {
        this.f77324p = i;
        m114780f();
    }

    /* renamed from: a */
    public final synchronized boolean mo111308a(int i) {
        boolean z;
        if (this.f77324p == i) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        if (f77309g) {
            Iterator<T> it = this.f77315e.mo111346a().iterator();
            while (it.hasNext()) {
                it.next().mo110961a(canvas);
            }
        } else {
            Bitmap bitmap = this.f77313c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f77319k);
            }
        }
        if (this.f77314d && !this.f77327s) {
            LaunchPerfMonitor.m124430d("show_chip");
            LaunchPerfMonitor.m124427c();
            LaunchMemoryMonitor.m124420b();
            this.f77327s = true;
        }
        this.f77323o.mo111382a(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            DragDrawChipViewData a = this.f77315e.mo111345a(motionEvent.getX(), motionEvent.getY());
            this.f77328t.mo111356a(motionEvent, a);
            this.f77329u.mo111364a(motionEvent, a);
            if (a != null) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } else if (action == 1) {
            this.f77328t.mo111354a();
            if (this.f77329u.mo111365a(motionEvent)) {
                return true;
            }
            return false;
        } else if (action == 2) {
            this.f77328t.mo111355a(motionEvent);
            this.f77329u.mo111366b(motionEvent);
            return false;
        } else if (action != 3) {
            return false;
        } else {
            this.f77328t.mo111358b();
            this.f77329u.mo111363a();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo111305a(DayChipData cVar) {
        DragDrawChipViewData eVar;
        boolean z;
        Bitmap a;
        Intrinsics.checkParameterIsNotNull(cVar, "dayData");
        LaunchPerfMonitor.m124428c("show_chip");
        Log.m165389i("DaysChipsLayer", C32673y.m125378d("bindData dayChipData = " + cVar));
        if (this.f77321m <= 0 || this.f77322n <= 0) {
            Log.m165383e("DaysChipsLayer", C32673y.m125378d("bindData dayHeight = " + this.f77322n + ", dayWidth = " + this.f77321m));
        } else if (mo111308a(cVar.mo110947a())) {
            ArrayList<DragDrawChipViewData> a2 = ChipsDataHandler.f77372a.mo111353a(cVar.mo110950d(), this.f77320l, this.f77321m, this.f77318j, this.f77317i);
            ChipsDataHandler.Companion aVar = ChipsDataHandler.f77372a;
            PiecesDragger bVar = this.f77312b;
            if (bVar != null) {
                eVar = bVar.mo111193a();
            } else {
                eVar = null;
            }
            DragDrawChipViewData a3 = aVar.mo111352a(eVar, a2);
            if (f77309g) {
                m114779a(a2, a3, cVar.mo110948b());
                Bitmap bitmap = this.f77313c;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f77313c = null;
                return;
            }
            ChipsBitmapPool bVar2 = this.f77311a;
            if (bVar2 == null || (a = bVar2.mo111339a(this.f77321m, this.f77322n)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("bitmapPool: ");
                if (this.f77311a == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                Log.m165383e("DaysChipsLayer", C32673y.m125378d(sb.toString()));
                return;
            }
            ChipsBitmapUtil.f77181a.mo111134a(a, a2);
            UICallbackExecutor.post(new RunnableC30781d(this, cVar, a, a2, a3));
        }
    }

    /* renamed from: a */
    public final void mo111304a(int i, int i2) {
        this.f77321m = i;
        this.f77322n = i2;
        this.f77323o.mo111381a(i);
    }

    /* renamed from: a */
    private final boolean m114779a(ArrayList<DragDrawChipViewData> arrayList, DragDrawChipViewData eVar, boolean z) {
        return post(new RunnableC30780c(this, z, arrayList, eVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DayChipsLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setWillNotDraw(false);
        this.f77317i = ((float) UIHelper.dp2px(50.0f)) / 60.0f;
        this.f77318j = UIHelper.dp2px(7.0f);
        this.f77319k = new Paint(2);
        DayChipsLayer dayChipsLayer = this;
        this.f77323o = new RedTimeLine(dayChipsLayer);
        this.f77324p = -1;
        this.f77325q = -1;
        this.f77315e = new ChipsDataHandler(new C30782e(this));
        this.f77328t = new DelayStyleClicker(dayChipsLayer, new C30783f(this));
        this.f77329u = new PiecesClickTrigger(new C30784g(this));
    }

    /* renamed from: a */
    public final void mo111306a(ArrayList<DragDrawChipViewData> arrayList, DragDrawChipViewData eVar, Bitmap bitmap, boolean z) {
        DragDrawChipViewData eVar2;
        PiecesDragger bVar;
        if (!z || !this.f77314d) {
            mo111311d();
            this.f77313c = bitmap;
            this.f77315e.mo111349a(arrayList);
            invalidate();
            if (eVar != null) {
                PiecesDragger bVar2 = this.f77312b;
                if (bVar2 != null) {
                    eVar2 = bVar2.mo111193a();
                } else {
                    eVar2 = null;
                }
                if (Intrinsics.areEqual(eVar, eVar2) && (bVar = this.f77312b) != null) {
                    bVar.mo111196a(eVar);
                }
            }
            PiecesDragger bVar3 = this.f77312b;
            if (bVar3 != null) {
                bVar3.mo111195a(this, arrayList);
            }
            this.f77314d = true;
            return;
        }
        ChipsBitmapPool bVar4 = this.f77311a;
        if (bVar4 != null) {
            bVar4.mo111342a(bitmap);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayChipsLayer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
