package com.ss.android.lark.mediapicker.widget;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.mediapicker.dependency.C44677b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0016¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mediapicker/widget/OnSingleClickListener;", "Landroid/view/View$OnClickListener;", "interval", "", "(J)V", "()V", "getInterval", "()J", "mLastClickTime", "mMinClickInterval", "onClick", "", "v", "Landroid/view/View;", "onSingleClick", "Companion", "mediapicker_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.mediapicker.widget.a */
public abstract class OnSingleClickListener implements View.OnClickListener {

    /* renamed from: e */
    public static final Companion f113383e = new Companion(null);

    /* renamed from: a */
    private long f113384a = 500;

    /* renamed from: b */
    private long f113385b;

    /* renamed from: c */
    private final long f113386c = 500;

    /* renamed from: a */
    public abstract void mo158215a(View view);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mediapicker/widget/OnSingleClickListener$Companion;", "", "()V", "LENGTH_LONG", "", "LENGTH_SHORT", "mediapicker_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.mediapicker.widget.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onClick(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f113385b = uptimeMillis;
        if (uptimeMillis - this.f113385b < this.f113384a) {
            C44677b.m177240c("elapsedTime is short than LENGTH_SHORT");
        } else {
            mo158215a(view);
        }
    }
}
