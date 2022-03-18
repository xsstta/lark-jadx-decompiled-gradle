package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.ArrayUtil;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.IDayLayoutParam;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b&\u0018\u0000 .2\u00020\u0001:\u0002./B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\u0017\u001a\u00020\u0018\"\b\b\u0000\u0010\u0019*\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\n¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0002J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\bH\u0016J\u0018\u0010)\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00060"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView$LayoutManager;", "parent", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "mLayoutParam", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/IDayLayoutParam;)V", "currentDay", "", "mDayLayers", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysChipsLayer;", "[Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysChipsLayer;", "mIsLayoutFinished", "", "managerListener", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$ILayerManagerListener;", "getManagerListener", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$ILayerManagerListener;", "setManagerListener", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$ILayerManagerListener;)V", "getParent", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/SnapScrollView;", "addLayers", "", "T", "instanceLayers", "([Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysChipsLayer;)V", "computeAndNotifyLayerDate", "oldLayerDay", "newLayerDay", "drawChild", "canvas", "Landroid/graphics/Canvas;", "drawTime", "", "layoutChild", "offsetX", "offsetY", "notifyLayerDayChanged", "leftLayerDay", "reLayoutChild", "scrollDx", "dx", "scrollDy", "dy", "Companion", "ILayerManagerListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.a */
public abstract class AbsDaysLayoutManager extends SnapScrollView.LayoutManager {

    /* renamed from: a */
    public static final Companion f79040a = new Companion(null);

    /* renamed from: b */
    private final int f79041b = new CalendarDate().getJulianDay();

    /* renamed from: c */
    private boolean f79042c;

    /* renamed from: d */
    private AbsDaysChipsLayer[] f79043d;

    /* renamed from: e */
    private ILayerManagerListener f79044e;

    /* renamed from: f */
    private final SnapScrollView f79045f;

    /* renamed from: g */
    private final IDayLayoutParam f79046g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$ILayerManagerListener;", "", "onFirstLayoutFinished", "", "onLayerNeedBindData", "layerDay", "", "onSelectDayChanged", "leftLayerDay", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.a$b */
    public interface ILayerManagerListener {
        /* renamed from: a */
        void mo113320a();

        /* renamed from: a */
        void mo113321a(int i);

        /* renamed from: b */
        void mo113322b(int i);
    }

    /* renamed from: a */
    public void mo113317a(int i) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/dayslayout/AbsDaysLayoutManager$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.dayslayout.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public SnapScrollView mo113316a() {
        return this.f79045f;
    }

    /* renamed from: a */
    public final void mo113318a(ILayerManagerListener bVar) {
        this.f79044e = bVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: c */
    public void mo111067c(int i) {
        AbsDaysChipsLayer[] absDaysChipsLayerArr = this.f79043d;
        if (absDaysChipsLayerArr != null) {
            for (AbsDaysChipsLayer absDaysChipsLayer : absDaysChipsLayerArr) {
                absDaysChipsLayer.offsetTopAndBottom(i);
            }
        }
    }

    /* renamed from: a */
    public final <T extends AbsDaysChipsLayer> void mo113319a(T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "instanceLayers");
        int length = tArr.length;
        AbsDaysChipsLayer[] absDaysChipsLayerArr = new AbsDaysChipsLayer[length];
        for (int i = 0; i < length; i++) {
            absDaysChipsLayerArr[i] = tArr[i];
        }
        this.f79043d = absDaysChipsLayerArr;
        for (T t : tArr) {
            mo113316a().mo113223a(t);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111063b(int i) {
        Rect f;
        AbsDaysChipsLayer[] absDaysChipsLayerArr = this.f79043d;
        if (!(absDaysChipsLayerArr == null || (f = this.f79046g.mo113328f()) == null)) {
            int width = f.width();
            int a = this.f79046g.mo113323a();
            int c = this.f79046g.mo113325c();
            IDayLayoutParam.LayersInfo e = this.f79046g.mo113327e();
            int b = e.mo113330b();
            int a2 = e.mo113329a();
            boolean z = false;
            boolean z2 = false;
            for (AbsDaysChipsLayer absDaysChipsLayer : absDaysChipsLayerArr) {
                if (i > 0) {
                    if (absDaysChipsLayer.getLeft() + i >= width + (a * b)) {
                        int layerDay = absDaysChipsLayer.getLayerDay();
                        int i2 = layerDay - a2;
                        absDaysChipsLayer.setLayerDay(i2);
                        absDaysChipsLayer.mo113311c();
                        absDaysChipsLayer.offsetLeftAndRight(i - (a * a2));
                        m116779c(layerDay, i2);
                        ILayerManagerListener bVar = this.f79044e;
                        if (bVar != null) {
                            bVar.mo113322b(i2);
                        }
                        z = true;
                        z2 = false;
                    }
                } else if (absDaysChipsLayer.getRight() + i <= c - (b * a)) {
                    int layerDay2 = absDaysChipsLayer.getLayerDay();
                    int i3 = layerDay2 + a2;
                    absDaysChipsLayer.setLayerDay(i3);
                    absDaysChipsLayer.mo113311c();
                    absDaysChipsLayer.offsetLeftAndRight((a * a2) + i);
                    m116779c(layerDay2, i3);
                    ILayerManagerListener bVar2 = this.f79044e;
                    if (bVar2 != null) {
                        bVar2.mo113322b(i3);
                    }
                    z = true;
                    z2 = true;
                }
                absDaysChipsLayer.offsetLeftAndRight(i);
            }
            if (z) {
                ArrayUtil.f77180a.mo111131a(this.f79043d, z2);
            }
        }
    }

    public AbsDaysLayoutManager(SnapScrollView snapScrollView, IDayLayoutParam bVar) {
        Intrinsics.checkParameterIsNotNull(snapScrollView, "parent");
        Intrinsics.checkParameterIsNotNull(bVar, "mLayoutParam");
        this.f79045f = snapScrollView;
        this.f79046g = bVar;
    }

    /* renamed from: c */
    private final void m116779c(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = i + 1 + this.f79046g.mo113327e().mo113330b();
        } else if (i > i2) {
            i3 = this.f79046g.mo113327e().mo113330b() + i2;
        } else {
            return;
        }
        mo113317a(i3);
        ILayerManagerListener bVar = this.f79044e;
        if (bVar != null) {
            bVar.mo113321a(i3);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111053a(int i, int i2) {
        AbsDaysChipsLayer[] absDaysChipsLayerArr;
        Log.m165389i("AbsDaysLayoutManager", C32673y.m125378d("reLayoutChild = " + this.f79042c));
        if (this.f79042c && (absDaysChipsLayerArr = this.f79043d) != null) {
            for (AbsDaysChipsLayer absDaysChipsLayer : absDaysChipsLayerArr) {
                absDaysChipsLayer.mo113310b();
            }
            mo111064b(i, i2);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: a */
    public void mo111054a(Canvas canvas, long j) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect f = this.f79046g.mo113328f();
        if (f != null) {
            int save = canvas.save();
            canvas.clipRect(f);
            AbsDaysChipsLayer[] absDaysChipsLayerArr = this.f79043d;
            if (absDaysChipsLayerArr != null) {
                for (AbsDaysChipsLayer absDaysChipsLayer : absDaysChipsLayerArr) {
                    mo113316a().mo113225a(canvas, absDaysChipsLayer, j);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.SnapScrollView.LayoutManager
    /* renamed from: b */
    public void mo111064b(int i, int i2) {
        int i3;
        ILayerManagerListener bVar;
        int a = this.f79046g.mo113323a();
        int b = this.f79046g.mo113324b();
        int c = this.f79046g.mo113325c();
        int d = this.f79046g.mo113326d();
        int b2 = this.f79046g.mo113327e().mo113330b();
        if (a > 0) {
            int i4 = (-i) / a;
            int i5 = i % a;
            if (i > 0 && i5 != 0) {
                i4--;
            }
            if (i5 < 0) {
                i5 += a;
            }
            if (i5 > 0) {
                i3 = i5 - (b2 * a);
            } else {
                i3 = a - (b2 * a);
            }
            int i6 = c + i3;
            int i7 = (i6 - a) + 0;
            int i8 = (this.f79041b - b2) + i4;
            AbsDaysChipsLayer[] absDaysChipsLayerArr = this.f79043d;
            if (absDaysChipsLayerArr != null) {
                int length = absDaysChipsLayerArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    AbsDaysChipsLayer absDaysChipsLayer = absDaysChipsLayerArr[i9];
                    if (absDaysChipsLayer.mo113309a()) {
                        absDaysChipsLayer.setLayerDay(i8 + i9);
                        int i10 = i9 * a;
                        absDaysChipsLayer.layout(i7 + i10, d + i2, i10 + i6, b + d + i2);
                        if (i9 == absDaysChipsLayerArr.length - 1) {
                            if (!this.f79042c && (bVar = this.f79044e) != null) {
                                bVar.mo113320a();
                            }
                            this.f79042c = true;
                        }
                    } else {
                        absDaysChipsLayer.layout(absDaysChipsLayer.getLeft(), absDaysChipsLayer.getTop(), absDaysChipsLayer.getRight(), absDaysChipsLayer.getBottom());
                    }
                }
            }
        }
    }
}
