package com.ss.android.lark.calendar.impl.features.calendarview.days.gesture;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.VelocityHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/gesture/ThreeDayMotionHandler;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler;", "context", "Landroid/content/Context;", "coordApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;)V", "getContext", "()Landroid/content/Context;", "getCoordApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "mOnDownXOffset", "", "down", "", "mDwonX", "", "mDwonY", "xFling", "velocityX", "yFling", "velocityY", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.b.a */
public final class ThreeDayMotionHandler extends BaseMotionHandler {

    /* renamed from: a */
    public static final Companion f77054a = new Companion(null);

    /* renamed from: c */
    private int f77055c;

    /* renamed from: d */
    private final Context f77056d;

    /* renamed from: e */
    private final ICoordinateApi f77057e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/gesture/ThreeDayMotionHandler$Companion;", "", "()V", "DAY_NUM_3", "", "DAY_NUM_OF_WEEK", "SMOOTH_SCROLL_TIME", "", "THRESHOLD_MORE_3_DAY", "THRESHOLD_ONE_DAY", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler
    /* renamed from: b */
    public void mo111024b(float f) {
        int b = this.f77057e.mo113243b() + VelocityHelper.m116744b(this.f77056d, f);
        BaseMotionHandler.OnMotionLister a = mo113254a();
        if (a != null) {
            a.mo113265a(b, 600, mo113261c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo111022a(float r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.days.gesture.ThreeDayMotionHandler.mo111022a(float):void");
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler
    /* renamed from: a */
    public void mo111023a(float f, float f2) {
        this.f77055c = this.f77057e.mo113242a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDayMotionHandler(Context context, ICoordinateApi aVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "coordApi");
        this.f77056d = context;
        this.f77057e = aVar;
    }
}
