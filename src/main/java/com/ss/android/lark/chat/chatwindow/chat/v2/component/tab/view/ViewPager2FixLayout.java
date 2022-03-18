package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startX", "startY", "viewPagerControl", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout$IViewPagerControl;", "getViewPagerControl", "()Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout$IViewPagerControl;", "setViewPagerControl", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout$IViewPagerControl;)V", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "resetEvent", "", "IViewPagerControl", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ViewPager2FixLayout extends FrameLayout {

    /* renamed from: a */
    private IViewPagerControl f86818a;

    /* renamed from: b */
    private int f86819b;

    /* renamed from: c */
    private int f86820c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/view/ViewPager2FixLayout$IViewPagerControl;", "", "enableViewPagerHorizontalScroll", "", "enable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout$a */
    public interface IViewPagerControl {
        /* renamed from: a */
        void mo123575a(boolean z);
    }

    public ViewPager2FixLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public ViewPager2FixLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final IViewPagerControl getViewPagerControl() {
        return this.f86818a;
    }

    /* renamed from: a */
    private final void m130700a() {
        this.f86819b = 0;
        this.f86820c = 0;
        IViewPagerControl aVar = this.f86818a;
        if (aVar != null) {
            aVar.mo123575a(true);
        }
    }

    public final void setViewPagerControl(IViewPagerControl aVar) {
        this.f86818a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x003e
            r1 = 1
            if (r0 == r1) goto L_0x003a
            r1 = 2
            if (r0 == r1) goto L_0x0017
            r1 = 3
            if (r0 == r1) goto L_0x003a
            goto L_0x004c
        L_0x0017:
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            int r2 = r3.f86819b
            int r0 = r0 - r2
            int r0 = java.lang.Math.abs(r0)
            int r2 = r3.f86820c
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            if (r0 >= r1) goto L_0x004c
            com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout$a r0 = r3.f86818a
            if (r0 == 0) goto L_0x004c
            r1 = 0
            r0.mo123575a(r1)
            goto L_0x004c
        L_0x003a:
            r3.m130700a()
            goto L_0x004c
        L_0x003e:
            float r0 = r4.getX()
            int r0 = (int) r0
            r3.f86819b = r0
            float r0 = r4.getY()
            int r0 = (int) r0
            r3.f86820c = r0
        L_0x004c:
            boolean r4 = super.dispatchTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.view.ViewPager2FixLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPager2FixLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewPager2FixLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
