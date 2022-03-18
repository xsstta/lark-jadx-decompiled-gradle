package com.ss.android.lark.calendar.impl.features.calendarview.days.drag;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.ICoordinateApi;
import com.ss.android.lark.calendar.impl.features.common.widget.infinitescroller.IScrollAnimApi;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\nJ\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/AutoScroller;", "", "coordinateApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "scrollAnimApi", "Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/IScrollAnimApi;)V", "getCoordinateApi", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/infinitescroller/ICoordinateApi;", "mDragArea", "", "mInvHeight", "", "mInvWidth", "mScrollDxSum", "", "mScrollThreshold", "mStartScreenX", "mStartScreenY", "mXThreshold", "mYThreshold", "autoScrollX", "", "screenX", "autoScrollY", "screenY", "reset", "", "setDragArea", "dragArea", "setStartXYIfNot", "startScreenX", "startScreenY", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a */
public final class AutoScroller {

    /* renamed from: a */
    public static final Companion f77186a = new Companion(null);

    /* renamed from: b */
    private final float f77187b = 0.3f;

    /* renamed from: c */
    private final float f77188c = 0.15f;

    /* renamed from: d */
    private float f77189d = 1.0f;

    /* renamed from: e */
    private float f77190e = 1.0f;

    /* renamed from: f */
    private int f77191f = -1;

    /* renamed from: g */
    private int f77192g = -1;

    /* renamed from: h */
    private final int f77193h = 5;

    /* renamed from: i */
    private final int[] f77194i = new int[4];

    /* renamed from: j */
    private int f77195j;

    /* renamed from: k */
    private final ICoordinateApi f77196k;

    /* renamed from: l */
    private final IScrollAnimApi f77197l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/drag/AutoScroller$Companion;", "", "()V", "FLAG_NOT_SET_START", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo111140a() {
        this.f77191f = -1;
        this.f77192g = -1;
        this.f77195j = 0;
        this.f77197l.mo113245a();
    }

    /* renamed from: a */
    public final void mo111142a(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "dragArea");
        int length = this.f77194i.length;
        for (int i = 0; i < length; i++) {
            this.f77194i[i] = iArr[i];
        }
        int[] iArr2 = this.f77194i;
        int i2 = iArr2[2] - iArr2[0];
        int i3 = iArr2[3] - iArr2[1];
        if (!(i2 == 0 || i3 == 0)) {
            this.f77189d = 1.0f / ((float) i2);
            this.f77190e = 1.0f / ((float) i3);
        }
    }

    /* renamed from: a */
    public final boolean mo111143a(int i) {
        float f = ((float) (this.f77194i[3] - i)) * this.f77190e;
        float f2 = f - 0.5f;
        int signum = ((int) Math.signum(f2)) * UIHelper.dp2px(Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f77187b - (0.5f - Math.abs(f2))) * (1.0f / this.f77187b) * 25.0f);
        if (Math.abs(i - this.f77191f) > this.f77193h) {
            this.f77197l.mo113252c(-signum);
        }
        if (signum != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo111144b(int i) {
        float f = ((float) (this.f77194i[2] - i)) * this.f77189d;
        float f2 = f - 0.5f;
        int signum = ((int) Math.signum(f2)) * UIHelper.dp2px(Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f77188c - (0.5f - Math.abs(f2))) * (1.0f / this.f77188c) * 25.0f);
        if (Math.abs(i - this.f77192g) > this.f77193h) {
            if (signum == 0) {
                this.f77195j = 0;
            } else {
                int i2 = this.f77195j + (-signum);
                this.f77195j = i2;
                if (i2 > this.f77196k.mo113244c()) {
                    this.f77197l.mo113246a(1);
                    this.f77195j = 0;
                }
                if (this.f77195j < (-this.f77196k.mo113244c())) {
                    this.f77197l.mo113246a(-1);
                    this.f77195j = 0;
                }
            }
        }
        if (signum != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo111141a(int i, int i2) {
        if (this.f77192g == -1) {
            this.f77192g = i;
        }
        if (this.f77191f == -1) {
            this.f77191f = i2;
        }
    }

    public AutoScroller(ICoordinateApi aVar, IScrollAnimApi bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "coordinateApi");
        Intrinsics.checkParameterIsNotNull(bVar, "scrollAnimApi");
        this.f77196k = aVar;
        this.f77197l = bVar;
    }
}
