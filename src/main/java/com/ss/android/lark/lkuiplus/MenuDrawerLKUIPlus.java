package com.ss.android.lark.lkuiplus;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.p030a.C0959c;
import com.larksuite.component.ui.layout.ILKUILayout;
import com.larksuite.component.ui.layout.OnLayoutData;
import com.larksuite.component.ui.layout.plus.BaseLKUIPlus;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.sidemenu.C35299a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002HIB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010!J \u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\u0006\u00102\u001a\u00020+J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\b\u00105\u001a\u00020\u0006H\u0002J\b\u00106\u001a\u00020\u0006H\u0002J\u0006\u0010\u001b\u001a\u00020\u0019J\"\u00107\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006H\u0002J\b\u00108\u001a\u00020+H\u0016J\u0017\u00109\u001a\u0004\u0018\u00010\u00192\u0006\u0010:\u001a\u00020;H\u0016¢\u0006\u0002\u0010<J\u0010\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020?H\u0016J\u0017\u0010@\u001a\u0004\u0018\u00010\u00192\u0006\u0010A\u001a\u00020;H\u0016¢\u0006\u0002\u0010<J\u0010\u0010B\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010!J\u000e\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020\u0019J\u0010\u0010E\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;H\u0002J\u0006\u0010F\u001a\u00020+J\u0006\u0010G\u001a\u00020+R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001dX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&¨\u0006J"}, d2 = {"Lcom/ss/android/lark/lkuiplus/MenuDrawerLKUIPlus;", "Lcom/larksuite/component/ui/layout/plus/BaseLKUIPlus;", "layout", "Lcom/larksuite/component/ui/layout/ILKUILayout;", "(Lcom/larksuite/component/ui/layout/ILKUILayout;)V", "MOVE_SLOP", "", "TAG", "", "callback", "Landroidx/customview/widget/ViewDragHelper$Callback;", "getCallback", "()Landroidx/customview/widget/ViewDragHelper$Callback;", "setCallback", "(Landroidx/customview/widget/ViewDragHelper$Callback;)V", "downX", "", "getDownX", "()F", "setDownX", "(F)V", "downY", "getDownY", "setDownY", "interceptDown", "", "isMenuEnable", "isMenuShowing", "mDragHelper", "Landroidx/customview/widget/ViewDragHelper;", "kotlin.jvm.PlatformType", "mOnMenuStatusChangeListeners", "Lcom/ss/android/lark/chatwindow/view/sidemenu/CopyOnWriteArray;", "Lcom/ss/android/lark/lkuiplus/MenuDrawerLKUIPlus$OnMenuStatusChangeListener;", "mVdhXOffset", "getMVdhXOffset", "()I", "setMVdhXOffset", "(I)V", "mVdhYOffset", "getMVdhYOffset", "setMVdhYOffset", "addOnMenuStatusChangeListener", "", "onMenuStatusChangeListener", "childNeedTouch", "view", "Landroid/view/View;", "x", "y", "closeMenu", "getContentView", "getMenuView", "getMenuWidth", "getUnResponseRange", "isXYInView", "onDelegateComputeScroll", "onDelegateInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;", "onDelegateLayoutEnd", "onLayoutData", "Lcom/larksuite/component/ui/layout/OnLayoutData;", "onDelegateTouchEvent", "event", "removeOnMenuStatusChangeListener", "setMenuEnable", "enable", "shouldIntercept", "showMenu", "toggleMenu", "OnMenuStatusChangeListener", "SimpleOnMenuStatusChangeListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class MenuDrawerLKUIPlus extends BaseLKUIPlus {
    private final int MOVE_SLOP = 25;
    private final String TAG = "MenuDrawerLayout";
    private C0959c.AbstractC0962a callback = new C41549b(this);
    private float downX;
    private float downY;
    private boolean interceptDown;
    private boolean isMenuEnable = (!DesktopUtil.m144301a(getContext()));
    public boolean isMenuShowing;
    public C0959c mDragHelper = C0959c.m4642a(getLayout(), this.callback);
    public final C35299a<OnMenuStatusChangeListener> mOnMenuStatusChangeListeners = new C35299a<>();
    private int mVdhXOffset;
    private int mVdhYOffset;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/lkuiplus/MenuDrawerLKUIPlus$OnMenuStatusChangeListener;", "", "onMenuClosed", "", "onMenuOpened", "onProgress", "progress", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.lkuiplus.MenuDrawerLKUIPlus$a */
    public interface OnMenuStatusChangeListener {
        /* renamed from: a */
        void mo149506a();

        /* renamed from: a */
        void mo149507a(float f);

        /* renamed from: b */
        void mo149508b();
    }

    public final C0959c.AbstractC0962a getCallback() {
        return this.callback;
    }

    public final float getDownX() {
        return this.downX;
    }

    public final float getDownY() {
        return this.downY;
    }

    public final int getMVdhXOffset() {
        return this.mVdhXOffset;
    }

    public final int getMVdhYOffset() {
        return this.mVdhYOffset;
    }

    public final boolean isMenuShowing() {
        return this.isMenuShowing;
    }

    private final int getUnResponseRange() {
        return (DeviceUtils.getScreenWidth(getContext()) / 3) * 2;
    }

    public final View getContentView() {
        View childAt = getLayout().getChildAt(0);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "getLayout().getChildAt(0)");
        return childAt;
    }

    public final View getMenuView() {
        View childAt = getLayout().getChildAt(1);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "getLayout().getChildAt(1)");
        return childAt;
    }

    public final int getMenuWidth() {
        return getMenuView().getWidth();
    }

    public final void showMenu() {
        if (this.isMenuEnable && this.mDragHelper != null) {
            this.mDragHelper.mo4868a(getContentView(), -getMenuWidth(), 0);
            getLayout().invalidate();
        }
    }

    public final void toggleMenu() {
        if (this.isMenuEnable) {
            if (this.isMenuShowing) {
                closeMenu();
            } else {
                showMenu();
            }
        }
    }

    public final void closeMenu() {
        if (this.isMenuEnable && this.mDragHelper != null) {
            this.mDragHelper.mo4868a(getContentView(), getLayout().getPaddingLeft(), 0);
            getLayout().invalidate();
        }
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateComputeScroll() {
        super.onDelegateComputeScroll();
        C0959c cVar = this.mDragHelper;
        if (cVar == null || !cVar.mo4869a(true)) {
            View contentView = getContentView();
            this.mVdhXOffset = contentView.getLeft();
            this.mVdhYOffset = contentView.getTop();
            return;
        }
        getLayout().postInvalidateOnAnimation();
    }

    public final void setDownX(float f) {
        this.downX = f;
    }

    public final void setDownY(float f) {
        this.downY = f;
    }

    public final void setMVdhXOffset(int i) {
        this.mVdhXOffset = i;
    }

    public final void setMVdhYOffset(int i) {
        this.mVdhYOffset = i;
    }

    public final void setMenuEnable(boolean z) {
        this.isMenuEnable = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"com/ss/android/lark/lkuiplus/MenuDrawerLKUIPlus$callback$1", "Landroidx/customview/widget/ViewDragHelper$Callback;", "mCurrentLeft", "", "clampViewPositionHorizontal", "child", "Landroid/view/View;", "left", "dx", "onViewPositionChanged", "", "changedView", "top", "dy", "onViewReleased", "releasedChild", "xvel", "", "yvel", "tryCaptureView", "", "pointerId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.lkuiplus.MenuDrawerLKUIPlus$b */
    public static final class C41549b extends C0959c.AbstractC0962a {

        /* renamed from: a */
        final /* synthetic */ MenuDrawerLKUIPlus f105628a;

        /* renamed from: b */
        private int f105629b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41549b(MenuDrawerLKUIPlus menuDrawerLKUIPlus) {
            this.f105628a = menuDrawerLKUIPlus;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "child");
            if (view == this.f105628a.getContentView()) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(view, "child");
            int min = Math.min(0, Math.max(-this.f105628a.getMenuWidth(), i));
            this.f105629b = min;
            return min;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            Intrinsics.checkParameterIsNotNull(view, "releasedChild");
            int paddingLeft = this.f105628a.getLayout().getPaddingLeft();
            int i = -this.f105628a.getMenuWidth();
            if (Math.abs(this.f105629b) < this.f105628a.getMenuWidth() / 2) {
                this.f105628a.mDragHelper.mo4866a(paddingLeft, 0);
            } else {
                this.f105628a.mDragHelper.mo4866a(i, 0);
            }
            this.f105628a.getLayout().invalidate();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(view, "changedView");
            float f = (float) i;
            this.f105628a.getMenuView().setTranslationX(f);
            int paddingLeft = this.f105628a.getLayout().getPaddingLeft();
            int i5 = -this.f105628a.getMenuWidth();
            C35299a<OnMenuStatusChangeListener> aVar = this.f105628a.mOnMenuStatusChangeListeners;
            C35299a.C35300a<OnMenuStatusChangeListener> a = aVar.mo129885a();
            try {
                int a2 = a.mo129889a();
                for (int i6 = 0; i6 < a2; i6++) {
                    OnMenuStatusChangeListener a3 = a.mo129890a(i6);
                    if (a3 != null) {
                        a3.mo149507a(f / ((float) this.f105628a.getMenuWidth()));
                        if (i == paddingLeft) {
                            a3.mo149506a();
                        } else if (i == i5) {
                            a3.mo149508b();
                        }
                    }
                }
                if (i == paddingLeft) {
                    this.f105628a.isMenuShowing = false;
                } else if (i == i5) {
                    this.f105628a.isMenuShowing = true;
                }
                this.f105628a.setMVdhXOffset(view.getLeft());
                this.f105628a.setMVdhYOffset(view.getTop());
            } finally {
                aVar.mo129887b();
            }
        }
    }

    public final void addOnMenuStatusChangeListener(OnMenuStatusChangeListener aVar) {
        if (aVar != null) {
            this.mOnMenuStatusChangeListeners.mo129886a(aVar);
        }
    }

    public final void setCallback(C0959c.AbstractC0962a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.callback = aVar;
    }

    public final boolean removeOnMenuStatusChangeListener(OnMenuStatusChangeListener aVar) {
        if (aVar != null) {
            return this.mOnMenuStatusChangeListeners.mo129888b(aVar);
        }
        return false;
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public void onDelegateLayoutEnd(OnLayoutData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onLayoutData");
        super.onDelegateLayoutEnd(bVar);
        View contentView = getContentView();
        contentView.offsetLeftAndRight(this.mVdhXOffset);
        contentView.offsetTopAndBottom(this.mVdhYOffset);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuDrawerLKUIPlus(ILKUILayout iLKUILayout) {
        super(iLKUILayout);
        Intrinsics.checkParameterIsNotNull(iLKUILayout, "layout");
    }

    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    public Boolean onDelegateTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        if (!this.interceptDown) {
            return super.onDelegateTouchEvent(motionEvent);
        }
        try {
            C0959c cVar = this.mDragHelper;
            if (cVar != null) {
                cVar.mo4872b(motionEvent);
            }
        } catch (Exception e) {
            Log.m165398w(this.TAG, "exception in onTouchEvent", e);
        }
        return true;
    }

    private final boolean shouldIntercept(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (DesktopUtil.m144301a(getContext()) || !this.isMenuEnable) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() >= ((float) getUnResponseRange()) || this.isMenuShowing) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = childNeedTouch(getContentView(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            } else {
                z2 = false;
            }
            if (z && !z2) {
                z3 = true;
            }
            this.interceptDown = z3;
        }
        return this.interceptDown;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[Catch:{ Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[Catch:{ Exception -> 0x007c }] */
    @Override // com.larksuite.component.ui.layout.plus.BaseLKUIPlus
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean onDelegateInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.lkuiplus.MenuDrawerLKUIPlus.onDelegateInterceptTouchEvent(android.view.MotionEvent):java.lang.Boolean");
    }

    private final boolean isXYInView(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        float f3 = (float) i;
        if (f3 <= f || f3 >= f + ((float) view.getWidth())) {
            return false;
        }
        float f4 = (float) i2;
        if (f4 <= f2 || f4 >= f2 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }

    private final boolean childNeedTouch(View view, int i, int i2) {
        if (!isXYInView(view, i, i2)) {
            return false;
        }
        if (view.getTag(R.id.cannot_swipe_view) != null || view.canScrollHorizontally(1) || view.canScrollHorizontally(-1)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
                if (childNeedTouch(childAt, i, i2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
