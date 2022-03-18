package com.ss.android.lark.keyboard.plugin.tool.face;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.FixTouchBugViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceViewPager;", "Lcom/ss/android/lark/widget/FixTouchBugViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "enableScroll", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "setEnableScroll", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FaceViewPager extends FixTouchBugViewPager {

    /* renamed from: a */
    private boolean f103960a;

    public final void setEnableScroll(boolean z) {
        this.f103960a = z;
    }

    @Override // com.ss.android.lark.widget.FixTouchBugViewPager, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f103960a) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.ss.android.lark.widget.FixTouchBugViewPager, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f103960a) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaceViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f103960a = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FaceViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
