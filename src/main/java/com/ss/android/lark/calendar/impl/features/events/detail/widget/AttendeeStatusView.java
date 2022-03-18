package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0006\u0010\u001a\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/AttendeeStatusView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAcceptDrawable", "Landroid/graphics/drawable/Drawable;", "mDeclineDrawable", "mHeight", "mStatusDrawable", "mTentativeDrawable", "mWidth", "initPaint", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", C14002h.f36692e, "oldw", "oldh", "setAcceptStatus", "setDeclineStatus", "setTentativeStatus", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AttendeeStatusView extends View {

    /* renamed from: a */
    private Drawable f79698a;

    /* renamed from: b */
    private Drawable f79699b;

    /* renamed from: c */
    private Drawable f79700c;

    /* renamed from: d */
    private Drawable f79701d;

    /* renamed from: e */
    private int f79702e;

    /* renamed from: f */
    private int f79703f;

    public AttendeeStatusView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AttendeeStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo114126a() {
        this.f79701d = this.f79698a;
        invalidate();
    }

    /* renamed from: b */
    public final void mo114127b() {
        this.f79701d = this.f79699b;
        invalidate();
    }

    /* renamed from: c */
    public final void mo114128c() {
        this.f79701d = this.f79700c;
        invalidate();
    }

    /* renamed from: d */
    private final void m118364d() {
        this.f79698a = C32634ae.m125184d(R.drawable.ud_icon_succeed_colorful);
        this.f79699b = C32634ae.m125184d(R.drawable.ud_icon_delete_colorful);
        this.f79700c = C32634ae.m125184d(R.drawable.ud_icon_file_round_unknow_colorful);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = this.f79701d;
        if (drawable != null) {
            if (drawable == null) {
                Intrinsics.throwNpe();
            }
            drawable.setBounds(0, 0, this.f79702e, this.f79703f);
            Drawable drawable2 = this.f79701d;
            if (drawable2 == null) {
                Intrinsics.throwNpe();
            }
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AttendeeStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m118364d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f79702e = i;
        this.f79703f = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AttendeeStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
