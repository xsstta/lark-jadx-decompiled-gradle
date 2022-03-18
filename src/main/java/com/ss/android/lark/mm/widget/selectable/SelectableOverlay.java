package com.ss.android.lark.mm.widget.selectable;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.C47098d;
import io.reactivex.p3457e.C68296b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/widget/selectable/SelectableOverlay;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mContext", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dismissSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "getDismissSubject", "()Lio/reactivex/subjects/PublishSubject;", "setDismissSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "startClickTime", "", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "onDetachedFromWindow", "", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectableOverlay extends ConstraintLayout {

    /* renamed from: a */
    public static final Companion f118884a = new Companion(null);

    /* renamed from: b */
    private long f118885b;

    /* renamed from: c */
    private C68296b<Boolean> f118886c;

    public SelectableOverlay(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelectableOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/widget/selectable/SelectableOverlay$Companion;", "", "()V", "getSelectableOverlayView", "Lcom/ss/android/lark/mm/widget/selectable/SelectableOverlay;", "context", "Landroid/content/Context;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.widget.selectable.SelectableOverlay$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SelectableOverlay mo165806a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Activity a = C47098d.m186533a(context);
            Intrinsics.checkExpressionValueIsNotNull(a, "MmActivityUtils.getSafeActivity(context)");
            return (SelectableOverlay) a.getWindow().findViewById(R.id.detailSelectableRootView);
        }
    }

    public final C68296b<Boolean> getDismissSubject() {
        return this.f118886c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f118886c.onComplete();
    }

    public final void setDismissSubject(C68296b<Boolean> bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f118886c = bVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f118885b = System.currentTimeMillis();
        } else if (action == 1 && System.currentTimeMillis() - this.f118885b < ((long) LocationRequest.PRIORITY_HD_ACCURACY)) {
            this.f118886c.onNext(true);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            C45855f.m181666e("SelectableOverlay", "[dispatchTouchEvent] " + e);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectableOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        C68296b<Boolean> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create<Boolean>()");
        this.f118886c = a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectableOverlay(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
