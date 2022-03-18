package com.ss.android.lark.widget.photo_picker.palette;

import com.larksuite.framework.palette.colour.BaseColour;
import com.larksuite.framework.utils.UIUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J/\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00060\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/palette/TouchSlopMonitorColour;", "Lcom/larksuite/framework/palette/colour/BaseColour;", "()V", "callback", "Lcom/ss/android/lark/widget/photo_picker/palette/TouchSlopMonitorColour$TouchSlopCallback;", "isOpenMonitor", "", "lastX", "", "lastY", "sTouchSlopValue", "getSTouchSlopValue", "()I", "sTouchSlopValue$delegate", "Lkotlin/Lazy;", "totalXOffset", "totalYOffset", "closeMonitor", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "superMethod", "Lkotlin/Function1;", "(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "openMonitor", "resetTotalOffset", "setTouchSlopCallback", "TouchSlopCallback", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.photo_picker.d.b */
public final class TouchSlopMonitorColour extends BaseColour {

    /* renamed from: a */
    private boolean f144779a = true;

    /* renamed from: b */
    private final Lazy f144780b = LazyKt.lazy(new C58632b(this));

    /* renamed from: c */
    private int f144781c;

    /* renamed from: d */
    private int f144782d;

    /* renamed from: e */
    private int f144783e;

    /* renamed from: f */
    private int f144784f;

    /* renamed from: g */
    private TouchSlopCallback f144785g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/widget/photo_picker/palette/TouchSlopMonitorColour$TouchSlopCallback;", "", "onSlop", "", "photo-picker-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.d.b$a */
    public interface TouchSlopCallback {
        void onSlop();
    }

    /* renamed from: b */
    private final int m227409b() {
        return ((Number) this.f144780b.getValue()).intValue();
    }

    /* renamed from: c */
    private final void m227410c() {
        this.f144783e = 0;
        this.f144784f = 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.photo_picker.d.b$b */
    static final class C58632b extends Lambda implements Function0<Integer> {
        final /* synthetic */ TouchSlopMonitorColour this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58632b(TouchSlopMonitorColour bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return UIUtils.getScaledTouchSlop(this.this$0.mo92556a());
        }
    }

    /* renamed from: a */
    public final void mo198686a(TouchSlopCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f144785g = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r3 != 3) goto L_0x0059;
     */
    @Override // com.larksuite.framework.palette.colour.BaseColour
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo92558a(android.view.MotionEvent r6, kotlin.jvm.functions.Function1<? super android.view.MotionEvent, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "superMethod"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            com.ss.android.lark.widget.photo_picker.d.b$a r0 = r5.f144785g
            if (r0 == 0) goto L_0x005d
            if (r6 == 0) goto L_0x005d
            float r1 = r6.getRawX()
            int r1 = (int) r1
            float r2 = r6.getRawY()
            int r2 = (int) r2
            int r3 = r6.getAction()
            if (r3 == 0) goto L_0x0056
            r4 = 1
            if (r3 == r4) goto L_0x0056
            r4 = 2
            if (r3 == r4) goto L_0x0025
            r0 = 3
            if (r3 == r0) goto L_0x0056
            goto L_0x0059
        L_0x0025:
            int r3 = r5.f144783e
            int r4 = r5.f144781c
            int r4 = r1 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r5.f144783e = r3
            int r3 = r5.f144784f
            int r4 = r5.f144782d
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r3 = r3 + r4
            r5.f144784f = r3
            int r3 = r5.f144783e
            int r4 = r5.m227409b()
            if (r3 > r4) goto L_0x004f
            int r3 = r5.f144784f
            int r4 = r5.m227409b()
            if (r3 <= r4) goto L_0x0059
        L_0x004f:
            r5.m227410c()
            r0.onSlop()
            goto L_0x0059
        L_0x0056:
            r5.m227410c()
        L_0x0059:
            r5.f144781c = r1
            r5.f144782d = r2
        L_0x005d:
            java.lang.Boolean r6 = super.mo92558a(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.photo_picker.palette.TouchSlopMonitorColour.mo92558a(android.view.MotionEvent, kotlin.jvm.functions.Function1):java.lang.Boolean");
    }
}
