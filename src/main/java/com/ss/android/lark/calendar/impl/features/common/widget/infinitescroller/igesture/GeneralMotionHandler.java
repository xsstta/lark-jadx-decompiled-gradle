package com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.calendarview.days.util.CoordinateUtil;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GeneralMotionHandler;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/BaseMotionHandler;", "context", "Landroid/content/Context;", "coordApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;)V", "getContext", "()Landroid/content/Context;", "getCoordApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "mOnDownXOffset", "", "down", "", "mDwonX", "", "mDwonY", "xFling", "velocityX", "yFling", "velocityY", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.b */
public final class GeneralMotionHandler extends BaseMotionHandler {

    /* renamed from: a */
    public static final Companion f78983a = new Companion(null);

    /* renamed from: c */
    private int f78984c;

    /* renamed from: d */
    private final Context f78985d;

    /* renamed from: e */
    private final ICoordinateApi f78986e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/igesture/GeneralMotionHandler$Companion;", "", "()V", "SMOOTH_SCROLL_TIME", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.a.b$a */
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
        int b = this.f78986e.mo113243b() + VelocityHelper.m116744b(this.f78985d, f);
        BaseMotionHandler.OnMotionLister a = mo113254a();
        if (a != null) {
            a.mo113265a(b, 600, mo113261c());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler
    /* renamed from: a */
    public void mo111022a(float f) {
        int c = this.f78986e.mo113244c();
        int a = this.f78986e.mo113242a();
        int a2 = CoordinateUtil.m114508a(((CoordinateUtil.m114507a((int) f) * c) / 2) + a, c);
        int a3 = VelocityHelper.m116742a(this.f78985d, a2 - a);
        BaseMotionHandler.OnMotionLister a4 = mo113254a();
        if (a4 != null) {
            a4.mo113264a(a2, (long) a3);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.igesture.BaseMotionHandler
    /* renamed from: a */
    public void mo111023a(float f, float f2) {
        this.f78984c = this.f78986e.mo113242a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeneralMotionHandler(Context context, ICoordinateApi aVar) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "coordApi");
        this.f78985d = context;
        this.f78986e = aVar;
    }
}
