package com.ss.lark.android.passport.biz.widget.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/layout/BlockedNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scrollable", "", "disableScrollable", "", "enableScrollable", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockedNestedScrollView extends NestedScrollView {

    /* renamed from: a */
    private boolean f164430a;

    public BlockedNestedScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BlockedNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo114050a() {
        this.f164430a = true;
    }

    /* renamed from: b */
    public final void mo114057b() {
        this.f164430a = false;
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f164430a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockedNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f164430a = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockedNestedScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
