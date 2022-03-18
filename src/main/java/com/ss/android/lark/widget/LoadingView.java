package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LoadingView extends FrameLayout {

    /* renamed from: a */
    private LKUIStatus f143425a;

    public LoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        return true;
    }

    /* renamed from: a */
    public final void mo197486a() {
        LKUIStatus lKUIStatus = this.f143425a;
        if (lKUIStatus != null) {
            if (lKUIStatus == null) {
                Intrinsics.throwNpe();
            }
            lKUIStatus.mo89847d();
        }
    }

    /* renamed from: a */
    public final void mo197487a(int i) {
        LKUIStatus a = new LKUIStatus.C25680a(this).mo89858a(UIHelper.getString(i)).mo89857a(R.color.bg_base).mo89859a();
        this.f143425a = a;
        if (a != null) {
            a.mo89837a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m226086a(LoadingView loadingView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.string.Lark_Legacy_LoadingWait;
        }
        loadingView.mo197487a(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
